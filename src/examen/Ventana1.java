package examen;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 /**
 * Esta clase Ventana1 representa la primera ventana de la aplicación.
 * Permite al usuario ingresar su nombre, elegir un dominio de correo y validarlo.
 */
public class Ventana1 extends javax.swing.JFrame {
    /**
     * Constructor de la clase Ventana1.
     * Inicializa los componentes de la interfaz gráfica.
     */
    public Ventana1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Correo electrónico:");

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane2);

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("2. Elige un dominio:");

        jLabel3.setText("Paso 1: Ingresa tu nombre de usuario:");

        jButton3.setText("@gmail.com");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("@tlaxiaco.tecnm.mx");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Permite letras (mayúsculas y minúsculas) y números. ");

        jLabel5.setText("Solo permite los siguientes caracteres especiales . _ % + -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String correoCompleto = ""; // Variable para almacenar el correo
    private String dominioSeleccionado = ""; // Variable para almacenar el dominio seleccionado
   
    //Botón "Siguiente" que enlaza a la ventana2 donde se encuentra la validación de la contraseña
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Ventana2 newframe = new Ventana2();//Crea un nuevo objeto tipo ventana
       newframe.setVisible(true);//la muestra
       this.dispose();//cierra la ventana actual
       
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //botón validar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarCorreo();//método para validar el correo
    }//GEN-LAST:event_jButton1ActionPerformed

    //botón "@gmail.com"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    dominioSeleccionado = "@gmail.com"; //Asignación de la variable 
    actualizarTexto(); //actualiza el correo mostrado      
    }//GEN-LAST:event_jButton3ActionPerformed

    //botón "@tlaxiaco.tecnm.mx"
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dominioSeleccionado = "@tlaxiaco.tecnm.mx"; //asignación de la variable
    actualizarTexto(); //actualiza el correo mostrado
    }//GEN-LAST:event_jButton4ActionPerformed

    //método principal
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
  
    //método que actualiza el correo mostrado
    private void actualizarTexto() {
        String usuario = jTextField1.getText().trim(); // Obtener usuario del JTextField

    if (usuario.isEmpty()) {
        jTextPane2.setText("Ingresa un nombre de usuario valido antes de seleccionar un dominio.");
        return; // Salir de la función si no hay usuario
    }

    correoCompleto = usuario + dominioSeleccionado; // Unir usuario + dominio
    jTextPane2.setText(correoCompleto); // Mostrar en JTextPane

        } 
    //método que valida correo
    private void validarCorreo() {
        //expresión regular que valida los correos electrónicos
   String regex = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|tlaxiaco\\.tecnm\\.mx)$";
   /*Al compilarla con Pattern.compile(regex), se crea un objeto Pattern que
    luego se usará para comprobar si un correo ingresado cumple con el formato 
    permitido.*/
    Pattern pattern = Pattern.compile(regex);
    // Habilitar botón "Siguiente"
    String email = jTextPane2.getText().trim();
    //imprime validando y el correo electrónico previamente ingresado
    System.out.println("Validando: " + email); 
    //compara una cadena de texto con una expresión regular.
    Matcher matcher = pattern.matcher(email);
    //Si el correo es válido entonces:
    if (matcher.matches()) {
        //se imprime los siguiente
        jTextPane2.setText(" El correo es válido: " + email);
        //se activa el boton siguiente
        jButton2.setEnabled(true);  
    } else {// Si no es válido entonces
        //se imprime lo siguiente:
        jTextPane2.setText(" El correo NO es válido: " + email + "\n"
                + "Verifica:\n"
                + "- Escribe un nombre de usuario según las indicaciones.\n"
                + "- Luego, selecciona un dominio con un botón.");
        jButton2.setEnabled(false);
        //se deshabilita el botón "siguiente"
    }}
      
}
