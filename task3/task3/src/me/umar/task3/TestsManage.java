package me.umar.task3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestsManage {
	public DTest[]tests;
	
	@JsonCreator
	public TestsManage(@JsonProperty("tests")DTest[]tests) {
		this.tests = tests;
	}

	public DTest[] getTests() {
		return tests;
	}

	public void setTests(DTest[] tests) {
		this.tests = tests;
	}
	
	@JsonIgnore
	public DTest findTestById(int id) {
		DTest test = null;
		for (DTest t: tests) {
			//System.out.println(t.getId());
			if (t.getId()==id) {return t;} else {
				test = t.findTestById(id);
				if (test!=null) {
					return test;
				}
			}
		}
		return test;
	}
	
	@JsonIgnore
	public void show() {
		for (int i = 0; i<tests.length; i++) {
			DTest t = tests[i];
			System.out.println("===== "+i+"=========");
			t.show();
		}
	}
}
