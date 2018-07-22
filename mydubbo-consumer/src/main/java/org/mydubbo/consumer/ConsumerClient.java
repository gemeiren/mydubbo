package org.mydubbo.consumer;


import org.mydubbo.api.inter.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerClient {
	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");  
        HelloService helloService = (HelloService) context.getBean("helloService");  
        String result = helloService.SayImp("2018-520");  
        System.in.read(); 
    } 
}
