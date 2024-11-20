package com.george.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName WebSiteFactory
 * @Description
 * @Author George
 * @Date 2024/11/20 21:14
 */
// 享元工厂
public class WebSiteFactory {

    // 共享数据池
    private Map<String, WebSite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            // 创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}
