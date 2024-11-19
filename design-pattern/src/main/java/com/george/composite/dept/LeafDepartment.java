package com.george.composite.dept;

/**
 * @ClassName LeafDepartment
 * @Description
 * @Author George
 * @Date 2024/11/19 20:43
 */
// 叶子部门
public class LeafDepartment implements Department {
    // 部门名称
    public String name;

    public LeafDepartment(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
