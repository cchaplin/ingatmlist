package com.naveenl.atmlist.dao;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.naveenl.atmlist.model.ATM;

public class DefaultAtmDAO implements AtmListDAO {

	private String url = "https://www.ing.nl/api/locator/atms/";
	@Override
	public List<ATM> listAllAtm() {
		System.out.println("Nav: Inside listAllAtm");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		//
		// The response returned by the given URL does not give valid JSON. It begins with )]}',
		// We need to strip those additional characters from beginning of the response to make it a valid JSON.
		// Use this string to convert into a List of ATM Pojo.
		//
		// Ideally, this should have been done as part of RestTemplate call had the response from backend been right.
		//
		String sanitizedResponse = response.getBody().substring(6);
		ObjectMapper jacksonMapper = new ObjectMapper();
		List<ATM> atmList = null;
		try {
			atmList = jacksonMapper.readValue(sanitizedResponse, new TypeReference<List<ATM>>() {});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return atmList;
	}

	@Override
	public List<ATM> listAtmByCity(String city) {
		List<ATM> atmList = listAllAtm().parallelStream()
				.filter(a -> a.getAddress().getCity().equalsIgnoreCase(city))
				.collect(Collectors.toList());
		
		return atmList;
	}

}
