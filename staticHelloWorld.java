package com.imooc;

public class staticHelloWorld {
    
    String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
    
    // ���췽��
	public staticHelloWorld() { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
	}
    
    // ��̬��ʼ����
	static{ 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		staticHelloWorld hello = new staticHelloWorld();
		// ���ö����show����
        hello.show();
        
	}
}