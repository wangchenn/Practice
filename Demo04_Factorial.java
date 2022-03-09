package how2j;

import java.util.Scanner;

/**
 * 求一个数字的阶乘
 */
public class Demo04_Factorial {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner a = new Scanner(System.in);
        var num = a.nextLong();
        int i = 0;
        long sum = 1;
        while (i < num){
            sum = sum*num;
            num--;
        }
        System.out.println("它的阶乘是"+sum);
    }
}
