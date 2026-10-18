package cn.edu.szu;

import java.util.ArrayList;
import java.util.List;

/**
 * 期刊编辑部类。
 */
public class JournalEditorialOffice {
    private String journalName;
    private String englishName;
    private String publisher;
    private String issn;
    private int foundedYear;
    private int firstIssueYear;
    private int volumes;
    private int issues;
    private String statDate;
    private String editorInChief;
    private String indexedBy;
    private String impactFactor;
    private String scope;
    private List<Person> editors = new ArrayList<>();

    public JournalEditorialOffice(String journalName, String englishName, String publisher, String issn,
                                  int foundedYear, int firstIssueYear, int volumes, int issues,
                                  String statDate, String editorInChief, String indexedBy,
                                  String impactFactor, String scope) {
        this.journalName = journalName;
        this.englishName = englishName;
        this.publisher = publisher;
        this.issn = issn;
        this.foundedYear = foundedYear;
        this.firstIssueYear = firstIssueYear;
        this.volumes = volumes;
        this.issues = issues;
        this.statDate = statDate;
        this.editorInChief = editorInChief;
        this.indexedBy = indexedBy;
        this.impactFactor = impactFactor;
        this.scope = scope;
    }

    public void addEditor(Person p) { editors.add(p); }
    public String getJournalName() { return journalName; }
    public String getEnglishName() { return englishName; }
    public String getPublisher() { return publisher; }
    public String getIssn() { return issn; }
    public int getFoundedYear() { return foundedYear; }
    public int getFirstIssueYear() { return firstIssueYear; }
    public String getEditorInChief() { return editorInChief; }
    public int getVolumes() { return volumes; }
    public int getIssues() { return issues; }
    public String getIndexedBy() { return indexedBy; }
    public String getImpactFactor() { return impactFactor; }
    public int getEditorCount() { return editors.size(); }

    public void showInfo() {
        System.out.println("期刊编辑部：");
        System.out.println("  期刊名称：" + journalName + "（" + englishName + "）");
        System.out.println("  出版社：" + publisher + "    ISSN：" + issn);
        System.out.println("  创刊年份：" + foundedYear + "    首期发行：" + firstIssueYear + "年第一卷第一期");
        System.out.println("  发行情况：截至" + statDate + "，共发行" + volumes + "卷" + issues + "期");
        System.out.println("  主编：" + editorInChief);
        System.out.println("  检索收录：" + indexedBy);
        System.out.println("  2025年影响因子：" + impactFactor);
        System.out.println("  期刊范围：" + scope);
        System.out.println("  编辑部成员：");
        for (Person p : editors) {
            System.out.println("    " + p);
        }
    }
}
