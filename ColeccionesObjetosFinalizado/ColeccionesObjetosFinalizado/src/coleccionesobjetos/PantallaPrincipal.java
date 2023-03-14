/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesobjetos;

import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MiTimer implements ActionListener {

    private ArrayList<JButton> Botones;
    private Timer xd;
    private int R, i = 0, x, y;

    public MiTimer(int R, int I, ArrayList Bn) {
        this.R = R;
        this.Botones = Bn;
        i = I;
        x = 0;
        y = 0;
        xd = new Timer(this.R, this);
        if (Botones.get(i).getX() > 10) {
            x = -10;
        } else {
            x = 10;
        }
        if (i == 0) {
            if (Botones.get(0).getY() > 10) {
                y = -10;
            } else {
                y = 10;
            }
        } else {
            if (Botones.get(i).getY() > Botones.get(i - 1).getY() + 30) {
                y = -10;
            } else {
                y = 10;
            }
        }
        xd.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Botones.get(i).getX() != 10) {
            Botones.get(i).setLocation(Botones.get(i).getX() + x, Botones.get(i).getY());
        }
        if (Botones.get(i).getX() == 10 || Botones.get(i).getX() == 11 || Botones.get(i).getX() == 12 || Botones.get(i).getX() == 13 || Botones.get(i).getX() == 14 || Botones.get(i).getX() == 15 || Botones.get(i).getX() == 16 || Botones.get(i).getX() == 17 || Botones.get(i).getX() == 18 || Botones.get(i).getX() == 19 || Botones.get(i).getX() == 20) {
            Botones.get(i).setLocation(10, Botones.get(i).getY() + y);

        }
        if (i == 0) {
            if (Botones.get(i).getY() == 10 || Botones.get(i).getY() == 11 || Botones.get(i).getY() == 12 || Botones.get(i).getY() == 13 || Botones.get(i).getY() == 14 || Botones.get(i).getY() == 15 || Botones.get(i).getY() == 16 || Botones.get(i).getY() == 17 || Botones.get(i).getY() == 18 || Botones.get(i).getY() == 19 || Botones.get(i).getY() == 20 && Botones.get(i).getX() == 10) {
                xd.stop();

            }
        } else {
            if (Botones.get(i).getY() == Botones.get(i - 1).getY() + 30 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 31 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 32 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 33 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 34 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 35 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 36 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 37 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 38 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 39 || Botones.get(i).getY() == Botones.get(i - 1).getY() + 40 && Botones.get(i - 1).getX() == 10) {
                xd.stop();
                Botones.get(i).setLocation(Botones.get(i).getX(), Botones.get(i - 1).getY() + 30);
            }
        }

    }

}

public class PantallaPrincipal extends javax.swing.JFrame {

    int NumB, I = 0;
    MiTimer xd;
    Timer dx;
    ArrayList<Color> Colores = new ArrayList();
    ArrayList<Integer> Numeros = new ArrayList();
    ArrayList<JButton> Botones;
    JTextArea Panel;
    ActionListener Tarea0;
    boolean Band = true;
    JFrame Paneltext = null;

    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBounds(0, 0, 690, 530);
        Texto.setEnabled(false);
        Pintar.setEnabled(false);
        Limpiar.setEnabled(false);
        Ordenar.setEnabled(false);
        Rojo.setEnabled(false);
        Verde.setEnabled(false);
        Rosa.setEnabled(false);
        Amarillo.setEnabled(false);
        Azul.setEnabled(false);
        Naranja.setEnabled(false);
        Aleatorios.setEnabled(false);
        GenerarTexto.setEnabled(false);
        EscribirNumeros.setEnabled(false);
        EscribirString.setEnabled(false);
        Detener.setVisible(false);
        Botones = new ArrayList();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Crear = new javax.swing.JButton();
        Pintar = new javax.swing.JButton();
        Detener = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Ordenar = new javax.swing.JButton();
        EscribirString = new javax.swing.JButton();
        EscribirNumeros = new javax.swing.JButton();
        GenerarTexto = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextPane();
        Naranja = new javax.swing.JRadioButton();
        Rojo = new javax.swing.JRadioButton();
        Azul = new javax.swing.JRadioButton();
        Rosa = new javax.swing.JRadioButton();
        Amarillo = new javax.swing.JRadioButton();
        Verde = new javax.swing.JRadioButton();
        Aleatorios = new javax.swing.JRadioButton();
        FondoAbajo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(184, 60, 83));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        getContentPane().setLayout(null);

        Crear.setBackground(new java.awt.Color(0, 0, 0));
        Crear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        Crear.setText("Crear");
        Crear.setBorder(null);
        Crear.setBorderPainted(false);
        Crear.setContentAreaFilled(false);
        Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Crear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Crear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        getContentPane().add(Crear);
        Crear.setBounds(230, 310, 110, 40);

        Pintar.setBackground(new java.awt.Color(0, 0, 0));
        Pintar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pintar.setForeground(new java.awt.Color(255, 255, 255));
        Pintar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        Pintar.setText("Pintar");
        Pintar.setToolTipText("Para pintar seleccione los colores de la parte \nde abajo que desea ocupar");
        Pintar.setBorder(null);
        Pintar.setBorderPainted(false);
        Pintar.setContentAreaFilled(false);
        Pintar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pintar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        Pintar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PintarMouseClicked(evt);
            }
        });
        getContentPane().add(Pintar);
        Pintar.setBounds(530, 310, 113, 40);

        Detener.setBackground(new java.awt.Color(0, 0, 0));
        Detener.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Detener.setForeground(new java.awt.Color(255, 255, 255));
        Detener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        Detener.setText("Detener");
        Detener.setBorder(null);
        Detener.setBorderPainted(false);
        Detener.setContentAreaFilled(false);
        Detener.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Detener.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        Detener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetenerMouseClicked(evt);
            }
        });
        getContentPane().add(Detener);
        Detener.setBounds(370, 350, 113, 40);

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });
        getContentPane().add(Limpiar);
        Limpiar.setBounds(370, 310, 113, 40);

        Ordenar.setBackground(new java.awt.Color(0, 0, 0));
        Ordenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ordenar.setForeground(new java.awt.Color(255, 255, 255));
        Ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        Ordenar.setText("Ordenar");
        Ordenar.setBorder(null);
        Ordenar.setBorderPainted(false);
        Ordenar.setContentAreaFilled(false);
        Ordenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ordenar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        Ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenarMouseClicked(evt);
            }
        });
        getContentPane().add(Ordenar);
        Ordenar.setBounds(370, 350, 113, 40);

        EscribirString.setBackground(new java.awt.Color(0, 0, 0));
        EscribirString.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EscribirString.setForeground(new java.awt.Color(255, 255, 255));
        EscribirString.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        EscribirString.setText("Escribir Texto");
        EscribirString.setToolTipText("Crea un array list de tipo String con todo el texto que se encuentra en la ventana de la izquierda y lo asigna a los botones");
        EscribirString.setBorder(null);
        EscribirString.setBorderPainted(false);
        EscribirString.setContentAreaFilled(false);
        EscribirString.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EscribirString.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        EscribirString.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscribirStringMouseClicked(evt);
            }
        });
        getContentPane().add(EscribirString);
        EscribirString.setBounds(370, 430, 113, 40);

        EscribirNumeros.setBackground(new java.awt.Color(0, 0, 0));
        EscribirNumeros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EscribirNumeros.setForeground(new java.awt.Color(255, 255, 255));
        EscribirNumeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        EscribirNumeros.setText("EscribirNum");
        EscribirNumeros.setToolTipText("Escribe los numeros que se crearon en la ventana de \"Generar texto\" en todos los botones");
        EscribirNumeros.setBorder(null);
        EscribirNumeros.setBorderPainted(false);
        EscribirNumeros.setContentAreaFilled(false);
        EscribirNumeros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EscribirNumeros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        EscribirNumeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscribirNumerosMouseClicked(evt);
            }
        });
        getContentPane().add(EscribirNumeros);
        EscribirNumeros.setBounds(370, 390, 113, 40);

        GenerarTexto.setBackground(new java.awt.Color(0, 0, 0));
        GenerarTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GenerarTexto.setForeground(new java.awt.Color(255, 255, 255));
        GenerarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonFinal.png"))); // NOI18N
        GenerarTexto.setText("GenerarTexto");
        GenerarTexto.setBorder(null);
        GenerarTexto.setBorderPainted(false);
        GenerarTexto.setContentAreaFilled(false);
        GenerarTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GenerarTexto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/BottonPressFinal.png"))); // NOI18N
        GenerarTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarTextoMouseClicked(evt);
            }
        });
        getContentPane().add(GenerarTexto);
        GenerarTexto.setBounds(230, 350, 113, 40);

        ComboBox.setBackground(new java.awt.Color(0, 0, 0));
        ComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Agregar uno", "Manualmente", "Aleatoriamente", " " }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox);
        ComboBox.setBounds(10, 360, 210, 40);

        Texto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(Texto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 210, 40);

        Naranja.setBackground(new java.awt.Color(255, 153, 51));
        Naranja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Naranja.setForeground(new java.awt.Color(51, 51, 51));
        Naranja.setText("Naranja");
        Naranja.setBorderPainted(true);
        getContentPane().add(Naranja);
        Naranja.setBounds(600, 360, 70, 25);

        Rojo.setBackground(new java.awt.Color(255, 0, 0));
        Rojo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rojo.setForeground(new java.awt.Color(51, 51, 51));
        Rojo.setText("Rojo");
        Rojo.setBorderPainted(true);
        getContentPane().add(Rojo);
        Rojo.setBounds(510, 390, 80, 25);

        Azul.setBackground(new java.awt.Color(0, 102, 255));
        Azul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Azul.setForeground(new java.awt.Color(51, 51, 51));
        Azul.setText("Azul");
        Azul.setBorderPainted(true);
        getContentPane().add(Azul);
        Azul.setBounds(600, 390, 70, 25);

        Rosa.setBackground(new java.awt.Color(255, 51, 255));
        Rosa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rosa.setForeground(new java.awt.Color(51, 51, 51));
        Rosa.setText("Rosa");
        Rosa.setBorderPainted(true);
        getContentPane().add(Rosa);
        Rosa.setBounds(510, 360, 80, 25);

        Amarillo.setBackground(new java.awt.Color(255, 255, 51));
        Amarillo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Amarillo.setForeground(new java.awt.Color(51, 51, 51));
        Amarillo.setText("Amarillo");
        Amarillo.setBorderPainted(true);
        getContentPane().add(Amarillo);
        Amarillo.setBounds(510, 420, 80, 25);

        Verde.setBackground(new java.awt.Color(0, 255, 0));
        Verde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Verde.setForeground(new java.awt.Color(51, 51, 51));
        Verde.setText("Verde");
        Verde.setBorderPainted(true);
        getContentPane().add(Verde);
        Verde.setBounds(600, 420, 70, 25);

        Aleatorios.setBackground(new java.awt.Color(0, 0, 0));
        Aleatorios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Aleatorios.setForeground(new java.awt.Color(255, 255, 255));
        Aleatorios.setText("Aleatorios");
        Aleatorios.setBorderPainted(true);
        Aleatorios.setContentAreaFilled(false);
        getContentPane().add(Aleatorios);
        Aleatorios.setBounds(530, 450, 120, 40);

        FondoAbajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coleccionesobjetos/imagenes/Stone.jpg"))); // NOI18N
        getContentPane().add(FondoAbajo);
        FondoAbajo.setBounds(0, 300, 690, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        if (ComboBox.getSelectedItem() == "Manualmente") {
            Texto.setVisible(true);
            Texto.setEnabled(true);
            Crear.setVisible(true);

        } else {
            Texto.setVisible(false);
            Crear.setVisible(true);
        }
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
        if (Paneltext != null) {
            Paneltext.dispose();
            Panel = new JTextArea();
            Numeros.clear();
            Band = true;
        }
        if (ComboBox.getSelectedItem() == "Manualmente" && Texto.getText().length() > 0) {
            try {
                NumB = Integer.parseInt(Texto.getText());
            } catch (Exception e) {
                this.setTitle("Digite un numero entero en la casilla");
            }

            int i = 0;

            do {
                JButton Boton = new JButton();
                Boton.setText("");
                Boton.setToolTipText("Este es el boton: " + Botones.size());
                this.add(Boton);
                Boton.setBounds(((int) (Math.random() * 560+10)), ((int) (Math.random() * 270)), 120, 30);
                Botones.add(Boton);
                this.setTitle("Total de elementos en el arraylist: " + Botones.size());
                i++;
            } while (i < NumB);
            Pintar.setEnabled(true);
            Limpiar.setEnabled(true);
            Ordenar.setEnabled(true);
            Rojo.setEnabled(true);
            Verde.setEnabled(true);
            Rosa.setEnabled(true);
            Amarillo.setEnabled(true);
            Azul.setEnabled(true);
            Naranja.setEnabled(true);
            GenerarTexto.setEnabled(true);
        } else {
            this.setTitle("Digite un numero en la casilla");
        }
        if (ComboBox.getSelectedItem() == "Aleatoriamente") {
            NumB = (int) ((Math.random() * 100));
            Botones.ensureCapacity(NumB);//Para que no ocupe mas recursos de los que necesita
            for (int i = 0; i < NumB; i++) {
                JButton Boton = new JButton();
                Boton.setText("");
                Boton.setToolTipText("Este es el boton: " + Botones.size());
                this.add(Boton);
                Boton.setBounds(((int) (Math.random() * 560+10)), ((int) (Math.random() * 270)), 120, 30);
                Botones.add(Boton);
                this.setTitle("Total de elementos en el arraylist: " + Botones.size());
            }
            Pintar.setEnabled(true);
            Limpiar.setEnabled(true);
            Ordenar.setEnabled(true);
            Rojo.setEnabled(true);
            Verde.setEnabled(true);
            Rosa.setEnabled(true);
            Amarillo.setEnabled(true);
            Azul.setEnabled(true);
            Naranja.setEnabled(true);
            GenerarTexto.setEnabled(true);
        }
        if (ComboBox.getSelectedItem() == "Agregar uno") {
            JButton Boton = new JButton();
            System.out.println("PASO POR AQUIXD");
            Boton.setText("");
            Boton.setToolTipText("Este es el boton: " + Botones.size());
            this.add(Boton);
            Boton.setBounds(((int) (Math.random() * 560+10)), ((int) (Math.random() * 270)), 120, 30);
            Botones.add(Boton);
            this.setTitle("Total de elementos en el arraylist: " + Botones.size());
            Pintar.setEnabled(true);
            Limpiar.setEnabled(true);
            Ordenar.setEnabled(true);
            Rojo.setEnabled(true);
            Verde.setEnabled(true);
            Rosa.setEnabled(true);
            Amarillo.setEnabled(true);
            Azul.setEnabled(true);
            Naranja.setEnabled(true);
            GenerarTexto.setEnabled(true);
        }
    }//GEN-LAST:event_CrearMouseClicked

    private void OrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenarMouseClicked

        Detener.setVisible(true);
        Pintar.setEnabled(false);
        Limpiar.setEnabled(false);
        Ordenar.setEnabled(true);
        Rojo.setEnabled(false);
        Verde.setEnabled(false);
        Rosa.setEnabled(false);
        Amarillo.setEnabled(false);
        Azul.setEnabled(false);
        Naranja.setEnabled(false);
        Aleatorios.setEnabled(false);
        GenerarTexto.setEnabled(false);
        if (Paneltext!=null) {
            EscribirNumeros.setEnabled(false);
        EscribirString.setEnabled(false);
        }
        
        Tarea0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (I < Botones.size()) {
                    Texto.setEnabled(false);

                    xd = new MiTimer(1, I, Botones);
                    I++;
                } else {

                }
            }
        };
        dx = new Timer(2200, Tarea0);
        dx.start();


    }//GEN-LAST:event_OrdenarMouseClicked

    private void PintarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PintarMouseClicked
        int j = 0;
        if (!Aleatorios.isSelected() && !Rojo.isSelected() && !Verde.isSelected() && !Azul.isSelected() && !Amarillo.isSelected() && !Rosa.isSelected() && !Naranja.isSelected()) {
            this.setTitle("Primero seleccione alguna de las opciones para pintar");
        } else {
            this.setTitle("Los: " + Botones.size() + "Botones se pintaron");
        }
        if (Aleatorios.isSelected()) {
            for (JButton xd : Botones) {
                xd.setBackground(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            }
        }
        if (Rojo.isSelected()) {
            Colores.add(Color.RED);
            j++;
        }
        if (Verde.isSelected()) {
            Colores.add(Color.GREEN);
            j++;
        }
        if (Azul.isSelected()) {
            Colores.add(Color.BLUE);
            j++;
        }
        if (Amarillo.isSelected()) {
            Colores.add(Color.YELLOW);
            j++;
        }
        if (Rosa.isSelected()) {
            Colores.add(Color.PINK);
            j++;
        }
        if (Naranja.isSelected()) {
            Colores.add(Color.ORANGE);
            j++;
        }

        if (!Colores.isEmpty()) {
            Iterator<Color> Ite = Colores.iterator();        //Creamos un iterador para manejar como se van a pintar los botones
            Collections.shuffle(Colores); //Revuelve el orden de los colores
            for (JButton B : Botones) {
                B.setBackground(Ite.next());
                if (!Ite.hasNext()) {
                    Collections.shuffle(Colores); //Revuelve el orden de los colores en el array list de colores
                    Ite = Colores.listIterator();   //Regresa el iterador al principio para acabar de colorear todos los botones

                }
            }
            Colores.clear();
        }

    }//GEN-LAST:event_PintarMouseClicked

    private void GenerarTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTextoMouseClicked
        if (Band) {
            Paneltext = new JFrame();
            Paneltext.setBounds(this.getX() + 700, this.getY(), 200, 222);
            Paneltext.setVisible(true);
            Panel = new JTextArea();
            Panel.setBounds(0, 0, 180, 380);
            Paneltext.add(Panel);
            Panel.setFont(new Font("Courier New", Font.BOLD, 20));
            int num = 0;
            System.out.println("PASAPORAQUI");
            for (int i = 0; i < Botones.size(); i++) {
                Numeros.add(num++);
                Panel.append(Numeros.get(i) + "\n");
            }
            System.out.println("COLUMNAS: " + Panel.getLineCount());
            Band = false;
            EscribirNumeros.setEnabled(true);
            EscribirString.setEnabled(true);
            Texto.setEnabled(false);
            Pintar.setEnabled(false);
            Limpiar.setEnabled(true);
            Ordenar.setEnabled(false);
            Rojo.setEnabled(false);
            Verde.setEnabled(false);
            Rosa.setEnabled(false);
            Amarillo.setEnabled(false);
            Azul.setEnabled(false);
            Naranja.setEnabled(false);
            GenerarTexto.setEnabled(false);
            Aleatorios.setEnabled(false);

        } else {
            this.setTitle("Ya existe un panel de texto");
        }
    }//GEN-LAST:event_GenerarTextoMouseClicked

    private void EscribirNumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirNumerosMouseClicked
        Iterator<Integer> Iter = Numeros.iterator();
        for (JButton Butt : Botones) {
            if (Iter.hasNext()) {
                Butt.setText(Integer.toString(Iter.next()));
            }
            Pintar.setEnabled(true);
            Limpiar.setEnabled(true);
            Ordenar.setEnabled(true);
            Rojo.setEnabled(true);
            Verde.setEnabled(true);
            Rosa.setEnabled(true);
            Amarillo.setEnabled(true);
            Azul.setEnabled(true);
            Naranja.setEnabled(true);
            GenerarTexto.setEnabled(true);
            Aleatorios.setEnabled(true);

        }
    }//GEN-LAST:event_EscribirNumerosMouseClicked

    private void EscribirStringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirStringMouseClicked
        ArrayList<String> Text = new ArrayList();
        Panel.getColumns();
        String Textt;
        Textt = Panel.getText(); //En el auxiliar se guarda todo el texto que existe en el Panel de la ventana emergente
        String Aux[] = Textt.split("\n");//Sirve para tomar lo que hay en cada linea sin el salto "\n",Este metodo solo devuelve un array de tipo String
        for (int i = 0; i < Panel.getLineCount() - 1; i++) {
            Text.add(Aux[i]);
        }
        Iterator<String> Ite = Text.iterator();
        for (JButton xd : Botones) {
            if (Ite.hasNext()) {
                xd.setText(Ite.next());
            }
        }
        Pintar.setEnabled(true);
        Limpiar.setEnabled(true);
        Ordenar.setEnabled(true);
        Rojo.setEnabled(true);
        Verde.setEnabled(true);
        Rosa.setEnabled(true);
        Amarillo.setEnabled(true);
        Azul.setEnabled(true);
        Naranja.setEnabled(true);
        GenerarTexto.setEnabled(true);
        Aleatorios.setEnabled(true);


    }//GEN-LAST:event_EscribirStringMouseClicked

    private void DetenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetenerMouseClicked
        dx.stop();
        Ordenar.setVisible(true);
        Detener.setVisible(false);
        Pintar.setEnabled(true);
        Limpiar.setEnabled(true);
        Rojo.setEnabled(true);
        Verde.setEnabled(true);
        Rosa.setEnabled(true);
        Amarillo.setEnabled(true);
        Azul.setEnabled(true);
        Naranja.setEnabled(true);
        Aleatorios.setEnabled(true);
        GenerarTexto.setEnabled(true);
        if (Paneltext!=null) {
            EscribirNumeros.setEnabled(true);
        EscribirString.setEnabled(true);
        }
    }//GEN-LAST:event_DetenerMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        I = 0;
        Numeros.clear();
        if (Paneltext != null) {
            Paneltext.dispose();
            Panel = new JTextArea();
            Numeros.clear();
            Band = true;
        }
        for (JButton s : Botones) {
            this.remove(s);
        }
        Botones.clear();
        Texto.setEnabled(false);
        Pintar.setEnabled(false);
        Limpiar.setEnabled(false);
        Ordenar.setEnabled(false);
        Rojo.setEnabled(false);
        Verde.setEnabled(false);
        Rosa.setEnabled(false);
        Amarillo.setEnabled(false);
        Azul.setEnabled(false);
        Naranja.setEnabled(false);
        Aleatorios.setEnabled(false);
        GenerarTexto.setEnabled(false);
        EscribirNumeros.setEnabled(false);
        EscribirString.setEnabled(false);
        Detener.setVisible(false);
        this.repaint();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aleatorios;
    private javax.swing.JRadioButton Amarillo;
    private javax.swing.JRadioButton Azul;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Detener;
    private javax.swing.JButton EscribirNumeros;
    private javax.swing.JButton EscribirString;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoAbajo;
    private javax.swing.JButton GenerarTexto;
    private javax.swing.JButton Limpiar;
    private javax.swing.JRadioButton Naranja;
    private javax.swing.JButton Ordenar;
    private javax.swing.JButton Pintar;
    private javax.swing.JRadioButton Rojo;
    private javax.swing.JRadioButton Rosa;
    private javax.swing.JTextPane Texto;
    private javax.swing.JRadioButton Verde;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
