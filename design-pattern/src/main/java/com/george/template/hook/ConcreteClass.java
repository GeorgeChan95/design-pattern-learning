package com.george.template.hook;

/**
 * 具体实现类
 */
public class ConcreteClass extends AbstractClass{

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void abstractMethod() {
        System.out.println("具体实现类--重写父类的抽象方法");
    }

    /**
     * 子类重写钩子方法，非必须
     * @return
     */
    @Override
    public boolean hookMethod() {
        System.out.println("重写了父类的钩子方法, 反向控制父类的行为");
        return false;
    }
}
