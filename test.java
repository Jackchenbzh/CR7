package com.imooc;
import java.util.Scanner;
import java.sql.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("�Ƿ���Ҫ�⳵��1��2��");
		int temp = Integer.valueOf(inp.next());
		int cost = 0;
		int tianshu;
		if(temp == 1){
			qingHuo num1 = new qingHuo();
			zhongHuo num2 = new zhongHuo();
			piKa num3 = new piKa();
			siJia num4 = new siJia();
			gongJiao num5 = new gongJiao();
			num1.shuxing();
			num2.shuxing();
			num3.shuxing();
			num4.shuxing();
			num5.shuxing();
			System.out.println("��ѡ������");
			int temp1 = Integer.valueOf(inp.next());
			switch(temp1){
				case 1 :{
					System.out.println("����������");
					int temp2 = Integer.valueOf(inp.next());
					tianshu = Integer.valueOf(temp2);
					cost += tianshu * num1.price;
					break;
				}
				case 2 :{
					System.out.println("����������");
					int temp2 = Integer.valueOf(inp.next());
					tianshu = Integer.valueOf(temp2);
					cost += tianshu * num2.price;
					break;
				}
				case 3 :{
					System.out.println("����������");
					int temp2 = Integer.valueOf(inp.next());
					tianshu = Integer.valueOf(temp2);
					cost += tianshu * num3.price;
					break;
				}
				case 4 :{
					System.out.println("����������");
					int temp2 = Integer.valueOf(inp.next());
					tianshu = Integer.valueOf(temp2);
					cost += tianshu * num4.price;
					break;
				}
				case 5 :{
					System.out.println("����������");
					int temp2 = Integer.valueOf(inp.next());
					tianshu = Integer.valueOf(temp2);
					cost += tianshu * num5.price;
					break;
				}
			}
		}else{
			System.out.println("δ�⳵");
		}
		System.out.println("�ܽ��Ϊ��" + cost);
	}

}
