import java.util.ArrayList;
class Main2{
    void main(){
        float[][][] arr=new float[80][1000][1000];    //定义三维数组arr
        for (int i = 0; i<80;i++){                    //三层循环遍历数组
            for (int j=0;j<1000;j++){
                for (int k=0;k<1000;k++){
                    arr[i][j][k]= (float) Math.random();      //给每一个元素赋值随机数0到1
                }
            }
        }
        ArrayList<Float> ans=new ArrayList<>();       //定义一个答案列表
        for (int t=0;t<20;++t){                       //寻找20个最终答案
            float cur_min_dis=100;                    //记录20轮里每一轮的最短距离
            float cur_min=0;                          //记录每一轮最短距离对应的数组元素
            int target_index[]={};                    //记录此数组元素对应的下标
            for (int i = 0; i<80;i++){                //遍历数组
                for (int j=0;j<1000;j++){
                    for (int k=0;k<1000;k++){
                        if (Math.abs(arr[i][j][k]-0.5)<cur_min_dis){    //判断当前元素和0.5的距离是否小于记录的最短距离
                            cur_min_dis= (float) Math.abs(arr[i][j][k]-0.5);    //如果此元素更佳，更新最短距离
                            cur_min=arr[i][j][k];        //更新最佳的元素
                            target_index= new int[]{i, j, k};      //更新下标
                        }
                    }
                }
            }
            ans.addLast(cur_min);                     //将得到的离0.5最近的元素塞入答案列表
            arr[target_index[0]][target_index[1]][target_index[2]]=100;//把该元素在数组里“去掉”，赋值大数，以后的轮次里不可能成为最佳答案
        }
        for (float it:ans){                           //遍历答案并输出
            IO.println(it);
        }
    }
}
