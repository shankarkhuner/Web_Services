package com.cts;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class EmpController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	//Represents read operations commonly available to discovery services such as NetflixEureka 
	
	@Autowired
	DiscoveryClient discoveryClient;
	//getEmp/1/2
	@GetMapping("getTrainer/{id}/{techId}")
	public Trainer getEmployee(@PathVariable int id,@PathVariable int techId) {
		
		Trainer emp=empRepo.findEmployee(id);
		
		//Technology tech=new RestTemplate().getForObject("http://localhost:8070/getTech/"+techId, Technology.class);
		//getInstance() method Gets all ServiceInstances associated with a particular serviceId.
		List<ServiceInstance> list=discoveryClient.getInstances("TECHSERVICE");//Employee,Order,Project
		
		ServiceInstance service=list.get(0);
		//localhost:8090/getTech/2
		// Uniform Resource Identifier (URI) reference. 
		URI url=service.getUri();
		
		//Create a new instance of the RestTemplate using default settings.Default HttpMessageConverters are initialized.

		
		Batch tech=new RestTemplate().getForObject(url+"/getTech/"+techId, Batch.class);
		
		
		emp.setTechnology(tech);
		
		return emp;
		
	}

}
