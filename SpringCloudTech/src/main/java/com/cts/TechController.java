package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechController {
	
	@Autowired
	TechnologyRepository techRep;
	
	@GetMapping("getTech/{techId}")
	public Batch getTechnology(@PathVariable int techId) {
		
		return techRep.findTechnology(techId);
		
	}

}
