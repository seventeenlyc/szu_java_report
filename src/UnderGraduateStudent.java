class UnderGraduateStudent { // 定义本科生类UnderGraduateStudent
    private String studentId; // 定义studentId表示学号
    private String name; // 定义name表示姓名
    private double averageScore; // 定义averageScore表示平均成绩
    private double comprehensiveScore; // 定义comprehensiveScore表示综合测评成绩
    public void setInfo(String studentId,String name,double averageScore,double comprehensiveScore) { // 定义setInfo方法设置学生信息
        this.studentId=studentId; // 设置学生学号
        this.name=name; // 设置学生姓名
        this.averageScore=averageScore; // 设置学生平均成绩
        this.comprehensiveScore=comprehensiveScore; // 设置学生综合测评成绩
    }
    public boolean isExcellent() { // 定义isExcellent方法判断学生是否优秀
        return averageScore>=85&&comprehensiveScore>=90; // 判断平均成绩是否不低于85且综合测评成绩是否不低于90
    }
    public String toString() { // 定义toString方法返回学生基本信息和评定结果
        String result=isExcellent()?"优秀学生":"非优秀学生"; // 根据isExcellent方法得到学生评定结果
        return "学号: "+studentId+", 姓名: "+name+", 平均成绩: "+averageScore+", 综合测评成绩: "+comprehensiveScore+", 评定结果: "+result; // 返回学生基本信息和评定结果
    }
    public static void main() { // 定义main方法测试UnderGraduateStudent类
        UnderGraduateStudent student=new UnderGraduateStudent(); // 创建UnderGraduateStudent类的对象
        student.setInfo("20260001", "张三", 88, 92); // 设置学生的学号、姓名、平均成绩和综合测评成绩
        IO.println("是否为优秀学生: "+student.isExcellent()); // 调用isExcellent方法并输出判断结果
        IO.println(student.toString()); // 调用toString方法并输出学生基本信息和评定结果
    }
}
