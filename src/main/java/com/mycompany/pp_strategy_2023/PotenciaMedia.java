/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class PotenciaMedia implements Strategy {
    @Override
    public void CalculaPotencia(){
        int trabalho = 10;
        float tempo = (float) 0.5;
        float potencia;
        
        potencia = trabalho/tempo;
        
        System.out.println("Potencia Media: "+potencia);
    }
}
