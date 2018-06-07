package java34.dya17.lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	1.把ArrayList集合中的字符串数据存储到文本文件,要求每个元素存一行
	2.从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 *
 */
public class IoTest {
	public static void main(String[] args) {
		//创建一个 list 的集合
		List<String> list=new ArrayList<String>();
		//添加元素
		list.add("李白乘舟将欲行");
		list.add("忽闻岸上踏歌声");
		list.add("桃花潭水深千尺");
		list.add("不及汪伦送我情");
		
		try(
				//创建字缓冲字符流
				BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
				BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
				) {
			//遍历list集合中的元素
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				//将每个元素添加到指定文件
				bw.write(it.next());
				//如果下面还有内容就进行换行，没有就不换
				if(it.hasNext()){
					bw.newLine();
				}
			}
			bw.flush();
			
			String s;
			//遍历指定文件中的内容 并打印，并把文件中的内容重新装到集合中
			List<String> list1=new ArrayList<String>();
			while((s=br.readLine())!=null){
				System.out.println(s);
				list1.add(s);
			}
			System.out.println(list1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
