package com.sp.project0623.animal2;
public class Duck extends Bird{
					/*Duck is a Bird*/

			String  name="난 오리";

			public void fly(){
			System.out.println("오리가날아갑니다");
			}
		public static void main(String[] args){
			//1)만일 오리가 새라면 서로 같은 자료형으로 인정되고
			//  서로 같은 자료형이라면 형변환도 가능해야 한다.
		/*	byte b=5;
			short s=3;
			byte k=(byte)s;*/

		Duck d=new Duck();
		System.out.println(d);
		// 상속관계에서 부모와 자식이 동시에 인스턴스 생성될때는
		//부모,자식의 인스턴스는 자식의 인스턴스로 군집화되어진다.
	//따라서 군집화된 인스턴스내에서 부모의 인스턴스를 접근하려면
	// up casting연산자사용, 다시 작으로 내려오려면 down 
	//casting을 사용한다.
		Bird b1=(Bird)d;
		System.out.println(b1.name);

		Duck d1=(Duck)b1;
		System.out.println(d1.name);
		//군집화된 인스턴스내에서 동일한 메서드가 오버라이딩 되어있다면
		//sun에서는 자식의 메서드를 업그레이드로 인정하여 자식이
		//메서드를 호출하여준다.
		b1.fly();//자식이 메서드를 호출하게 된다

		//원칙:해당 객체자료형을 따라가면 되지만
		//예외:단, 오버라이딩된 메서드가 잇을경우 자식의 메서드를 우선한다.

	//	Bird b=new Bird();

	//	b=d;//새의 자료형으로 오리를 가리키고 잇으므로,
		//자동 형변환이다
		//d=(Duck)b;//down casting
		//d.name;
		//System.out.println(d.name);
		//Duck c=(Duck)b;
		//Bird k=(Bird)c;//up casting
		//System.out.println(c.name);
		//System.out.println(k.name);
		}
}
