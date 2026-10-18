package cn.edu.szu;

import java.util.ArrayList;
import java.util.List;

/**
 * 实验中心类。
 */
public class ExperimentCenter {
    private String name = "实验中心";
    private List<Person> members = new ArrayList<>();

    public void addMember(Person p) { members.add(p); }
    public int getMemberCount() { return members.size(); }
    public String getName() { return name; }

    public void showMembers() {
        System.out.println(name + "成员（共" + members.size() + "人）：");
        for (Person p : members) {
            System.out.println("  " + p);
        }
    }
}
