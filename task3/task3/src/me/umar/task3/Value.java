package me.umar.task3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Value{
	public int id;
	public String value;
	
	@JsonCreator
	public Value(@JsonProperty("id") int id, @JsonProperty("value")String value) {
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@JsonIgnore
	public void show() {
		System.out.println("id:"+id);
		System.out.println("value:"+value);
	}
}
