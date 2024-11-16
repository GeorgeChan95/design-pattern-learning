package com.george.decorator;

/**
 * @ClassName Bungalow
 * @Description
 * @Author George
 * @Date 2024/11/16 15:28
 */

/**
 * 平房
 */
public class Bungalow implements IHouse{
    @Override
    public void clean() {
        System.out.println("平房打扫卫生");
    }
}
