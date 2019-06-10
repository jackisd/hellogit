package com.jack.test;

//饿汉式单例
public class SingleDog {
	private static SingleDog dog = new SingleDog();

	public SingleDog() {
		System.out.println("2018年七夕情人节");
	}

	public static SingleDog get() {
		return dog;
	}
	public static void main(String[] args) {
		System.out.println(get());
		System.out.println(get());
	}
}
