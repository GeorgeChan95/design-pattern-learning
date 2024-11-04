package com.george.singleton.type1;

/**
 * @ClassName SingletonTest01
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 9:19
 */
public class SingletonTest01 {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode()); // instance.hashCode=460141958
        System.out.println("instance2.hashCode=" + instance2.hashCode()); // instance2.hashCode=460141958
    }

}

/**
 * 单例模式：饿汉式（静态常量）
 */
class Singleton {
    // 1.构造器私有化

    private Singleton() {
    }

    // 2.在类的内部创建对象实例
    private static final Singleton instance = new Singleton();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
