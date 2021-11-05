package com.revature;

import java.util.Scanner;

public class PigLatinator {
	
	 public static String convertToPigLatin(String s){
	        StringBuilder sb = new StringBuilder();
	        String punctuation = s.substring(s.length() - 1);
	        String[] words = s.substring(0, s.length() - 1).split(" ");
	        for(int i = 0; i < words.length; i ++){
	            if ("aeiouAEIOU".indexOf(words[i].charAt(0)) >= 0) {
	            	sb.append(words[i] + "way");
	            }
	            else if(Character.isUpperCase(words[i].charAt(0))){
	                sb.append(Character.toUpperCase(words[i].charAt(1)) + words[i].substring(2) + Character.toLowerCase(words[i].charAt(0)) + "ay");
	            }else{
	                sb.append(words[i].charAt(1) + words[i].substring(2) + words[i].charAt(0) + "ay");
	            }
	            if(i != words.length - 1) {
	            	sb.append(" ");
	            }
	        }
	        sb.append(punctuation);
	        return sb.toString();
	    }
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Input a sentence to convert to Pig Latin:");
		String s = in.nextLine();
        System.out.println(PigLatinator.convertToPigLatin(s));
		
	}
}
