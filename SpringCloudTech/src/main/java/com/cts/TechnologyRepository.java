package com.cts;

import org.springframework.stereotype.Component;

@Component
public class TechnologyRepository {
	
Batch[] techAr= {
			
			new Batch(1000,"java"),
			new Batch(2000,"mysql"),
			new Batch(3000,"aws"),
			new Batch(4000,"python"),
	};
	
	
	public Batch findTechnology(int techid) {
		
		for(Batch t:techAr) {
			if(t.getTechId()==techid) {
				return t;
			}
		}
		return null;
	}


}
