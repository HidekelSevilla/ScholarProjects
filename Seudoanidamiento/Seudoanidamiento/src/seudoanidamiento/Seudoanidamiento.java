
package seudoanidamiento;

class Libro  {
    private int NumPag[];       //Numero de paginas
    private char EdiciL[];      //Edicion o tomo del libro
    private boolean LibDisp[];  //Disponibilidad del libro para rentar
    private float Renta[];    //Costo de renta en caso de no tener credencial
    private String NombLib [];   //Nombre del libro
    private String Autor [];     //Autor del libro
    private short LibExistencia[];  //Contador de cuantos libros iguales hay en existencia
    private int n,m=0,x;
    
    public Libro  (int nt){
        nt = n;
        NumPag = new int [n];
        EdiciL = new char [n];
        NombLib = new String [n];
        Autor = new String [n];
        LibDisp= new boolean [n];
        Renta= new float [n];
        LibExistencia = new short [n];
    }
    public boolean AgregaLibro (String nomblib, String autor, int numpag, char edicion,float renta){
        if (m>=n){
            return false;
        } else {
        NumPag[m] = numpag;
        EdiciL[m] = edicion;
        NombLib[m] = nomblib;
        Autor[m]= autor;
        Renta[m]= renta;
        LibExistencia[m]++;
        LibDisp[m]=true;
        }
        m++;
        return true;
        
    }
    
    public void PresLibro(String nomblib){
        for (int i=0; i<m; i++){
            if (NombLib[m]==nomblib){
                LibExistencia[m]--;
                if (LibExistencia[m]==0){
                    LibDisp[m]=false;
                }
            }
        

        }
    }
    public float RentLibro(String nomblib){
        for (int i=0; i<m; i++){
            if (NombLib[m]==nomblib){
                x=m;
                LibExistencia[m]--;
                if (LibExistencia[m]==0){
                    LibDisp[m]=false;
                } 
            }
        }
        return Renta[x];
    }
    
    public void MostrarDatosLib(int k) {
        System.out.println("\nNombre del libro: "+NombLib[k]);
        System.out.println("\nNombre del autor: "+Autor[k]);
        System.out.println("\nNumero de paginas: "+NumPag[k]);
        System.out.println("\nEdicion del libro: "+EdiciL[k]);
        System.out.println("\nPrecio de renta en caso de no contar con credencial: "+Renta[k]);
        if (LibDisp[k]){
            System.out.println("\nDisponibilidad del libro: Disponible para rentar");
            System.out.println("\nLibros en existencia: "+LibExistencia[k]);
        } else{
            System.out.println("\nDisponibilidad del libro: No disponible para rentar");
            System.out.println("\nLibros en existencia: 0");
        }
    }
    
    public void DevolucionDeLibro(String nomblib){
       for (int i=0; i<m; i++){
            if (NombLib[m]==nomblib){
                LibExistencia[m]++;
                LibDisp[m]=true;
            }
       }
    }
    public boolean RevisarDisponibilidad (String nomblib){
        for (int i=0; i<m; i++){
            if (NombLib[m]==nomblib && LibExistencia[m]>0){
                
                return true;
            }
    }
        return false;
    }
    
    
}
class Biblioteca {
    private String Seccion[];   //Seccion de la biblioteca donde se ordenan los libros del mismo tema o similar
    private boolean Cred=false;     //Verificacion para saber si cuentan con credencial de estudiante
    private int ContClien=0;    //Contador de libros rentados o prestados
    private float Prec;       //Precio de renta en caso de no ser estudiante o no contar con credencial
    private long Cant=0;        //Cantidad de libros en la biblioteca 
    private byte LibSecc[];      //Contador de Libros en cada seccion
    private int m=0;
    //Seudoanidamiento
    public Libro Lib; 

    public Biblioteca(int nt){
        Lib = new Libro(nt);
        Seccion=new String[4];
        LibSecc=new byte[4];
        Seccion[0]="Literatura";
        Seccion[1]="Ciencias";
        Seccion[2]="Matematicas";
        Seccion[3]="Fisica";
        Seccion[4]="Programacion";
    }
  
    public boolean AgregarLibro(String NombLib, String Autor, int numpag, char edicion,float cosrenta,String seccion) { 
        if (Lib.AgregaLibro(NombLib, Autor, numpag, edicion,cosrenta)){
            Cant++; 
            for (int i = 0;i<4; i++){
                if (Seccion[i]==seccion){
                    LibSecc[i]++;
                }
            }          
           return true;
        } 
            return false;
    }
    
    public boolean BuscarLibro(String nomblib)  {
        if (Lib.RevisarDisponibilidad(nomblib)){
            return true;
        }
        return false;
    }
    
    public boolean PrestarLibro(String nomblib) {
        if (BuscarLibro(nomblib)){
            Lib.PresLibro(nomblib);
            ContClien++;
            return true;
        }
        return false;
    }
    
    public float RentarLibro(String nomblib)  {
        if (BuscarLibro(nomblib)){
            Prec = Lib.RentLibro(nomblib);
            ContClien++;
            return Prec;
        }
        return (float) 0.0;
    }
    
    public boolean DevolucionLibro(String nomblib){
        if (BuscarLibro(nomblib)){
            Lib.DevolucionDeLibro(nomblib);
            ContClien--;
            return true;
        }else {
            return false;
        }
    }
    
    
    public void MostrarDatosBiblioteca(){
        System.out.println("\nDatos de la biblioteca;");
        System.out.println("\nLibros Rentados o Prestados actualmente: "+ContClien);
        System.out.println("\nCantidad total de libros en la biblioteca: "+Cant);
        System.out.println("\nSecciones con el total de libros en cada seccion:  ");
        for(int i =0; i<=4;i++){
            System.out.println("\n"+Seccion[i]+":  "+LibSecc[i]+" Libros");
        }
        
        
    }
}



public class Seudoanidamiento {
    public static void main(String[] args) {
       
    }
    
}
