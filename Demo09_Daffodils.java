package how2j;

/**
 * 水仙花数
 */
public class Demo09_Daffodils {
    public static void main(String[] args) {
        for (int i= 100;i<1000;i++){
            int num1 = i/100;
            int num2 = (i%100)/10;
            int num3 = i%10;
            if ((num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3)==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
