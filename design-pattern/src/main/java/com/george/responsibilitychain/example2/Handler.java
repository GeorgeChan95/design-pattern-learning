package com.george.responsibilitychain.example2;

/**
 * 抽象处理者角色类
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    private Handler successor = null;

    /**
     * 获取下一个处理请求的对象
     *
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 设置下一个处理请求的对象
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     *
     * @param user 申请人
     * @param fee  申请的钱数
     * @return 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user, double fee);
}
