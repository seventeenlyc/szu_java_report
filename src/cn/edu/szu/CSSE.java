package cn.edu.szu;
import java.util.ArrayList;
import java.util.List;
/**
 * 计算机与软件学院类。
 */
public class CSSE {
    private List<Institute> institutes = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private AdminOffice adminOffice;
    private ExperimentCenter experimentCenter;
    private JournalEditorialOffice journalOffice;

    public void addInstitute(Institute institute) { institutes.add(institute); }
    public void addDepartment(Department department) { departments.add(department); }

    public void setAdminOffice(AdminOffice adminOffice) { this.adminOffice = adminOffice; }
    public void setExperimentCenter(ExperimentCenter experimentCenter) { this.experimentCenter = experimentCenter; }
    public void setJournalOffice(JournalEditorialOffice journalOffice) { this.journalOffice = journalOffice; }

    public AdminOffice getAdminOffice() { return adminOffice; }
    public ExperimentCenter getExperimentCenter() { return experimentCenter; }
    public JournalEditorialOffice getJournalOffice() { return journalOffice; }

    // 2.1 的方法
    public void getInstituteNames() {
        System.out.println("研究所/中心名称及负责人：");
        for (Institute i : institutes) {
            System.out.println("  " + i.getName() + "  负责人：" + i.getDirector());
        }
    }

    public void getDepartmentNames() {
        System.out.println("教学系名称及系主任：");
        for (Department d : departments) {
            System.out.println("  " + d.getName() + "  系主任：" + d.getHead());
        }
    }

    public void getInstituteNumber() {
        System.out.println("研究所/中心数量：" + institutes.size());
    }

    public void getDepartmentNumber() {
        System.out.println("教学系数量：" + departments.size());
    }

    // 2.2 新增的方法
    public void getAdminOfficeInfo() {
        if (adminOffice == null) {
            System.out.println("暂无行政办公室信息");
            return;
        }
        adminOffice.showMembers();
        Person director = adminOffice.getDirector();
        if (director != null) {
            System.out.println("办公室主任：" + director.getName());
        }
    }

    public void getExperimentCenterInfo() {
        if (experimentCenter == null) {
            System.out.println("暂无实验中心信息");
            return;
        }
        experimentCenter.showMembers();
    }

    public void getJournalOfficeInfo() {
        if (journalOffice == null) {
            System.out.println("暂无期刊编辑部信息");
            return;
        }
        journalOffice.showInfo();
    }
}
