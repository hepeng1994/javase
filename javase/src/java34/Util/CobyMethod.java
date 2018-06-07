package java34.Util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CobyMethod {
	
	public static void  fisAndFosCopy(String f,String g){
		long a=System.currentTimeMillis();
		try(
				FileInputStream fis=new FileInputStream(f);
				FileOutputStream fos=new FileOutputStream(g);
				) {
			byte [] b=new byte[1024];
			int len;
			while((len=fis.read(b))!=-1){	
				fos.write(b,0,len);
				}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		long a1=System.currentTimeMillis();
		System.out.println("拷贝成功，共耗时："+(a1-a)+"毫秒");
		
	}
//------------------------------------------------------------------
	public static void  bisAndBosCopy(String f,String g){
		long a=System.currentTimeMillis();
		try(
				BufferedInputStream bis= new BufferedInputStream(new FileInputStream(f));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(g));
				) {
			byte [] b=new byte[1024];
			int len;
			while((len=bis.read(b))!=-1){	
				bos.write(b,0,len);
				}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		long a1=System.currentTimeMillis();
		System.out.println("拷贝成功，共耗时："+(a1-a)+"毫秒");
	}
//----------------------------------------------------------------------
	public static void  isrAndIswCopy(String f,String g){
		long a=System.currentTimeMillis();
		try(
				InputStreamReader isr= new InputStreamReader(new FileInputStream(f));
				OutputStreamWriter isw=new OutputStreamWriter(new FileOutputStream(g));
				) {
			char [] b=new char[1024];
			int len;
			while((len=isr.read(b))!=-1){	
				isw.write(b,0,len);
				}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		long a1=System.currentTimeMillis();
		System.out.println("拷贝成功，共耗时："+(a1-a)+"毫秒");
	}
//------------------------------------------------------------------------------------------
	public static void  frAndFwCopy(String f,String g){
		long a=System.currentTimeMillis();
		try(
				FileReader fr= new FileReader(f);
				FileWriter fw=new FileWriter(g);
				) {
			char [] b=new char[1024];
			int len;
			while((len=fr.read(b))!=-1){	
				fw.write(b,0,len);
				}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		long a1=System.currentTimeMillis();
		System.out.println("拷贝成功，共耗时："+(a1-a)+"毫秒");
	}

//-----------------------------------------------------------
	public static void  brAndBwCopy(String f,String g){
		long a=System.currentTimeMillis();
		try(
				BufferedReader br= new BufferedReader(new FileReader(f));
				BufferedWriter bw=new BufferedWriter(new FileWriter(g));
				) {
			char [] b=new char[1024];
			int len;
			while((len=br.read(b))!=-1){	
				bw.write(b,0,len);
				}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		long a1=System.currentTimeMillis();
		System.out.println("拷贝成功，共耗时："+(a1-a)+"毫秒");
	}
	
		

   
}
