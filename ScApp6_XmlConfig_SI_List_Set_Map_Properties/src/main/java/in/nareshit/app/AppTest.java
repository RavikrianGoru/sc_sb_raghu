package in.nareshit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.nareshit.bean.Student;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("mybeans.xml");
		Student sobj = ac.getBean("student", Student.class);
		System.out.println(sobj);
		System.out.println(sobj.getMarks().getClass().getName());
		System.out.println(sobj.getSubjects().getClass().getName());
		System.out.println(sobj.getResults1().getClass().getName());
		System.out.println(sobj.getData().getClass().getName());
		
	}

}
