package lab_2;

import java.util.Scanner;

public class courseSystem {
	
	public static void main(String[] args) {
		// ������ķ�ʽʵ�����γ���
		Course[] c = new Course[3];
		c[0] = new Course(0, "java","����","10��22��","��ĳĳ");
		c[1] = new Course(1, "���ݿ�","���","10��25��","��ĳĳ");
		c[2] = new Course(2, "����","��ɽ","10��27��","��ĳĳ");
		System.out.println("-----------------��ӭ����ѡ��ϵͳ------------------------");
		for(int i = 0; i<c.length;i++) {
			System.out.println();
			System.out.println(c[i]);
		}
		System.out.println("--------------------------------------");
		Students stu = new Students(1,"�ܛ���","��");
		int  num = 0;
		String exit = "ok";
		while(exit.equals("ok")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������ѡ�γ�");
			num = scanner.nextInt();
			stu.setCourse(c[num]);
			System.out.println("���Ļ�����Ϣ��"+stu);
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("�����롮q�����˳�ѡ��ϵͳ��");
			exit = scanner1.nextLine();
		}
		System.out.println("--------------------------------------");
		System.out.println("ʣ��γ����£�");
		for(int i=0;i<c.length;i++) {
			if(i == num) {
				continue;
			}
			System.out.println();
			System.out.println(c[i]);
		}
		
	}

}
//��Ա��
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
		return"���" + this.number+",������"+this.name +this.sex;
	}
}
//��ʦ��̳�����Ա��
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
		return"��ţ�" + this.number +",������"+this.name +",�Ա�"+ this.sex +",���ڿγ�"+c.getCourseNmae();
	}
}
//ѧ����̳�����Ա��
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
		return super.toString()+",��ѧ�γ�"+c.getCourseName();
	}
}
//�γ���
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
		return"["+"��ţ�"+this.number+",�γ����ƣ�"+this.courseName+",�Ͽεص㣺"+this.site+"��ʱ�䣺"+this.time+",�ڿν�ʦ��"+this.teacher+"]";
	}
}



















