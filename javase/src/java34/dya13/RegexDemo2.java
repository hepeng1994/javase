package java34.dya13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		String str="jin tian yao xia yu,da jia pa bu pa ?huang bu huang?are you sure";
		Pattern p=Pattern.compile("\\b[a-zA-Z]{1,}\\b");
		Matcher matcher=p.matcher(str);
		int a=0;
		while(matcher.find()){
			a++;
			System.out.println(matcher.group());
		}
		System.out.println(a);
	}

}
