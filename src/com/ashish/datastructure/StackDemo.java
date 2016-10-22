package com.ashish.datastructure;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Initial stack: " + st);

		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);

		showPep(st);
		showPep(st);

		showPop(st);
		showPop(st);
		showPop(st);

		try {
			showPop(st);
		} catch (EmptyStackException e) {
			System.out.println("Empty Stack");
		}
	}

	private static void showPep(Stack<Integer> st) {
		System.out.print("Peep -> ");
		Integer p = st.peek();
		System.out.println(p);
		System.out.println("stack: " + st);
	}

	private static void showPop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	private static void showPush(Stack<Integer> st, int i) {
		st.push(new Integer(i));
		System.out.println("push(" + i + ")");
		System.out.println("stack: " + st);
	}
}