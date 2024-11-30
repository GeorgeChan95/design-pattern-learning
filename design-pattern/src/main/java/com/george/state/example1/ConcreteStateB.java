package com.george.state.example1;

/**
 * 具体状态类B
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle : " + sampleParameter);
    }
}
