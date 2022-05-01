
import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
		    char ch = str.charAt(i);
		    if(ch >= 'A' && ch <= 'Z'){
		        char lc = (char)(ch-'A' + 'a');
		        ans.append(lc);
		    }
		        else {
		            char uc = (char)(ch-'a'+'A');
		            ans.append(uc);
		        }
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
