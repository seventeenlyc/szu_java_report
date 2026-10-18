public class Cone { // 定义圆锥体类Cone
    private double radius; // 定义数据成员radius表示圆锥底面半径
    private double height; // 定义数据成员height表示圆锥高度
    public void setInfo(double radius, double height) { // 定义setInfo方法设置半径和高度
        this.radius = radius; // 将参数radius赋值给当前对象的radius
        this.height = height; // 将参数height赋值给当前对象的height
    }
    public double volume() { // 定义volume方法计算圆锥体积
        return 1.0 / 3.0 * Math.PI * radius * radius * height; // 根据1/3πr²h计算并返回体积
    }
    public double area() { // 定义area方法计算圆锥表面积
        double line = Math.sqrt(radius * radius + height * height); // 根据勾股定理计算圆锥母线长度
        return Math.PI * radius * radius + Math.PI * radius * line; // 计算底面积与侧面积之和并返回
    }
    public String toString() { // 定义toString方法返回圆锥的信息
        return String.format("半径: %.2f, 高: %.2f, 体积: %.2f, 表面积: %.2f", // 设置输出字符串格式
                radius, height, volume(), area()); // 将圆锥各项数据转换为字符串
    }
    public static void main(String[] args) { // 定义main方法测试Cone类
        Cone cone = new Cone(); // 创建一个Cone类的对象
        cone.setInfo(3.0, 4.0); // 调用setInfo方法设置半径为3、高为4
        IO.println("圆锥体积: " + cone.volume()); // 调用volume方法并输出圆锥体积
        IO.println("圆锥表面积: " + cone.area()); // 调用area方法并输出圆锥表面积
        IO.println(cone.toString()); // 调用toString方法输出圆锥完整信息
    }
}
