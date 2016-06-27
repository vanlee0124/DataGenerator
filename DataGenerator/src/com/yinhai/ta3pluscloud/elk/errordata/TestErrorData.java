package com.yinhai.ta3pluscloud.elk.errordata;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TestErrorData {
	private Integer actionExecuteTime=0;
	private String browser=new String("Chrome");
	private String clientIp=new String("0:0:0:0:0:0:0:1");
	private Integer date=0;
	private Boolean iserror=false;
	private Integer menuid=0;
	private String menuname="sudo user";
	private String os="Windows7";
	private String serverIp=new String("0:0:0:0:0:0:0:1:8080");
	private List<ServiceInformation> serviceInfo=new ArrayList<ServiceInformation>();
	private String url=new String("http://localhost:8080/ta3localold/org/admin/adminUserMgAction!toFuncAdminUsePoermission2.do");
	private Integer userid=1;
	private String username="root";
	
	
}
