package cn.itcast;

public class tast {
    public static void main(String[] args) {
        // 继承Thread
     //   run1();
        //重写thread方法
     //  run2();
        //实现runabble接口
   //   run3();
        //实现runabble接口
        run4();
    }

    private static void run4() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        },"thread4").start();
    }

    private static void run3() {
        Thread thread2_1= new Thread(new MyRunnable());
        thread2_1.setName("thread3_1");
        thread2_1.start();
        Thread thread2_2 = new Thread( new MyRunnable(),"thread3_2");
        thread2_2.start();
    }

    private static void run2() {
        new Thread("thread2"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+":"+i);
                }
            }
        }.start();
    }

    private static void run1() {
        MyThreadClass thread1_1 = new MyThreadClass();
        MyThreadClass thread1_2=new MyThreadClass("thread1_2");
        thread1_1.setName("thread1_1");
        thread1_1.start();
        thread1_2.start();
    }
}
