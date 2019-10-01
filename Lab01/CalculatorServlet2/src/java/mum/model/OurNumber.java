package mum.model;

public class OurNumber {
    private Double num1;
    private Double num2;
    private Double sum;
    private Double product;

    public OurNumber(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;

        this.sum = num1 + num2;
        this.product = num1 * num2;
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
    public Double add(){
        return num1 + num2;
    }

    public Double multiply(){
        return num1 * num2;
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
}
