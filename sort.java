package com.imooc;
import java.util.Arrays;
import java.util.Scanner;

public class sort {
    
    //����ɼ�,�����÷���
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
        	System.out.println("�����뿼�Գɼ�:");
        	scores[i] = input.nextInt();
        }
        System.out.println("���Գɼ���ǰ����Ϊ��");
        sort hello = new sort();
        hello.temp(scores);
        
    }
    
    //��ɳɼ��������ǰ�����Ĺ���
    public void temp(int[] scores){
        Arrays.sort(scores);
        int num = 0;
        for(int i = scores.length - 1;i >= 0;i--){
            if(scores[i] < 0 || scores[i] > 100){
                continue;
            }
            num++;
            if(num > 3){
                break;
            }
            System.out.println(scores[i]);
        }
    }
}

