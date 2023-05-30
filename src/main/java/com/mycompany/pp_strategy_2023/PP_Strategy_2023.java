/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_strategy_2023;

/**
 *
 * @author nando
 */
public class PP_Strategy_2023 {

    public static void main(String[] args) {
        Context context = new Context(new PotenciaMedia());
        context.executarCalculo();
        
        context.setStrategy(new PotenciaInstantanea());
        context.executarCalculo();
      
        context.setStrategy(new PotenciaEletrica());
        context.executarCalculo();
        
        context.setStrategy(new PotenciaMecanica());
        context.executarCalculo();
       
    }
}
