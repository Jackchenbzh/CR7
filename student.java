package model;



public class student {

	private String sid;
	private int age;
	private String sname;
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", age=" + age + ", sname=" + sname
				+ "]";
	}
	
	
	
}
