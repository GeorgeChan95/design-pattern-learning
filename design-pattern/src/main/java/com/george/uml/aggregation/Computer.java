package com.george.uml.aggregation;

/**
 * @author George Chan
 * @date 2024/11/3 16:59
 * <p></p>
 */
public class Computer {
    private Mouse mouse; //鼠标可以和computer分离
    private Moniter moniter;//显示器可以和Computer分离
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
