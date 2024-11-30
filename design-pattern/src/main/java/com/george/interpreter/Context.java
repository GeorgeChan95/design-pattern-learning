package com.george.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境(Context)类定义出从变量到布尔值的一个映射
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<>();

    /**
     * 设置变量和值
     * @param variable
     * @param value
     */
    public void assign(Variable variable, boolean value) {
        map.put(variable, value);
    }

    /**
     * 根据变量获取变量的值
     * @param var
     * @return
     */
    public boolean lookup(Variable var) {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
