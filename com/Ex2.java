package com.Practical;

public class Ex2 {
	
	private String  id ;
	private String name;
	
	public Ex2(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id != null && id.matches("^[A-Za-z0-9]+$")) {
			this.id = id;
		}else {
			System.out.println("Invalid ID");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == "null") {
			System.out.println("sorry plese enter proper name");
		}else {
			this.name = name;
		}
		
	}
	
	
	

}
