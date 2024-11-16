package com.george.decorator;

/**
 * @ClassName TreeDecoratorHouse
 * @Description
 * @Author George
 * @Date 2024/11/16 15:55
 */
public class TreeDecoratorHouse extends DecoratorHouse{
    public TreeDecoratorHouse(IHouse decoratedHouse) {
        super(decoratedHouse);
    }

    @Override
    public void clean() {
        super.decoratedHouse.clean();
    }

    /**
     * 自定义装饰方法
     */
    public void treeDecorate() {
        // 用圣诞树装饰房间
        System.out.println("用圣诞树装饰房间");
    }
}
