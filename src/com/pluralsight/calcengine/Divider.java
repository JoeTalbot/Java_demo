package com.pluralsight.calcengine;

/**
 * Created by z069057 on 10/14/16.
 */
public class Divider extends CalculateBase {
    public Divider(){}

    public Divider(double leftVal, double rightVal) {
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }

}
