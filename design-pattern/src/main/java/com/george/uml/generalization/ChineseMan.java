package com.george.uml.generalization;

import com.george.uml.test.Person;

/**
 * @author George Chan
 * @date 2024/11/3 15:19
 * <p></p>
 */
public class ChineseMan extends Person {
    private String skinColor = "yellow";

    public void sayHello() {
        System.out.println("欢迎来中国 !");
    }
}
