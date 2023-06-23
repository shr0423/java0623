package com.sp.project0623.animal;
public class Duck extends Bird{
	String name="오리";
	int wingCount=2;
	//상속관계에서 부모의 생성자가 인수있는 즉 매개변수가 잇는
	//생성자일 경우 자식 생성자에서의 자동으로 호출하던 super()는
	//더이상 사용하면 안되고
	//개발자가 생성자를 직접 정의하여 처리하자
	public Duck(){
	//	int x=3;
	super(true);
	}
	public void fly(){
		System.out.println(name+"이 펄덕거려요");
	}
}
