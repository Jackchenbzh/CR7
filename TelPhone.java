package chenbzh.second;

public class TelPhone {
	private double screen;
	private double cpu;
	private double men;
	
	public void sendMessage(){
		System.out.println("可以发送短信");
	}
	
	public double getScreen() {
		return screen;
	}
	public void setScreen(double screen) {
		this.screen = screen;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getMen() {
		return men;
	}
	
	public void setMen(double men){
		this.men = men;
	}
	
}
