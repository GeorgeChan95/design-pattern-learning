package com.george.strategy.example2;

/**
 * 价格计算类
 */
public class Price {

    // 持有一个具体的策略对象
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double quote(double booksPrice) {
        return this.memberStrategy.calcPrice(booksPrice);
    }
}
