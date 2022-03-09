package how2j;

public class Demo10_MathPractice {
    public static void main(String[] args) {
        for (int a = 0;a<14;a++){
            for (int b = 0;b < 10;b++){
                for (int c = 0;c < 14;c++){
                    for(int d = 0;d < 10;d++){
                        if (a+b==8&&a+c==14&&b+d==10&&c-d==6){
                            System.out.println("a="+a);
                            System.out.println("b="+b);
                            System.out.println("c="+c);
                            System.out.println("d="+d);
                        }
                    }
                }
            }
        }
    }
}
