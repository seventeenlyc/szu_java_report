import java.util.Scanner;
class Main4{
    void main() {
        int count=0;    //计数器，记录尝试的次数
        while (true){    //无条件循环
            int num;    //定义一个整数num存放随机数
            num=10000000+(int)(90000000*Math.random());//生成8位数，最小未10000000，最大为99999999（最小+89999999）
            ++count;    //计数器+1
            int sum=0,tmp=num;    //定义num的各数位之和sum，临时变量tmp赋值为sum
            while (tmp>0){        //当tmp>0时进行循环
                int digit=tmp%10;    //记录tmp末位
                sum+=digit;          //把末位数字加到sum里
                tmp/=10;             //去掉最低位
            }
            IO.println(count+" "+num+" "+sum);    //打表观察
            if (sum%7==0){                        //如果sum能被7整除
                IO.println("经过" + count + "次尝试后生成了符合要求的整数: " + num);
                IO.println("该整数各位数字之和为: " + sum);        //输出答案
                break;                            //结束循环
            }
        }
    }
}
