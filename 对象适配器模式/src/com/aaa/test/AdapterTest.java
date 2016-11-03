package com.aaa.test;

public class AdapterTest {
    public static void main(String[] args) {
		Source s=new Source();
		TargetAble t=new Wrapper(s);
		t.method1();
		t.method2();
		
	}
}
