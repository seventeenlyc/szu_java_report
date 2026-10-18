import cn.edu.szu.AdminOffice;
import cn.edu.szu.CSSE;
import cn.edu.szu.Department;
import cn.edu.szu.ExperimentCenter;
import cn.edu.szu.Institute;
import cn.edu.szu.JournalEditorialOffice;
import cn.edu.szu.Person;

// 2.1 / 2.2 的演示程序（类已经移入 cn.edu.szu 包，这里通过 import 使用）
void main(String[] args) {
    CSSE csse = new CSSE();

    // ---------- 2.1：研究所/中心、教学系 ----------
    csse.addInstitute(new Institute("高性能计算研究所", "陈国良"));
    csse.addInstitute(new Institute("大数据技术与应用研究所", "黄哲学"));
    csse.addInstitute(new Institute("未来媒体技术与计算研究所", "江健民"));
    csse.addInstitute(new Institute("人工智能安全研究所", "林秋镇"));
    csse.addInstitute(new Institute("视觉智能研究中心", "贾森"));
    csse.addInstitute(new Institute("可视计算研究中心", "黄惠"));
    csse.addInstitute(new Institute("智能服务计算研究中心", "张良杰"));
    csse.addInstitute(new Institute("软件工程研究中心", "明仲"));

    csse.addDepartment(new Department("计算机科学与技术系", "潘微科"));
    csse.addDepartment(new Department("软件工程系", "张良杰"));
    csse.addDepartment(new Department("人工智能系", "王熙照"));

    // ---------- 2.2：行政办公室 ----------
    AdminOffice office = new AdminOffice();
    office.addMember(new Person("刘晔", "办公室主任，纪委委员", "2690-9202", "ly@szu.edu.cn", "致腾楼839"));
    office.addMember(new Person("樊婷", "办公室副主任，工会副主席", "2653-5401", "fanting@szu.edu.cn", "致腾楼822"));
    office.addMember(new Person("洪岚军", "博士后工作站、人事秘书", "2653-5401", "honglj@szu.edu.cn", "致腾楼822"));
    office.addMember(new Person("王佳岱", "人事、OA秘书", "2690-9202", "wjd@szu.edu.cn", "致腾楼839"));
    office.addMember(new Person("皮倩", "工会秘书", "8693-5816", "piq@szu.edu.cn", "致腾楼834"));
    office.addMember(new Person("覃靖", "财务秘书", "2690-9202", "jingq@szu.edu.cn", "致腾楼839"));
    office.addMember(new Person("钱刘义", "院士秘书", "2655-8644", "qianly@szu.edu.cn", "汇元楼338"));
    office.addMember(new Person("王泽朋", "行政秘书", "8693-5816", "zpwang@szu.edu.cn", "致腾楼834"));
    csse.setAdminOffice(office);

    // ---------- 2.2：实验中心 ----------
    ExperimentCenter center = new ExperimentCenter();
    center.addMember(new Person("林佳利", "实验中心副主任，324、325实验室负责人", "2653-5346", "key@szu.edu.cn", "致腾楼319"));
    center.addMember(new Person("申向军", "322、323实验室负责人", "2653-5342", "shenxj@szu.edu.cn", "致腾楼321"));
    center.addMember(new Person("吴涛", "招投标管理员", "2653-5346", "wtao74@szu.edu.cn", "致腾楼319"));
    center.addMember(new Person("王召选", "设备管理员，326、328实验室负责人", "2653-5342", "wangzhaoxuan@szu.edu.cn", "致腾楼321"));
    center.addMember(new Person("尹义飞", "服务器机房管理员", "2653-5346", "yfyin@szu.edu.cn", "致腾楼319"));
    csse.setExperimentCenter(center);

    // ---------- 2.2：期刊编辑部 ----------
    JournalEditorialOffice journal = new JournalEditorialOffice(
            "机器学习与控制论国际期刊",
            "International Journal of Machine Learning and Cybernetics",
            "Springer",
            "1868-8071",
            2009, 2010, 17, 144, "2026年6月",
            "王熙照",
            "SCIE、JCR、CC",
            "2.9",
            "机器学习与控制论交叉领域的关键研究问题，涵盖新想法、设计方案、应用及实例研究");
    journal.addEditor(new Person("姜欣彤", "博士教学秘书，编辑部编辑", "2653-0131", "gracejiang@szu.edu.cn", "致腾楼822"));
    csse.setJournalOffice(journal);

    // ---------- 输出 ----------
    csse.getInstituteNames();
    csse.getInstituteNumber();
    System.out.println();
    csse.getDepartmentNames();
    csse.getDepartmentNumber();
    System.out.println();
    csse.getAdminOfficeInfo();
    System.out.println();
    csse.getExperimentCenterInfo();
    System.out.println();
    csse.getJournalOfficeInfo();
}
