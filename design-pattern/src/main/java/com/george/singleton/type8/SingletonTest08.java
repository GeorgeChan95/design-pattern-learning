package com.george.singleton.type8;

/**
 * @ClassName SingletonTest08
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 10:05
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();
    }
}

/**
 * 单例模式，基于枚举实现，（推荐）
 */
enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("~ok~");
    }
}
