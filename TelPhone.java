package chenbzh;

public class TelPhone {
	//����,��Ա����,��װ
	private double screen;
	private double cpu;
	private double men;
	//����
	public double getScreen(){
		return screen;
	}
	
	public void setScreen(double newScreen){
		screen = newScreen;
	}
	
	public double getCpu(){
		return cpu;
	}
	
	public void setCpu(double newCpu){
		cpu = newCpu;
	}
	
	public double getMen(){
		return men;
	}
	
	public void setMen(double newMen){
		men = newMen;
	}
	//�������ֲ�����
	void call(){
		System.out.println("���д�绰�Ĺ���");		
	}
	void text(){
		System.out.println("screen:"+screen+"cpu:"+cpu+"men:"+men+"���з����ŵĹ���");
	}
	//�޲ι��췽��
	public TelPhone(){
		screen = 5.2;
		cpu = 4.0;
		men = 3.5;
		System.out.println("�޲ι��췽��ִ���ˣ����趨��Ĭ��ֵ");
	}
	//�вι��췽��
	public TelPhone(double newscreen,double newcpu,double newmen){
		screen = newscreen;
		cpu = newcpu;
		men = newmen;
		System.out.println("�вι��췽��ִ����");
	}
}
