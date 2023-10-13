package cn.bugstack.design.impl;


public class CalculationAreaExt extends CalculationArea {

    private final static double  π = 3.141592653D;

    @Override
    public double circular(double r) {
        return π * r * r;
    }

}
