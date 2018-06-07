package java34.dya17.lianxi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriderDemo {
	public static void main(String[] args) {
		
		try(
				BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
				) {
			bw.write("我自清高向天问");
			bw.newLine();
			bw.write("爱恨情仇亦不闻");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
