import java.util.LinkedHashMap;
import java.util.Map;
public class CSRankings {
    private LinkedHashMap<String, LinkedHashMap<String, String>> data = new LinkedHashMap<>();
    public CSRankings(){
        LinkedHashMap<String, String> db = new LinkedHashMap<>();
        db.put("SIGMOD", "dblp.org/db/conf/sigmod/index.html");
        db.put("VLDB",   "dblp.org/db/conf/vldb/index.html");
        data.put("Databases", db);
        LinkedHashMap<String, String> se = new LinkedHashMap<>();
        se.put("FSE",  "dblp.org/db/conf/sigsoft/index.html");
        se.put("ICSE", "dblp.org/db/conf/icse/index.html");
        data.put("Software Engineering", se);
        LinkedHashMap<String, String> web = new LinkedHashMap<>();
        web.put("SIGIR", "dblp.org/db/conf/sigir/index.html");
        web.put("WWW",   "dblp.org/db/conf/www/index.html");
        data.put("The Web & Information Retrieval", web);
        LinkedHashMap<String, String> sec = new LinkedHashMap<>();
        sec.put("CCS",             "dblp.org/db/conf/ccs/index.html");
        sec.put("S&P",             "dblp.org/db/conf/sp/index.html");
        sec.put("USENIX Security", "dblp.org/db/conf/uss/index.html");
        data.put("Computer Security", sec);
        LinkedHashMap<String, String> ml = new LinkedHashMap<>();
        ml.put("ICLR",    "dblp.org/db/conf/iclr/index.html");
        ml.put("ICML",    "dblp.org/db/conf/icml/index.html");
        ml.put("NeurIPS", "dblp.org/db/conf/nips/index.html");
        data.put("Machine Learning & Data Mining", ml);
    }
    public String toString(String name) {
        LinkedHashMap<String, String> venues = data.get(name);
        if (venues == null) {
            return "未找到研究方向：" + name;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : venues.entrySet()) {
            sb.append("会议名称：").append(e.getKey())
                    .append("网址：").append(e.getValue())
                    .append("\n");
        }
        return sb.toString();
    }
    void main(String[] args) {
        CSRankings c = new CSRankings();
        System.out.println(c.toString("Machine Learning & Data Mining"));
        System.out.println("--------");
        System.out.println(c.toString("Databases"));
        System.out.println("--------");
        System.out.println(c.toString("Software Engineering"));
        System.out.println("--------");
        System.out.println(c.toString("The Web & Information Retrieval"));
        System.out.println("--------");
        System.out.println(c.toString("Computer Security"));
    }
}