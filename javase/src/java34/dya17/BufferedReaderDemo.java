package java34.dya17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		try(
				BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
				) {
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
