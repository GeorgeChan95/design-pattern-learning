package com.george.interpreter;

/**
 * 一个Constant对象代表一个布尔常量
 */
public class Constant extends Expression {

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    /**
     * 检验两个表达式在结构上是否相同
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Constant) {
            return this.value == ((Constant) obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
