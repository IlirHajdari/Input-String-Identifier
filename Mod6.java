import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mod6 {
	public static void main(String[] args) {
		System.out.println(checkString());
	}
	public static String checkString() {
		String str1, str2, str3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter three strings: ");
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		
		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		Matcher m1=p.matcher(str1);
		Matcher m2=p.matcher(str2);
		Matcher m3=p.matcher(str3);
		/* exception handling*/
		
		try {
			if((!m1.find()||!m2.find()||!m3.find())) {
				throw new Exception();
			}
		}
		catch(Exception e) {
			return "fail";
		}
		return "success";
	}
}