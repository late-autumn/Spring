package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator mycalculator =ctx.getBean("mycalculator",MyCalculator.class);
		mycalculator.add();
		mycalculator.sub();
		mycalculator.multi();
		mycalculator.div();
	}

}
 