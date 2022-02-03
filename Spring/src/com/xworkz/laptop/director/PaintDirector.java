package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Paint;

public class PaintDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Paint paint = application.getBean("paint", Paint.class);
		String spring = paint.decorate();
		System.out.println(spring);
		String string = paint.painting();
		System.out.println(string);

		Paint paint1 = application.getBean("paint2", Paint.class);
		String spring1 = paint1.decorate();
		System.out.println(spring1);
		String string1 = paint1.painting();
		System.out.println(string1);
	}

}
