public class hw9_6 {
    private long startTime;
    private long endTime;

    public hw9_6() {
        startTime = System.currentTimeMillis();
    }

    // 将startTime重设为当前时间
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // 将endTime设置为当前时间
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // 返回秒表记录的时间（ms）
    public long getElapsedTime() {
        return endTime - startTime;
    }
}



