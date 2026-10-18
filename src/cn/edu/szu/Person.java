package cn.edu.szu;

/**
 * 人员类：行政办公室、实验中心、期刊编辑部的成员都用它表示。
 */
public class Person {
    private String name;
    private String title;   // 职务/职责
    private String tel;
    private String email;
    private String office;  // 办公室

    public Person(String name, String title, String tel, String email, String office) {
        this.name = name;
        this.title = title;
        this.tel = tel;
        this.email = email;
        this.office = office;
    }

    public String getName() { return name; }
    public String getTitle() { return title; }
    public String getTel() { return tel; }
    public String getEmail() { return email; }
    public String getOffice() { return office; }

    @Override
    public String toString() {
        return name + " | " + title + " | TEL: " + tel + " | E-mail: " + email + " | Office: " + office;
    }
}
