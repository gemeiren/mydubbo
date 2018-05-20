package org.mydubbo.producer;

import org.mydubbo.api.inter.HelloService;

public class HelloServiceImpl implements HelloService {  

	/* (non-Javadoc)
	 * @see org.mydubbo.api.inter.HelloService#SayImp(java.lang.String)
	 */
	@Override
	public String SayImp(String name) {
		 return "你好：" + name;  
	}  
}  
