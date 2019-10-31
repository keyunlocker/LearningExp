package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Component
public class HystrixTryclass {

	@Autowired
	Tryclass tryclass;
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="exec")
	public DataReciev executeabc(DataSend dataSend) throws Exception {
		DataReciev dataReciev=null;
		try {
			dataReciev = execute(dataSend.isSelected());
			
		}catch (Exception e) {
			throw e;
		}
		return dataReciev;
	}
	
	
	public DataReciev execute(boolean dataSend) throws Exception  {
		if(dataSend) {
			tryclass.setA(7);
			throw new Exception();
		}else {
			tryclass.setA(8);
			throw new Exception();
		}
	}
	
	public DataReciev exec(DataSend dataSend) {
		System.out.println(dataSend);
		System.out.println(tryclass);
		System.out.println("hystrixclass"+ this.hashCode());
		return new DataReciev();
		
	}
	
}
