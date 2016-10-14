package com.pluralsight.calcengine;

/**
 * Created by z069057 on 10/14/16.
 */
public class Subtracter extends CalculateBase{
    public Subtracter(){}

    public Subtracter(double leftVal, double rightVal) {
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
