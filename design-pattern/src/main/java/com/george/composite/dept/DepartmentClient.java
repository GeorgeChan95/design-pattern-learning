package com.george.composite.dept;

/**
 * @ClassName DepartmentClient
 * @Description
 * @Author George
 * @Date 2024/11/19 20:48
 */
public class DepartmentClient {
    public static void main(String[] args) {
        AggregateDepartment company = new AggregateDepartment("公司");

        Department fawu = new LeafDepartment("法务部");
        Department xingzheng = new LeafDepartment("行政部");
        Department renshi = new LeafDepartment("人事部");
        AggregateDepartment jishu = new AggregateDepartment("技术部");

        Department java = new LeafDepartment("Java事业部");
        Department c = new LeafDepartment("C++事业部");
        Department go = new LeafDepartment("GO事业部");
        Department front = new LeafDepartment("大前端事业部");

        company.addDepartment(fawu);
        company.addDepartment(xingzheng);
        company.addDepartment(renshi);
        company.addDepartment(jishu);

        jishu.addDepartment(java);
        jishu.addDepartment(c);
        jishu.addDepartment(go);
        jishu.addDepartment(front);

        company.show();
    }
}
