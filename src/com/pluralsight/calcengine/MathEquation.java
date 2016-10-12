package com.pluralsight.calcengine;

/**
 * Created by z069057 on 10/12/2016.
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getOpCode() {return leftVal;}
    public void setOpCode (char opCode) {this.opCode = opCode;}

    public double getResult() {return result;}

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation (char opcode, double leftVal, double rightVal) {
        this(opcode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }

    public void execute()
    {
        switch(opCode) {
            case 'a' :
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = (rightVal != 0) ? leftVal / rightVal : 0.0d;
                break;
            case  'm':
                result = leftVal * rightVal;
                break;
            default :
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
