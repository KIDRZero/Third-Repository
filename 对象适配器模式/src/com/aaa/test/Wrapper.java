package com.aaa.test;
/*
 * 对象适配器模式，只是将适配器类进行修改，不是继承source类，而是拥有source类的一个实例，解决了兼容性问题
 * 通过持有一个实例，调用实例的method1方法
 */
public class Wrapper implements TargetAble {
    private Source source;
    
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("这是接口中的方法");
	}

}
