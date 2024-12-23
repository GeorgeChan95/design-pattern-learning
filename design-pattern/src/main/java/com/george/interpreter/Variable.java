package com.george.interpreter;

/**
 * 一个Variable对象代表一个有名变量
 */
public class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context ctx) {
        // 获取变量对应的值
        boolean value = ctx.lookup(this);
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Variable) {
            return this.name.equals(((Variable)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
