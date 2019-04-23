package cn.itcast;

public class MyThreadClass extends  Thread {
    public MyThreadClass() {
    }

    public MyThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
