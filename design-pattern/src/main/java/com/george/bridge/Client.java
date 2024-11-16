package com.george.bridge;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/16 13:25
 */
// 测试类
public class Client {

    public static void main(String[] args) {
        FoldedPhone foldedXiaomi = new FoldedPhone(new XiaoMi());
        foldedXiaomi.open();
        foldedXiaomi.call();
        foldedXiaomi.close();
        System.out.println("========================");

        FoldedPhone foldedVivo = new FoldedPhone(new Vivo());
        foldedVivo.open();
        foldedVivo.call();
        foldedVivo.close();
        System.out.println("========================");

        UpRightPhone upXiaomi = new UpRightPhone(new XiaoMi());
        upXiaomi.open();
        upXiaomi.call();
        upXiaomi.close();
        System.out.println("========================");

        UpRightPhone upVivo = new UpRightPhone(new XiaoMi());
        upVivo.open();
        upVivo.call();
        upVivo.close();
        System.out.println("========================");
    }
}
