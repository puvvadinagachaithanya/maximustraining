package com.max.lan;

public class CastDemo {
	public static void main(String[] args) {
		int x =10;
		long x1 = x*2; // upcasting
		
		Integer y =20+x; //autoboxing
		Object o=y; // object upcasting
		//Long a  = (Long)o; // throws ClassCastException

	}
}
