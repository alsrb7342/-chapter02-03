package com.javaex.ex05;

public class Student extends Person{
	
	//�ʵ�
	
	protected String schoolName;

	//������
	
	public Student() {}
	
	
	public Student(String schoolName) {
	    //Person(); �θ��� ����Ʈ ������ ����
	    super();
		this.schoolName = schoolName;
	}
	
	
	public Student(String name, int age, String schoolName) {
		//1. �ڽ��� ������ ����-->�Ϸ�x
		//2. �θ��� ������ ȣ��
		//   -�θ��� �����ڸ� ������ �� �ִ�.
		//   -�������� �������� ������ �����ڰ� ����ȴ�.
		//3. �θ��� ������ �۾��� ������ �ڽ��� ������ �۾��� �Ϸ��Ѵ�.
		
		//*�θ� ������ ȣ�� ���
		// ǥ������� ����Ʈ ������ ȣ��
		// ������ �ϸ� ������ ������ ȣ��
		// super(�Ķ����) <-- �̷������� ǥ����.
		super(name, age);
		this.schoolName = schoolName;
	}

	//�޼ҵ� gt st

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
    //�޼ҵ� �Ϲ�
	
	public void showInfo() {
		/*
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(schoolName);
		*/
		System.out.println("�̸�: " + name + " ����: " + age + " �б�: " + schoolName);
	}


	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}


}
