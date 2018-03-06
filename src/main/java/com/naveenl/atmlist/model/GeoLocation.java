package com.naveenl.atmlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
"lat",
"lng"
})
public class GeoLocation {
	
	@JsonProperty("lat")
	private String lat;
	
	@JsonProperty("lng")
	private String lng;
	
	@Override
	public String toString() {
		return "GeoLocation [lat=" + lat + ", lng=" + lng + "]";
	}

}
