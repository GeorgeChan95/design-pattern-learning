package com.george.state.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类
 */
public class VoteManager {
    // 持有的状态处理对象
    private VoteState state = null;
    // 记录用户投票的结果，Map<String,String>对应Map<用户名称，投票的选项>
    private Map<String, String> mapVote = new HashMap<>();
    // 记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票的次数>
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    /**
     * 获取用户投票结果的Map
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    /**
     * 投票方法
     *
     * @param user     投票人
     * @param voteItem 投票项
     */
    public void vote(String user, String voteItem) {
        // 1.为该用户增加投票次数
        Integer voteCount = mapVoteCount.get(user);
        if (voteCount == null) {
            voteCount = 0;
        }
        voteCount++;
        mapVoteCount.put(user, voteCount);

        // 2.判断该用户的投票类型，就相当于判断对应的状态
        if (voteCount == 1) { // 正常投票
            state = new NormalVoteState();
        } else if (voteCount > 1 && voteCount < 5) { // 重复投票
            state = new RepeatVoteState();
        } else if (voteCount >= 5 && voteCount < 8) { // 恶意刷票
            state = new SpiteVoteState();
        } else if (voteCount > 8) { // 黑名单
            state = new BlackVoteState();
        }

        // 调用状态接口方法，进行投票
        state.vote(user, voteItem, this);
    }
}
