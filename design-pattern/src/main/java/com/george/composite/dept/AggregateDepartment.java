package com.george.composite.dept;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AggregateDepartmen
 * @Description
 * @Author George
 * @Date 2024/11/19 20:45
 */
// 聚合部门
public class AggregateDepartment implements Department {
    private String name;

    // 聚合下属部门
    List<Department> departmentList = new ArrayList<>();

    public AggregateDepartment(String name) {
        this.name = name;
    }

    // 添加部门
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    @Override
    public void show() {
        System.out.println("当前部门为：" + this.name + " 下属部门为：");
        for (Department department : departmentList) {
            department.show();
        }
    }
}
