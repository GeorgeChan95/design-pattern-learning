package com.george.uml.dependence;

import com.george.uml.realization.LandRover;

/**
 * @author George Chan
 * @date 2024/11/3 16:27
 * <p></p>
 */
public class ChineseMan extends LandRover {
    private String skinColor = "yellow";

    public  void sayHello(){
        System.out.println("欢迎来中国 !");
    }

    public void useCar(LandRover car){
        car.brand();
    }
}
