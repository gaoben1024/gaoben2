/*
	Test2用于测试8种基本数据类型
	整型：byte、short、int、long
	浮点型：float、double
	字符型：char
	布尔型：boolean

*/
public class Test2{

	public static void main(String[] args){
		
		byte age = 127;
		System.out.println(age);
		
		short salary = 32123;
		System.out.println(salary);

		int num = 183747475;
		System.out.println(num);

		long time = 220000000L;
		System.out.println(time);

		int s1 = -1000;
		int s2 = 5000;
		int s = s1 + s2;
		System.out.println(s);

		System.out.println("----------------------------");

		float f = 3.14F;
		System.out.println(f);


		double d = 3.143213132143;
		System.out.println(d);

		System.out.println("f是"+f+",d是"+d);
		

		System.out.println("----------------------------");

		char c = '你';
		System.out.println(c);

		System.out.println("----------------------------");
		
		boolean b1 = "true";
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}

}














