package com.george.singleton.type3;

/**
 * @ClassName SingletonTest03
 * @Description
 * @Author George
 * @Date 2024/11/4 9:37
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 单例模式：懒汉式（线程不安全的实现）
 */
class Singleton {
    private static Singleton instance;

    //1. 构造器私有化, 外部能new
    private Singleton() {
    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) { // 多线程并发下，可能会new多个实例对象
            instance = new Singleton();
        }
        return instance;
    }
}
