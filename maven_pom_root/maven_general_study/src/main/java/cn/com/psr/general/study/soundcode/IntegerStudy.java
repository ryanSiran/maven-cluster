package cn.com.psr.general.study.soundcode;

import java.lang.reflect.Field;

public class IntegerStudy {

	/*public static void main(String[] args) {
		Integer a = 1000;
		Integer b = 1000;
		System.out.println(a == b);
		Integer c = new Integer(1000);
		Integer d = new Integer(1000);
		System.out.println(c == d);
		int e = 1000;
		int f = 1000;
		System.out.println(e == f);
	}*/
	
/*	public static void main(String[] args) {
		try {
			Class cache = Integer.class.getDeclaredClasses()[0]; //1
			Field myCache = cache.getDeclaredField("cache"); //2
			myCache.setAccessible(true);//3
			
			Integer[] newCache = (Integer[]) myCache.get(cache); //4
			newCache[132] = newCache[133]; //5
			
			int a = 2;
			int b = a + a;
			System.out.printf("%d + %d = %d", a, a, b); //
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {
		try {
			Integer aa = 1000;
			Integer bb = 1000;
			System.out.println(aa == bb);
			int a = aa;
			int b = bb;
			System.out.println(a == b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
