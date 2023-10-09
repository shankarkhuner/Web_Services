package com.cyber.success.CSJ29WebRestfullApi.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyber.success.CSJ29WebRestfullApi.entity.Train;
@RestController
public class TrainController {

	@RequestMapping("/getAllTrain")
	public Train getAllTrain() {
		Train train = new Train();
		train.setTrainNumber(122);
		train.setTrainName("India");
		train.setSourceStation("pune");
		train.setDestinationStation("Parbhani");
		train.setTrainPrice(5500.00);
		train.setJourneyDate(LocalDate.now());
		train.setTrainStatus(" On the way Monday to Saturday");
		return train;
		
	}
}
