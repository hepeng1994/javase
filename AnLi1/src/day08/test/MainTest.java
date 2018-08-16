package day08.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 智联招聘
 * @author ASUS
 *
 */

public class MainTest {
	
	public static void main(String[] args) {
		String url ="http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%E5%8D%97%E6%98%8C&kw=%E5%A4%A7%E6%95%B0%E6%8D%AE&p=1&isadv=0";
		//通过url获取document
		Document document = getDocument(url);
		Page page = new Page();
		//放入page对象中
		page.setDocument(document);
		while(true){
		//提取本页信息
		List<Job> job = getJob(page);
		for (Job job2 : job) {
			System.out.println(job2);
		}
		//获取下一页信息
		getUpPage(page);
		if (page.isIspageUpUrl()) {
			String pageUpUrl = page.getPageUpUrl();
			Document document2 = getDocument(pageUpUrl);
			page.setDocument(document2);
		}else{
			break;
		}
		//延时,否则Id会被封
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	/**
	 * 获取本页内job信息封装成list
	 * @param page
	 */
	private static List<Job> getJob(Page page) {
		//创建list<job>
		List<Job> a =new ArrayList<Job>();
		Document document = page.getDocument();
		 Elements select = document.select("#newlist_list_content_table table");
		 select.remove(0);
		 for (Element element : select) {
			 Elements select2 = element.select(".zwmc div a");
			 String text = select2.text();
			 Job job = new Job();
			 job.setJobName(text);
			 String text2 = element.select(".gsmc a").text();
			 job.setComName(text2);
			 String text3 = element.select(".zwyx").text();
			 job.setSalary(text3);
			 String text4 = element.select(".gxsj").text();
			 job.setDate(text4);
			 a.add(job);
		}
		 return a;
		
	}
	/**
	 * 获取下一页
	 * @param page
	 */
private static void getUpPage(Page page) {
	Document document = page.getDocument();
	Elements select = document.select(".pagesDown-pos");
	if (select!=null&&select.size()>0) {
		Element element = select.get(0);
		Elements select2 = element.select("a");
		
		String attr = select2.attr("href");
	
		page.setPageUpUrl(attr);
	
		page.setIspageUpUrl(true);
	}else{
		page.setIspageUpUrl(false);
	}
	}
/**
 * 获取Document获取整个网页源码
 * @param url
 */
	private static Document getDocument(String url) {
		try {
			URL url1=new URL(url);
			Document parse = Jsoup.parse(url1,4000);
			return parse;
		} catch (Exception e) {
			e.printStackTrace();
		}return null;
	}
}
