package com.jack.test;

//����ʽ������
public class SingleDog {
	private static SingleDog dog = new SingleDog();

	public SingleDog() {
		System.out.println("2018����Ϧ������ڿ��֡�");
	}

	public static SingleDog get() {
		return dog;
	}
	public static void main(String[] args) {
		System.out.println(get());
		System.out.println(get());
	}
}
