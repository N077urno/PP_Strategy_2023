/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class PotenciaInstantanea implements Strategy {
    @Override
    public void CalculaPotencia(){
        float trabalho = (float) 0.5;
        float tempo = (float) 0.1;
        float potencia;
        
        potencia = trabalho/tempo;
        
        System.out.println("Potencia Instantanea: "+potencia);
    }
}
