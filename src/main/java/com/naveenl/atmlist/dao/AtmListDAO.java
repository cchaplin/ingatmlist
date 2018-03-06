package com.naveenl.atmlist.dao;

import java.util.List;

import com.naveenl.atmlist.model.ATM;

public interface AtmListDAO {

	List<ATM> listAllAtm();
	List<ATM> listAtmByCity(String city);
}
