package day06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.BufferRow;

public class MainTest {
	public static void main(String[] args) {
		// 获取数据并装进map合集
		Map<String, List<SessionBean>> ipMap = ipSessionMap();
		// 创建毛集合
		Map<String, List<SessionBean>> a = new HashMap<String, List<SessionBean>>();
		// 对map中的list进行排序 时间升序
		Set<Entry<String, List<SessionBean>>> entrySet = ipMap.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> value = entry.getValue();
			sortByDate(value);
			// 判断相邻两个session之间是否属于同一个session，相应的附上sessionid和order
			List<SessionBean> panDuan = panDuan(value);
			// 把id相同放在一起
			for (SessionBean se : value) {
				List<SessionBean> o = a.getOrDefault(se.getSessionId(),
						new ArrayList<SessionBean>());
				o.add(se);
				a.put(se.getSessionId(), o);
			}
		}
		// 遍历a 获取起始请求时间 结束请求时间 起始页面 跳出页面
		Set<Entry<String, List<SessionBean>>> entrySet2 = a.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet2) {
			List<SessionBean> value = entry.getValue();
			SessionBean se = value.get(0);
			Date dateStart = se.getDate();
			String formatStart = format(dateStart);
			String urlStart = se.getSessionUrl();
			SessionBean se1 = value.get(value.size() - 1);
			Date dateEnd = se1.getDate();
			String formatEnd = format(dateEnd);
			String urlEnd = se1.getSessionUrl();
			long shijian = (dateEnd.getTime() - dateStart.getTime()) / 1000;
			String str="SessionBean号:" + se.getSessionId() + "地址:"
					+ se.getSessionIp() + "起始时间:" + formatStart + "结束时间:"
					+ formatEnd + "起始Url" + formatEnd + "结束Url" + urlEnd
					+ "总时长" + shijian + "秒";
			try(BufferedWriter ba =new BufferedWriter(new FileWriter("D:\\b.txt",true));) {
				
				
				
					ba.write(str);
					ba.newLine();
				
				ba.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// try (BufferedWriter c =new BufferedWriter(new
		// FileWriter("D:\\a.txt")) ;){
		//
		//
		// for (Entry<String, List<SessionBean>> entry2 : entrySet) {
		// List<SessionBean> value2 = entry2.getValue();
		// for (SessionBean sessionBean : value2) {
		// c.write(sessionBean.toString());
		// c.newLine();
		// }
		//
		// }
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();}
		//

	}

	/**
	 * 把时间转换为String
	 * 
	 * @param date
	 * @return
	 */
	private static String format(Date date) {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String format = sim.format(date);
		return format;
	}

	private static List<SessionBean> panDuan(List<SessionBean> value) {

		if (value.size() == 1) {
			SessionBean se = value.get(0);
			String st = UUID.randomUUID().toString();
			se.setSessionId(st);
			se.setSessionCixu(1);
		} else {
			for (int i = 0; i < value.size() - 1; i++) {
				// 判断两次时间超过30分钟的
				Date date = value.get(i).getDate();
				Date date2 = value.get(i + 1).getDate();
				long time = date.getTime();
				long time2 = date2.getTime();
				long dd = time2 - time;
				if (dd >= 1000 * 60 * 30) {
					if (value.get(i).getSessionId() == null) {
						String str = UUID.randomUUID().toString();
						value.get(i).setSessionId(str);
						value.get(i).setSessionCixu(1);
						String str1 = UUID.randomUUID().toString();
						value.get(i + 1).setSessionId(str1);
						value.get(i + 1).setSessionCixu(1);
					} else {
						String str1 = UUID.randomUUID().toString();
						value.get(i + 1).setSessionId(str1);
						value.get(i + 1).setSessionCixu(1);
					}
				} else {
					if (value.get(i).getSessionId() == null) {
						String str = UUID.randomUUID().toString();
						value.get(i).setSessionId(str);
						value.get(i).setSessionCixu(1);
						value.get(i + 1).setSessionId(str);
						value.get(i + 1).setSessionCixu(2);
					} else {
						String str1 = UUID.randomUUID().toString();
						value.get(i + 1).setSessionId(
								value.get(i).getSessionId());
						value.get(i + 1).setSessionCixu(
								value.get(i).getSessionCixu() + 1);
					}
				}
			}

		}
		return value;
	}

	/**
	 * 对map中的value进行时间升序排序
	 * 
	 * @param value
	 */
	private static void sortByDate(List<SessionBean> value) {
		Collections.sort(value, new Comparator<SessionBean>() {

			@Override
			public int compare(SessionBean o1, SessionBean o2) {
				Date date = o1.getDate();
				Date date2 = o2.getDate();
				return date.after(date2) ? 1 : -1;
			}
		});
	}

	/**
	 * 把数据封装进map合集,mao<ip,list<javabean>>
	 */
	private static Map<String, List<SessionBean>> ipSessionMap() {
		// 创建Map合集
		Map<String, List<SessionBean>> b = new LinkedHashMap<>();
		// 录入数据
		try (BufferedReader a = new BufferedReader(new FileReader(
				"E:\\x\\案例分析\\day06-session分析/access.log.fensi"));) {
			String str;
			while ((str = a.readLine()) != null) {
				// 获取session所需要的ip.date.url
				String ipRegex = "(\\d+\\.){3}\\d+";
				String dateRegex = "\\[.+\\d+\\]";
				String urlRegex = "(POST|GET){1}\\s(\\S)*\\s";
				String sessionIp = zhengZe(str, ipRegex);
				String sessionDate = zhengZe(str, dateRegex);
				String sessionUrl = zhengZe(str, urlRegex);
				// 创建sessionBean封装数据 剔除url为空的
				if (sessionIp != null && sessionDate != null
						&& sessionUrl != null) {
					SessionBean s = new SessionBean();
					// 将String转换为Date
					// [18/Sep/2013:06:49:18 +0000]
					Date parse = parse(sessionDate);
					s.set(sessionIp, parse, sessionUrl);
					List<SessionBean> list = b.getOrDefault(sessionIp,
							new ArrayList<SessionBean>());
					list.add(s);
					b.put(sessionIp, list);
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	/**
	 * 将String 装换为Date
	 * 
	 * @param sessionDate
	 */
	private static Date parse(String sessionDate) {
		// [18/Sep/2013:06:49:18 +0000]
		// 先切分为所需格式
		String sub = sessionDate.substring(1, sessionDate.length() - 1);
		SimpleDateFormat simp = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss",
				Locale.US);
		try {
			Date parse = simp.parse(sub);
			return parse;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 用正则表达式获取所需要的
	 * 
	 * @param str
	 * @param ipRegex
	 */
	private static String zhengZe(String str, String ipRegex) {
		Pattern compile = Pattern.compile(ipRegex);
		Matcher matcher = compile.matcher(str);
		while (matcher.find()) {
			String group = matcher.group();
			return group;
		}
		return null;
	}
}
