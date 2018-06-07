package java34.dya17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("明月几时有");
		list.add("把酒问青天");
		list.add("不知天上宫阙");
		list.add("今夕是何年");
		
		try (
				BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
				BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
				){
			 
			
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				bw.write(it.next());
				if(it.hasNext()){
				bw.newLine();
				}
			}
			bw.flush();
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);	
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
	}


