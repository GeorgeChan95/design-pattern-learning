package com.george.adapter.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Description
 * @Author George
 * @Date 2024/11/12 19:55
 */
// 适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // 父类方法输出的结果
        int srcV = output220V();
        int out = srcV / 44; // 对父类输出结果进行适配
        // 将适配后的接口返回
        return out;
    }
}
