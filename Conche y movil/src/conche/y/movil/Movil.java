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
public class Movil {
    /** Metodo constructor*/
    public Movil(){
        
    }
    /** Aqui no hay señal aun*/
    public String Señal(){
        return "No hay señal hermano";
    }
    /** Aqui se le da señal al celular*/
    public String Señal(double intensidad){
        String Señal ="";
        if(intensidad!=0){
            Señal="Procesar llamada";
        }else{
            Señal="No señal";
        }
        return Señal;
    }
}
