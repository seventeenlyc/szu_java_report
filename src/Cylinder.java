class Cylinder { // 定义圆柱体类Cylinder
    private double radius; // 定义半径radius
    private double height; // 定义高度height
    public void setInfo(double radius, double height) { // 定义setInfo方法设置半径和高度
        this.radius = radius; // 将参数radius赋值给当前对象的radius
        this.height = height; // 将参数height赋值给当前对象的height
    }
    public double volume() { // 定义volume方法计算圆柱体体积
        return Math.PI * radius * radius * height; // 根据πr²h计算并返回圆柱体体积
    }
    public double area() { // 定义area方法计算圆柱体表面积
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height; // 计算并返回圆柱体表面积
    }
    public String toString() { // 定义toString方法返回圆柱体的信息
        return String.format("半径: %.2f, 高: %.2f, 体积: %.2f, 表面积: %.2f",
                radius, height, volume(), area()); // 将圆柱体各项数据转换为字符串并返回
    }
    public static void main() { // 在Cylinder类内部定义main方法
        Cylinder cylinder = new Cylinder(); // 创建Cylinder类的一个对象
        cylinder.setInfo(3.0, 5.0); // 调用setInfo方法设置半径为3、高为5
        IO.println("圆柱体体积: " + cylinder.volume()); // 调用volume方法并输出体积
        IO.println("圆柱体表面积: " + cylinder.area()); // 调用area方法并输出表面积
        IO.println(cylinder.toString()); // 调用toString方法并输出完整信息
    }
}
