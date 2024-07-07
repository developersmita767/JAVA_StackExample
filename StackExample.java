//package com.example;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> st=new Stack<String>();
		st.push("A");
		st.push("B");
		st.push("C");
		System.out.println(st);
		st.pop();
		System.out.println("After popping"+st);
		st.push("D");
		st.peek();
		System.out.println("After pushing"+st);
		

	}

}
