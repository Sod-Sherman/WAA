package edu.mum.service;


import edu.mum.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Double calculateSum(Calculator calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public Double calculateProduct(Calculator calculator) {
        return calculator.getNum3() * calculator.getNum4();
    }



}
