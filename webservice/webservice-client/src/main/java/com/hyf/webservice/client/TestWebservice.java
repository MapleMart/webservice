package com.hyf.webservice.client;

import org.junit.Test;


public class TestWebservice
{

		@Test
		public void test() throws Exception
		{
			String url = "http://192.168.87.89:8088/webservice-web/test/test?wsdl";
			String method = "test";
			String data = "123";
			Object obj = WebserviceUtil.invoke(url, method, data);
			System.out.println(obj.toString());
		}
		
}
