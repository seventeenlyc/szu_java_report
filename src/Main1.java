import java.util.Scanner;
class Main1{
    void main(){
        Scanner sc = new Scanner(System.in);    //初始化输入器
        float[] arr=new float[10];              //定义长度未10的arr数组
        for (int i=0;i<10;++i){                 //遍历输入元素
            arr[i]= sc.nextFloat();
        }
        for (int i=0;i<9;i+=2){                 //从第一个开始，每次跳一个元素
            float tmp=arr[i];                   //tmp临时变量记录第一个元素
            arr[i]=arr[i+1];                    //把后一个元素的值赋值给第一个元素
            arr[i+1]=tmp;                       //把后一个元素赋值tmp，即原本的第一个元素
        }
        for (int i=0;i<10;++i) IO.println(arr[i]);    //循环打印
    }
}
