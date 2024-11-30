package com.george.state.example2;

/**
 * 抽象状态类
 */
public interface VoteState {

    /**
     * 不同状态共有的投票方法
     * @param user 投票人
     * @param voteItem 投票项目
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，可以回调上下文的数据
     */
    void vote(String user, String voteItem, VoteManager voteManager);
}
