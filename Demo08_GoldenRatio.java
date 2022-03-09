package how2j;

/**
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 *
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class Demo08_GoldenRatio {
    public static void main(String[] args) {
    double value;
    double gold = 0.618;
    double diff;
    int numerator = 1;
    int denominator = 1;
    double minDiff = 20;
        for (int a = 1;a < 21;a++){
            for(int b = 1;b<21;b++){
                if (a%2==0&&b%2==0){
                    continue;
                }
                value = (double) a/b;
                diff = value - gold;
                if (diff<0){
                    diff = 0-diff;
                }
                if (diff < minDiff){
                    minDiff = diff;
                    numerator = a;
                    denominator = b;
                }
            }
        }
        System.out.println("分子是"+numerator+"分母是"+denominator+"结果为"+(double)numerator/denominator);
    }
}
