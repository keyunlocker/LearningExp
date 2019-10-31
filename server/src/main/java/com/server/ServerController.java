package com.server;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

	
	@PostMapping(value="/",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public DataReciev sendData(@RequestBody DataSend dataSend) {
		System.out.println(dataSend);
		DataReciev dr= new DataReciev();
		dr.setDataRe("server");
		return dr;
	}
}
