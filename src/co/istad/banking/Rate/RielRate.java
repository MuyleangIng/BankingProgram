package co.istad.banking.Rate;

import co.istad.banking.Interest;

public class RielRate implements Interest {
    @Override
    public Double calculate(Double amount) {
        return amount * 0.09;
    }
}
