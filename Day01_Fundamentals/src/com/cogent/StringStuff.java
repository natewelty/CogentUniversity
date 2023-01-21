package com.cogent;

public class StringStuff {
	public static void main(String[] args) {
		/*String s1 = "hello";
		String s2= "world";
		System.out.println("Before concat: " +"\ns1: "+s1+"\ns2" +s2);
		
		s2=s1.concat(s2);
		System.out.println("After concat: " +"\ns1: "+s1+"\ns2" +s2);
		*/
		/*
		 * String s1 = "abc";
		 
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		*/
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity: "+ sb.capacity()); //16 bytes
		//StringBuffer is a mutable string
		
		sb=new StringBuffer("abcde");
		System.out.println(sb.reverse());
		System.out.println(sb.insert(3, "xyz"));
		System.out.println(sb.delete(3, 6));
		
	}
}
