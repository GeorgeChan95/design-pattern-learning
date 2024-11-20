package com.george.flyweight;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/20 21:17
 */
// 测试类
public class Client {
    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        // 新闻形式的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));

        // 博客形式的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Jack"));


        int webSiteCount = factory.getWebSiteCount();
        System.out.println("网站分类数：" + webSiteCount);
    }
}
