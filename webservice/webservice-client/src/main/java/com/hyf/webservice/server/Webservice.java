package com.hyf.webservice.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.hyf.webservice.interfaces.impl.TestServiceImpl;


public class Webservice
{
	public static void main(String[] args)
	{
		//webservice可以用tomcat启动(webservice-web工程)，也可以自己写线程启动（这里），
		
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(TestServiceImpl.class);
		factory.setAddress("http://192.168.87.89:8080/webservice/test");
		Server server = factory.create();
		server.start();
		//访问http://192.168.87.89:8080/webservice/test/test?wsdl
		
//		JaxWsServerFactoryBean factory2 = new JaxWsServerFactoryBean();
//		factory2.setServiceClass(Test2ServiceImpl.class);
//		factory2.setAddress("http://192.168.87.89:8080/webservice/test2");
//		Server server2 = factory2.create();
//		server2.start();
		
	}
}
