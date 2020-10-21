package classone;

public class Classes {
	String grade;//年级
	String major;//专业
	String id;//班级序号
	String manager;//班级负责人
	
	public Classes(String grade,String major,String id){ //定义有参的构造方法1
		this.grade = grade;//明确访问成员变量grade 
		this.major = major;//明确访问成员变量major
		this.id = id;//明确访问成员变量id
	}
	
	public  Classes(String grade,String major,String id,String manager){ //定义有参的构造方法2
		this.grade = grade;//明确访问成员变量grade
		this.major = major;//明确访问成员变量major
		this.id = id;//明确访问成员变量id
		this.manager = manager;	//明确访问成员变量manager
	}
	
	public void setGrade(String grade){
		this.grade = grade;//设置grade的值
	}
	
	public void setMajor(String major){
		this.major = major;//设置major的值
	}
	
	public void setid(String id){
		this.id = id ;//设置id的值
	}
	
	public void method1() { // 方法1
		System.out.println("输出班级所有信息");
		if (manager!= null) {
			System.out.println("年级：" + grade + "\n" + "专业:" + major+ "\n" + "班级序号:" + id + "\n" + "班级负责人:" + manager);
		} else {
			System.out.println("年级：" + grade + "\n" + "专业:" + major+ "\n" + "班级序号:" + id);
				}
	}
	 
	public void getmanager(){ //方法2
		
	}
	
	public void method3(String manager){ //方法3
		this.manager = manager;//设置班级负责人
	}
	
	public static void main(String[] args){
		Classes class_1 = new Classes("1班","2020级","软件工程","张强");
		Classes class_2 = new Classes("2班","2020级","软件工程");
		class_1.method1();
		System.out.println();
		class_2.method1();
	}
	
}

