package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde my Implementacion propa del bean");
    }
}
