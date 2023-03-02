/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.Guia7;

//**
 
public class MatrizContemida {
    private static int  Matris[][];
    private static int  MatrisContenida[][];
    
    
    private static void IniciarMAtriz(){
        //Matris = new int[10][10];
        Matris = new int[][] {{1,26,36,47,5,6,72,81,95,10},
                                {11,12,13,21,41,22,67,20,10,61},
                                {56,78,87,90,9,90,17,12,87,67},
                                {41,87,24,56,97,74,87,42,64,35},
                                {32,76,79,01,36,05,67,96,12,11},
                                {99,13,54,88,89,90,75,12,41,76},
                                {67,78,87,45,14,22,26,42,56,78},
                                {98,45,34,23,32,56,74,16,19,18},
                                {24,67,97,46,87,13,67,89,93,24},
                                {21,68,78,98,90,67,12,41,65,12}};
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {                
                    Matris [i][j] = (int)(Math.random() *10) ;  //funcion de llenado aleatorio      
           }  
        } */          
    }
    
    
    private static void IniciarMAtrizContenida(){
        MatrisContenida = new int[][] {{36,05,67},
                                {89,90,75},
                                {14,22,26}};
       /* MatrisContenida = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
                    Matris [i][j] = (int)(Math.random() *10) ;  //funcion de llenado aleatorio      
           }  
        }*/           
    }
    
    
    private static boolean BuscarContenida(int i1, int j1 ){
        int a=0;
        int b=0;
        if(((i1+3)<10)&&((j1+3)<10)){ 
            for (int i = i1; i < (i1+3); i++) {
                for (int j = j1; j < (j1+3); j++) {                
                    if(Matris [i][j] == MatrisContenida[a][b]){

                    }else{
                        return false;
                    }
                    b++;
               }  
                a++;
                b=0;
            }                   
        }else{
            return false;
        }
        return true;    
    }
    
    private static void MostrarBase(){
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {                
                    System.out.print ("\t"+Matris [i][j]);
                }
                System.out.println("");
            }
     }
    
    
    private static void MostrarContenida(){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {                
                    System.out.print ("\t"+Matris [i][j]);
                }
                System.out.println("");
            }
     }
    
    
     private static void MostrarBaseContenida(int a,int b){
            int b1=b,a1=a; 
            boolean Muestra=false;
            boolean Muestra1=false;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {                    
                    if((i==a1)&&(b1==j)){
                       Muestra=true;
                       Muestra1=true;
                       System.out.print ("\t*"+Matris [i][j]+"* ");
                    }else{
                       Muestra=false;
                       System.out.print ("\t"+Matris [i][j]);
                    }
                    if(Muestra){
                        b1++;
                        if(b1==(b+3)){
                            b1=b;
                        }
                    }
                }
                System.out.println("");
                if(Muestra1){
                    a1++;
                    Muestra1=false;
                    if(a1==(a+3)){
                         a1=a;
                    }
                }
            }
     }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        IniciarMAtriz();
        IniciarMAtrizContenida();
        MostrarBase();
        System.out.println("");
        MostrarContenida();
        System.out.println("");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {                
               if(BuscarContenida(i, j )){
                   System.out.println("Estacontenida apartir i:" + i + " j :" +j);
                    MostrarBaseContenida(i,j);
                } 
            }
        }
    }
    
    
    
    
}

