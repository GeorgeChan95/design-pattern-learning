package com.george.mediator.example1;

/**
 * 具体中介者
 */
public class ConcreteMediator implements Mediator{

    // 持有并维护同事A
    private ConcreteColleagueA colleagueA;
    // 持有并维护同事B
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague c) {

    }
}
