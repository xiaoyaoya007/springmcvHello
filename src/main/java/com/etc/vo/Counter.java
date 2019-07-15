package com.etc.vo;

public class Counter {
    private String number1;
    private String sign;
    private String number2;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public Counter(String number1, String sign, String number2) {
        this.number1 = number1;
        this.sign = sign;
        this.number2 = number2;
    }

    public Counter() {
    }
}
