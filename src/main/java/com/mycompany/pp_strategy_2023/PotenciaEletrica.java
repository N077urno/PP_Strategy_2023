/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class PotenciaEletrica implements Strategy {
    @Override
    public void CalculaPotencia(){
        float tensao = (float) 10;
        float corrente = (float) 1.5;
        float potencia;
        
        potencia = tensao*corrente;
        
        System.out.println("Potencia Eletrica: "+potencia);
    }
}
