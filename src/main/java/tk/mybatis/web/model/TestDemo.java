package tk.mybatis.web.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestDemo {

    public static void main(String[] args) {
		String name = "zhangsna";
		int age = 234;
		System.out.println("name:"+name+"age:"+age);
		System.out.println(new StringBuilder().append("name:").append(name).append("age:").append(age).toString());
		System.out.println("name:"+name+"age:"+age);
		System.out.printf("name:%sage:%d%n", name, age);
		String ss = "username";
	}

	private static void f(ArrayList<String> strings) {
		for (String tmep : strings) {

		}
	}

	private static void hello() {
	}
}
