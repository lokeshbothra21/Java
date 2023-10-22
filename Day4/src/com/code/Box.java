package com.code;

public class Box {
	private int height;
	private int width;
	private int length;
	
	public Box(int height,int width,int length) {
		this.height=height;
		this.width=width;
		this.length=length;
		
	}
public Box(int side) {
//	this(side,side,side);
System.out.println(side);
}
@Override
public String toString() {
	return height+" "+width+" "+length;
}
public Box() {

	this.height=10;
	this.width=20;
	this.length=30;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public boolean isSame(Box boxobj) {
	if(this.height==boxobj.height && this.width==boxobj.width && this.length==boxobj.length) {
		return true;
	}
	else
		return false;
}


}
