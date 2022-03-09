package how2j;

import java.util.Scanner;

/**
 * 判断是什么季节
 */
public class Demo03_Season {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入月份");
        String result = "";
        var month = a.nextInt();
        if (month>=1&&month<4){
            result = "Spring";
        }else if (month>=4&&month<7){
            result = "Summer";
        }else if (month>=7&&month<10){
            result = "Autumn";
        }else if (month>=10&&month<13){
            result = "Winner";
        }else{
            System.out.println("输入月份不合法");
        }
        switch (result){
            case "Spring":
                System.out.println(month+"月是春天");
                break;
            case "Summer":
                System.out.println(month+"月是夏天");
                break;
            case "Autumn":
                System.out.println(month+"月是秋天");
                break;
            case "Winner":
                System.out.println(month+"月是冬天");
                break;
        }
    }
}
