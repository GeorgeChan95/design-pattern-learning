package com.george.state.example1;

/**
 * 抽象状态接口, 定义具体状态类共用的处理方法
 */
public interface State {

    /**
     * 状态对应的处理
     * @param sampleParameter 相同的参数
     */
    void handle(String sampleParameter);
}
