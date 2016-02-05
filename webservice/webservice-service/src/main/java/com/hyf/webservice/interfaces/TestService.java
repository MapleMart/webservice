package com.hyf.webservice.interfaces;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace="http://interfaces.webservice.hyf.com/")
@SOAPBinding(style=Style.DOCUMENT)
public interface TestService
{
	public String test(String data);
	public String test2(String data);
}
