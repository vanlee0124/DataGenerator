package com.yinhai.ta3pluscloud.elk;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.yinhai.ta3pluscloud.elk.errordata.ServiceInformation;
import com.yinhai.ta3pluscloud.elk.errordata.TestErrorData;;

public class TestErrorDataGenerator {
    private  TestErrorData errorData;
    private  Random randomizer=new Random();
	 public TestErrorData generate()
	{
		 errorData=new TestErrorData();
		 errorData.setActionExecuteTime(this.actionExecuteTimeGenerator());
		 errorData.setBrowser(this.browserGenerator());
		 errorData.setClientIp(this.clientIpGenerator());
		 errorData.setDate(this.dateGenerator());
		 errorData.setIserror(this.isErrorGenerator());
		 errorData.setMenuid(this.menuidGenerator());
		 errorData.setMenuname(this.menunameGenerator());
		 errorData.setOs(this.osGenerator());
		 errorData.setServerIp(this.serviceIpGenerator());
		 errorData.setServiceInfo(this.serviceInfoGenerator());
		 errorData.setUrl(this.urlGenerator());
		 errorData.setUserid(this.useridGenerator());
		 errorData.setUsername(this.usernameGenerator());
		 return errorData;
	}
	 private Integer actionExecuteTimeGenerator()
	 {
		 return  randomizer.nextInt(10001);
	 }
	 private String browserGenerator()
	 {
		 return errorData.getBrowser();
	 }
	 private String clientIpGenerator()
	 {
		 return this.ipGenerator().toString();
	 }
	 
	 private String intParserToHex(int num)
	 {
		 StringBuilder sb=new StringBuilder();
		 if(num<0||num>255)
		 {
			 return "FF";
		 }
		 int firstNum=num/16;
		 int secondNum=num%16;
		 if(firstNum>=10)
		 {
			 sb.append((char)('A'+firstNum-10));
		 }
		 else
		 {
			 sb.append(firstNum);
		 }
		 if(secondNum>=10)
		 {
			 sb.append((char)('A'+secondNum-10));
		 }
		 else
		 {
			 sb.append(secondNum);
		 }
		 return sb.toString();
	 }
	 private StringBuilder ipGenerator()
	 {
		StringBuilder sb=new StringBuilder();
		int num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		sb.append(':');
		num=randomizer.nextInt(256);
		sb.append(this.intParserToHex(num));
		return sb;
	 }
	 private Integer dateGenerator()
	 {
		 return randomizer.nextInt(Integer.MAX_VALUE);
	 }
	 private Boolean isErrorGenerator()
	 {
		 
		 return randomizer.nextInt(2)==1?true:false;
	 }
	 private Integer menuidGenerator()
	 {
		return errorData.getUserid(); 
	 }
	 private String menunameGenerator()
	 {
		 return errorData.getMenuname();
	 }
	 private String osGenerator()
	 {
		 return errorData.getOs();
	 }
	 private String serviceIpGenerator()
	 {
		 StringBuilder sb=new StringBuilder();
		 sb=this.ipGenerator();
		 sb.append(":8080");
		 return sb.toString();
	 }
	 private List<ServiceInformation> serviceInfoGenerator()
	 {
		 int n=randomizer.nextInt(10);
		 if(n==0)
		 {
			 return null;
		 }
		 List<ServiceInformation> res=new ArrayList<ServiceInformation>();
		 ServiceInformationGenerator serviceInformationGenerator=new ServiceInformationGenerator();
		 for(int i =0;i<n;++i)
		 {
			 res.add(serviceInformationGenerator.generate());
		 }
		 return res;
		 
	 }
	 private String urlGenerator()
	 {
		 return this.errorData.getUrl();
	 }
	 private Integer useridGenerator()
	 {
		 return randomizer.nextInt(100);
	 }
	 private String usernameGenerator()
	 {
		 return this.errorData.getUsername();
	 }
}
