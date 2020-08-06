package com.example.BusReservationOnline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BusReservationOnline.model.BusDetailTableEntity;
import com.example.BusReservationOnline.model.BusDetailTableID;


@Repository
public interface BusDetailTableRepository extends CrudRepository<BusDetailTableEntity,BusDetailTableID>{

}
