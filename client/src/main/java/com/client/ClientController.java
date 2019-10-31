package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	HystrixTryclass hystrixTryclass;
	
	@GetMapping("/")
	public DataReciev getData() throws Exception {
		DataSend dataSend=new DataSend();
		dataSend.setSelected(true);
		System.out.println(byte[].class);
		throw new ResponseStatusException("Ani");
		//return hystrixTryclass.executeabc(dataSend);
	}
	
	@GetMapping("/try")
	public DataReciev getDatatry() throws Exception {
		DataSend dataSend=new DataSend();
		dataSend.setSelected(false);
		System.out.println(byte[].class);
		return hystrixTryclass.executeabc(dataSend);
	}
	
	@PostMapping(value="/post",consumes= {"application/xml"})
	public ResponseEntity<DataReciev> postData(RequestEntity<DataSend> requ){
		System.out.println();
		return new  ResponseEntity<DataReciev>(new DataReciev(), HttpStatus.ACCEPTED);
	}
}
