package com.system.blog;

import javax.validation.constraints.NotNull;

public class TestVO {
	
	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
