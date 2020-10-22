package text3;

import java.util.Scanner;

public class Shuzu {

		public static void main(String[] args) {
			System.out.println("请输入学生人数:");
			Scanner reader = new Scanner(System.in);//创建Scanner对象，从键盘中获取学生个数
			int num = reader.nextInt();  //记录学生个数
			int students[] = new int[num];	//通过学生个数，创建数组
			int no = 0;  //不及格人数
			int maxscore = 0; // 最高分
			int maxperson = 1; // 最高分学生
			System.out.println("请输入每个学生的成绩:限制在0~100");
			
			//for循环，获取学生成绩
			for ( int a = 0; a < num; a++) {
				students[a] = reader.nextInt();
				//if条件语句，判断不及格人数、最高分、最高分学生
				if (students[a] < 60) {
					no++;
				}
				if (maxscore < students[a]) {
					maxscore = students[a];
					maxperson = a;
				}
			}
			
			System.out.println("最高分的学生的成绩是:" + maxscore);
			System.out.println("他是第:" + (maxperson + 1) + "个学生");
			System.out.println("不及格的人数:"+ no);
	 

			
	}

}
