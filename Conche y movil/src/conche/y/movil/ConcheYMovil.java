/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conche.y.movil;

import java.util.Scanner;

/**
 *
 * @author Angel Hernandez Velazquez
 */
public class ConcheYMovil {

    /**
     Sistema central para conectar todos los objetos, con series de if's anidados llamamos los objetos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        char opc='s';
        do{
            int op=0;
            System.out.println("Seleccione una de nuestras opciones");
            System.out.println("1.Automovil");
            System.out.println("2.Smartphone");
            op=sc.nextInt();
            if(op==1){
                System.out.println("Seleciona un coche:");
                System.out.println("1.Conche con Gas");
                System.out.println("2.Coche sin gas");
                System.out.println("3.Coche estandar");
                op=sc.nextInt();
                if(op==1){
                    System.out.println("Ingresa la gas");
                    CocheGas o = new CocheGas();
                    System.out.println(o.Gas(sc.nextDouble()));
                    System.out.println("________________");
                }else{
                    if(op==2){
                        CocheSinGAs o = new CocheSinGAs();
                        System.out.println(o.ups());
                        System.out.println("________________");
                    }else{
                        if(op==3){
                            Coche o = new Coche();
                            System.out.println(o.Gasolina());
                            System.out.println("Ingresemos gasolina");
                            System.out.println(o.Gasolina(sc.nextDouble()));
                            System.out.println("________________");
                        }else{
                            System.out.println("Otro error :/");
                            System.out.println("_____________");
                        }
                    }
                }
            }else{
                if (op == 2) {
                    System.out.println("Selecciona un celular");
                    System.out.println("1.Celular con señal");
                    System.out.println("2. Celular sin señal");
                    System.out.println("3. Celular");
                    op = sc.nextInt();
                    if (op == 1) {
                        System.out.println("Ingresa la Señal");
                        MovilSeñal o = new MovilSeñal();
                        System.out.println(o.Señal(sc.nextDouble()));
                        System.out.println("________________");
                    } else {
                        if (op == 2) {
                            MovilSinSeñal o = new MovilSinSeñal();
                            System.out.println(o.Señal());
                            System.out.println("________________");
                        } else {
                            if (op == 3) {
                                Movil o = new Movil();
                                System.out.println(o.Señal());
                                System.out.println("Ingresemos la señal");
                                System.out.println(o.Señal(sc.nextDouble()));
                                System.out.println("________________");
                            } else {
                                System.out.println("Otro error :/");
                                System.out.println("_____________");
                            }
                        }
                    }
                } else {
                    System.out.println("Opcion invalida hermano");
                }
            }
            System.out.println("Desea volver a usar la aplicacion s/n");
            opc=sc.next().charAt(0);
        }while(opc=='s'||opc=='S');
        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("___________________________");
        System.out.println("Gracias por su Uso");
    }
    
}
