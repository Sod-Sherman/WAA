package mum.edu.model;

public class OurNumber {
    private Double num1;
    private Double num2;
    private Double num3;
    private Double num4;

    private Double sum;
    private Double product;

    public OurNumber(){

    }

    public OurNumber(Double num1, Double num2, Double num3, Double num4){
        this.sum = num1 + num2;
        this.product = num3 * num4;
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

    public Double getNum4() {
        return num4;
    }

    public void setNum4(Double num4) {
        this.num4 = num4;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getProduct() {
        return product;
    }

    public void setProduct(Double product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OurNumber{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", sum=" + sum +
                ", product=" + product +
                '}';
    }
}
