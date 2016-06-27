package com.yinhai.ta3pluscloud.elk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Data;

@Data
public class DataWriterThread implements Runnable {

	private String path;
	public DataWriterThread(String path)
	{
		this.path=path;

	}
	public void write(BufferedWriter bufWriter,String input)
	{
		try {
			bufWriter.write(input);
			bufWriter.newLine();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	@Override
	public void run() {
		try  {
			BufferedWriter bufWriter;
			bufWriter=new BufferedWriter(new FileWriter(this.path+Thread.currentThread().getName()+".log"));
			int i=0;
			TestErrorDataGenerator tedg;
			while(i<1000)
			{
				tedg=new TestErrorDataGenerator();
				String input=TestErrorDataToJSON.testErrorDataToJSON(tedg.generate());	
				this.write(bufWriter,input);
				i++;
				
			}
			bufWriter.close();
			System.out.println("thread"+Thread.currentThread().getName()+" written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
