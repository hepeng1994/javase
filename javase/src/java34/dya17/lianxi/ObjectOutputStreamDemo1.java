package java34.dya17.lianxi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ObjectOutputStreamDemo1 {
	public static void main(String[] args) {
		
		try(
				BufferedReader br=new BufferedReader(new FileReader("d:/power.txt"));
				
				) {
			Map<String, Integer > map1=new HashMap<>();
			Map<String, Integer> map=new HashMap<String, Integer>();
			
			String s;
			while((s=br.readLine())!=null){
				//System.out.println(s);
				String [] split=s.split(",");
				//System.out.println(split[0]);
				
				String key=split[0];
				 
				Integer value=map.get(key);
				
				if(value==null){
					
					map.put(key, 1);
				}else{
					
					value++;    //=Integer.parseInt(split[1]);
					map.put(key, value);
					
				
			}
		Set<String> set = map1.keySet();
			for(String c:set){
				System.out.println(c+","+map1.get(c));
			}
	
			}}
		
			
		 catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
