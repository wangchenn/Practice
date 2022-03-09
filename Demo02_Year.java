package how2j;

import java.util.Scanner;

/**
 * 判断平年还是闰年
 * 闰年不可被100整除但是能被4与400整除
 */
public class Demo02_Year {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner year = new Scanner(System.in);
        int a = year.nextInt();
        if (a%4 == 0 && a%400 == 0 && a%100!= 0){
            System.out.println(a+"是闰年");
        }else {
            System.out.println(a+"是平年");
        }
    }
}
