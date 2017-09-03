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
public class CocheGas {
    /** Metodo constructor de coche gas*/
    public CocheGas(){
        
    }
    /** Aqui le damos la gasolina y se convierte en una cadena */
    public String Gas(double litro){
        String lololo="";
        if(litro!=0){
            lololo="Avancemos";
        }else{
            lololo="No funciona esto :(";
        }
        return lololo;
    }
}
