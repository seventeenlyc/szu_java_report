import cn.edu.szu.AdminOffice;
import cn.edu.szu.CSSE;
import cn.edu.szu.Department;
import cn.edu.szu.ExperimentCenter;
import cn.edu.szu.Institute;
import cn.edu.szu.JournalEditorialOffice;
import cn.edu.szu.Person;
public class CSSETest {

    private static int passCount = 0;
    private static int failCount = 0;

    /** 断言工具：条件成立记一次通过，否则记一次失败 */
    private static void check(String caseName, boolean condition) {
        if (condition) {
            passCount++;
            System.out.println("  [通过] " + caseName);
        } else {
            failCount++;
            System.out.println("  [失败] " + caseName);
        }
    }

    // ==================== 1. Person 类 ====================
    private static void testPerson() {
        System.out.println("---- 测试 Person 类 ----");
        Person p = new Person("刘晔", "办公室主任，纪委委员", "2690-9202", "ly@szu.edu.cn", "致腾楼839");

        check("getName() 返回姓名", "刘晔".equals(p.getName()));
        check("getTitle() 返回职务", p.getTitle().contains("办公室主任"));
        check("getTel() 返回电话", "2690-9202".equals(p.getTel()));
        check("getEmail() 返回邮箱", "ly@szu.edu.cn".equals(p.getEmail()));
        check("getOffice() 返回办公室", "致腾楼839".equals(p.getOffice()));
        check("toString() 包含姓名与邮箱", p.toString().contains("刘晔") && p.toString().contains("ly@szu.edu.cn"));
        System.out.println("  toString() = " + p);
    }

    // ==================== 2. Institute 类 ====================
    private static void testInstitute() {
        System.out.println("---- 测试 Institute 类 ----");
        Institute institute = new Institute("高性能计算研究所", "陈国良");

        check("getName() 返回研究所名称", "高性能计算研究所".equals(institute.getName()));
        check("getDirector() 返回负责人", "陈国良".equals(institute.getDirector()));
        System.out.println("  toString() = " + institute);
    }

    // ==================== 3. Department 类 ====================
    private static void testDepartment() {
        System.out.println("---- 测试 Department 类 ----");
        Department department = new Department("计算机科学与技术系", "潘微科");

        check("getName() 返回系名称", "计算机科学与技术系".equals(department.getName()));
        check("getHead() 返回系主任", "潘微科".equals(department.getHead()));
        System.out.println("  toString() = " + department);
    }

    // ==================== 4. AdminOffice 类 ====================
    private static void testAdminOffice() {
        System.out.println("---- 测试 AdminOffice 类 ----");
        AdminOffice office = new AdminOffice();

        check("addMember() 前成员数为 0", office.getMemberCount() == 0);

        office.addMember(new Person("刘晔", "办公室主任，纪委委员", "2690-9202", "ly@szu.edu.cn", "致腾楼839"));
        office.addMember(new Person("樊婷", "办公室副主任，工会副主席", "2653-5401", "fanting@szu.edu.cn", "致腾楼822"));
        office.addMember(new Person("覃靖", "财务秘书", "2690-9202", "jingq@szu.edu.cn", "致腾楼839"));

        check("addMember() 后成员数为 3", office.getMemberCount() == 3);
        check("getName() 返回“行政办公室”", "行政办公室".equals(office.getName()));
        check("getDirector() 找到办公室主任（跳过副主任）",
                office.getDirector() != null && "刘晔".equals(office.getDirector().getName()));

        System.out.println("  showMembers() 输出：");
        office.showMembers();

        AdminOffice emptyOffice = new AdminOffice();
        check("空办公室 getDirector() 返回 null", emptyOffice.getDirector() == null);
    }

    // ==================== 5. ExperimentCenter 类 ====================
    private static void testExperimentCenter() {
        System.out.println("---- 测试 ExperimentCenter 类 ----");
        ExperimentCenter center = new ExperimentCenter();

        check("addMember() 前成员数为 0", center.getMemberCount() == 0);

        center.addMember(new Person("林佳利", "实验中心副主任，324、325实验室负责人", "2653-5346", "key@szu.edu.cn", "致腾楼319"));
        center.addMember(new Person("申向军", "322、323实验室负责人", "2653-5342", "shenxj@szu.edu.cn", "致腾楼321"));

        check("addMember() 后成员数为 2", center.getMemberCount() == 2);
        check("getName() 返回“实验中心”", "实验中心".equals(center.getName()));

        System.out.println("  showMembers() 输出：");
        center.showMembers();
    }

    // ==================== 6. JournalEditorialOffice 类 ====================
    private static JournalEditorialOffice newJournal() {
        return new JournalEditorialOffice(
                "机器学习与控制论国际期刊",
                "International Journal of Machine Learning and Cybernetics",
                "Springer",
                "1868-8071",
                2009, 2010, 17, 144, "2026年6月",
                "王熙照",
                "SCIE、JCR、CC",
                "2.9",
                "机器学习与控制论交叉领域的关键研究问题");
    }

    private static void testJournalEditorialOffice() {
        System.out.println("---- 测试 JournalEditorialOffice 类 ----");
        JournalEditorialOffice journal = newJournal();

        check("getJournalName() 返回期刊名称", "机器学习与控制论国际期刊".equals(journal.getJournalName()));
        check("getEnglishName() 返回英文刊名",
                journal.getEnglishName().startsWith("International Journal of Machine Learning"));
        check("getPublisher() 返回出版社", "Springer".equals(journal.getPublisher()));
        check("getIssn() 返回 ISSN", "1868-8071".equals(journal.getIssn()));
        check("getFoundedYear() 返回创刊年份", journal.getFoundedYear() == 2009);
        check("getFirstIssueYear() 返回首期年份", journal.getFirstIssueYear() == 2010);
        check("getVolumes() 返回卷数", journal.getVolumes() == 17);
        check("getIssues() 返回期数", journal.getIssues() == 144);
        check("getEditorInChief() 返回主编", "王熙照".equals(journal.getEditorInChief()));
        check("getIndexedBy() 返回收录情况", journal.getIndexedBy().contains("SCIE"));
        check("getImpactFactor() 返回影响因子", "2.9".equals(journal.getImpactFactor()));

        check("addEditor() 前编辑人数为 0", journal.getEditorCount() == 0);
        journal.addEditor(new Person("姜欣彤", "博士教学秘书，编辑部编辑", "2653-0131", "gracejiang@szu.edu.cn", "致腾楼822"));
        check("addEditor() 后编辑人数为 1", journal.getEditorCount() == 1);

        System.out.println("  showInfo() 输出：");
        journal.showInfo();
    }

    // ==================== 7. CSSE 类 ====================
    private static void testCSSE() {
        System.out.println("---- 测试 CSSE 类 ----");
        CSSE csse = new CSSE();

        // 未设置任何成员时，三个 getXxxInfo() 应给出提示而不抛异常
        System.out.println("  空学院时的提示输出：");
        csse.getAdminOfficeInfo();
        csse.getExperimentCenterInfo();
        csse.getJournalOfficeInfo();

        csse.addInstitute(new Institute("高性能计算研究所", "陈国良"));
        csse.addInstitute(new Institute("大数据技术与应用研究所", "黄哲学"));
        csse.addInstitute(new Institute("软件工程研究中心", "明仲"));

        csse.addDepartment(new Department("计算机科学与技术系", "潘微科"));
        csse.addDepartment(new Department("软件工程系", "张良杰"));
        csse.addDepartment(new Department("人工智能系", "王熙照"));

        AdminOffice office = new AdminOffice();
        office.addMember(new Person("刘晔", "办公室主任，纪委委员", "2690-9202", "ly@szu.edu.cn", "致腾楼839"));
        csse.setAdminOffice(office);

        ExperimentCenter center = new ExperimentCenter();
        center.addMember(new Person("尹义飞", "服务器机房管理员", "2653-5346", "yfyin@szu.edu.cn", "致腾楼319"));
        csse.setExperimentCenter(center);

        JournalEditorialOffice journal = newJournal();
        journal.addEditor(new Person("姜欣彤", "博士教学秘书，编辑部编辑", "2653-0131", "gracejiang@szu.edu.cn", "致腾楼822"));
        csse.setJournalOffice(journal);

        // getter 检验：确认对象确实被装入学院
        check("setAdminOffice() / getAdminOffice() 一致", csse.getAdminOffice() == office);
        check("setExperimentCenter() / getExperimentCenter() 一致", csse.getExperimentCenter() == center);
        check("setJournalOffice() / getJournalOffice() 一致", csse.getJournalOffice() == journal);
        check("getAdminOffice() 中成员数为 1", csse.getAdminOffice().getMemberCount() == 1);

        System.out.println("  getInstituteNames() / getInstituteNumber() 输出：");
        csse.getInstituteNames();
        csse.getInstituteNumber();

        System.out.println("  getDepartmentNames() / getDepartmentNumber() 输出：");
        csse.getDepartmentNames();
        csse.getDepartmentNumber();

        System.out.println("  getAdminOfficeInfo() 输出：");
        csse.getAdminOfficeInfo();

        System.out.println("  getExperimentCenterInfo() 输出：");
        csse.getExperimentCenterInfo();

        System.out.println("  getJournalOfficeInfo() 输出：");
        csse.getJournalOfficeInfo();
    }

    // ==================== 主方法 ====================
    public static void main(String[] args) {
        System.out.println("========== cn.edu.szu 包测试开始 ==========");
        testPerson();
        testInstitute();
        testDepartment();
        testAdminOffice();
        testExperimentCenter();
        testJournalEditorialOffice();
        testCSSE();

        System.out.println("========== 测试结果 ==========");
        System.out.println("通过：" + passCount + " 项，失败：" + failCount + " 项");
        if (failCount > 0) {
            System.out.println("存在未通过的测试！");
        } else {
            System.out.println("全部测试通过。");
        }
    }
}
