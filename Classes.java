	public void setMajor(String major){
		this.major = major;//设置major的值
	}
	
	public void setid(String id){
		this.id = id ;//设置id的值
	}
	
	public void method1() {    // 方法1
		System.out.println("输出班级所有信息");
		if (manager!= null) {    //用if语句判断是否有班级负责人
			System.out.println("年级：" + grade + "\n" + "专业:" + major+ "\n" + "班级序号:" + id + "\n" + "班级负责人:" + manager);
		} else {
			System.out.println("年级：" + grade + "\n" + "专业:" + major+ "\n" + "班级序号:" + id);
				}
	}
	 
	public void getmanager(){   //方法2
		
	}
	
	public void method3(String manager){   //方法3
		this.manager = manager;//设置班级负责人
	}
	
	public static void main(String[] args){
		Classes class_1 = new Classes("1班","2020级","软件工程","张强");
		Classes class_2 = new Classes("2班","2020级","软件工程");
		class_1.method1();
		System.out.println();
		class_2.method1();
	}

//(2)题	
		Classes[] classesArray = {class_1 , class_2} ;
		String queryParam_grade = "";  //年级
		String queryParam_major= "";  //专业
		String queryParam_id = "";   //班级序号
		Classes result = queryBy (classesArray,queryParam_grade,queryParam_major,queryParam_id);{ 
		//用if语句判断查询结果是否存在
		if (null != result) {  
			result.method1();
		}
	}
	//没有数据则进行友好提示
	public static Classes queryBy(Classes[]datas,String grade,String major,String id){
		if (datas == null || datas.length == 0);{  
			System.out.println("无法查询");
		}
	
	//for循环遍历所有数据，查询到符合条件的数据则返回和中止循环
	for (int i = 0; i < datas.length; i++){ 
		if(datas[i].grade.equals(grade) || datas[i].major.equals(major) || datas[i].id.equals(id)){
			return datas[i];
		}
	}
	//遍历完所有数据没有符合条件的数据则友好提示
	System.out.println("未查询到数据");
		
	}	
}	
	
		
