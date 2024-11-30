package com.george.interpreter;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 环境
        Context context = new Context();

        // 变量
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        // 布尔常量
        Constant c = new Constant(true);

        // 将变量名和常量值设置到环境中
        context.assign(x, false);
        context.assign(y, true);

        Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));
        System.out.println("x=" + x.interpret(context));
        System.out.println("y=" + y.interpret(context));
        System.out.println(exp.toString() + "=" + exp.interpret(context));
    }
}
