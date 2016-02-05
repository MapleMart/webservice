package com.hyf.webservice.interfaces;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace="http://interfaces.webservice.hyf.com/")
@SOAPBinding(style=Style.DOCUMENT)
public interface Test2Service
{
	public String test(String data);
}
