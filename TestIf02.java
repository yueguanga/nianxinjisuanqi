import java.util.Scanner;
//这是一个年薪计算器9

public class TestIf02 {
        public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
                while(true){
                        System.out.println("请输入您的月薪");
                        int month=s.nextInt();
                        System.out.println("请输入您的年薪是几个月的");
                        int number=s.nextInt();
                        System.out.println("您的年薪一共是"+month*number+"元");
                        System.out.println("如果需要结束则请输入66,输入其他则继续");
                        int count=s.nextInt();
                        if(count==66)
                                break;
                        else{
                                System.out.println("结束！");
                                continue;
                        }
                }

        }
}
