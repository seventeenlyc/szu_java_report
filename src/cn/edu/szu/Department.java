package cn.edu.szu;

/**
 * 教学系类。
 */
public class Department {
    private String name;
    private String head;

    public Department(String name, String head) {
        this.name = name;
        this.head = head;
    }

    public String getName() { return name; }
    public String getHead() { return head; }

    @Override
    public String toString() {
        return name + "（系主任：" + head + "）";
    }
}
