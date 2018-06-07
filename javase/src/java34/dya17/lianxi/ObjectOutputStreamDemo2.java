package java34.dya17.lianxi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamDemo2 {
	public static void main(String[] args) {
		
		try(
			BufferedReader br=new BufferedReader(new FileReader("d:/power.txt"));
				
				) {
			List<String[]> list=new ArrayList<String[]>();
			
			String s;
			while((s=br.readLine())!=null){
				
				String [] ss=s.split(",");
				list.add(ss);
			}
			
			List<String> list1=new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				if(!list1.contains(list.get(i)[0])){
					list1.add(list.get(i)[0]);
				}
			}
			 
			for(int i=0;i<list1.size();i++){
				int a=0;
				int b=0;
				for(int j=0;j<list.size();j++){
					if(list1.get(i).equals(list.get(j)[0])){
						a+=Integer.parseInt(list.get(j)[1]);
						b++;
					}
				}
					System.out.println("捐款人:"+list1.get(i)+"\t捐款总金额:"+a+"\t元  "+"\t捐款次数:"+b+"次");
			}
		}catch (Exception e) {
			e.printStackTrace();
			}
	}
}
