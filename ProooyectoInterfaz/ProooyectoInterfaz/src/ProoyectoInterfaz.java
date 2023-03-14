import java.util.Scanner;
import javax.swing.JTextArea;

//Clase del Programador
class Programador {
    private float arr[][];
    private int fi,co,fil, col,x,y,cont1,cont2,cont3,cont4,elem;  
    private boolean centinela;

    //Sobrecarga de constructores
    //Asignar memoria al arreglo con numeros randoms.
    public Programador(){
    //contructor sin argumentos
        fi=(int)(Math.random()*10+2);
        co=(int)(Math.random()*10+2);
        arr=new float[fi][co];        
    }
 //Asignar memoria al arreglo
    public Programador(int x, int y){
        fi=x;
        co=y;
        arr=new float[fi][co];  
        cont1=0;
        cont2=0;
    }
     //CONSTRUCTOR COPIADOR :V
    public Programador(Programador original){ 
        //asigna memoria
        int x,y;
        x=original.fi;
        y=original.co;
        arr=new float[x][y];
        //copia de contenido
        co=original.co;
        fi=original.fi;
        cont4=original.cont4;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               arr[i][j]=original.arr[i][j];
            }
        }
    }
    //Metodos publicos
    public boolean agregar(float num){
        if (cont3>=(fi*co))
            return false;
            arr[cont1][cont2] = num;
            cont3++;
            cont2++;
            if (cont2==1)
                cont4++;
    if (cont2>=co){
            cont2=0;
            cont1++;
    }
    return true;
    }
    
    public boolean random(){
        cont4=fi;
        for (int i=0; i < fi; i++) {
            for (int j=0; j < co; j++) {
               arr[i][j] = (float)(Math.random()*50+1);
            }
        }
        return true;
    }

        public void mostrar (JTextArea ta,int a){
     for(int i = 0; i<cont4; i++){
         ta.append("\n");
            for(int j = 0; j<co;j++){
                if (arr[i][j]==0.0){
                     break;
                 }
                ta.append(" ["+(i+1)+"]["+(j+1)+"]="+"[ "+" ]\t  ");
            } 
          
        } 
     }
    public void mostrar (JTextArea ta){ 
        if (cont4==0)
        {
            ta.append("\nNo hay datos en el arreglo");
         return;   
        } else {
      for(int i = 0; i<cont4; i++){
          ta.append("\n");
            for(int j = 0; j<co;j++){
               if (arr[i][j]==0.0){
                     break;
                 }
                 ta.append(" ["+(i+1)+"]["+(j+1)+"]="+"["+arr[i][j]+"]  \t");
        }
     }
    }
    }
    public boolean buscarelementos (float Busc){
        int i=0;
        while (i < cont4) {
            int j=0;
            while (j< co) {
                if (arr[i][j]==0.0)
                    break;
                if (Busc==(arr[i][j])) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false; 
    }
    public String buscarelementos (float Busc,int e){
        String a = null,b="No se encontro el elemento";
        int g=0,h=0;
        for (int i=0;i<fi;i++){
            for (int j=0; j<co;j++){
                if (arr[i][j]==0.0)
                    break;
                if (Busc==arr[i][j]) {
                    a="["+(i+1)+"]"+"["+(j+1)+"]";
                    return a;
                }
            }
        }
        return b;
    }

    public void quitar(float Quit){
        float aux, aux2=0;
        int j;
        for (int i=0;i<cont4;i++){
            for(j=0;j<co;j++){
                if(arr[i][j]==Quit){
                    x=i;
                    y=j;
                    arr[i][j]-=arr[x][y];
                }
            }
        }
        int coni,conj;
        coni=cont4;
        conj=co;
        for (int i=coni-1;i>=0;i--){
            for ( j=conj-1;j>=0;j--){       
        aux = arr[i][j];
        arr[i][j]=aux2;
        aux2=aux; 
        if (i==x && j==y){
            centinela = true;
              break;
        }
            }
        j=conj-1;
        if(centinela)
            break;
           
            }                        
        }  
    public boolean modificar(float Busc, float Nelem){
        int i=0;
        while (i <cont4) {
            int j=0;
            while (j<co) {
                if (arr[i][j]==0.0)
                    break;
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
    public boolean modificar( float Nelem){
        
        int i=0;
        int l,m,d,f;
        d=fi;
        f=co;
        l=(int)(Math.random()*d+0);
        m=(int)(Math.random()*f+0);
        while (i <cont4) {
            int j=0;
            while (j<co) {
                if (arr[l][m]==(arr[i][j])) {
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
                }while (j < co);
                  i++; 
            }while (i < fi);
    }
    public void limpiar(){
          boolean resultado;
           for (float []arr2 : arr ){
               for (int i=0; i<arr2.length; i++){  
                 arr2[i]=(float) 0.0;
                 cont4=0;
               }
           }
    }
    public void limpiar(int x){
        fi=0;
        co=0;
    }

}
//Hola mundo


public class ProoyectoInterfaz extends javax.swing.JFrame {
    static Programador arreglo;
    float nume;
    boolean centinela1;
    public ProoyectoInterfaz() {
        boolean centinela=false;
        initComponents();
        //Instrucciones
        jTextField1.setText("");
        jTextArea1.setEditable(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jButton10.setVisible(false);
        this.setTitle("Procesamiento del arreglo");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane2.setToolTipText("");

        jTextPane1.setCaretColor(new java.awt.Color(255, 255, 153));
        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Copiar arreglo y modificar copia"); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 180, 16));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Limpiar elementos del arreglo");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 170, 16));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Modificar aleatoriamente");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 16));

        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 419, 200));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 106, -1));

        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("Mostrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jButton4.setText("random");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));

        jButton5.setText("Copiar arreglo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, -1));

        jButton6.setText("Quitar elemento");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 117, -1));

        jButton7.setText("Modificar a");
        jButton7.setActionCommand("");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jButton8.setText("Limpiar tamaño");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, -1));

        jButton9.setText("Buscar posicion");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));

        jButton10.setText("Modifica por");
        jButton10.setActionCommand("");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.setDefaultCapable(true);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(85, 23));
        jButton10.setMinimumSize(new java.awt.Dimension(85, 23));
        jButton10.setPreferredSize(new java.awt.Dimension(85, 23));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        jButton11.setText("Limpiar elementos");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        jButton3.setText("Buscar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        jButton13.setText("Modificar Aleatoriamente");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        jButton12.setText("Reconstruir arreglo");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 150, -1));

        jButton14.setText("Salir");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        if (jTextField1.getText().length()>0){
            float num;
            try{
              num =Float.parseFloat(jTextField1.getText());  
            }
            catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if (arreglo.agregar(num)){
                jTextArea1.append("\nDato del arreglo agregado");
            }else{
                {
                jTextArea1.append("\nArreglo Lleno");
        }
    }//GEN-LAST:event_jButton1MouseClicked
    } else 
            jTextArea1.append("\nNo hay datos en la casilla");
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        {        arreglo.mostrar(jTextArea1);
    }//GEN-LAST:event_jButton2MouseClicked
    }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //Boton Para el ramdon
     if (arreglo.random()){
         jTextArea1.append("\nSe agregaron datos aleatorios");
     }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        //Boton para Limpiar
        arreglo.mostrar(jTextArea1, 2);
        arreglo.limpiar();
        jTextArea1.append("\nSe han limpiado los datos del arreglo: ");
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (jTextField1.getText().length()>0){
            float num;
            try{
              num =Float.parseFloat(jTextField1.getText());  
            }
            catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if (arreglo.buscarelementos(num)){
                jTextArea1.append("\nEl elemento se encuentra en el arreglo");
            }else{
                jTextArea1.append("\nEl elemento no se encuentra en el arreglo");
            }
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");
    
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
         if (jTextField1.getText().length()>0){
            float num;
            try{
              num =Float.parseFloat(jTextField1.getText());  
            }
            catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            jTextArea1.append("\nLa posicion del elemento es: "+arreglo.buscarelementos(num,4));
                
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (jTextField1.getText().length()>0){
            float num;
            try{
              num =Float.parseFloat(jTextField1.getText());  
            }
            catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if (arreglo.buscarelementos(num)){
                jTextArea1.append("\nLa posicion del dato eliminado es: "+arreglo.buscarelementos(num,4));
                arreglo.quitar(num);
                    jTextArea1.append("\nSe ha quitado el dato correctamente");    
            }else{
                jTextArea1.append("\nEl elemento no se encuentra en el arreglo");
            }
            
           
            
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");
    

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (jTextField1.getText().length()>0){
            try{
              nume =Float.parseFloat(jTextField1.getText());
            }catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if (arreglo.buscarelementos(nume)){
            jButton10.setVisible(true);
            jButton7.setVisible(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton9.setEnabled(false);
            jButton11.setEnabled(false);
            jButton8.setEnabled(false);
            jButton13.setEnabled(false);
        
            jTextArea1.append("\n Ingrese el elemento por el cual se modificara");
            } else {
            jTextArea1.append("\n No se encontro el elemento para modificar");
            }
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked

            if (jTextField1.getText().length()>0){
               float num2;
            try{
              num2 =Float.parseFloat(jTextField1.getText());
            }catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if (arreglo.modificar(nume, num2)){
                jTextArea1.append("\n El elemento se modifico correctamente");
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jButton5.setEnabled(true);
                jButton6.setEnabled(true);
                jButton9.setEnabled(true);
                jButton11.setEnabled(true);
                jButton8.setEnabled(true);
                jButton13.setEnabled(true);
                jButton7.setVisible(true);
                jButton10.setVisible(false);
            }
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");
        

    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        Programador copia;
        copia = new Programador(arreglo);
        jTextArea1.append("\n Copia del arreglo:  ");
        copia.mostrar(jTextArea1);
        jTextArea1.append("\n Arreglo original:  ");
        arreglo.mostrar(jTextArea1);
        
        copia.modificar(666);
        
        jTextArea1.append("\n Copia del arreglo modificada:  ");
        copia.mostrar(jTextArea1);
        jTextArea1.append("\n Arreglo original:  ");
        arreglo.mostrar(jTextArea1);
        copia=null;
        jTextArea1.append("\n Se ha eliminado la copia del arreglo");
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        if (jTextField1.getText().length()>0){
            float num;
            try{
              num =Float.parseFloat(jTextField1.getText());  
            }
            catch(Exception e){
                jTextArea1.append("\nIngrese el formato correcto en la casilla");
             return;
            }
            if(arreglo.modificar(num)){
                jTextArea1.append("\nSe ha modificado un elemento aleatoriamente");
            }
        }else 
            jTextArea1.append("\nNo hay datos en la casilla");
    }//GEN-LAST:event_jButton13MouseClicked
    
    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        jLabel1.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jLabel3.setVisible(true);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        arreglo.limpiar(2);
        jTextArea1.append("\n Se ha limpiado el tamaño maximo del arreglo");
        jTextArea1.append("\n Si desea asignar denuevo memoria al arreglo presione 'Reconstruir arreglo' ");
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton9.setEnabled(false);
            jButton11.setEnabled(false);
            jButton7.setEnabled(false);
            jButton13.setEnabled(false);
            
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        boolean reconstruir=true;
        PantallaPrincipal obj;
        obj= new PantallaPrincipal(reconstruir);
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton12MouseClicked
    
    
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProoyectoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProoyectoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProoyectoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProoyectoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                  new ProoyectoInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
