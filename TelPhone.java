package chenbzh;

public class TelPhone {
	//属性,成员变量,封装
	private double screen;
	private double cpu;
	private double men;
	//调用
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
	//方法，局部变量
	void call(){
		System.out.println("具有打电话的功能");		
	}
	void text(){
		System.out.println("screen:"+screen+"cpu:"+cpu+"men:"+men+"具有发短信的功能");
	}
	//无参构造方法
	public TelPhone(){
		screen = 5.2;
		cpu = 4.0;
		men = 3.5;
		System.out.println("无参构造方法执行了，并设定了默认值");
	}
	//有参构造方法
	public TelPhone(double newscreen,double newcpu,double newmen){
		screen = newscreen;
		cpu = newcpu;
		men = newmen;
		System.out.println("有参构造方法执行了");
	}
}
