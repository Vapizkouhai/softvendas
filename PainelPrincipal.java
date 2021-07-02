package softvendas;

public class PainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrincipal
     */
    java.awt.CardLayout cardLayout;
    
    public PainelPrincipal() {
        initComponents();
        
        cardLayout = (java.awt.CardLayout) (pannelNavegacao.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pannelLogotipo = new javax.swing.JPanel();
        logotipo = new javax.swing.JLabel();
        pannelDisplayEntrada = new javax.swing.JPanel();
        jScrollPaneDisplay = new javax.swing.JScrollPane();
        displaySaida = new javax.swing.JTextArea();
        entradaDeCodigo = new javax.swing.JTextField();
        displayError = new javax.swing.JLabel();
        pannelAbas = new javax.swing.JPanel();
        botaoAbaVenda = new javax.swing.JButton();
        botaoAbaEstoque = new javax.swing.JButton();
        botaoAbaHistoricoDeVendas = new javax.swing.JButton();
        botaoAbaCadastroDeClientes = new javax.swing.JButton();
        pannelNavegacao = new javax.swing.JPanel();
        pannelAbaVenda = new javax.swing.JPanel();
        jScrollPaneRelatorioVenda = new javax.swing.JScrollPane();
        displayRelatorioDaVenda = new javax.swing.JTextArea();
        botaoFinalizar = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        entradaCliente = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        entradaCategoria = new javax.swing.JTextField();
        labelProduto = new javax.swing.JLabel();
        entradaProduto = new javax.swing.JTextField();
        pannelAbaEstoque = new javax.swing.JPanel();
        jScrollPaneEstoque = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        labelClicavelCadastrarProduto = new javax.swing.JLabel();
        pannelAbaHistoricoDeVendas = new javax.swing.JPanel();
        jScrollPaneVendas = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        labelClicavelRelatorioDeVendas = new javax.swing.JLabel();
        pannelAbaCadastroDeClientes = new javax.swing.JPanel();
        jScrollPaneClientes = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        labelCllicavelCadastrarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logotipo.setBackground(new java.awt.Color(204, 255, 51));
        logotipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logotipo.setForeground(new java.awt.Color(0, 204, 204));
        logotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logotipo.setText("SoftVendas");
        logotipo.setOpaque(true);

        javax.swing.GroupLayout pannelLogotipoLayout = new javax.swing.GroupLayout(pannelLogotipo);
        pannelLogotipo.setLayout(pannelLogotipoLayout);
        pannelLogotipoLayout.setHorizontalGroup(
            pannelLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pannelLogotipoLayout.setVerticalGroup(
            pannelLogotipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logotipo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        displaySaida.setEditable(false);
        displaySaida.setColumns(20);
        displaySaida.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        displaySaida.setRows(1);
        jScrollPaneDisplay.setViewportView(displaySaida);

        entradaDeCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        entradaDeCodigo.setText("Insira o código do produto...");
        entradaDeCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaDeCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaDeCodigoFocusLost(evt);
            }
        });
        entradaDeCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaDeCodigoActionPerformed(evt);
            }
        });

        displayError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pannelDisplayEntradaLayout = new javax.swing.GroupLayout(pannelDisplayEntrada);
        pannelDisplayEntrada.setLayout(pannelDisplayEntradaLayout);
        pannelDisplayEntradaLayout.setHorizontalGroup(
            pannelDisplayEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDisplay)
            .addComponent(entradaDeCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(displayError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pannelDisplayEntradaLayout.setVerticalGroup(
            pannelDisplayEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelDisplayEntradaLayout.createSequentialGroup()
                .addComponent(jScrollPaneDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaDeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botaoAbaVenda.setText("Venda");
        botaoAbaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbaVendaActionPerformed(evt);
            }
        });

        botaoAbaEstoque.setText("Estoque");
        botaoAbaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbaEstoqueActionPerformed(evt);
            }
        });

        botaoAbaHistoricoDeVendas.setText("Histórico de Vendas");
        botaoAbaHistoricoDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbaHistoricoDeVendasActionPerformed(evt);
            }
        });

        botaoAbaCadastroDeClientes.setText("Cadastro de Clientes");
        botaoAbaCadastroDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbaCadastroDeClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pannelAbasLayout = new javax.swing.GroupLayout(pannelAbas);
        pannelAbas.setLayout(pannelAbasLayout);
        pannelAbasLayout.setHorizontalGroup(
            pannelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAbaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAbaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAbaHistoricoDeVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAbaCadastroDeClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pannelAbasLayout.setVerticalGroup(
            pannelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbasLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(botaoAbaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbaHistoricoDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAbaCadastroDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pannelNavegacao.setLayout(new java.awt.CardLayout());

        displayRelatorioDaVenda.setEditable(false);
        displayRelatorioDaVenda.setColumns(20);
        displayRelatorioDaVenda.setRows(5);
        jScrollPaneRelatorioVenda.setViewportView(displayRelatorioDaVenda);

        botaoFinalizar.setText("Finalizar");

        botaoAdicionar.setText("Adicionar");

        botaoCancelar.setText("Cancelar");

        labelCliente.setText("Cliente");

        entradaCliente.setText("--INFORMAR O CLIENTE--");
        entradaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaClienteFocusLost(evt);
            }
        });

        labelCategoria.setText("Categoria do Produto");

        entradaCategoria.setText("--INFORMAR A CATEGORIA--");
        entradaCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCategoriaFocusLost(evt);
            }
        });

        labelProduto.setText("Produto");

        entradaProduto.setText("--INFORMAR O PRODUTO--");
        entradaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaProdutoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pannelAbaVendaLayout = new javax.swing.GroupLayout(pannelAbaVenda);
        pannelAbaVenda.setLayout(pannelAbaVendaLayout);
        pannelAbaVendaLayout.setHorizontalGroup(
            pannelAbaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneRelatorioVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannelAbaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pannelAbaVendaLayout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoFinalizar))
                    .addComponent(labelCliente)
                    .addComponent(labelProduto)
                    .addComponent(entradaCliente)
                    .addComponent(entradaCategoria)
                    .addComponent(entradaProduto)
                    .addComponent(labelCategoria))
                .addContainerGap())
        );
        pannelAbaVendaLayout.setVerticalGroup(
            pannelAbaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelAbaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelAbaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pannelAbaVendaLayout.createSequentialGroup()
                        .addComponent(labelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(entradaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(pannelAbaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoFinalizar)
                            .addComponent(botaoAdicionar)
                            .addComponent(botaoCancelar)))
                    .addComponent(jScrollPaneRelatorioVenda))
                .addContainerGap())
        );

        pannelNavegacao.add(pannelAbaVenda, "abaVenda");

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneEstoque.setViewportView(tabelaEstoque);

        labelClicavelCadastrarProduto.setForeground(new java.awt.Color(0, 0, 255));
        labelClicavelCadastrarProduto.setText("<HTML><U>Cadastrar produto...</U></HTML>");
        labelClicavelCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClicavelCadastrarProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelClicavelCadastrarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelClicavelCadastrarProdutoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pannelAbaEstoqueLayout = new javax.swing.GroupLayout(pannelAbaEstoque);
        pannelAbaEstoque.setLayout(pannelAbaEstoqueLayout);
        pannelAbaEstoqueLayout.setHorizontalGroup(
            pannelAbaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelAbaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(pannelAbaEstoqueLayout.createSequentialGroup()
                        .addComponent(labelClicavelCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pannelAbaEstoqueLayout.setVerticalGroup(
            pannelAbaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClicavelCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pannelNavegacao.add(pannelAbaEstoque, "abaEstoque");

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código da Venda", "Cliente", "Itens Comprados", "Valor Total", "Horário", "Data da Transação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneVendas.setViewportView(tabelaVendas);

        labelClicavelRelatorioDeVendas.setForeground(new java.awt.Color(0, 0, 255));
        labelClicavelRelatorioDeVendas.setText("<HTML><U>Relatório de Vendas Totais<U><HTML>");

        javax.swing.GroupLayout pannelAbaHistoricoDeVendasLayout = new javax.swing.GroupLayout(pannelAbaHistoricoDeVendas);
        pannelAbaHistoricoDeVendas.setLayout(pannelAbaHistoricoDeVendasLayout);
        pannelAbaHistoricoDeVendasLayout.setHorizontalGroup(
            pannelAbaHistoricoDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaHistoricoDeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelAbaHistoricoDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(pannelAbaHistoricoDeVendasLayout.createSequentialGroup()
                        .addComponent(labelClicavelRelatorioDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pannelAbaHistoricoDeVendasLayout.setVerticalGroup(
            pannelAbaHistoricoDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaHistoricoDeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClicavelRelatorioDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pannelNavegacao.add(pannelAbaHistoricoDeVendas, "abaHistorico");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF/CNPJ", "Nome", "Valor Total em Compras", "Vendas Totais", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneClientes.setViewportView(tabelaClientes);

        labelCllicavelCadastrarCliente.setForeground(new java.awt.Color(0, 0, 255));
        labelCllicavelCadastrarCliente.setText("<HTML><U>Cadastrar Cliente...<U><HTML>");

        javax.swing.GroupLayout pannelAbaCadastroDeClientesLayout = new javax.swing.GroupLayout(pannelAbaCadastroDeClientes);
        pannelAbaCadastroDeClientes.setLayout(pannelAbaCadastroDeClientesLayout);
        pannelAbaCadastroDeClientesLayout.setHorizontalGroup(
            pannelAbaCadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaCadastroDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelAbaCadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addGroup(pannelAbaCadastroDeClientesLayout.createSequentialGroup()
                        .addComponent(labelCllicavelCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pannelAbaCadastroDeClientesLayout.setVerticalGroup(
            pannelAbaCadastroDeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelAbaCadastroDeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCllicavelCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pannelNavegacao.add(pannelAbaCadastroDeClientes, "abaCliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pannelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelLogotipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pannelDisplayEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannelLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pannelDisplayEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pannelAbas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void entradaDeCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        cardLayout.show(pannelNavegacao, "abaVenda");
                // TODO add your handling code here:
    }                                               

    private void botaoAbaVendaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        cardLayout.show(pannelNavegacao, "abaVenda");// TODO add your handling code here:
    }                                             

    private void entradaDeCodigoFocusGained(java.awt.event.FocusEvent evt) {                                            
        if (entradaDeCodigo.getText().equals("Insira o código do produto...")) {   
            entradaDeCodigo.setText("");
        }// TODO add your handling code here:
    }                                           

    private void entradaDeCodigoFocusLost(java.awt.event.FocusEvent evt) {                                          
        if (entradaDeCodigo.getText().equals("")){
            entradaDeCodigo.setText("Insira o código do produto...");
        }        // TODO add your handling code here:
    }                                         

    private void botaoAbaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        cardLayout.show(pannelNavegacao, "abaEstoque");// TODO add your handling code here:
    }                                               

    private void botaoAbaHistoricoDeVendasActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        cardLayout.show(pannelNavegacao, "abaHistorico");// TODO add your handling code here:
    }                                                         

    private void botaoAbaCadastroDeClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        cardLayout.show(pannelNavegacao, "abaCliente");// TODO add your handling code here:
    }                                                          

    private void labelClicavelCadastrarProdutoMouseClicked(java.awt.event.MouseEvent evt) {                                                           
        entradaDeCodigo.grabFocus();                // TODO add your handling code here:
    }                                                          

    private void labelClicavelCadastrarProdutoMouseEntered(java.awt.event.MouseEvent evt) {                                                           
        labelClicavelCadastrarProduto.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));        // TODO add your handling code here:
    }                                                          

    private void labelClicavelCadastrarProdutoMouseExited(java.awt.event.MouseEvent evt) {                                                          
        labelClicavelCadastrarProduto.setCursor(java.awt.Cursor.getDefaultCursor());        // TODO add your handling code here:
    }                                                         

    private void entradaClienteFocusGained(java.awt.event.FocusEvent evt) {                                           
        if (entradaCliente.getText().equals("--INFORMAR O CLIENTE--")){
            entradaCliente.setText("");
        }// TODO add your handling code here:
    }                                          

    private void entradaClienteFocusLost(java.awt.event.FocusEvent evt) {                                         
        if (entradaCliente.getText().equals("")){
            entradaCliente.setText("--INFORMAR O CLIENTE--");
        }// TODO add your handling code here:
    }                                        

    private void entradaCategoriaFocusGained(java.awt.event.FocusEvent evt) {                                             
        if (entradaCategoria.getText().equals("--INFORMAR A CATEGORIA--")){
            entradaCategoria.setText("");
        }// TODO add your handling code here:
    }                                            

    private void entradaCategoriaFocusLost(java.awt.event.FocusEvent evt) {                                           
        if (entradaCategoria.getText().equals("")){
            entradaCategoria.setText("--INFORMAR A CATEGORIA--");
        }// TODO add your handling code here:
    }                                          

    private void entradaProdutoFocusGained(java.awt.event.FocusEvent evt) {                                           
        if (entradaProduto.getText().equals("--INFORMAR O PRODUTO--")){
            entradaProduto.setText("");
        }// TODO add your handling code here:
    }                                          

    private void entradaProdutoFocusLost(java.awt.event.FocusEvent evt) {                                         
        if (entradaProduto.getText().equals("")){
            entradaProduto.setText("--INFORMAR O PRODUTO--");
        }// TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public void executar() {
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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAbaCadastroDeClientes;
    private javax.swing.JButton botaoAbaEstoque;
    private javax.swing.JButton botaoAbaHistoricoDeVendas;
    private javax.swing.JButton botaoAbaVenda;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JLabel displayError;
    private javax.swing.JTextArea displayRelatorioDaVenda;
    private javax.swing.JTextArea displaySaida;
    private javax.swing.JTextField entradaCategoria;
    private javax.swing.JTextField entradaCliente;
    private javax.swing.JTextField entradaDeCodigo;
    private javax.swing.JTextField entradaProduto;
    private javax.swing.JScrollPane jScrollPaneClientes;
    private javax.swing.JScrollPane jScrollPaneDisplay;
    private javax.swing.JScrollPane jScrollPaneEstoque;
    private javax.swing.JScrollPane jScrollPaneRelatorioVenda;
    private javax.swing.JScrollPane jScrollPaneVendas;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelClicavelCadastrarProduto;
    private javax.swing.JLabel labelClicavelRelatorioDeVendas;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCllicavelCadastrarCliente;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel logotipo;
    private javax.swing.JPanel pannelAbaCadastroDeClientes;
    private javax.swing.JPanel pannelAbaEstoque;
    private javax.swing.JPanel pannelAbaHistoricoDeVendas;
    private javax.swing.JPanel pannelAbaVenda;
    private javax.swing.JPanel pannelAbas;
    private javax.swing.JPanel pannelDisplayEntrada;
    private javax.swing.JPanel pannelLogotipo;
    private javax.swing.JPanel pannelNavegacao;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration                   
}
