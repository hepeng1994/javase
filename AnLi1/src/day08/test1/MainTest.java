package day08.test1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainTest {
	public static void main(String[] args) {
		String str= "http://bj.ganji.com/qiuzhi/s/_%E5%A4%A7%E6%95%B0%E6%8D%AE/?from=zhaopin_indexpage";
		Document document = getDocument(str);
		Page page = new Page();
		page.setDocument(document);
		while(true){
			//获得本页job
			List<Job> job = getJob(page);
			for (Job job2 : job) {
				System.out.println(job2);
			}
			//获取下一页
			getDownPage(page);
			if (page.getIdDownPage()) {
				String downPage = page.getDownPage();
				Document document2 = getDocument(downPage);
				page.setDocument(document2);
			}else{
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 获取下一页
	 * @param page
	 */
	private static void getDownPage(Page page) {
		Document document = page.getDocument();
		Elements select = document.select(".next");
		System.out.println(select.size());
		if (select!=null&&select.size()>0) {
			Elements select2 = select.select("a");
			String attr = "http://bj.ganji.com/"+select2.attr("href");
			
			page.setDownPage(attr);
			
			page.setIdDownPage(true);
		}else{
			page.setIdDownPage(false);
		}
		
	}
	/**
	 * 获得job
	 * @param page
	 */
private static List<Job> getJob(Page page) {
	//创建lsit合集
	List<Job> a =new ArrayList<Job>();
	Document document = page.getDocument();
	//System.out.println(document);
	Elements select = document.select("#js_list div dl");
	select.remove(0);
	for (Element element : select) {
		Job job = new Job();
		String text = element.select(".j-post a").text();
		job.setJobName(text);
		String text2 = element.select(".j-name").text();
		job.setName(text2);
		String text3 = element.select(".j-gender").text();
		job.setSex(text3);
		String text4 = element.select(".j-age").text();
		job.setAge(text4);
		String text5 = element.select(".j-salary").text();
		job.setSalary(text5);
		String text6 = element.select(".j-edu").text();
		job.setBackGround(text6);
		String text7 = element.select(".j-work").text();
		job.setJobAge(text7);
		String text8 = element.select(".j-time").text();
		job.setDate(text8);
		a.add(job);
	}
		return a;
	}
/**
 * 通过url获得Document
 * @param str
 */
	private static Document getDocument(String str) {
		try {
			URL url = new URL(str);
			Document parse = Jsoup.parse(url,4000);
			return parse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return null;
	}
}
