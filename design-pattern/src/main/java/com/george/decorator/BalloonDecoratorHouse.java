package com.george.decorator;

/**
 * @ClassName BalloonDecoratorHouse
 * @Description
 * @Author George
 * @Date 2024/11/16 15:39
 */

/**
 * 具体的装饰：气球
 */
public class BalloonDecoratorHouse extends DecoratorHouse {

    public BalloonDecoratorHouse(IHouse decoratedHouse) {
        super(decoratedHouse);
    }

    @Override
    public void clean() {
        super.decoratedHouse.clean();
    }

    /**
     * 自定义装饰方法
     */
    public void ballonDecorate() {
        // 用气球装饰房间
        System.out.println("用气球装饰房间, 好漂亮");
    }
}
