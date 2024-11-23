package com.george.visitor.assign;

/**
 * @ClassName Mozi
 * @Description
 * @Author George
 * @Date 2024/11/23 15:53
 */

/**
 * 静态分派：方法重载是根据静态类型进行的
 */
public class Mozi {

    public void ride(Horse h){
        System.out.println("骑马");
    }

    public void ride(WhiteHorse wh){
        System.out.println("骑白马");
    }

    public void ride(BlackHorse bh){
        System.out.println("骑黑马");
    }

    public static void main(String[] args) {
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
    }
}
