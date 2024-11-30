package com.george.state.example2;

import java.util.Map;

/**
 * 具体状态：正常投票
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        Map<String, String> mapVote = voteManager.getMapVote();
        mapVote.put(user, voteItem);
        System.out.println("投票成功");
    }
}
