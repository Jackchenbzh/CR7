package duotai;

public class initJiaoTong {
	public static void main(String[] args){
		gongJiao gongjiao = new gongJiao();
		jiaoTong num = gongjiao;//��������ת��
		if(num instanceof gongJiao){
			gongJiao num2 = (gongJiao)num;//ǿ��ת��
		}else{
			System.out.println("�޷�����ת��");
		}
		
		if(num instanceof chuanbo){
			chuanbo chuan = (chuanbo)num;
		}else{
			System.out.println("�޷�ת����chuanbo");
		}
	}
}
