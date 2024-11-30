package com.george.state.example1;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个State对象
        State state = new ConcreteStateA();
        // 创建环境
        Context context = new Context();
        // 将状态设置到环境中
        context.setState(state);
        // 调用请求
        context.request("param A");

    }
}
