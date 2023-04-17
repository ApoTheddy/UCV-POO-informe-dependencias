package views;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import services.ApiJsonPlaceholder;
import models.Client;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.swing.JOptionPane;
import models.BankAccount;
import services.ApiResponse;

public class BankView extends javax.swing.JFrame {

    private ApiJsonPlaceholder api = new ApiJsonPlaceholder();
    private Client[] clients;
    private Client client;
    private BankAccount bankAccount;

    public BankView() {
        ApiResponse apiResponse = api.getClients();

        /*
            Verificamos si nuestra respuesta de la api es igual a 'null' lo cual indica que no hemos obtenido ningun dato de la api, por lo cual la aplicacion va mandar un mensaje
            indicando que no se pudo obtener los datos
         */
        if (apiResponse == null) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los datos de los clientes");
            System.exit(0);
        }

        // Caso contrario almacenaremos los 'Clientes' de la api, para darles uso
        clients = apiResponse.<Client[]>convert();

        initComponents();

        // Establecemos algunas propiedades que tendra nuestra ventana
        windowConfiguration();

        actionButtonSearch();
    }

    void windowConfiguration() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResults = new javax.swing.JTextArea();
        txtAmount = new javax.swing.JTextField();
        btnDepositMoney = new javax.swing.JButton();
        btnWithdrawals = new javax.swing.JButton();
        btnShowNumberAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar cliente");

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search32px.png"))); // NOI18N

        btnCreateAccount.setBackground(new java.awt.Color(153, 255, 153));
        btnCreateAccount.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(0, 0, 0));
        btnCreateAccount.setText("Crear cuenta bancaria");
        btnCreateAccount.setEnabled(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        txaResults.setEditable(false);
        txaResults.setBackground(new java.awt.Color(255, 255, 255));
        txaResults.setColumns(20);
        txaResults.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        txaResults.setForeground(new java.awt.Color(0, 0, 0));
        txaResults.setLineWrap(true);
        txaResults.setRows(5);
        txaResults.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(txaResults);

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtAmount.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(0, 0, 0));
        txtAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "S/", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        btnDepositMoney.setBackground(new java.awt.Color(153, 255, 153));
        btnDepositMoney.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnDepositMoney.setForeground(new java.awt.Color(0, 0, 0));
        btnDepositMoney.setText("Depositar Dinero");
        btnDepositMoney.setEnabled(false);
        btnDepositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositMoneyActionPerformed(evt);
            }
        });

        btnWithdrawals.setBackground(new java.awt.Color(255, 102, 102));
        btnWithdrawals.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnWithdrawals.setForeground(new java.awt.Color(0, 0, 0));
        btnWithdrawals.setText("Retirar Dinero");
        btnWithdrawals.setEnabled(false);
        btnWithdrawals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawalsActionPerformed(evt);
            }
        });

        btnShowNumberAccount.setBackground(new java.awt.Color(204, 255, 204));
        btnShowNumberAccount.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        btnShowNumberAccount.setForeground(new java.awt.Color(0, 0, 0));
        btnShowNumberAccount.setText("Mostrar informacion de cuenta");
        btnShowNumberAccount.setEnabled(false);
        btnShowNumberAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNumberAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAmount)
                    .addComponent(btnDepositMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnShowNumberAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDepositMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShowNumberAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Creamos un evento de teclado que estara a la escucha cuando presionemos una tecla
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Verificamos si el campo de texto de buscar cliente se encuentra vacio, lo cual desactivara el boton de crear cuenta bancaria
        if (txtSearch.getText().isBlank()) {
            setButtonState(false);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        bankAccount = new BankAccount(client);
        JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
        setButtonState(true);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnDepositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositMoneyActionPerformed
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            bankAccount.depositeMoney(amount);
        } catch (NumberFormatException nfex) {
            JOptionPane.showMessageDialog(null, "No se deposito el dinero, el monto agregado es incorrecto");
        }
    }//GEN-LAST:event_btnDepositMoneyActionPerformed

    private void btnWithdrawalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawalsActionPerformed
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            bankAccount.withdrawals(amount);
        } catch (NumberFormatException nfex) {
            JOptionPane.showMessageDialog(null, "No se deposito el dinero, el monto agregado es incorrecto");
        }
    }//GEN-LAST:event_btnWithdrawalsActionPerformed

    private void btnShowNumberAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNumberAccountActionPerformed
        JOptionPane.showMessageDialog(null, "Numero de cuenta " + bankAccount.getAccountNumber() + "\n"
                + "Nombre de titular: " + bankAccount.obtenerNombreTitular() + "\n"
                + "Saldo: " + bankAccount.getBalance());
    }//GEN-LAST:event_btnShowNumberAccountActionPerformed

    public void actionButtonSearch() {
        lblSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSearch.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                String name = txtSearch.getText().trim();

                if (!name.isEmpty()) {
                    client = searchClientByName(name);

                    if (client != null) {
                        // Activamos el boton de crear cuenta bancaria
                        btnCreateAccount.setEnabled(true);

                        // Instanciamos la clase de gson para poder hacer uso de sus metodos, para poder transformar el client a un json y mostrarlo en el text area
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();

                        // Asignamos el client al text area con todos sus datos correspondientes
                        txaResults.setText(gson.toJson(client));
                    } else {
                        txaResults.setText("No se encontro el usuario buscado");
                        setButtonState(false);
                    }
                } else {
                    txaResults.setText("Ingres algun nombre");
                }
            }
        });
    }

    public Client searchClientByName(String name) {
        Client clientToSearch = null;

        for (Client client : clients) {
            if (client.getName().equals(name)) {
                clientToSearch = client;
                break;
            }
        }
        return clientToSearch;
    }

    public void setButtonState(boolean state) {
        btnShowNumberAccount.setEnabled(state);
        btnCreateAccount.setEnabled(state);
        btnWithdrawals.setEnabled(state);
        btnDepositMoney.setEnabled(state);
        txtAmount.setEditable(state);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnDepositMoney;
    private javax.swing.JButton btnShowNumberAccount;
    private javax.swing.JButton btnWithdrawals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextArea txaResults;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
