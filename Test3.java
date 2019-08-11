/*
	演示变量的先声明后赋值
*/
public class Test3{

	public static void main(String[] args){
		
		int i;
		i = 3;
		System.out.println(i);

		int a = 4;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		/*
		   容易出现的问题
		   1.变量名不能重复
		   2.变量在使用前必须先声明（创建）
      	           3.变量的赋值必须在数据类型的范围内
		*/

    		int m = 44;
		System.out.println("原始的m："+m);
		m = 66;
		System.out.println("更新后的m："+m);
		
		System.out.println("------------------------");

		//报错，因为没有声明
	`	//n = 100;
		//System.out.println(n);	


		





		
	
	}

}