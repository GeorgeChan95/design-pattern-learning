package com.george.visitor.assign2;

/**
 * @ClassName West
 * @Description
 * @Author George
 * @Date 2024/11/23 16:37
 */
public abstract class West {

    // 传入East子类作为参数
    public abstract void goWest1(SubEast1 east);

    // 传入East子类作为参数
    public abstract void goWest2(SubEast2 east);
}
