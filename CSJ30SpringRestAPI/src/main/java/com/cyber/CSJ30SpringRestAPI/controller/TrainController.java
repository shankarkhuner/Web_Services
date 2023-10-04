package com.cyber.CSJ30SpringRestAPI.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cyber.CSJ30SpringRestAPI.dao.TrainServiceImpl;
import com.cyber.CSJ30SpringRestAPI.entity.Train;


@RestController
public class TrainController {
	
	/*
	POST-create resources
	PUT-update complete resource
	PATCH-update partial resources
	DELETE-delete a resource
	*/
	@Autowired
	private TrainServiceImpl trainService;
	@PostMapping("/addTrain")
	
	
	public Train createTrainResource(@RequestBody Train train) {
		Train trainObj=trainService.addTrain(train);
		return trainObj;
	}

	//url: locahost:5677/getAllTrain
	@GetMapping(path="/getAllTrain")
	
	public List<Train> getAllTrain()
	{
		return trainService.getAllTrain();
	}
	@GetMapping("/getTrainByNumber/{tno}")
	public Train getTrainByNumber(@PathVariable int tno) {
		return trainService.getTrainByNumber(tno);	
	}
	@PutMapping("/updateTrain/{tno}")
	public String updateTrainByNumber(@PathVariable int tno, @RequestBody Train train)
{
		int status=trainService.updateTrain(tno, train);
		if(status>0) {
			return "train date update Successfully";
		}else {
			return "nat able to update";
		}		
		}
	
	
	
	/*public Train geAllTrain()
	{
		Train train=new Train();
		train.setTrainNumber(1223);
		train.setTrainName("PUN-HWH DURONTO EXPRESS");
		train.setSourceStation("PUNE");
		train.setDestinationStation("HOWRAH");
		train.setTrainPrice(5200.00);
		train.setTrainStatus("RUNNING ON MONADY and staurday");
		train.setJourneyDate(LocalDate.now());
		return train;
	}*/
	
	
	
	
	
}
