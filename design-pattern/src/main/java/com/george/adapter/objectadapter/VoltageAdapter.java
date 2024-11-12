package com.george.adapter.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Description
 * @Author George
 * @Date 2024/11/12 19:55
 */
// 适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        if (voltage220V == null) return 0;
        // 被适配类方法调用
        int srcV = voltage220V.output220V();
        int out = srcV / 44; // 对被适配输出结果进行适配
        // 将适配后的结果返回
        return out;
    }
}
