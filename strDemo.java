package programs2;
import java.util.Arrays;
import java.util.Scanner;
public class strDemo {
	public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("********************");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.substring(15,16));
		System.out.println(hannah.indexOf("b"));
		System.out.println("********************");
		StringBuffer sb2=new StringBuffer("Was it a car or a cat I saw?");
		String str=sb2.substring(9, 12);
		System.out.println(str);
		System.out.println("********************");
		String original = "software";
		StringBuffer result = new StringBuffer("hi");
		int index = original.indexOf('a');
		result.setCharAt(0, original.charAt(0));
		result.setCharAt(1, original.charAt(original.length()-1));
		result.insert(1, original.charAt(4));
		result.append(original.substring(1,4));
		 result.insert(3, (original.substring(index, index+2) + " "));
		System.out.println(result);
		String hi = "Hi, ";
		String mom = "mom.";
		System.out.println("********************");
		String string1 = new String ("ArthiCharen Sankar");
		char char1 = string1.charAt(0);
		 int a1 = string1.indexOf(" ")+1;
		char char2 = string1.charAt(a1);
		System.out.println(char1+" "+char2);
        //anagram
		System.out.println("********************");
        String a="parliament";
        String b="partial men";
        a=b.toLowerCase();
        a=a.toLowerCase();
        a= a.replace(" ","");
		b=b.replace(" ", "");
		char chararray1[] =a.toCharArray();
		char chararray2[]=b.toCharArray();
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		boolean result1 =Arrays.equals(chararray1,chararray2);
			if (result1) {
				System.out.println(a+" and "+b+" are anagrams");
			}
			else {
				System.out.println(a+" and "+b+" are not anagrams");
			}
        
		}
	  
	  
	  
}
