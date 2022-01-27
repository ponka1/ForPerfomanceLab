package me.umar.task3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DTest {
	public int id;
	public String title;
	public String value;
	public DTest[]values;
	
	@JsonCreator
	public DTest(@JsonProperty("id")int id, @JsonProperty("title")String title, @JsonProperty("value")String value, @JsonProperty("values")DTest[]values) {
		this.id = id;
		this.title = title;
		this.value = value;
		this.values = values;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DTest[] getValues() {
		return values;
	}

	public void setValues(DTest[] values) {
		this.values = values;
	}
	
	@JsonIgnore
	public void show() {
		System.out.println("id:"+id);
		System.out.println("title:"+title);
		System.out.println("value:"+value);
		System.out.println("values:"+values);
	}
	
	@JsonIgnore
	public DTest findTestById(int id) {
		DTest test = null;
		if (this.id == id) {return this;}
		if (values!=null) {
			for (DTest t: values) {
				test = t.findTestById(id);
				if (test!=null) {return test;}
			}
		}
		return test;
	}
}
