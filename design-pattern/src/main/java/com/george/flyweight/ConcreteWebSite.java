package com.george.flyweight;

/**
 * @ClassName ConcreteWebSite
 * @Description
 * @Author George
 * @Date 2024/11/20 21:11
 */
// 具体的享元角色
public class ConcreteWebSite extends WebSite {

    // 网站类型，享元模式中的内部状态
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
