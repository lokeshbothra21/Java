package com.code;

public class Array {
	private int id;
	private String name;
	public Array() {}
	public Array(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "id:"+id+"name: "+name;
	}

}
