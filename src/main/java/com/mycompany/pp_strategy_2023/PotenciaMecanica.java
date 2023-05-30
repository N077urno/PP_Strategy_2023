/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class PotenciaMecanica implements Strategy {
    @Override
    public void CalculaPotencia(){
        float velocidade = (float) 10;
        float forca = (float) 8;
        float potencia;
        
        potencia = forca*velocidade;
        
        System.out.println("Potencia Mecanica: "+potencia);
    }
}
