import java.util.Random;
public class hw9_4 {
    public static void main(String[] args) {
        // 创建种子为1000的 Random 对象
        Random random = new Random(1000);

        // 显示0到100之间的前50个随机整数
        System.out.println("50 random numbers between 0 and 100:");
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(101); // 生成0到100之间的随机整数
            System.out.print(randomNumber + " ");
        }
    }
}

