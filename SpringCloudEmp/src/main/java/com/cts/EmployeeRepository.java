package com.cts;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
	
	Trainer[] empAr= {
			
			new Trainer(100,"A"),
			new Trainer(500,"B"),
			new Trainer(200,"C"),
	};
	
	
	
	public Trainer findEmployee(int id) {
		
		for(Trainer e:empAr) {
			
			if(e.getId()==id) {
				return e;
			}
		}
		
		return null;
	}

}

