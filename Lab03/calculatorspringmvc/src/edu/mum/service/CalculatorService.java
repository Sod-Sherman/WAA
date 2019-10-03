package edu.mum.service;

import edu.mum.model.Calculator;

public interface CalculatorService {
    abstract public Double calculateSum(Calculator calculator);
    abstract public Double calculateProduct(Calculator calculator);
}
