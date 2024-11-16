package com.george.decorator;

/**
 * @ClassName HighRiseBuilding
 * @Description
 * @Author George
 * @Date 2024/11/16 15:29
 */

/**
 * 楼房
 */
public class HighRiseBuilding implements IHouse{
    @Override
    public void clean() {
        System.out.println("楼房打扫卫生");
    }
}
