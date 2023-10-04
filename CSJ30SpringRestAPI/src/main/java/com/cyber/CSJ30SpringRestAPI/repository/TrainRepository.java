package com.cyber.CSJ30SpringRestAPI.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cyber.CSJ30SpringRestAPI.entity.Train;
@Repository
public interface TrainRepository extends CrudRepository<Train, Integer>{

	@Transactional
	@Modifying
	@Query("update Train t set t.trainNumber=:tno, t.trainName=:tname, t.sourceStation=:tsource, t.destinationStation=:tdest, t.trainPrice=:tprice")
	public int updateTrain(@Param("tno") int tno,@Param("tname")String tname, @Param("tsource") String tsource,@Param("tdest") String tdest,@Param("tprice")double tprice);
}
