package how2j;

/**
 * 天朝有一个乞丐姓洪，去天桥要钱
 * 第一天要了1块钱
 * 第二天要了2块钱
 * 第三天要了4块钱
 * 第四天要了8块钱
 * 以此类推
 *1 2 4 8 16 32 64 128 256 512
 * 问题： 洪乞丐干10天，收入是多少？
 */
public class Demo05_Beggar {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        for (int i = 0;i < 9;i++){
            a=a*2;
            sum = sum+a;
        }
        sum = sum+1;
        System.out.println("一共收入"+sum);
    }
}

