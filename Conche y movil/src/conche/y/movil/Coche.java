/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conche.y.movil;

/**
 *
 * @author angel
 */
public class Coche {
    /** Metodo constructor*/
    public Coche(){
        
    }
    /** Aqui se declara el primer metodo, este nos avisa que se necesita gasolina */
    public String Gasolina(){
        String Funcionamos="Necesitamos Gasolina";
        return Funcionamos;
    }
    /** Con este metodo se le ingresa gas al objeto*/
    public String Gasolina(double gas){
        String fu ="";
        if(gas!=0){
            fu="Avanzamos papu";
        }else{
            fu="No se puede";
        }
        return fu;
    }
    
}
