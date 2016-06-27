package com.yinhai.ta3pluscloud.elk;

import java.util.Random;
import com.yinhai.ta3pluscloud.elk.errordata.ServiceInformation;

public class ServiceInformationGenerator {
	    private  ServiceInformation serviceInfo;
	    private  Random randomizer=new Random();
		 public ServiceInformation generate()
		{
			
			this.serviceInfo=new ServiceInformation();
			this.serviceInfo.setPercent(this.percentGenerator());
			this.serviceInfo.setServiceExecuteTime(this.serviceExecuteTimeGenerator());
			this.serviceInfo.setServiceMethodName(this.serviceMethodNameGenerator());
			this.serviceInfo.setServicePackageClass(this.servicePackageClassGenerator());
			this.serviceInfo.setServiceStartTime(this.serviceStartTimeGenerator());
			return this.serviceInfo;
		}
		 private Integer percentGenerator()
		{
			
			return randomizer.nextInt(101);
		}
		 private Integer serviceExecuteTimeGenerator()
		{
			
			return randomizer.nextInt(10001);
		}
		 private String serviceMethodNameGenerator()
		{
			
			return serviceInfo.getServiceMethodName();
		}
		 private String servicePackageClassGenerator()
		{
			
			return serviceInfo.getServicePackageClass();
		}
		 private Integer serviceStartTimeGenerator()
		{
			
			return randomizer.nextInt(10001);
		}
		
}
