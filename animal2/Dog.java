package com.sp.project0623.animal2;

//this란? 레퍼런스 변수이다.
//단, 변수명은 이미 java프로그램에서 정해져잇다.

public class Dog {
	String name;
	public void run(String name){
		this.name="난 강아지";
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.name;
		this.name="둘리";
	}
}
