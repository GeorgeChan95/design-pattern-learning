package com.george.state.example1;

/***
 * 环境角色类， 当内部状态（state）改变的时候，行为（request）也发生了改变
 */
public class Context {

    // 持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 请求的方法
     * @param sampleParameter
     */
    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
