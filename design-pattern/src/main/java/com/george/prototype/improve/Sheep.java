package com.george.prototype.improve;

/**
 * @ClassName Sheep
 * @Description
 * @Author George
 * @Date 2024/11/6 19:08
 */
public class Sheep implements Cloneable{ // 实现Cloneable接口， 重写clone方法
    private String name;
    private int age;
    private String color;

    // 对象.clone() 操作是浅拷贝，对于引用类型的属性，仅复制引用地址。
    public Sheep friend; // 这里添加了friend属性，属性值是一个引用类型

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

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
