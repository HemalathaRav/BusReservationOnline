package com.example.BusReservationOnline.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.mockito.Mockito.when;

import com.example.BusReservationOnline.controller.BusSearchController;
import com.example.BusReservationOnline.model.BusDetailRequest;
import com.example.BusReservationOnline.model.BusDetailResponse;
import com.example.BusReservationOnline.service.BusSearchService;

@ExtendWith(MockitoExtension.class)
public class BusSearchControllerTest {
	private @Mock BusSearchService service;
	private @Autowired MockMvc mockMvc;
	private @InjectMocks BusSearchController controller;
	BusDetailRequest request;
	List<BusDetailResponse> response;
	@Test
	public void testBusSearchController() throws Exception {
		
		request = new BusDetailRequest();
		response = new ArrayList<BusDetailResponse>();
		when(service.getBusSearchDetail(this.request)).thenReturn(this.response);
		assertEquals(controller.getSearchDetails(this.request), this.response);
		
	}
	
	

}
