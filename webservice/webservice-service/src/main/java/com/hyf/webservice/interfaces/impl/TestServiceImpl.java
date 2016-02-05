package com.hyf.webservice.interfaces.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.hyf.webservice.interfaces.TestService;

@WebService(targetNamespace="http://interfaces.webservice.hyf.com/")
@SOAPBinding(style=Style.DOCUMENT)
public class TestServiceImpl implements TestService
{

	public String test(String data)
	{
		
		return "test";
	}

	public String test2(String data)
	{
		return "test2";
	}

}
