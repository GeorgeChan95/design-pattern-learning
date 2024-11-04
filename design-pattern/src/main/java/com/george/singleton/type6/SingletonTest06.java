package com.george.singleton.type6;

/**
 * @ClassName SingletonTest06
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 9:55
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }

}

// 懒汉式(线程安全，同步方法)
class Singleton {
    // 使用 volatile 关键字，当对象发生变化时，其它线程及时感知到
    private static volatile Singleton instance;

    // 构造器私有，不允许外部new对象
    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
