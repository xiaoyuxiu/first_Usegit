package text2;

public class shuxianhua {

	public static void main(String[] args) {   //程序启动启点
		//定义变量类型
		int x = 100 ;
		int a = 0 ;
		int b = 0;
		int c = 0;
		//for循环，求出该数百位、十位、个位上的数
		for (x = 100 ;x < 1000 ; x++) {
			a = x / 100 ;   //百位
			b = (x % 100) / 10 ;    //十位
			c = x % 10 ;  //个位
			//for循环嵌套if语句，Math.pow函数用于返回一个数的指定次幂
			if (x == Math.pow (a , 3)+Math.pow (b , 3)+Math.pow (c , 3)) {
				System.out.println("水仙花数：" + x);
			}
		}
	}
}
	

