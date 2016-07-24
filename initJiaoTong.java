package duotai;

public class initJiaoTong {
	public static void main(String[] args){
		gongJiao gongjiao = new gongJiao();
		jiaoTong num = gongjiao;//向上类型转换
		if(num instanceof gongJiao){
			gongJiao num2 = (gongJiao)num;//强制转换
		}else{
			System.out.println("无法进行转化");
		}
		
		if(num instanceof chuanbo){
			chuanbo chuan = (chuanbo)num;
		}else{
			System.out.println("无法转化成chuanbo");
		}
	}
}
