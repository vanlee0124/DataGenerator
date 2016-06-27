package com.yinhai.ta3pluscloud.elk;
import com.google.gson.*;
import com.yinhai.ta3pluscloud.elk.errordata.TestErrorData;

public class TestErrorDataToJSON {
	public static String testErrorDataToJSON(TestErrorData testErrorData)
	{
		Gson gson=new Gson();
		return gson.toJson(testErrorData);
	}
}
