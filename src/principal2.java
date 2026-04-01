
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import teste.atri3;

public class principal2 extends javax.swing.JFrame {

    public principal2() {
        initComponents();
    }

    int id = 0;
    int id2 = 0;
    int id3 = 0;
    atri3 at3 = new atri3();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_cpf2 = new javax.swing.JLabel();
        txt_cpf2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###.###.###-##");
            txt_cpf2 = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        lbl_telefone = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            txt_telefone = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        lbl_email2 = new javax.swing.JLabel();
        txt_email2 = new javax.swing.JTextField();
        caixa_estado = new javax.swing.JComboBox<>();
        lbl_estado = new javax.swing.JLabel();
        bt_cadastro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_clientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_nomeFor = new javax.swing.JLabel();
        txt_nomeFor = new javax.swing.JTextField();
        lbl_cnpj = new javax.swing.JLabel();
        txt_cnpj = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##.###.###/####-##");
            txt_cnpj = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        lbl_telefoneFor = new javax.swing.JLabel();
        txt_telefoneFor = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            txt_telefoneFor = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        lbl_emailFor = new javax.swing.JLabel();
        txt_emailFor = new javax.swing.JTextField();
        caixa_estadoFor = new javax.swing.JComboBox<>();
        lbl_estadoFor = new javax.swing.JLabel();
        bt_cadastroFor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_fornecedores = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_descProd = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();
        lbl_idFor = new javax.swing.JLabel();
        txt_codFor = new javax.swing.JTextField();
        lbl_precoUn = new javax.swing.JLabel();
        txt_precoUnit = new javax.swing.JTextField();
        lbl_quantEst = new javax.swing.JLabel();
        txt_quantEst = new javax.swing.JTextField();
        lbl_perecivel = new javax.swing.JLabel();
        bt_cadastroProd = new javax.swing.JButton();
        lbl_estMax = new javax.swing.JLabel();
        txt_estoqueMax = new javax.swing.JTextField();
        rb_nao = new javax.swing.JRadioButton();
        rb_sim = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_produtos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Balanço Geral de Mercadoria");
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Cadastro de clientes:");

        lbl_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_cpf2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_cpf2.setText("CPF:");

        lbl_telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_telefone.setText("Telefone:");

        lbl_email2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_email2.setText("Email");

        caixa_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Paulo", "Rio de Janeiro", "Espirito Santo", "Minas Gerais" }));

        lbl_estado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_estado.setText("Estado:");

        bt_cadastro.setText("Cadastrar");
        bt_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_email2)
                            .addComponent(txt_email2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_estado)
                                .addGap(18, 18, 18)
                                .addComponent(caixa_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_cpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cpf2)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_telefone)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(bt_cadastro)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_cpf2)
                    .addComponent(lbl_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_email2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixa_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastro)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1025, 229);

        jPanel5.setLayout(null);

        jt_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do cliente", "Nome do cliente", "CPF", "Telefone", "Email", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_clientes);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1030, 323);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 230, 1025, 427);

        jTabbedPane4.addTab("Clientes", jPanel1);

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Cadastro de fornecedores:");

        lbl_nomeFor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_nomeFor.setText("Nome:");

        lbl_cnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_cnpj.setText("CNPJ:");

        lbl_telefoneFor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_telefoneFor.setText("Telefone:");

        lbl_emailFor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_emailFor.setText("Email");

        caixa_estadoFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Paulo", "Rio de Janeiro", "Espirito Santo", "Minas Gerais" }));

        lbl_estadoFor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_estadoFor.setText("Estado:");

        bt_cadastroFor.setText("Cadastrar");
        bt_cadastroFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroForActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomeFor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nomeFor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_emailFor)
                            .addComponent(txt_emailFor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_estadoFor)
                                .addGap(18, 18, 18)
                                .addComponent(caixa_estadoFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_cnpj)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_telefoneFor)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(bt_cadastroFor)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nomeFor)
                    .addComponent(lbl_cnpj)
                    .addComponent(lbl_telefoneFor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_emailFor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emailFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixa_estadoFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estadoFor))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastroFor)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 1025, 220);

        jPanel6.setLayout(null);

        jt_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do fornecedor", "Nome do fornecedor", "CNPJ", "Telefone", "Email", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_fornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_fornecedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_fornecedores);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(0, 10, 1030, 320);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 220, 1020, 340);

        jTabbedPane4.addTab("Fornecedores", jPanel2);

        jPanel7.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Cadastro de produtos:");

        lbl_descProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_descProd.setText("Descrição:");

        lbl_idFor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_idFor.setText("Código do fornecedor:");

        lbl_precoUn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_precoUn.setText("Preço Unitário (R$):");

        lbl_quantEst.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_quantEst.setText("Quantidade em estoque:");

        lbl_perecivel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_perecivel.setText("Produto perecível?");

        bt_cadastroProd.setText("Cadastrar");
        bt_cadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroProdActionPerformed(evt);
            }
        });

        lbl_estMax.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_estMax.setText("Estoque Máximo:");

        buttonGroup1.add(rb_nao);
        rb_nao.setText("Não");

        buttonGroup1.add(rb_sim);
        rb_sim.setText("Sim");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_quantEst)
                                    .addComponent(txt_quantEst, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_estoqueMax, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(txt_codFor)
                                            .addComponent(lbl_idFor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(152, 152, 152)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_precoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(lbl_perecivel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rb_sim)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rb_nao))
                                            .addComponent(lbl_precoUn)))
                                    .addComponent(lbl_estMax, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descProd))))
                .addGap(117, 117, 117))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(bt_cadastroProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_descProd)
                    .addComponent(lbl_idFor)
                    .addComponent(lbl_precoUn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_quantEst)
                    .addComponent(lbl_estMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_quantEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_perecivel)
                    .addComponent(txt_estoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_nao)
                    .addComponent(rb_sim))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastroProd)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 1025, 240);

        jPanel9.setLayout(null);

        jt_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do produto", "Descrição do Produto", "Código do fornecedor", "Preço Unitário", "Quantidade em Estoque", "Estoque Máximo", "Produto perecível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_produtosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_produtos);

        jPanel9.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 1030, 330);

        jPanel7.add(jPanel9);
        jPanel9.setBounds(0, 240, 1030, 300);

        jTabbedPane4.addTab("Produtos", jPanel7);

        getContentPane().add(jTabbedPane4);
        jTabbedPane4.setBounds(0, 0, 1030, 600);

        jMenu1.setText("Usuário");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Caio\\Downloads\\Imagens\\Minio_Devices_and_Hardware_Bold-90-512.png")); // NOI18N
        jMenuItem1.setText("Fazer Logoff");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resultado = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Confirmação", 1);
        if(resultado == JOptionPane.YES_OPTION){
            frame2 f2 = new frame2();
            f2.setLocationRelativeTo(null);
            f2.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bt_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroActionPerformed
        if(txt_nome.getText().equals("") || txt_cpf2.getText().equals("   .   .   -  ") || txt_telefone.getText().equals("(  )     -    ") || 
                txt_email2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos!", "Erro", 2);
        } else{
            DefaultTableModel dtmClientes = (DefaultTableModel) jt_clientes.getModel();
            Object[] dados = {id+=1, txt_nome.getText(), txt_cpf2.getText(), txt_telefone.getText(), txt_email2.getText(), caixa_estado.getSelectedItem()};
            dtmClientes.addRow(dados);
            atri3.setNome(txt_nome.getText());
            atri3.setCpf(txt_cpf2.getText());
            atri3.setTelefone(txt_telefone.getText());
            atri3.setEmail(txt_email2.getText());
            atri3.setEstado(caixa_estado.getSelectedItem().toString());
            at3.salvarCli2();
            txt_nome.setText("");
            txt_cpf2.setText("");
            txt_telefone.setText("");
            txt_email2.setText("");
        }
    }//GEN-LAST:event_bt_cadastroActionPerformed

    private void jt_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_clientesMouseClicked

        if(jt_clientes.getSelectedRow() != -1){

            txt_nome.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(), 1).toString());
            txt_cpf2.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(), 2).toString());
            txt_telefone.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(), 3).toString());
            txt_email2.setText(jt_clientes.getValueAt(jt_clientes.getSelectedRow(), 4).toString());
            caixa_estado.setSelectedItem(jt_clientes.getValueAt(jt_clientes.getSelectedRow(), 5).toString());

        }

    }//GEN-LAST:event_jt_clientesMouseClicked

    private void bt_cadastroForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroForActionPerformed
        if(txt_nomeFor.getText().equals("") || txt_cnpj.getText().equals("  .   .   /    -  ") || txt_telefoneFor.getText().equals("(  )     -    ") || 
                txt_emailFor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos!", "Erro", 2);
        } else {
            DefaultTableModel dtmFornec = (DefaultTableModel) jt_fornecedores.getModel();
            Object[] dados = {id2+=1, txt_nomeFor.getText(), txt_cnpj.getText(), txt_telefoneFor.getText(), txt_emailFor.getText(), 
                caixa_estadoFor.getSelectedItem()};
            dtmFornec.addRow(dados);
            atri3.setNomeFor(txt_nomeFor.getText());
            atri3.setCnpj(txt_cnpj.getText());
            atri3.setTelefoneFor(txt_telefoneFor.getText());
            atri3.setEmailFor(txt_emailFor.getText());
            atri3.setEstadoFor(caixa_estadoFor.getSelectedItem().toString());
            
            at3.salvarFor();
            txt_nomeFor.setText("");
            txt_cnpj.setText("");
            txt_telefoneFor.setText("");
            txt_emailFor.setText("");
        }
    }//GEN-LAST:event_bt_cadastroForActionPerformed

    private void jt_fornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_fornecedoresMouseClicked
        if(jt_fornecedores.getSelectedRow() != -1){

            txt_nomeFor.setText(jt_fornecedores.getValueAt(jt_fornecedores.getSelectedRow(), 1).toString());
            txt_cnpj.setText(jt_fornecedores.getValueAt(jt_fornecedores.getSelectedRow(), 2).toString());
            txt_telefoneFor.setText(jt_fornecedores.getValueAt(jt_fornecedores.getSelectedRow(), 3).toString());
            txt_emailFor.setText(jt_fornecedores.getValueAt(jt_fornecedores.getSelectedRow(), 4).toString());
            caixa_estadoFor.setSelectedItem(jt_fornecedores.getValueAt(jt_fornecedores.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_jt_fornecedoresMouseClicked

    private void bt_cadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroProdActionPerformed
        if(txt_descricao.getText().equals("") || txt_codFor.getText().equals("") || txt_precoUnit.getText().equals("") || txt_quantEst.getText().equals("") 
                || txt_estoqueMax.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos!", "Erro", 2);
        } else{
            if(rb_sim.isSelected()){
                DefaultTableModel dtmProdutos = (DefaultTableModel) jt_produtos.getModel();
                Object[] dados = {id3+=1, txt_descricao.getText(), txt_codFor.getText(), txt_precoUnit.getText(), txt_quantEst.getText(), 
                    txt_estoqueMax.getText(), "Sim"};
                dtmProdutos.addRow(dados);
                atri3.setDescricao(txt_descricao.getText());
                atri3.setCodProd(txt_codFor.getText());
                atri3.setPrecoUnit(txt_precoUnit.getText());
                atri3.setQuantEst(txt_quantEst.getText());
                atri3.setEstoqueMax(txt_estoqueMax.getText());
                atri3.setRadio("Sim");
                at3.salvarProd();
                txt_descricao.setText("");
                txt_codFor.setText("");
                txt_precoUnit.setText("");
                txt_quantEst.setText("");
                txt_estoqueMax.setText("");
                buttonGroup1.clearSelection();
            } else if(rb_nao.isSelected()){
                DefaultTableModel dtmProdutos = (DefaultTableModel) jt_produtos.getModel();
                Object[] dados = {id3+=1, txt_descricao.getText(), txt_codFor.getText(), txt_precoUnit.getText(), txt_quantEst.getText(), 
                    txt_estoqueMax.getText(), "Não"};
                dtmProdutos.addRow(dados);
                atri3.setDescricao(txt_descricao.getText());
                atri3.setCodProd(txt_codFor.getText());
                atri3.setPrecoUnit(txt_precoUnit.getText());
                atri3.setQuantEst(txt_quantEst.getText());
                atri3.setEstoqueMax(txt_estoqueMax.getText());
                atri3.setRadio("Não");
                at3.salvarProd();
                txt_descricao.setText("");
                txt_codFor.setText("");
                txt_precoUnit.setText("");
                txt_quantEst.setText("");
                txt_estoqueMax.setText("");
                buttonGroup1.clearSelection();
            } else{
                JOptionPane.showMessageDialog(null, "Um ou mais campos não foram preenchidos!", "Erro", 2);
            }
        }
    }//GEN-LAST:event_bt_cadastroProdActionPerformed

    private void jt_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_produtosMouseClicked

        if(jt_produtos.getSelectedRow() != -1){

            if(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 6) == "Sim"){
                txt_descricao.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 1).toString());
                txt_codFor.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 2).toString());
                txt_precoUnit.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 3).toString());
                txt_quantEst.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 4).toString());
                txt_estoqueMax.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 5).toString());
                rb_sim.setSelected(true);
            } else if(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 6) == "Não"){
                txt_descricao.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 1).toString());
                txt_codFor.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 2).toString());
                txt_precoUnit.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 3).toString());
                txt_quantEst.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 4).toString());
                txt_estoqueMax.setText(jt_produtos.getValueAt(jt_produtos.getSelectedRow(), 5).toString());
                rb_nao.setSelected(true);
            }
        }

    }//GEN-LAST:event_jt_produtosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JOptionPane.showMessageDialog(null, "Ao clicar em cadastrar, um arquivo com os dados será criado no diretório deste programa", "Atenção", 1);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_cadastroFor;
    private javax.swing.JButton bt_cadastroProd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> caixa_estado;
    private javax.swing.JComboBox<String> caixa_estadoFor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jt_clientes;
    private javax.swing.JTable jt_fornecedores;
    private javax.swing.JTable jt_produtos;
    private javax.swing.JLabel lbl_cnpj;
    private javax.swing.JLabel lbl_cpf2;
    private javax.swing.JLabel lbl_descProd;
    private javax.swing.JLabel lbl_email2;
    private javax.swing.JLabel lbl_emailFor;
    private javax.swing.JLabel lbl_estMax;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_estadoFor;
    private javax.swing.JLabel lbl_idFor;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nomeFor;
    private javax.swing.JLabel lbl_perecivel;
    private javax.swing.JLabel lbl_precoUn;
    private javax.swing.JLabel lbl_quantEst;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_telefoneFor;
    private javax.swing.JRadioButton rb_nao;
    private javax.swing.JRadioButton rb_sim;
    private javax.swing.JTextField txt_cnpj;
    private javax.swing.JTextField txt_codFor;
    private javax.swing.JTextField txt_cpf2;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_email2;
    private javax.swing.JTextField txt_emailFor;
    private javax.swing.JTextField txt_estoqueMax;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomeFor;
    private javax.swing.JTextField txt_precoUnit;
    private javax.swing.JTextField txt_quantEst;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_telefoneFor;
    // End of variables declaration//GEN-END:variables
}
