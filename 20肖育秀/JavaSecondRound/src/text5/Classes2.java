package text5;

import java.util.Scanner;

public class Classes2 {
	String grade;//年级
	String major;//专业
	String id;//班级序号
	String manager;//班级负责人
	
	public Classes2(String grade,String major,String id){ //定义有参的构造方法1
		this.grade = grade;//明确访问成员变量grade 
		this.major = major;//明确访问成员变量major
		this.id = id;//明确访问成员变量id
	}
	
	public  Classes2(String grade,String major,String id,String manager){ //定义有参的构造方法2
		this.grade = grade;//明确访问成员变量grade
		this.major = major;//明确访问成员变量major
		this.id = id;//明确访问成员变量id
		this.manager = manager;	//明确访问成员变量manager
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //创建Scanner对象，从键盘中读取数据
		System.out.println("请输入班级数量:");
		int num = sc.nextInt(); //记录班级个数
		Classes2[] classes = new Classes2[num]; //通过班级个数，创建数组
		//for循环
		for (int i = 0; i < num; i++) {
			System.out.println("请输入班级：");
			String grade = sc.next();
			System.out.println("请输入专业：");
			String major = sc.next();
			System.out.println("请输入班级序号：");
			String id = sc.next();
			System.out.println("请输入班级负责人：");
			String manager = sc.next();
			//if语句判断是否有负责人
			if (manager != null) {
				classes[i] = new Classes2(grade, major, id);
			} else {
				classes[i] = new Classes2(grade, major, id, manager);
			}
		}
		// 查询的方式
		System.out.println("请输入按照哪种方式查询数据：1.班级;2.专业;3.班级序号");
		int a = sc.nextInt();
		// 用switch语句来进行多层判断
		switch (a) {
		//按班级查询
		case 1: 
			System.out.println("请输入查询的年级：");
			String b = sc.next();
			System.out.println("查询结果如下：");
			//for循环
			for (int i = 0; i < num; i++) {
				if (classes[i].grade.equals(b)) {
					//if语句判断是否有负责人
					if (classes[i].manager != null) {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id);
					} else {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id+ "\n" + "班级负责人" + classes[i].manager);
					}
				}
			}
			break;
		//按专业查询
		case 2:
			System.out.println("请输入查询的专业：");
			String c = sc.next();
			System.out.println("查询结果如下：");
			//for循环
			for (int i = 0; i < num; i++) {
				if (classes[i].major.equals(c)) {
					// if语句判断是否有负责人
					if (classes[i].manager != null) {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id + "\n");
					} else {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id + "\n" + "班级负责人" + classes[i].manager);
					}
				}
			}
			break;
		//按班级序号
		case 3:
			System.out.println("请输入查询的班级序号：");
			String d = sc.next();
			System.out.println("查询结果如下：");
			// for循环
			for (int i = 0; i < num; i++) {
				if (classes[i].id.equals(d)) {
					//if语句判断是否有负责人
					if (classes[i].manager != null) {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id);
					} else {
						System.out.println("年级：" + classes[i].grade + "\n" + "专业:" + classes[i].major + "\n"+ "班级序号:" + classes[i].id + "\n" + "班级负责人" + classes[i].manager);
					}
				}
			}
			break;
		}
	}
}




