package com.class25;

public class TestTeachers {

	public static void main(String[] args) {
		MathTeacher teacher1=new MathTeacher("John","Sun",'M',"Math");
		teacher1.salary=5000;
		teacher1.email="jsun@gmail.com";
		teacher1.age=25;
		System.out.println("the salary is "+teacher1.salary+" and email adress is "+teacher1.email);
		teacher1.teach();
		teacher1.calculate();
		System.out.println("**************************");
		PianoTeacher teacher2=new PianoTeacher("Jane","Small",'F',"Piano");
		teacher2.subBranch="PE";
		teacher2.email="janesmall@gmail.com";
		teacher2.age=45;
		System.out.println("the subBranch is "+teacher2.subBranch+" and email adress is "+teacher2.email);
		teacher2.teach();
		teacher2.play();
		System.out.println("**************************");
		ChemistryTeacher teacher3=new ChemistryTeacher("Barett","Kirland",'F',"Chemistry");
		teacher3.universitiy="Oxford";
		teacher3.email="barettk@gmail.com";
		teacher3.age=36;
		System.out.println("The universitiy is "+teacher3.universitiy+" and email adress is "+teacher3.email);
		teacher3.teach();
		teacher3.experince();
		System.out.println("**************************");
		Teacher teacher4=new Teacher("Rose","Smile",'F',"Math");
		teacher4.teach();
		

	}

}
