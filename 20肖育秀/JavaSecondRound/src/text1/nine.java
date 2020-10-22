package text1;

public class nine {

	public static void main(String[] args) { //程序启动启点
		int n ; //乘数
		int m ; //被乘数
		
		//for循环嵌套
		for (n = 1; n < 10 ; n++) { 
			for(m = n ; m < 10 ; m++) {
				System.out.print( n + "*" + m + "=" + ( n*m ) + "\t" );
			}		
		System.out.print(  "\n") ;
		}
	}
}

		 
	