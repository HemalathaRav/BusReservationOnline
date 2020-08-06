package com.example.BusReservationOnline.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.BusReservationOnline.model.BusDetailList;
import com.example.BusReservationOnline.model.BusDetailRequest;
import com.example.BusReservationOnline.model.BusDetailResponse;
import com.example.BusReservationOnline.model.BusDetailTableEntity;
import com.example.BusReservationOnline.repository.BusDetailTableRepository;



@Component
public class BusSearchService {

	@Autowired
	BusDetailTableRepository repository;
	
	public List<BusDetailResponse> getBusSearchDetail(BusDetailRequest request) throws Exception {
		 List<BusDetailList> busDetailsList = searchBusDetails(request);
		 List<BusDetailResponse> searchResult = new ArrayList<>();
		 buildeResponse(busDetailsList, searchResult);
		 return searchResult;
	}
	
	private void buildeResponse(List<BusDetailList> busDetailsList, List<BusDetailResponse> searchResult ) {
		BusDetailResponse response = new BusDetailResponse();
		for(BusDetailList busdetail : busDetailsList) {
			 response.setBusNumber(busdetail.getBusNumber());
			 response.setOperatorName(busdetail.getOperatorName());
			 response.setDepatureTime(busdetail.getDepatureTime());
			 response.setArrivalTime(busdetail.getArrivalTime());
			 response.setDuration(busdetail.getDuration());
			 response.setPrice(busdetail.getPrice());
			 searchResult.add(response);
		 }
	}
	
	private List<BusDetailList> findAll(){
		Iterable<BusDetailTableEntity> findAll = repository.findAll();
		List<BusDetailList> responseList = new ArrayList<BusDetailList>();
		findAll.forEach(e -> buildResponse(e, responseList));
		return responseList;		
	}
	
	private void buildResponse(BusDetailTableEntity entity, List<BusDetailList> responseList) {
		BusDetailList response = new BusDetailList();
		BeanUtils.copyProperties(entity, response);
		responseList.add(response);		
	}
	
	public List<BusDetailList> searchBusDetails(BusDetailRequest request) {
		
		List<BusDetailList> responseDetails = findAll();
		Predicate<BusDetailList> predicateWithoutReturnDateSearch = x-> (x.getSourceCity().equals(request.getSourceCity())
													&& x.getDestinationCity().equals(request.getDestinationCity()))
													&& x.getTravelDate().toString().equals(request.getTravelDate());
		
		Predicate<BusDetailList> predicateWithReturnDateSearch = x-> (x.getSourceCity().equals(request.getSourceCity())
				&& x.getDestinationCity().equals(request.getDestinationCity()))
				&& (x.getTravelDate().toString().equals(request.getTravelDate())
					&& x.getReturnDate().toString().equals(request.getReturnDate()));
			
		if(request.getReturnDate()==null) {
			responseDetails = responseDetails.stream().filter(predicateWithoutReturnDateSearch).collect(Collectors.toList());
		}
		else {
			responseDetails = responseDetails.stream().filter(predicateWithReturnDateSearch).collect(Collectors.toList());
		}
		
		return responseDetails;
		 
	}
}
