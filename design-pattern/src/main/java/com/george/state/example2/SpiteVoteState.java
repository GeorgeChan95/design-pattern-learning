package com.george.state.example2;

import java.util.Map;

/**
 * 具体状态：恶意刷票
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        Map<String, String> mapVote = voteManager.getMapVote();
        if (mapVote.get(user) != null) {
            mapVote.remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
