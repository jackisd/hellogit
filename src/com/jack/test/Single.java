package com.jack.test;

//懒汉式单例
public class Single {
	private static Single single;

	// 私有化构造方法
	private Single() {

	}

	// 提供公共的访问方法
	public static Single get() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (single == null) {
			single = new Single();
		}
		return single;
	}

	public static void main(String[] args) {
		System.out.println(Single.get() );
		System.out.println(Single.get());
	}
}
