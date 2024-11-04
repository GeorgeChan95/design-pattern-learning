package com.george.singleton.type5;

/**
 * @ClassName SingletonTest05
 * @Description
 * @Author George
 * @Date 2024/11/4 9:50
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("~懒汉式(线程不安全，同步代码块)~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

/**
 * 单例模式：懒汉式(线程不安全，同步代码块)
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // 同步代码框放到 instance == null 后面，解决不了线程安全问题
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}