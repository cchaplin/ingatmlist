package com.naveenl.atmlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveenl.atmlist.dao.AtmListDAO;
import com.naveenl.atmlist.model.ATM;

@RestController
public class ATMController {
	
	private final AtmListDAO atmDAO;
	
	@Autowired
	ATMController(AtmListDAO dao) {
		this.atmDAO = dao;
	}
	
	@GetMapping("/atms")
	public List<ATM> retrieveAtmList(@RequestParam(required=false) String city){
		if (null == city || city.isEmpty())
			return atmDAO.listAllAtm();
		return atmDAO.listAtmByCity(city);
	}


}
