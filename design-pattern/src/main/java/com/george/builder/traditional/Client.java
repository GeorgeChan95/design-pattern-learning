package com.george.builder.traditional;

/**
 * @author George Chan
 * @date 2024/11/11 22:09
 * <p></p>
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse common = new CommonHouse();
        common.build();

        AbstractHouse high = new HighRises();
        high.build();
    }
}
