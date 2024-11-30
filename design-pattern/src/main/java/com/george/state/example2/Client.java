package com.george.state.example2;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 9; i++) {
            vm.vote("George", "A");
        }
    }
}
