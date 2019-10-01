package edu.mum.model;

public class OurNumber {
    private Double num0;
    private Double num1;
    private Double num2;
    private Double num3;

    public OurNumber(){
        this.num0 = Math.random();
        this.num1 = Math.random();
        this.num2 = Math.random();
        this.num3 = Math.random();
    }

    public Double getNum0() {
        return num0;
    }

    public void setNum0(Double num0) {
        this.num0 = num0;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum3() {
        return num3;
    }

    public void setNum3(Double num3) {
        this.num3 = num3;
    }
}
