package com.cyber.CSJ30SpringRestAPI.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.CSJ30SpringRestAPI.entity.Train;
import com.cyber.CSJ30SpringRestAPI.exception.InvalidTrainNumber;
import com.cyber.CSJ30SpringRestAPI.repository.TrainRepository;
import com.cyber.CSJ30SpringRestAPI.service.TrainService;


@Service
public class TrainServiceImpl implements TrainService{
	@Autowired
	private TrainRepository trainRepository;
	@Override
	public Train addTrain(Train train) {
		Train trainObj=trainRepository.save(train);
		return trainObj;
	}
	@Override
	public List<Train> getAllTrain() {
		List<Train> al=new ArrayList();
		Iterable<Train> list=trainRepository.findAll();
		Iterator<Train> itr=list.iterator();
		while(itr.hasNext()) {
			al.add(itr.next());
		}
		
		return al;
	}
	@Override
	public Train getTrainByNumber(int trainNumber) {
		// TODO Auto-generated method stub
		Train t=trainRepository.findById(trainNumber).get();
		return t;
	}
	@Override
	public int updateTrain(int trainNumber, Train newTrain) {
		int status=trainRepository.updateTrain(trainNumber, newTrain.getTrainName(), newTrain.getSourceStation(), newTrain.getDestinationStation(), newTrain.getTrainPrice());
	     return status;
	}
	@Override
	public int deleteTrain(int trainNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
