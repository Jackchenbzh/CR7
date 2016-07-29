package exption;

public class bingKe extends jiuDian{
	private String xingMin;
	private String xingBie;
	private String shenFenZheng;
	private int age;
	
	public String getXingMin() {
		return xingMin;
	}
	
	public void setXingMin(String xingMin) {
		this.xingMin = xingMin;
	}
	
	public String getXingBie() {
		return xingBie;
	}
	
	public void setXingBie(String xingBie) {
		this.xingBie = xingBie;
	}
	
	public String getShenFenZheng() {
		return shenFenZheng;
	}
	
	public void setShenFenZheng(String shenFenZheng) {
		this.shenFenZheng = shenFenZheng;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public bingKe(){
		
	}
	
	public bingKe(String xingMin1,String xingBie1,String shenFenZheng1,int age1){
		this.xingMin = xingMin1;
		this.xingBie = xingBie1;
		this.shenFenZheng = shenFenZheng1;
		this.age = age1;
	}
	
	public void shuxing(){
		System.out.println("入住人员是: " + xingMin + " 性别 " + xingBie +" 证件号为："+ shenFenZheng + " 年龄是：" + age);
	}
}
