package com.example.BusReservationOnline.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;

import com.example.BusReservationOnline.model.BusDetailList;
import com.example.BusReservationOnline.model.BusDetailRequest;
import com.example.BusReservationOnline.model.BusDetailResponse;
import com.example.BusReservationOnline.repository.BusDetailTableRepository;

@ExtendWith(MockitoExtension.class)
public class BusSearchServiceTest {
	
	@Mock
	private  BusDetailTableRepository repo;
	
	@InjectMocks
	private BusSearchService service;
	
	@Test
	public void testBusSearchDetailService() {
		BusDetailRequest request = new BusDetailRequest();
		request.setSourceCity("ABC");
		request.setDestinationCity("DEF");
		request.setTravelDate("2020-10-1");
		
		BusDetailList response = new BusDetailList();
		response.setBusNumber("BUS-1234");
		response.setDepatureTime("09:00");
		response.setArrivalTime("14:00");
		response.setDuration("5");
		response.setOperatorName("SSS");
		response.setPrice("2500.00");
		response.setReturnDate("2020-10-2");
		response.setSourceCity("ABC");
		response.setDestinationCity("DEF");
		response.setTravelDate("2020-10-1");
		
		List<BusDetailList> searchList = new ArrayList<>();
		searchList.add(response);
		when(service.searchBusDetails(request)).thenResult(searchList);
		List<BusDetailResponse> searchResult = service.getBusSearchDetail(request);
		assertEquals(searchResult.get(0).getBusNumber(), response.getBusNumber());
		assertEquals(searchResult.get(0).getOperatorName(), response.getOperatorName());
		
	}

}
