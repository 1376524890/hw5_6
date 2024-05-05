public class Rectangle {
    private double width;
    private double height;

    // 默认构造方法
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // 带参数的构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 计算矩形面积
    public double getArea() {
        return width * height;
    }

    // 计算矩形周长
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // 获取矩形宽度
    public double getWidth() {
        return width;
    }

    // 获取矩形高度
    public double getHeight() {
        return height;
    }
}

// 测试程序


