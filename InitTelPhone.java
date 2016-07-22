package chenbzh;

public class InitTelPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelPhone phone = new TelPhone();
		phone.text();
		//赋值
		phone.setScreen(5.0);
		phone.setCpu(6.2);
		phone.setMen(15);
		//调用方法
		phone.text();
		TelPhone phone2 = new TelPhone(6.2,5.7,8.0);
	}

}
