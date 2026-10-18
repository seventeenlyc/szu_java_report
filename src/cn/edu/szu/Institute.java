package cn.edu.szu;

/**
 * 研究所/中心类。
 */
public class Institute {
    private String name;
    private String director;

    public Institute(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String getName() { return name; }
    public String getDirector() { return director; }

    @Override
    public String toString() {
        return name + "（负责人：" + director + "）";
    }
}
