public class Player {
    public String name,gender,item;
    public int age,championships;
    public Player(String name,String gender,int age,String item,int championships){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.item=item;
        this.championships=championships;
    }
    @Override
    public String toString(){
        String ans=name+" "+gender+" "+age+" "+item+" "+championships;
        IO.println(ans);
        return ans;
    }

}
void main(){
    Player p=new Player("张三","男",20,"举重",5);
    var ans=p.toString();
    IO.println(ans);
}
