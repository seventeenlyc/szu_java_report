package cn.edu.szu;

import java.util.ArrayList;
import java.util.List;

/**
 * 行政办公室类。
 */
public class AdminOffice {
    private String name = "行政办公室";
    private List<Person> members = new ArrayList<>();

    public void addMember(Person p) { members.add(p); }
    public int getMemberCount() { return members.size(); }
    public String getName() { return name; }

    public Person getDirector() {
        for (Person p : members) {
            if (p.getTitle().contains("办公室主任")) return p;
        }
        return null;
    }

    public void showMembers() {
        System.out.println(name + "成员（共" + members.size() + "人）：");
        for (Person p : members) {
            System.out.println("  " + p);
        }
    }
}
