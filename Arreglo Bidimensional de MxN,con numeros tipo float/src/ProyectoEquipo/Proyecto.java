
package ProyectoEquipo;
  
import java.util.Scanner;


//Clase del Programador
class Programador {
    private int fi;
    private int co;
    private float arr[][];
    //Sobrecarga de constructores
    
    
    public Programador(int fi, int co, int i){ 
        arr=new float[fi-1][co-1];   //Asignar memoria al arreglo
    }
    public Programador(int x, int y){
        fi=x;
        co=y;
        arr=new float[fi][co];   //Asignar memoria al arreglo con numeros randoms.
    }
    //Metodos publicos
    
    public void agregar(){
        int i,j;
        i=0;
        j=0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese elemento:");
        arr[i][j]=tec.nextFloat();
        j++;
        if (j>=co){
        j=0;
        i++;
        }
}
    public void random(){
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
               arr[i][j] = (float)(Math.random()*50+1);
            }
        }
    }
    
       public void mostrar (){
     int x,y;
     for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                if (0.0==(arr[i][j])){
                    x=i;
                    y=j;
                    for(int k = 1; k<x-1; k++){
                          for(int l = 1; l<y-2;l++){
                              System.out.println("   Elementos["+(k+1)+"]["+(l+1)+"]="+arr[k][l]);
            } 
            System.out.println(" ");              
        }
    } 
   }       
    } 
     
     for(int k = 0; k<arr.length; k++){
            for(int l = 0; l<arr[k].length;l++){
                System.out.println("   Elemento["+(k+1)+"]["+(l+1)+"]="+arr[k][l]);
            } 
          System.out.println(" ");
        } 
                         
     
     }


            


    
    public boolean buscarelementos (float Busc){
        int i=0;
        while (i < arr.length) {
            int j=0;
            while (j< arr[0].length) {
                if (Busc==(arr[i][j])) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false; 
    }
    public void quitar(float Quit){
        float aux, aux2=0;
        int x, y;
        for (int i=0;i<fi;i++){
            for(int j=0;j<co;j++)
                if(arr[i][j]==Quit){
                    x=i;
                    y=j;
                      arr[i][j]-=arr[x][y];
                }
        }
        for (int i=fi-1;i>=0;i--){
            for (int j=co-1;j>=0;j--){
                
        aux = arr[i][j];
        arr[i][j]=aux2;
        aux2=aux; 
        if(i==0 && j==0){
                    if (co == 0) {
                        fi--;
                        co = co - 1;
                    } else {
                        co--;
                    }
                    j=co-1;
        }
         
            }
            
        }
                  
    }
       /* boolean in=false;
        int i=0,j;
        float aux,aux2=0;
        int x = -1, y = -1;
        for(int m=0;m<fi;m++){
            for(int n=0;n<co;n++){
                if(arr[m][n]==Quit){
                    x=m;
                    y=n;
                    break;
                }
                if(x==m)
                    break;
            }
        }
        i=fi-1;
        j=co-1;
        do{
            do{
                aux = arr[i][j];
                arr[i][j]=aux2;
                aux2=aux;         
                if(i==x && j==y){
                    if (co == 0) {
                        fi--;
                        co = co - 1;
                    } else {
                        co--;
                    }
                    in = true;
                    break;
                }
                j--;
            }while(j>=y);
            j=co-1;
            if(in)
                break;
            i--;
        }while(i>=x);  
        
        
    }
    */
    public boolean modificar(float Busc, float Nelem){
        int i=0;
        while (i < arr.length) {
            int j=0;
            while (j< arr[0].length) {
                if (Busc==(arr[i][j])) {
                    arr[i][j]=Nelem;
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
    public void Invertir(float Inter, float Inter2){
           int i=0,k,l;
           int x=0,y=0;
           float aux;
           do {
               int j=0;
               do{
                   if(Inter==(arr[i][j])){
                     x=i; y=j;
                   }
                   if(Inter2==(arr[i][j])){
                     k=i; l=j;
                     aux=arr[x][y];
                     arr[x][y]=arr[k][l];
                     arr[k][l]=aux;  
                   }        
                 j++;
                }while (j < arr[0].length);
                  i++; 
            }while (i < arr.length);
    }
    public void limpiar(){
          boolean resultado;
           for (float []arr2 : arr ){
               for (int i=0; i<arr2.length; i++){  
                 arr2[i]=0;  
               }
           }
    }
}
public class Proyecto {
    static int opciones(Scanner tec)
    {
        int opc;
        System.out.println("   1-Agregar elementos\n   2-Buscar elementos\n   3-Quitar\n   4-Mostrar\n   5-Modificar\n   6-Intercambiar\n   7-Limpiar arreglo\n   8-Salir");
            opc=tec.nextInt();
        return opc;
    }
    public static void main(String[] args){
        int opc,opc_agregar,caso;
        float dato,Busc,Quit,Nelem;
        Scanner tec = new Scanner (System.in);
        char cond, rand;
        System.out.println("  Arreglo Bidimensional de MxN,con numeros tipo float");
            System.out.println("  Digite el numero MAXIMO de filas a ocupar");
            int x;
            x = tec.nextInt();
            System.out.println("  Digite el numero MAXIMO de columnas a ocupar");
            int y;
            y = tec.nextInt();
            Programador arreglo;
            arreglo = new Programador(x,y);
        {
        //UNA VEZ ASIGNADO EL TAMAÑO MOSTRAR EL MENÚ
     do{
      switch (caso=opciones(tec)){
            case 1 :
                System.out.println("¿Desea agregar numeros aleatorios?'S' para si o 'N' para no.");
                rand = tec.next().charAt(0);
                rand = Character.toUpperCase(rand);
                if (rand =='N'){         
                     arreglo.agregar();
                } else {
                    arreglo.random();
                }
            break;
            case 2:
            System.out.print("Dijite el elemento que desea buscar: ");
            Busc = tec.nextFloat();
            if (arreglo.buscarelementos(Busc)){
                System.out.println("El elemento " + Busc + " si esta en el arreglo");
            } else {
                        System.out.println("El Elemento " + Busc + " no esta en el arreglo");
                    }
            break;
            case 3: 
                System.out.println("Ingrese el elemento que desea quitar");
                Quit = tec.nextFloat();
                if (arreglo.buscarelementos(Quit)){
                    arreglo.quitar(Quit);
                         

                    System.out.println("Se quitó el elemento "+Quit+ " correctamente");
                    
                    }
                    else{
                        System.out.println("No se pudo quitar el elemento "+Quit);
                    }
                    break;
            case 4:
                System.out.println("los elementos son:");
                arreglo.mostrar();
                
            break;
            case 5:
                System.out.println("Digite el elemento que desea modificar");
                arreglo.mostrar();
                Busc=tec.nextFloat();
                if(arreglo.buscarelementos(Busc)){
                    System.out.println("/nIngrese el nuevo elemento: ");
                    Nelem=tec.nextFloat();
                    if (arreglo.modificar(Busc, Nelem)){
                        System.out.println("Se modifico el elemento correctamente");
                    }
                }else {
                    System.out.println("No puedes modificar el elemento porque " + Busc + " no esta almacenado en el arreglo");
                    }   
                    break;
            case 6 :  
                System.out.println("Digite el elemento que desea intercambiar");
                arreglo.mostrar();
                float Inter, Inter2;
                Inter=tec.nextFloat();
                System.out.println("Ahora digite el elemento por el cual se intercambiara");
                Inter2=tec.nextFloat();
             arreglo.Invertir(Inter, Inter2); 
                System.out.println("Se intercambio correctamente: ");
                arreglo.mostrar();
             break;
            case 7:
                arreglo.limpiar();
                  
                        System.out.println("La estructura de datos se vació correctamente");    
                    break;
            case 8: 
                System.out.println("No se ha realizado ninguna accion");
            break;
            default: System.out.println("No se ha realizado ninguna accion");
        }
        System.out.println("¿Desea realizar alguna otra accion?'S' para Si, o 'N' para No ");
        cond = tec.next().charAt(0);
        cond = Character.toUpperCase(cond);
    } while (cond =='S');
      } 
     }
}
     
    


