public abstract static class Item {
    public String name,type;
    public int player_num,match_count;
    public abstract void run();
    public Item(String t,int p,int m){
        this.type=t;
        this.player_num=p;
        this.match_count=m;
    }
};
public static class Male extends Item{
    public Male(String t,int p,int m){
        super(t,p,m);
        this.name="男子单打";
    }
    @Override
    public void run() {
        IO.println("项目\t比赛类型\t参赛人数\t比赛局数");
        IO.println("%s\t%s\t%d\t%d".formatted(name,type,player_num,match_count));
    }
}
public static class Mix extends Item{
    public Mix(String t,int p,int m){
        super(t,p,m);
        this.name="混双";
    }
    @Override
    public void run() {
        IO.println("项目\t比赛类型\t参赛队伍数\t比赛局数");
        IO.println("%s\t%s\t%d\t%d".formatted(name,type,player_num,match_count));
    }
}
void main() {
    Male male= new Male("三局两胜", 25, 32);
    male.run();
    IO.println("-****************************-");
    Mix mix= new Mix("五局三胜", 10, 20);
    mix.run();
}
