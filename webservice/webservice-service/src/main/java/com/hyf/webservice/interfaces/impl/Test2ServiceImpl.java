package com.hyf.webservice.interfaces.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.hyf.webservice.interfaces.Test2Service;

@WebService(targetNamespace="http://interfaces.webservice.hyf.com/")
@SOAPBinding(style=Style.DOCUMENT)
public class Test2ServiceImpl implements Test2Service
{

	public String test(String data)
	{
		return "test";
	}

}
