public class hw9_6test {
    public static void main(String[] args) {
        // 创建 StopWatch 对象
        hw9_6 stopwatch = new hw9_6();

        // 测试排序算法的执行时间
        int[] array = generateRandomArray(1000);
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();

        // 显示执行时间
        System.out.println("Execution time for sorting 1000 numbers: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // 生成随机数字数组
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    // 选择排序算法
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}