package com.george.state.example1;

/**
 * 具体状态类A
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle : " + sampleParameter);
    }
}
