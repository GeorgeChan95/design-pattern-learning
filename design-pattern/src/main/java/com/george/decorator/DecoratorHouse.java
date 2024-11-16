package com.george.decorator;

/**
 * @ClassName DecoratorHouse
 * @Description
 * @Author George
 * @Date 2024/11/16 15:37
 */

/**
 * 房间装饰器
 */
public abstract class DecoratorHouse implements IHouse {
    public IHouse decoratedHouse;

    public DecoratorHouse(IHouse decoratedHouse) {
        this.decoratedHouse = decoratedHouse;
    }


}
