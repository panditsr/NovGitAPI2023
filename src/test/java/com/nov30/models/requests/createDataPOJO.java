package com.nov30.models.requests;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"description",
"homepage",
"private"
})
public class createDataPOJO {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("homepage")
	private String homepage;
	
	@JsonProperty("private")
	private String _private;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
	return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
	this.description = description;
	}

	@JsonProperty("homepage")
	public String getHomepage() {
	return homepage;
	}

	@JsonProperty("homepage")
	public void setHomepage(String homepage) {
	this.homepage = homepage;
	}

	@JsonProperty("private")
	public String getPrivate() {
	return _private;
	}

	@JsonProperty("private")
	public void setPrivate(String _private) {
	this._private = _private;
	}

	

}
