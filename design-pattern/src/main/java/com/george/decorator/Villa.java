package com.george.decorator;

/**
 * @ClassName Villa
 * @Description
 * @Author George
 * @Date 2024/11/16 15:30
 */

/**
 * 别墅
 */
public class Villa implements IHouse {
    @Override
    public void clean() {
        System.out.println("别墅打扫卫生");
    }
}
