package com.george.prototype.deepclone;

import java.io.*;

/**
 * @ClassName Sheep
 * @Description
 * @Author George
 * @Date 2024/11/6 19:08
 */
public class Sheep implements Serializable, Cloneable{ // 实现Cloneable接口， 重写clone方法
    private String name;
    private int age;
    private String color;

    // 对象.clone() 操作是浅拷贝，对于引用类型的属性，仅复制引用地址。
    public SheepFriend friend; // 这里添加了friend属性，属性值是一个引用类型

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SheepFriend getFriend() {
        return friend;
    }

    public void setFriend(SheepFriend friend) {
        this.friend = friend;
    }

    /**
     * 深拷贝方式一：重写 clone() 方法
     * @return
     */
    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            // 将引用属性也调用clone() 方法复制一份
            SheepFriend sheepFriend = friend.clone();
            // 重新设置引用属性
            sheep.friend = sheepFriend;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }

    /**
     * 深拷贝-方式2：通过对象序列化实现(推荐)
     * @return
     */
    public Sheep deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 将当前对象以对象流的形式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep) ois.readObject();
            return sheep;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
