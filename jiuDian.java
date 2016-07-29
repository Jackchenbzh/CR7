package exption;

public class jiuDian {
	private int xuHao;
	private String renShu;
	private String yaoQiu;
	private double price;
	private String qingKuang;
	
	public int getXuHao() {
		return xuHao;
	}

	public void setXuHao(int xuHao) {
		this.xuHao = xuHao;
	}

	public String getRenShu() {
		return renShu;
	}

	public void setRenShu(String renShu) {
		this.renShu = renShu;
	}

	public String getYaoQiu() {
		return yaoQiu;
	}

	public void setYaoQiu(String yaoQiu) {
		this.yaoQiu = yaoQiu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQingKuang() {
		return qingKuang;
	}

	public void setQingKuang(String qingKuang) {
		this.qingKuang = qingKuang;
	}
	
	public jiuDian(){
		
	}
	
	public jiuDian(int xuHao1,String renShu1,String yaoQiu1,double price1,String qingKuang1){
		this.xuHao = xuHao1;
		this.renShu = renShu1;
		this.yaoQiu = yaoQiu1;
		this.price = price1;
		this.qingKuang = qingKuang1;
	}
	
	public void shuxing(){
		System.out.println("房间" + xuHao + "是" + renShu + yaoQiu + "间，价格是：" + price+"。入住情况为：" + qingKuang);
	}
}
