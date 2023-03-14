/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;


class Metodos{
    private char arr[],aux;
    private int n, m=0;
    
    
    public Metodos(int x){
        n=x;
        arr=new char[n];
    }
    
    public boolean agregar(Scanner tec){
       char carac;
       if (m>n){
           return false;
       } else{
           carac=tec.next().charAt(0);
           arr[m]=carac;
           m++;
           return true;
        }
      
    }
    public boolean random(){
        if (m>=n){
            return false;
        } else {
            for (int i=0; i <n; i++) {    
               arr[i] = (char)(Math.random()*126+33);
               m=n;  
        }   
            return true;
        }
    }
    public boolean ordenardecreciente(){
        if (m==0){
            return false;
        } else{
            boolean flag1=true;
            for (int i=0; i<n-1 &&  flag1==true;i++){
                flag1=false;
                for (int j=0; j<(n-i-1); j++){
                    if (arr[j]<arr[j+1]){
                        flag1=true;
                        aux=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=aux;
                    }
                }
            }
        return true;
        }
    }
    public boolean ordenarcreciente(){
        
        if (m==0){
            return false;
        } else{
            boolean flag2 =false;
            int i = 0;
            while (i<(n-1) &&  flag2==false){
            flag2 = true;
                for (int j=0; j<(n-i-1); j++){
                    if (arr[j]>arr[j+1]){
                        flag2=false;
                        aux=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=aux;
                    }
                }
                i++;
            }
        return true;
        }
    }
    
    public boolean mostrar(){
        if (m==0){
            return false;
        } else {
        System.out.println("\nArreglo ordenado");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+"--");
        }
        System.out.println("");
        return true;
        }
    }

}
public class Burbuja {
    
    public static void main(String[] args) {
       Scanner tec= new Scanner(System.in);
       char cond;
       int x;
       Metodos arr;
       System.out.println("\nDigite el numero de elementos del arreglo:");
       x=tec.nextInt();
       arr=new Metodos(x);
       char carac;
       int z = 0;
       do {
       System.out.println("\n Que desea realizar 1 agregar, 2 mostrar, 3 ordenar decreciente, 4 ordenar creciente");
       z= tec.nextInt();
       switch (z){
           case 1:    System.out.println("\nDigite los caracteres a agregar");
                      arr.agregar(tec);
                      System.out.println("\nSe agregaron datos");
                         break;
           case 2:    arr.mostrar();
           break;
           case 3:    if (arr.ordenardecreciente()){
               System.out.println("\n Se ordeno el arreglo");
           } else {
               System.out.println("\nNo se ordeno el arreglo");
           }
           break;
           case 4:    if(arr.ordenarcreciente()){
               System.out.println("\n Se ordeno el arreglo");
           } else {
               System.out.println("\nNo se ordeno el arreglo");
           }
           break;
           default:
       }
        System.out.println("¿Desea realizar alguna otra accion?'S' para Si, o 'N' para No ");
        cond = tec.next().charAt(0);
        cond = Character.toUpperCase(cond);
       } while(cond=='S');
      
    }
}



    
    

