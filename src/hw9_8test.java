public class hw9_8test {
    public static void main(String[] args) {
        // 创建两个 Fan 对象并设置属性
        hw9_8 fan1 = new hw9_8();
        fan1.setSpeed(hw9_8.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        hw9_8 fan2 = new hw9_8();
        fan2.setSpeed(hw9_8.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
