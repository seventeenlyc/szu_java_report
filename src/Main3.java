import java.util.Scanner;
class Main3{
    void main() {
        int count = 0;                                                  //记录水仙花数的个数

        for (int num = 1; num <= 100000; num++) {                       //依次判断1到100000之间的每个数
            int n = String.valueOf(num).length();                       //得到当前数字的位数
            int temp = num;                                             //保存当前数字，用于拆分各位
            int sum = 0;                                                //记录各位数字n次幂之和
            while (temp > 0) {                                          //依次取出当前数字的每一位
                int digit = temp % 10;                                  //得到当前最低位数字
                sum += (int) Math.pow(digit, n);                        //计算该数字的n次幂并累加
                temp /= 10;                                             //去掉当前最低位
            }
            if (sum == num) {                                           //判断是否满足水仙花数条件
                IO.println(num);                     //输出水仙花数
                count++;                             //水仙花数数量加1
            }
        }
        IO.println("水仙花数共有: " + count + "个");     //输出水仙花数总数
    }
}
