package com.example.BusReservationOnline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BusReservationOnline.model.BusDetailRequest;
import com.example.BusReservationOnline.model.BusDetailResponse;
import com.example.BusReservationOnline.service.BusSearchService;

@RestController
public class BusSearchController {
	
	@Autowired
	private BusSearchService busSearchService;
	
	@PostMapping(path="/getSearchDetails")
	public @ResponseBody List<BusDetailResponse> getSearchDetails(@RequestBody BusDetailRequest request) 
				throws Exception{
		 List<BusDetailResponse> response = null;	 
		 response=busSearchService.getBusSearchDetail(request);
		 return response;		 
	}
}
