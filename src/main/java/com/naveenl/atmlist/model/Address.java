package com.naveenl.atmlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	"street",
	"housenumber",
	"postalcode",
	"city",
	"geoLocation"
})
public class Address {

	@JsonProperty("street")
	private String street;
	
	@JsonProperty("housenumber")
	private String housenumber;
	
	@JsonProperty("postalcode")
	private String postalcode;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("geoLocation")
	private GeoLocation geoLocation;

	
	@Override
	public String toString() {
		return "Address [street=" + street + ", housenumber=" + housenumber + ", postalcode=" + postalcode + ", city="
				+ city + ", geoLocation=" + geoLocation + "]";
	}

	public String getCity() {
		return city;
	}
}
