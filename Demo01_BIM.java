package how2j;

import java.util.Scanner;

/**
 * 通过条件判断BMI的范围，打印出是超重还是正常
 */
public class Demo01_BIM {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("输入身高");
        double num1 = a.nextDouble();
        System.out.println("输入体重");
        int num2 = a.nextInt();

        double num3;
        num3 = num2/(num1*num1);
        System.out.println("当前BIM是"+num3);
        if (num3 < 18.5){
            System.out.println("体重过清");
        }else if (18.5<=num3 && num3 < 24){
            System.out.println("正常");
        }else if (24<=num3 && num3 < 27){
            System.out.println("体重过重");
        }else if (27<=num3 && num3 < 30){
            System.out.println("轻度肥胖");
        }else if (30<=num3 && num3 < 35){
            System.out.println("中度肥胖");
        }else if(35<=num3){
            System.out.println("重度肥胖");
        }else{
            System.out.println("不符合範圍");
        }
    }
}
