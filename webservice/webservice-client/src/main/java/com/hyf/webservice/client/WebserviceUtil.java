package com.hyf.webservice.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * webservice接口调用工具类
 * @author 黄永丰
 * @createtime 2016年1月22日
 * @version 1.0
 */
public class WebserviceUtil
{

	/**
	 * webservice接口调用方法
	 * @author 黄永丰
	 * @createtime 2016年1月22日
	 * @param url webservice的url
	 * @param method 调用方法名称
	 * @param data 调用传入参数
	 * @return Object对象
	 */
	public static Object invoke(String url, String method, String data)
	{
		try
		{
			// 不依赖服务器端接口来完成调用的，也就是不仅仅能调用Java的接口
			JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
			Client client = clientFactory.createClient(url);
			Object[] result = client.invoke(method, data);
			return result[0];
		}
		catch (Exception e)
		{
			throw new RuntimeException("调用服务接口失败."+e.getMessage(),e);
		}
	}

}
