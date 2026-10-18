public class Sphere { // 定义球体类Sphere
    private double radius; // 定义数据成员radius表示球体半径
    public void setInfo(double radius) { // 定义setInfo方法设置球体半径
        this.radius = radius; // 将参数radius赋值给当前对象的radius
    }
    public double volume() { // 定义volume方法计算球体体积
        return 4.0 / 3.0 * Math.PI * radius * radius * radius; // 根据4/3πr³计算并返回球体体积
    }
    public double area() { // 定义area方法计算球体表面积
        return 4 * Math.PI * radius * radius; // 根据4πr²计算并返回球体表面积
    }
    public String toString() { // 定义toString方法返回球体的信息
        return String.format("半径: %.2f, 体积: %.2f, 表面积: %.2f", // 设置输出字符串格式
                radius, volume(), area()); // 将球体半径、体积和表面积转换为字符串
    }
    void main() { // 定义main方法测试Sphere类
        Sphere sphere = new Sphere(); // 创建一个Sphere类的对象
        sphere.setInfo(3.0); // 调用setInfo方法设置球体半径为3
        IO.println("球体体积: " + sphere.volume()); // 调用volume方法并输出球体体积
        IO.println("球体表面积: " + sphere.area()); // 调用area方法并输出球体表面积
        IO.println(sphere.toString()); // 调用toString方法输出球体完整信息
    }
}
