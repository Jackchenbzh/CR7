package exption;
import java.util.Scanner;

public class guanLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiuDian[] shuzu = new jiuDian[100];
		jiuDian[] shuzu2 = new bingKe[100];
		init(shuzu,shuzu2);
		for(int i = 0;i < 10;i++){
			System.out.println("请输入数字进行操作: 1 查看 2 入住 3退宿 4 筛选 5 统计");
			Scanner inp = new Scanner(System.in);
			int temp = inp.nextInt();
			//初始化

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
			

	
	//初始化
	public static  void init(jiuDian[] shuzu,jiuDian[] shuzu2){

		for(int i = 1;i <= 100;i++){
			String ren;
			if(i % 2 == 0){
				ren = "单人";
			}else{
				ren = "双人";
			}
			String yao;
			double pri;
			if(i % 3 == 0){
				yao = "豪华";
				pri = 1500;
			}else{
				yao = "标准";
				pri = 800;
			}
			String qing;
			if(i % 5 == 0){
				qing = "已有人入住";
				shuzu2[i - 1] = new bingKe("李先生","男","110",i);
			}else{
				qing = "未有人入住";
			}
			shuzu[i - 1] = new jiuDian(i,ren,yao,pri,qing);
		}
	}
	//查看
	public static void view(jiuDian[] shuzu){
		System.out.println("以下是酒店入住情况：");
		for(int i = 0;i < 100;i++){
			shuzu[i].shuxing();
		}
	}
	//入住
	public static void ru(jiuDian[] shuzu,jiuDian[] shuzu2,Scanner inp){
		System.out.println("请输入房间号：");
		int temp1 = inp.nextInt();
		int hao = temp1;
		if(shuzu[temp1 - 1].getQingKuang() ==  "已有人入住"){
			System.out.println("已有人入住！");
		}else{
			System.out.println("请输入您的姓名：");
			String temp2 = inp.next();
			
			System.out.println("请输入您的性别：");
			String temp3 = inp.next();
			
			System.out.println("请输入您的证件号：");
			String temp4 = inp.next();
			
			System.out.println("请输入您的年龄：");
			int temp5 = inp.nextInt();
			
			shuzu2[hao - 1] = new bingKe(temp2,temp3,temp4,temp5);
			System.out.println("请确认您的信息：");
			shuzu2[hao - 1].shuxing();
			System.out.println("入住成功！");
		}
	}
	//退宿
	public static void tui(jiuDian[] shuzu,jiuDian[] shuzu2,Scanner inp){
		System.out.println("请输入您的房间号：");
		int temp = inp.nextInt();
		shuzu[temp - 1].setQingKuang("未有人入住");
		shuzu2[temp - 1] = null;
		System.out.println("退宿成功！");
	}
	//查询
	public static void choose(jiuDian[] shuzu,Scanner inp){
		System.out.println("请输入您要查找的项目：");
		String temp = inp.next();
		switch (temp){
			case "单人":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getRenShu() == "单人"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "双人":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getRenShu() == "双人"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "标准":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getYaoQiu() == "标准"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "豪华":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getYaoQiu() == "豪华"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "价格":{
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
			case "已有人入住":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getQingKuang() == "已有人入住"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
			case "未有人入住":{
				for(int i = 0;i < 100;i++){
					if(shuzu[i].getQingKuang() == "未有人入住"){
						shuzu[i].shuxing();
					}
				}
				break;
			}
		}
	}
	//统计
	public static void count(jiuDian[] shuzu2){
		int nan = 0;
		int nv = 0;
		for(int i = 0;i < 100;i++){
			if( shuzu2[i] != null && shuzu2[i].getXingBie().equals("男")) {
				nan++;
			}
			else if( shuzu2[i] != null && shuzu2[i].getXingBie().equals("女") ){
				nv++;
			}
		}
		System.out.println("男性和女性的比例为：" + nan + "：" + nv);
	}
}
