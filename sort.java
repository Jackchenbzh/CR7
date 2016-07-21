package com.imooc;
import java.util.Arrays;
import java.util.Scanner;

public class sort {
    
    //输入成绩,并调用方法
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
        	System.out.println("请输入考试成绩:");
        	scores[i] = input.nextInt();
        }
        System.out.println("考试成绩的前三名为：");
        sort hello = new sort();
        hello.temp(scores);
        
    }
    
    //完成成绩排序并输出前三名的功能
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

