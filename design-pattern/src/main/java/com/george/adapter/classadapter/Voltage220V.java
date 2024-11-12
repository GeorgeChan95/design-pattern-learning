package com.george.adapter.classadapter;

/**
 * @ClassName Voltage220V
 * @Description
 * @Author George
 * @Date 2024/11/12 19:49
 */
// 被适配的类
public class Voltage220V {

    /**
     * 输出220V电压
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("输出电压 " + src + " V");
        return src;
    }
}
