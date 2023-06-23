/*새를정의한다*/
package com.sp.project0623.animal;

public class Bird{
	String name="그냥 새";
	int wingCount=2;
	private boolean hasFeather=true;

	public Bird(boolean hasFeather){
		System.out.println("새의 초기화를 위한 생성자호출");
		this.hasFeather=hasFeather;
	}

	public void fly(){
		System.out.println(name+"이 펄덕거려요");
	}
}
