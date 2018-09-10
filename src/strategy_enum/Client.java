package strategy_enum;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        System.out.println("输入参数为:" + Arrays.toString(args));
        System.out.println("加法运算结果：" + Calculator.ADD.exec(a, b));
        System.out.println("减法运算结果：" + Calculator.SUB.exec(a, b));
    }
}
