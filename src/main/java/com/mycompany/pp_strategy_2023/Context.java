/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    
    public void executarCalculo(){
        strategy.CalculaPotencia();
    }
}
