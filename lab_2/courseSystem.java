package lab_2;

import java.util.Scanner;

public class courseSystem {
	
	public static void main(String[] args) {
		// 以数组的方式实例化课程类
		Course[] c = new Course[3];
		c[0] = new Course(0, "java","北京","10月22日","张某某");
		c[1] = new Course(1, "数据库","天津","10月25日","刘某某");
		c[2] = new Course(2, "高数","唐山","10月27日","周某某");
		System.out.println("-----------------欢迎来到选课系统------------------------");
		for(int i = 0; i<c.length;i++) {
			System.out.println();
			System.out.println(c[i]);
		}
		System.out.println("--------------------------------------");
		Students stu = new Students(1,"周洺旭","男");
		int  num = 0;
		String exit = "ok";
		while(exit.equals("ok")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入编号来选课程");
			num = scanner.nextInt();
			stu.setCourse(c[num]);
			System.out.println("您的基本信息："+stu);
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("请输入‘q’来退出选课系统：");
			exit = scanner1.nextLine();
		}
		System.out.println("--------------------------------------");
		System.out.println("剩余课程如下：");
		for(int i=0;i<c.length;i++) {
			if(i == num) {
				continue;
			}
			System.out.println();
			System.out.println(c[i]);
		}
		
	}

}
//人员类
class Person{
	public int number;
	public String name;
	public String sex;
	
	public Person(int number, String name, String sex) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return"编号" + this.number+",姓名："+this.name +this.sex;
	}
}
//老师类继承自人员类
class Teachers extends Person{
	Course c;

	public Teachers(int number,String name,String sex) {
		super(number,name,sex);
	}
	public void setCourse(Course c) {
		this.c=c;
	}	
	@Override 
	public String toString() {
		return"编号：" + this.number +",姓名："+this.name +",性别："+ this.sex +",所授课程"+c.getCourseNmae();
	}
}
//学生类继承自人员类
class Students extends Person{
	Course c;
	
	public Students(int number,String name,String sex) {
		super(number,name,sex);
	}
	public void setCourse(Course c) {
		this.c=c;
	}
	@Override
	public String toString() {
		return super.toString()+",所学课程"+c.getCourseName();
	}
}
//课程类
class Course{
	public int number;
	public String courseName;
	public String site;
	public String time;
	public String teacher;
	public Course(int number, String courseName, String site, String time, String teacher) {
		super();
		this.number = number;
		this.courseName = courseName;
		this.site = site;
		this.time = time;
		this.teacher = teacher;
	}
	
	public String getCourseNmae() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCourseName() {
		return this.courseName;
	}
	
	public String getTeacherName() {
		return this.teacher;
	}

	

	@Override
	public String toString() {
		return"["+"编号："+this.number+",课程名称："+this.courseName+",上课地点："+this.site+"，时间："+this.time+",授课教师："+this.teacher+"]";
	}
}



















