

import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1; i < str.length() ; i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    int diff  = curr - prev;
		    sb.append(diff); // StringBuilder me add ke liye append
		    sb.append(curr);  
		}

		return sb.toString();
		// If you want to represent any object as a string, toString() method comes into existence.
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));      
	}

}
