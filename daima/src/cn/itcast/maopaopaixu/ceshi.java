package cn.itcast.maopaopaixu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ceshi {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        long A = Calendar.getInstance().getTimeInMillis();
        System.out.println(A);
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
