package me.umar.task3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValuesManage {
	
	public Value[]values;
	
	@JsonCreator
	public ValuesManage(@JsonProperty("values")Value[] values) {
		this.values = values;
	}
	
	
	public Value[] getValues() {
		return values;
	}

	public void setValues(Value[] values) {
		this.values = values;
	}
	
	@JsonIgnore
	public void show() {
		for (int i=0;i<values.length;i++) {
			Value v = values[i];
			System.out.println("Value N "+i);
			v.show();
		}
	}

}