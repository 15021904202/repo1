package cn.ittest;

public class SynchronizedBlock implements  Runnable {
    private  static int x = 100;//
    private  Object obj= new Object();
    @Override
    public void run() {
        while (true){
            syncBlock();
        }
    }

    private void syncBlock() {
        synchronized (obj){
            if (x>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在出售第"+x--+"张票");

            }        }
    }
}
