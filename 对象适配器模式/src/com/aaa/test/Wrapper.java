package com.aaa.test;
/*
 * ����������ģʽ��ֻ�ǽ�������������޸ģ����Ǽ̳�source�࣬����ӵ��source���һ��ʵ��������˼���������
 * ͨ������һ��ʵ��������ʵ����method1����
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
		System.out.println("���ǽӿ��еķ���");
	}

}
