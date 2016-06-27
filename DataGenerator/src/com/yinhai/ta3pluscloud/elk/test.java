package com.yinhai.ta3pluscloud.elk;

import java.io.IOException;
public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		TestErrorDataGenerator tedg=new TestErrorDataGenerator();
		TestErrorData ted1=tedg.generate();
		TestErrorData ted2=tedg.generate();
		System.out.println(ted1.getClientIp());
		System.out.println(ted2.getClientIp());
		DataWriter dw=new DataWriter("./test.log");
		String gsonTest1=new Gson().toJson(ted1);
		String gsonTest2=new Gson().toJson(ted2);
		
		dw.write(gsonTest1);
		dw.write(gsonTest2);
		dw.getBufWriter().close();
		System.out.print(gsonTest1);
		*/
DataWriterThread th1=new DataWriterThread("./");
		
		Thread a=new Thread(th1,"A");	
	
		a.start();
	
	

	
	}

}
