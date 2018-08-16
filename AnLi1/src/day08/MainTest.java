package day08;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainTest {
	public static void main(String[] args) {
		String url ="https://search.51job.com/list/150200,000000,0000,00,9,99,%25E5%25A4%25A7%25E6%2595%25B0%25E6%258D%25AE,2,1.html?lang=c&stype=&postchannel=0000&workyear=99&cotype=99&degreefrom=99&jobterm=99&companysize=99&providesalary=99&lonlat=0%2C0&radius=-1&ord_field=0&confirmdate=9&fromType=&dibiaoid=0&address=&line=&specialarea=00&from=&welfare=";
		Document document = getDocument(url);
		Page page = new Page();
		page.setDocument(document);
		while(true){
			List<Job> byPage = getByPage(page);
			getNextPageUrl(page);
			for (Job job : byPage) {
				System.out.println(job);
			}
			if (page.isIspageUpUrl()) {
				Document document2 = getDocument(page.getPageUpUrl());
				page.setDocument(document2);
			}else{
				break;
			}
			//把循环放慢,防止被网站把IP禁le
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
	private static void getNextPageUrl(Page page) {
		Document document = page.getDocument();
		Elements select1 = document.select(".bk");
		Elements select = select1.get(1).select("a");
		//判断是否有下一页
		if (select!=null&&select.size()>0) {
			String attr = select.get(0).attr("href");
			page.setPageUpUrl(attr);
			page.setIspageUpUrl(true);
		}else{
			page.setIspageUpUrl(false);
		}
		
	}
	/**
	 * 用过url获得Document
	 * @param url
	 * @return
	 */
	private static Document getDocument(String url) {
		try {
			URL url2 = new URL(url);
			Document document = Jsoup.parse(url2, 4000);
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}return null;
	}
	
/**
 * 通过page获得job;
 * @param page
 */
	private static List<Job> getByPage(Page page) {
		//创建list集合
		List<Job> a =new ArrayList<>();
		//获取网页代码
		Document document = page.getDocument();
		//获取所需部分数据
		Elements select = document.select("#resultList .el");
		//去除第一行
		select.remove(0);
		for (Element element : select) {
			//获取所需数据
			String jobName = element.select(".t1 a").get(0).text();
			String comName = element.select(".t2 a").get(0).text();
			String addr = element.select(".t3").get(0).text();
			String salary = element.select(".t4").get(0).text();
			String date = element.select(".t5").get(0).text();
			Job job = new Job();
			job.set(jobName, comName, addr, salary, date);
			a.add(job);
		}return a;
	}
}
