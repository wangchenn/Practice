package how2j;

/**
 * 打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
 */
public class Demo06_IgnoreMultiple {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i%3==0||i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
