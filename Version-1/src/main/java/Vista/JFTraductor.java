package Vista;

import Logica.TraductorSanscrito;
import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class JFTraductor extends javax.swing.JFrame {

    private Map<Integer, ImageIcon> mapaImagenes;
    private Map<Integer, String> english;
    private Map<Integer, String> spanish;
    private Map<Integer, String> sanskrit;
    TraductorSanscrito ts;

    public JFTraductor() {
        setTitle("Yoga Translate");
        initComponents();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(cbEspanol);
        AutoCompleteDecorator.decorate(cbEnglish);
        AutoCompleteDecorator.decorate(cbSanskrit);
        // Inicializar el mapa de imágenes en el constructor
        mapaImagenes = new HashMap<>();
        english = new HashMap<>();
        spanish = new HashMap<>();
        sanskrit = new HashMap<>();

        // Cargar imágenes al inicio
        cargarImagenes();

        // Mostrar la imagen seleccionada al inicio
        mostrarImagenSeleccionada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        jpEspanol = new javax.swing.JPanel();
        cbEspanol = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        lblES_EN = new javax.swing.JLabel();
        lblES_SANS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpEnglish = new javax.swing.JPanel();
        cbEnglish = new javax.swing.JComboBox<>();
        lblImagenEN = new javax.swing.JLabel();
        lblEN_ES = new javax.swing.JLabel();
        lblEN_SANS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jpSanskrit = new javax.swing.JPanel();
        lblImagenSANS = new javax.swing.JLabel();
        lblSANS_ES = new javax.swing.JLabel();
        lblSANS_EN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cbSanskrit = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSanscrito = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTraducido = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traductor");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRADUCTOR");

        tabPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPanelMouseClicked(evt);
            }
        });

        cbEspanol.setEditable(true);
        cbEspanol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEspanol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Postura de la Montaña", "Perro mirando hacia abajo", "Guerrero I", "Guerrero II", "Postura del Árbol", "Postura del Niño", "Postura de la Cobra a la mitad", "Flexión hacia adelante sentado", "Postura del Puente", "Postura del Cadáver", "Postura del Triángulo", "Postura de la Plancha", "Perro mirando hacia arriba", "Postura del Pez", "Postura de la Silla", "Postura de la Guirnalda", "Postura de la Paloma", "Saludo hacia arriba", "Postura del Triángulo Invertido", "Postura de la Cabeza a la Rodilla Invertida" }));
        cbEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspanolActionPerformed(evt);
            }
        });

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblES_EN.setText("...");

        lblES_SANS.setText("...");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Inglés:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sánscrito: ");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpEspanolLayout = new javax.swing.GroupLayout(jpEspanol);
        jpEspanol.setLayout(jpEspanolLayout);
        jpEspanolLayout.setHorizontalGroup(
            jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspanolLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEspanol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(lblES_SANS, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(lblES_EN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addGap(74, 74, 74))
        );
        jpEspanolLayout.setVerticalGroup(
            jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspanolLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cbEspanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblES_EN)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jpEspanolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblES_SANS)
                            .addComponent(jLabel3))
                        .addGap(78, 78, 78))
                    .addGroup(jpEspanolLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        tabPanel.addTab("Español", jpEspanol);

        cbEnglish.setEditable(true);
        cbEnglish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEnglish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select     ", "Mountain Pose", "Downward-Facing Dog", "Warrior I", "Warrior II", "Tree Pose", "Child's Pose", "Half Cobra Pose", "Seated Forward Bend", "Bridge Pose", "Corpse Pose", "Triangle Pose", "Plank Pose", "Upward-Facing Dog", "Fish Pose", "Chair Pose", "Garland Pose", "Pigeon Pose", "Upward Salute", "Revolved Triangle Pose", "Revolved Head To Knee Pose" }));
        cbEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnglishActionPerformed(evt);
            }
        });

        lblImagenEN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEN_ES.setText("...");

        lblEN_SANS.setText("...");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Spanish: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sanskrit");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpEnglishLayout = new javax.swing.GroupLayout(jpEnglish);
        jpEnglish.setLayout(jpEnglishLayout);
        jpEnglishLayout.setHorizontalGroup(
            jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnglishLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnglishLayout.createSequentialGroup()
                        .addComponent(lblImagenEN, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnglishLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(lblEN_SANS, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnglishLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblEN_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEnglishLayout.setVerticalGroup(
            jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnglishLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEN_ES)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jpEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEN_SANS))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnglishLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cbEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagenEN, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tabPanel.addTab("English", jpEnglish);

        lblImagenSANS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSANS_ES.setText("...");

        lblSANS_EN.setText("...");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Español: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("English: ");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        cbSanskrit.setEditable(true);
        cbSanskrit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSanskrit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select     ", "Tadasana", "Adho Mukha Svanasana", "Virabhadrasana I", "Virabhadrasana II", "Vrikshasana", "Balasana", "Ardha Bhujangasana", "Paschimottanasana", "Setu Bandhasana", "Shavasana", "Trikonasana", "Kumbhakasana", "Urdhva Mukha Svanasana", "Matsyasana", "Utkatasana", "Malasana", "Eka Pada Rajakapotasana", "Urdhva Hastasana", "Parivrtta Trikonasana", "Parivrtta Janu Sirsasana" }));
        cbSanskrit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSanskritActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSanskritLayout = new javax.swing.GroupLayout(jpSanskrit);
        jpSanskrit.setLayout(jpSanskritLayout);
        jpSanskritLayout.setHorizontalGroup(
            jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanskritLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenSANS, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSanskrit, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSANS_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSANS_EN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpSanskritLayout.setVerticalGroup(
            jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanskritLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbSanskrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenSANS, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jpSanskritLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSANS_ES)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jpSanskritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSANS_EN)
                            .addComponent(jLabel7))
                        .addGap(82, 82, 82))))
        );

        tabPanel.addTab("Sanskrit", jpSanskrit);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sánscrito");

        jtaSanscrito.setColumns(20);
        jtaSanscrito.setLineWrap(true);
        jtaSanscrito.setRows(5);
        jtaSanscrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtaSanscritoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtaSanscrito);

        jtaTraducido.setEditable(false);
        jtaTraducido.setBackground(new java.awt.Color(255, 255, 255));
        jtaTraducido.setColumns(20);
        jtaTraducido.setLineWrap(true);
        jtaTraducido.setRows(5);
        jScrollPane2.setViewportView(jtaTraducido);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Traducción");

        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        tabPanel.addTab("Diccionario", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tabPanel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspanolActionPerformed
        System.out.println("Índice seleccionado: " + cbEspanol.getSelectedIndex());
        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();
    }//GEN-LAST:event_cbEspanolActionPerformed

    private void cbEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnglishActionPerformed

        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();

    }//GEN-LAST:event_cbEnglishActionPerformed

    private void tabPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPanelMouseClicked

        mostrarImagenSeleccionada();
    }//GEN-LAST:event_tabPanelMouseClicked

    private void cbSanskritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSanskritActionPerformed
        mostrarImagenSeleccionada();
        mostrarTextoSeleccionado();
    }//GEN-LAST:event_cbSanskritActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ts = new TraductorSanscrito();
        String traducir = ts.traducir(jtaSanscrito.getText().toLowerCase().trim());
        jtaTraducido.setText(traducir);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtaSanscritoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaSanscritoKeyTyped
        char c = evt.getKeyChar();

        // Definir la expresión regular
        String regex = "^[a-zA-Z ]$";
        Pattern pattern = Pattern.compile(regex);

        // Verificar si el carácter es una letra o espacio
        Matcher matcher = pattern.matcher(String.valueOf(c));

        if (!matcher.matches()) {
            evt.consume();
        }

    }//GEN-LAST:event_jtaSanscritoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEnglish;
    private javax.swing.JComboBox<String> cbEspanol;
    private javax.swing.JComboBox<String> cbSanskrit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpEnglish;
    private javax.swing.JPanel jpEspanol;
    private javax.swing.JPanel jpSanskrit;
    private javax.swing.JTextArea jtaSanscrito;
    private javax.swing.JTextArea jtaTraducido;
    private javax.swing.JLabel lblEN_ES;
    private javax.swing.JLabel lblEN_SANS;
    private javax.swing.JLabel lblES_EN;
    private javax.swing.JLabel lblES_SANS;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenEN;
    private javax.swing.JLabel lblImagenSANS;
    private javax.swing.JLabel lblSANS_EN;
    private javax.swing.JLabel lblSANS_ES;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables

    private void cargarIdioma(int tab) {
        String[] englishWords = {
            "...",
            "Mountain Pose",
            "Downward-Facing Dog",
            "Warrior I",
            "Warrior II",
            "Tree Pose",
            "Child's Pose",
            "Half Cobra Pose",
            "Seated Forward Bend",
            "Bridge Pose",
            "Corpse Pose",
            "Triangle Pose",
            "Plank Pose",
            "Upward-Facing Dog",
            "Fish Pose",
            "Chair Pose",
            "Garland Pose",
            "Pigeon Pose",
            "Upward Salute",
            "Revolved Triangle Pose",
            "Revolved Head To Knee Pose"

        };
        String[] spanishWords = {
            "...",
            "Postura de la Montaña",
            "Perro mirando hacia abajo",
            "Guerrero I",
            "Guerrero II",
            "Postura del Árbol",
            "Postura del Niño",
            "Postura de la Cobra a la mitad",
            "Flexión hacia adelante sentado",
            "Postura del Puente",
            "Postura del Cadáver",
            "Postura del Triángulo",
            "Postura de la Plancha",
            "Perro mirando hacia arriba",
            "Postura del Pez",
            "Postura de la Silla",
            "Postura de la Guirnalda",
            "Postura de la Paloma",
            "Saludo hacia arriba",
            "Postura del Triángulo Invertido",
            "Postura de la Cabeza a la Rodilla Invertida"
        };

        String[] sanskritWords = {
            "...",
            "Tadasana",
            "Adho Mukha Svanasana",
            "Virabhadrasana I",
            "Virabhadrasana II",
            "Vrikshasana",
            "Balasana",
            "Ardha Bhujangasana",
            "Paschimottanasana",
            "Setu Bandhasana",
            "Shavasana",
            "Trikonasana",
            "Kumbhakasana",
            "Urdhva Mukha Svanasana",
            "Matsyasana",
            "Utkatasana",
            "Malasana",
            "Eka Pada Rajakapotasana",
            "Urdhva Hastasana",
            "Parivrtta Trikonasana",
            "Parivrtta Janu Sirsasana"

        };

        switch (tab) {
            case 0:
                System.out.println("Idioma Español escogido: " + tabPanel.getSelectedIndex());
                for (int i = 0; i < englishWords.length; i++) {
                    english.put(i, englishWords[i]);
                }
                System.out.println("Mapeo de la lista EN: " + english);
                for (int i = 0; i < sanskritWords.length; i++) {
                    sanskrit.put(i, sanskritWords[i]);
                }
                System.out.println("Mapeo de la lista SANS: " + sanskrit);
                break;
            case 1:
                System.out.println("idioma Ingles" + tabPanel.getSelectedIndex());
                for (int i = 0; i < spanishWords.length; i++) {
                    spanish.put(i, spanishWords[i]);
                }
                System.out.println("Mapeo de la lista ES: " + spanish);
                for (int i = 0; i < sanskritWords.length; i++) {
                    sanskrit.put(i, sanskritWords[i]);
                }
                System.out.println("Mapeo de la lista SANS: " + sanskrit);
                break;
            case 2:
                System.out.println("idioma Ingles" + tabPanel.getSelectedIndex());
                for (int i = 0; i < spanishWords.length; i++) {
                    spanish.put(i, spanishWords[i]);
                }
                System.out.println("Mapeo de la lista ES: " + spanish);
                for (int i = 0; i < englishWords.length; i++) {
                    english.put(i, englishWords[i]);
                }
                System.out.println("Mapeo de la lista EN: " + english);
                break;
            default:
                break;
        }

    }

    private void cargarImagenes() {
        // Rutas de las imágenes en el paquete "Images"
        String[] nombresArchivos = {
            "0. Intro.gif",
            "01. PosturaMontana.gif",
            "02. PerroMirandoAbajo.gif",
            "03. Guerrero1.gif",
            "04. Guerrero2.gif",
            "05. PosturaArbol.gif",
            "06. PosturaNino.gif",
            "07. PosturaCobraMitad.gif",
            "08. FlexionHaciAdelanteSentado.gif",
            "09. PosturaPuente.gif",
            "10. PosturaCadaver.jpg",
            "11. PosturaTriangulo.gif",
            "12. PosturaPlancha.gif",
            "13. PerroMirandoArriba.gif",
            "14. PosturaPez.gif",
            "15. PosturaSilla.gif",
            "16. PosturaGuirnalda.gif",
            "17. PosturaPaloma.gif",
            "18. SaludoHaciaArriba.gif",
            "19. PosturaTrianguloInvertido.gif",
            "20. PosturaCabezaARodillaInvertida.gif"
        };

        // Obtener la ruta del paquete "Images"
        Path rutaBase = Paths.get("Version-1","src", "main", "java", "Images");

        // Agregar las imágenes al mapa
        for (int i = 0; i < nombresArchivos.length; i++) {
            Path rutaImagen = rutaBase.resolve(nombresArchivos[i]);
            mapaImagenes.put(i, new ImageIcon(rutaImagen.toString()));
        }
    }

    private void mostrarImagenSeleccionada() {
        int indiceSeleccionadoES = cbEspanol.getSelectedIndex();
        int indiceSeleccionadoEN = cbEnglish.getSelectedIndex();
        int indiceSeleccionadoSANS = cbSanskrit.getSelectedIndex();

        ImageIcon imagenSeleccionadaES = mapaImagenes.get(indiceSeleccionadoES);
        ImageIcon imagenSeleccionadaEN = mapaImagenes.get(indiceSeleccionadoEN);
        ImageIcon imagenSeleccionadaSANS = mapaImagenes.get(indiceSeleccionadoSANS);

        System.out.println("Ruta de la imagen: " + imagenSeleccionadaES);
        System.out.println("Ruta de la imagen: " + imagenSeleccionadaEN);
        System.out.println("Ruta de la imagen: " + imagenSeleccionadaSANS);

        switch (tabPanel.getSelectedIndex()) {
            case 0 -> {
                if (imagenSeleccionadaES != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaES.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagen.getWidth() + " x " + lblImagen.getHeight());
                    lblImagen.setIcon(icon);
                    this.repaint();
                    lblImagen.setText("");
                } else {
                    lblImagen.setIcon(null);
                    lblImagen.setText("Imagen NO Encontrada :c");
                }
            }
            case 1 -> {
                if (imagenSeleccionadaEN != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaEN.getImage().getScaledInstance(lblImagenEN.getWidth(), lblImagenEN.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagenEN.getWidth() + " x " + lblImagenEN.getHeight());
                    lblImagenEN.setIcon(icon);
                    this.repaint();
                    lblImagenEN.setText("");
                } else {
                    lblImagenEN.setText(null);
                    lblImagenEN.setText("Imagen NO Encontrada :c");
                }
            }
            case 2 -> {
                if (imagenSeleccionadaSANS != null) {
                    Icon icon = new ImageIcon(imagenSeleccionadaSANS.getImage().getScaledInstance(lblImagenSANS.getWidth(), lblImagenSANS.getHeight(), Image.SCALE_DEFAULT));
                    System.out.println("Tamaño del Icon: " + icon.getIconWidth() + " x " + icon.getIconHeight());
                    System.out.println("Dimensiones del JLabel: " + lblImagenSANS.getWidth() + " x " + lblImagenSANS.getHeight());
                    lblImagenSANS.setIcon(icon);
                    this.repaint();
                    lblImagenSANS.setText("");
                } else {
                    lblImagenSANS.setText(null);
                    lblImagenSANS.setText("Imagen NO Encontrada :c");
                }
            }
            default -> {
            }
        }
    }

    private void mostrarTextoSeleccionado() {
        cargarIdioma(tabPanel.getSelectedIndex());

        if (tabPanel.getSelectedIndex() == 0) {
            int indiceSeleccionadoES = cbEspanol.getSelectedIndex();
            String opcionEnglish = english.get(indiceSeleccionadoES);
            String opcionSanskrit = sanskrit.get(indiceSeleccionadoES);
            lblES_EN.setText(opcionEnglish);
            lblES_SANS.setText(opcionSanskrit);
        } else if (tabPanel.getSelectedIndex() == 1) {
            int indiceSeleccionadoEN = cbEnglish.getSelectedIndex();
            String opcionEspanish = spanish.get(indiceSeleccionadoEN);
            String opcionSanskrit = sanskrit.get(indiceSeleccionadoEN);
            lblEN_ES.setText(opcionEspanish);
            lblEN_SANS.setText(opcionSanskrit);
        } else if (tabPanel.getSelectedIndex() == 2) {
            int indiceSeleccionadoSANS = cbSanskrit.getSelectedIndex();
            String opcionEnglish = english.get(indiceSeleccionadoSANS);
            String opcionEspanish = spanish.get(indiceSeleccionadoSANS);
            lblSANS_ES.setText(opcionEspanish);
            lblSANS_EN.setText(opcionEnglish);
        }

    }

}
