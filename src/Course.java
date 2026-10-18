class Course { // 定义课程类Course
    private String courseName; // 定义courseName表示课程名称
    private String teacherName; // 定义teacherName表示任课教师姓名
    private double credit; // 定义credit表示课程学分
    private int difficulty; // 定义difficulty表示课程难度
    public void setInfo(String courseName,String teacherName,double credit,int difficulty) { // 定义setInfo方法设置课程信息
        this.courseName=courseName; // 设置课程名称
        this.teacherName=teacherName; // 设置任课教师姓名
        this.credit=credit; // 设置课程学分
        this.difficulty=difficulty; // 设置课程难度
    }
    public boolean isRecommended() { // 定义isRecommended方法判断课程是否值得推荐
        return credit>=2&&difficulty<=3; // 判断学分是否不低于2且课程难度是否不高于3
    }
    public String toString() { // 定义toString方法返回课程基本信息和推荐结果
        String result=isRecommended()?"值得推荐":"不值得推荐"; // 根据isRecommended方法得到课程推荐结果
        return "课程名称："+courseName+"，任课教师："+teacherName+"，学分："+credit+"，课程难度："+difficulty+"，推荐结果："+result; // 返回课程基本信息和推荐结果
    }
    public static void main() { // 定义main方法测试Course类
        Course course=new Course(); // 创建Course类的对象
        course.setInfo("Java程序设计","张老师",3,2); // 设置课程名称、任课教师、学分和课程难度
        IO.println("是否值得推荐："+course.isRecommended()); // 调用isRecommended方法并输出判断结果
        IO.println(course.toString()); // 调用toString方法并输出课程基本信息和推荐结果
    }
}
