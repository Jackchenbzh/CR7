package exption;
import java.util.Scanner;

public class guanLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiuDian[] shuzu = new jiuDian[100];
		jiuDian[] shuzu2 = new bingKe[100];
		init(shuzu,shuzu2);
		for(int i = 0;i < 10;i++){
			System.out.println("���������ֽ��в���: 1 �鿴 2 ��ס 3���� 4 ɸѡ 5 ͳ��");
			Scanner inp = new Scanner(System.in);
			int temp = inp.nextInt();
			//��ʼ��

			switch (temp){
				case 1:{
					view(shuzu);
					break;
				}
				case 2:{
					ru(shuzu,shuzu2,inp);
					break;
				}
				case 3:{
					tui(shuzu,shuzu2,inp);
					break;
				}
				case 4:{
					choose(shuzu,inp);
					break;
				}
				case 5:{
					count(shuzu2);
					break;
				}
			}
		}
	}
			

	
	//��ʼ��
	public static  void init(jiuDian[] shuzu,jiuDian[] shuzu2){

		for(int i = 1;i <= 100;i++){
			String ren;
			if(i % 2 == 0){
				ren = "����";
			}else{
				ren = "˫��";
			}
			String yao;
			double pri;
			if(i % 3 == 0){
				yao = "����";
				pri = 1500;
			}else{
				yao = "��׼";
				pri = 800;
			}
			String qing;
			if(i % 5 == 0){
				qing = "��������ס";
				shuzu2[i - 1] = new bingKe("������","��","110",i);
			}else{
				qing = "δ������ס";
			}
			shuzu[i - 1] = new jiuDian(i,ren,yao,pri,qing);
		}
	}
	//�鿴
	public static void view(jiuDian[] shuzu){
		System.out.println("�����ǾƵ���ס�����");
		for(int i = 0;i < 100;i++){
			shuzu[i].shuxing();
		}
	}
	//��ס
	public static void ru(jiuDian[] shuzu,jiuDian[] shuzu2,Scanner inp){
		System.out.println("�����뷿��ţ�");
		int temp1 = inp.nextInt();
		int hao = temp1;
		if(shuzu[temp1 - 1].getQingKuang() ==  "��������ס"){
			System.out.println("��������ס��");
		}else{
			System.out.println("����������������");
			String temp2 = inp.next();
			
			System.out.println("�����������Ա�");
			String temp3 = inp.next();
			
			System.out.println("����������֤���ţ�");
			String temp4 = inp.next();
			
			System.out.println("�������������䣺");
			int temp5 = inp.nextInt();
			
			shuzu2[hao - 1] = new bingKe(temp2,temp3,temp4,temp5);
			System.out.println("��ȷ��������Ϣ��");
			shuzu2[hao - 1].shuxing();
			System.out.println("��ס�ɹ���");
		}
	}
	//����
	public static void tui(jiuDian[] shuzu,jiuDian[] shuzu2,Scanner inp){
		System.out.println("���������ķ���ţ�");
		int temp = inp.nextInt();
		shuzu[temp - 1].setQingKuang("δ������ס");
		shuzu2[temp - 1] = null;
		System.out.println("���޳ɹ���");
	}
	//��ѯ
	public static void choose(jiuDian[] shuzu,Scanner inp){
		System.out.println("��������Ҫ���ҵ���Ŀ��");
		String temp = inp.next();
		switch (temp){
			case "����":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getRenShu() == "����"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "˫��":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getRenShu() == "˫��"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "��׼":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getYaoQiu() == "��׼"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "����":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getYaoQiu() == "����"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "�۸�":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getPrice() == 800){
						shuzu[i].shuxing();
					}
				}
				for(int j = 0;j < 100;j++){
					if(shuzu[j].getPrice() == 1500){
						shuzu[j].shuxing();
					}
				}
				break;
			}
			case "��������ס":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getQingKuang() == "��������ס"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "δ������ס":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getQingKuang() == "δ������ס"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
		}
	}
	//ͳ��
	public static void count(jiuDian[] shuzu2){
		int nan = 0;
		int nv = 0;
		for(int i = 0;i < 100;i++){
			if( shuzu2[i] != null && shuzu2[i].getXingBie().equals("��")) {
				nan++;
			}
			else if( shuzu2[i] != null && shuzu2[i].getXingBie().equals("Ů") ){
				nv++;
			}
		}
		System.out.println("���Ժ�Ů�Եı���Ϊ��" + nan + "��" + nv);
	}
}
