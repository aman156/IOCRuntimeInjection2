package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.ExpressiveConfig1;
import com.interfaces.CompactDisc;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ExpressiveConfig1.class);
		CompactDisc cd = ctx.getBean(CompactDisc.class);
		cd.play();
	}

}
