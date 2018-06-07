package java34.dya17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		CopyFile("d:/a.txt","d:/c.txt");
		
	}
	public static void  CopyFile(String path,String suffix){
		
		try(
				BufferedReader br=new BufferedReader(new FileReader(path));
				BufferedWriter bw=new BufferedWriter(new FileWriter(suffix));
				
				) {
			char[] a=new char[1024];
			int length;
			while((length=br.read(a))!=-1){
				bw.write(a, 0, length);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
