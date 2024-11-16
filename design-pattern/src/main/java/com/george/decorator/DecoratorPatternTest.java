package com.george.decorator;

/**
 * @ClassName DecoratorPatternTest
 * @Description
 * @Author George
 * @Date 2024/11/16 15:47
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // 不使用装饰
        IHouse house = new Villa();
        house.clean();

        System.out.println("========================");
        // 使用装饰: 气球
        BalloonDecoratorHouse decoratorHouse = new BalloonDecoratorHouse(new Villa());
        decoratorHouse.clean();
        decoratorHouse.ballonDecorate();
        // 使用装饰: 圣诞树
        TreeDecoratorHouse treeDecorator = new TreeDecoratorHouse(new Villa());
        treeDecorator.treeDecorate();
    }
}
