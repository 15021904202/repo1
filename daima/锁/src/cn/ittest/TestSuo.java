package cn.ittest;

/**
 * 同步锁的实现方式
 */
public class TestSuo {
    public static void main(String[] args) throws InterruptedException {
        // 同步代码块
        SynchronizedBlock block = new SynchronizedBlock();
        Thread  thread1_1=new Thread(block,"1号窗口");
        Thread  thread1_2=new Thread(block,"2号窗口");
        thread1_1.start();
        thread1_2.start();
    }
}
