package com.naveenl.atmlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
"address",
"distance",
"type"
})
public class ATM {

	@JsonProperty("address")
	private Address address;
	
	@JsonProperty("distance")
	private Integer distance;
	
	@JsonProperty("type")
	private String type;

	
	@Override
	public String toString() {
		return "ATM [address=" + address + ", distance=" + distance + ", type=" + type + "]";
	}

	public Address getAddress() {
		return address;
	}
}
