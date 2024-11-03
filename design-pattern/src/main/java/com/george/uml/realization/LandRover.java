package com.george.uml.realization;

import com.george.uml.dependence.ChineseMan;

/**
 * @author George Chan
 * @date 2024/11/3 16:14
 * <p></p>
 */
public class LandRover implements Car{
    @Override
    public void brand() {
        System.out.println("This is a LandRover");
    }
}
