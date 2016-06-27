
package com.yinhai.ta3pluscloud.elk.errordata;

import lombok.Data;


@Data

public class ServiceInformation {
	private Integer percent=0;
	private Integer serviceExecuteTime=0;
	private String serviceMethodName="getAdminUser";
	private String servicePackageClass="com.sun.proxy";
	private Integer serviceStartTime=0;
	
}
