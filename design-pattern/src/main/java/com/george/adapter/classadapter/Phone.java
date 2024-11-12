package com.george.adapter.classadapter;

/**
 * @ClassName Phone
 * @Description
 * @Author George
 * @Date 2024/11/12 19:57
 */
// 使用适配器
public class Phone {

    // 充电方法
    public void charging(IVoltage5V iVoltage5V) {
        int data = iVoltage5V.output5V();
        if (data == 5) {
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.println("电压不符合使用标准");
        }
    }
}
