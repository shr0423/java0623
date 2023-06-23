package com.sp.project0623.animal;
class UseDuck 
{
	public static void main(String[] args) {
		//오리를 생성한후 오리가 직접 보유하고 있찌 않은
		//깃털을 출력해본다

		//상속관계에서 자식의인스턴스를생성하는 시점에,
		//즉 자식의 생성자를 호출할때 시점 상, 부모가 먼저
		//인스턴스가 생성되어야 하므로 sun사는 부모의 생성자를
		//자동으로 호출한다 super();
		 Duck d=new Duck();
		// System.out.println(d.hasFeather);
	}
}
