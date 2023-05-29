package views;
import AppPackage.AnimationClass;
import java.awt.Color;


public class StockViews extends javax.swing.JFrame {

AnimationClass ac = new AnimationClass();
    public StockViews() {
        initComponents();
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelMenu1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        btnPedidos1 = new javax.swing.JButton();
        btnNovoPedido = new javax.swing.JButton();
        btnVisualizarPedidos = new javax.swing.JButton();
        btnProdutos1 = new javax.swing.JButton();
        btnEstoque1 = new javax.swing.JButton();
        painelMenu2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        btnPedidos2 = new javax.swing.JButton();
        btnProdutos2 = new javax.swing.JButton();
        btnLanches = new javax.swing.JButton();
        btnIngredientes = new javax.swing.JButton();
        btnFichaTecnica = new javax.swing.JButton();
        btnCalculoPorcoes = new javax.swing.JButton();
        btnEstoque2 = new javax.swing.JButton();
        painelMenu3 = new javax.swing.JPanel();
        logo3 = new javax.swing.JLabel();
        btnPedidos3 = new javax.swing.JButton();
        btnProdutos3 = new javax.swing.JButton();
        btnEstoque3 = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnProdutosEstoque = new javax.swing.JButton();
        areaPrincipal = new javax.swing.JDesktopPane();
        areaNovoPedido = new javax.swing.JInternalFrame();
        panelNP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        combobox1 = new combobox.Combobox();
        spinner2 = new spinner.Spinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        rodapePainel = new javax.swing.JPanel();
        lblCopyright = new javax.swing.JLabel();
        bordaPainel = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        areaVisualizarPedidos = new javax.swing.JInternalFrame();
        panelVP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1020));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1040));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenu1.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu1.setMaximumSize(new java.awt.Dimension(250, 1020));
        painelMenu1.setMinimumSize(new java.awt.Dimension(250, 1020));
        painelMenu1.setPreferredSize(new java.awt.Dimension(250, 1020));
        painelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 120));

        btnPedidos1.setBackground(new java.awt.Color(192, 192, 192));
        btnPedidos1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-de-compras.png"))); // NOI18N
        btnPedidos1.setText(" Pedidos");
        btnPedidos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnPedidos1.setContentAreaFilled(false);
        btnPedidos1.setDefaultCapable(false);
        btnPedidos1.setHideActionText(true);
        btnPedidos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPedidos1.setOpaque(true);
        btnPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidos1ActionPerformed(evt);
            }
        });
        painelMenu1.add(btnPedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 250, 60));

        btnNovoPedido.setBackground(new java.awt.Color(192, 192, 192));
        btnNovoPedido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnNovoPedido.setForeground(new java.awt.Color(56, 56, 56));
        btnNovoPedido.setText("     Novo Pedido");
        btnNovoPedido.setActionCommand("   Novo Pedido");
        btnNovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnNovoPedido.setContentAreaFilled(false);
        btnNovoPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoPedido.setDefaultCapable(false);
        btnNovoPedido.setHideActionText(true);
        btnNovoPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setOpaque(true);
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });
        painelMenu1.add(btnNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 240, 60));

        btnVisualizarPedidos.setBackground(new java.awt.Color(211, 211, 211));
        btnVisualizarPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnVisualizarPedidos.setForeground(new java.awt.Color(56, 56, 56));
        btnVisualizarPedidos.setText("     Visualizar Pedidos");
        btnVisualizarPedidos.setActionCommand("   Visualizar Pedidos");
        btnVisualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnVisualizarPedidos.setContentAreaFilled(false);
        btnVisualizarPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarPedidos.setDefaultCapable(false);
        btnVisualizarPedidos.setHideActionText(true);
        btnVisualizarPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVisualizarPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVisualizarPedidos.setOpaque(true);
        btnVisualizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarPedidosActionPerformed(evt);
            }
        });
        painelMenu1.add(btnVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, 240, 60));

        btnProdutos1.setBackground(new java.awt.Color(211, 211, 211));
        btnProdutos1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnProdutos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        btnProdutos1.setText(" Produtos");
        btnProdutos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnProdutos1.setContentAreaFilled(false);
        btnProdutos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos1.setDefaultCapable(false);
        btnProdutos1.setHideActionText(true);
        btnProdutos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProdutos1.setOpaque(true);
        btnProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos1ActionPerformed(evt);
            }
        });
        painelMenu1.add(btnProdutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, 250, 60));

        btnEstoque1.setBackground(new java.awt.Color(211, 211, 211));
        btnEstoque1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEstoque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque 1.png"))); // NOI18N
        btnEstoque1.setText(" Estoque");
        btnEstoque1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEstoque1.setContentAreaFilled(false);
        btnEstoque1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque1.setDefaultCapable(false);
        btnEstoque1.setHideActionText(true);
        btnEstoque1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque1.setOpaque(true);
        btnEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoque1ActionPerformed(evt);
            }
        });
        painelMenu1.add(btnEstoque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 250, 60));

        jPanel1.add(painelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1020));

        painelMenu2.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu2.setMaximumSize(new java.awt.Dimension(250, 1020));
        painelMenu2.setMinimumSize(new java.awt.Dimension(250, 1020));
        painelMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 120));

        btnPedidos2.setBackground(new java.awt.Color(211, 211, 211));
        btnPedidos2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPedidos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-de-compras.png"))); // NOI18N
        btnPedidos2.setText(" Pedidos");
        btnPedidos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnPedidos2.setContentAreaFilled(false);
        btnPedidos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos2.setDefaultCapable(false);
        btnPedidos2.setHideActionText(true);
        btnPedidos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPedidos2.setOpaque(true);
        btnPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidos2ActionPerformed(evt);
            }
        });
        painelMenu2.add(btnPedidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 250, 60));

        btnProdutos2.setBackground(new java.awt.Color(192, 192, 192));
        btnProdutos2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnProdutos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        btnProdutos2.setText(" Produtos");
        btnProdutos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnProdutos2.setContentAreaFilled(false);
        btnProdutos2.setDefaultCapable(false);
        btnProdutos2.setHideActionText(true);
        btnProdutos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProdutos2.setOpaque(true);
        btnProdutos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos2ActionPerformed(evt);
            }
        });
        painelMenu2.add(btnProdutos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 250, 60));

        btnLanches.setBackground(new java.awt.Color(192, 192, 192));
        btnLanches.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnLanches.setForeground(new java.awt.Color(56, 56, 56));
        btnLanches.setText("     Lanches");
        btnLanches.setActionCommand("   Novo Pedido");
        btnLanches.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnLanches.setContentAreaFilled(false);
        btnLanches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLanches.setDefaultCapable(false);
        btnLanches.setHideActionText(true);
        btnLanches.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLanches.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLanches.setOpaque(true);
        btnLanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanchesActionPerformed(evt);
            }
        });
        painelMenu2.add(btnLanches, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, 240, 60));

        btnIngredientes.setBackground(new java.awt.Color(211, 211, 211));
        btnIngredientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnIngredientes.setForeground(new java.awt.Color(56, 56, 56));
        btnIngredientes.setText("     Ingredientes");
        btnIngredientes.setActionCommand("   Visualizar Pedidos");
        btnIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnIngredientes.setContentAreaFilled(false);
        btnIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngredientes.setDefaultCapable(false);
        btnIngredientes.setHideActionText(true);
        btnIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngredientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIngredientes.setOpaque(true);
        btnIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngredientesActionPerformed(evt);
            }
        });
        painelMenu2.add(btnIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 240, 60));

        btnFichaTecnica.setBackground(new java.awt.Color(211, 211, 211));
        btnFichaTecnica.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnFichaTecnica.setForeground(new java.awt.Color(56, 56, 56));
        btnFichaTecnica.setText("     Ficha Técnica");
        btnFichaTecnica.setActionCommand("   Novo Pedido");
        btnFichaTecnica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnFichaTecnica.setContentAreaFilled(false);
        btnFichaTecnica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFichaTecnica.setDefaultCapable(false);
        btnFichaTecnica.setHideActionText(true);
        btnFichaTecnica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFichaTecnica.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnFichaTecnica.setOpaque(true);
        btnFichaTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFichaTecnicaActionPerformed(evt);
            }
        });
        painelMenu2.add(btnFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 455, 240, 60));

        btnCalculoPorcoes.setBackground(new java.awt.Color(211, 211, 211));
        btnCalculoPorcoes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCalculoPorcoes.setForeground(new java.awt.Color(56, 56, 56));
        btnCalculoPorcoes.setText("     Cálculo de Porções");
        btnCalculoPorcoes.setActionCommand("   Visualizar Pedidos");
        btnCalculoPorcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnCalculoPorcoes.setContentAreaFilled(false);
        btnCalculoPorcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculoPorcoes.setDefaultCapable(false);
        btnCalculoPorcoes.setHideActionText(true);
        btnCalculoPorcoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalculoPorcoes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCalculoPorcoes.setOpaque(true);
        btnCalculoPorcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoPorcoesActionPerformed(evt);
            }
        });
        painelMenu2.add(btnCalculoPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 525, 240, 60));

        btnEstoque2.setBackground(new java.awt.Color(211, 211, 211));
        btnEstoque2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEstoque2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque 1.png"))); // NOI18N
        btnEstoque2.setText(" Estoque");
        btnEstoque2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEstoque2.setContentAreaFilled(false);
        btnEstoque2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque2.setDefaultCapable(false);
        btnEstoque2.setHideActionText(true);
        btnEstoque2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque2.setOpaque(true);
        btnEstoque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoque2ActionPerformed(evt);
            }
        });
        painelMenu2.add(btnEstoque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 595, 250, 60));

        jPanel1.add(painelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1020));

        painelMenu3.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu3.setMaximumSize(new java.awt.Dimension(250, 1020));
        painelMenu3.setMinimumSize(new java.awt.Dimension(250, 1020));
        painelMenu3.setPreferredSize(new java.awt.Dimension(250, 1020));
        painelMenu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu3.add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 120));

        btnPedidos3.setBackground(new java.awt.Color(211, 211, 211));
        btnPedidos3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPedidos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrinho-de-compras.png"))); // NOI18N
        btnPedidos3.setText(" Pedidos");
        btnPedidos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnPedidos3.setContentAreaFilled(false);
        btnPedidos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos3.setDefaultCapable(false);
        btnPedidos3.setHideActionText(true);
        btnPedidos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPedidos3.setOpaque(true);
        btnPedidos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidos3ActionPerformed(evt);
            }
        });
        painelMenu3.add(btnPedidos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 250, 60));

        btnProdutos3.setBackground(new java.awt.Color(211, 211, 211));
        btnProdutos3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnProdutos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        btnProdutos3.setText(" Produtos");
        btnProdutos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnProdutos3.setContentAreaFilled(false);
        btnProdutos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos3.setDefaultCapable(false);
        btnProdutos3.setHideActionText(true);
        btnProdutos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProdutos3.setOpaque(true);
        btnProdutos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos3ActionPerformed(evt);
            }
        });
        painelMenu3.add(btnProdutos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 250, 60));

        btnEstoque3.setBackground(new java.awt.Color(192, 192, 192));
        btnEstoque3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEstoque3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque 1.png"))); // NOI18N
        btnEstoque3.setText(" Estoque");
        btnEstoque3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEstoque3.setContentAreaFilled(false);
        btnEstoque3.setDefaultCapable(false);
        btnEstoque3.setHideActionText(true);
        btnEstoque3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque3.setOpaque(true);
        btnEstoque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoque3ActionPerformed(evt);
            }
        });
        painelMenu3.add(btnEstoque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 250, 60));

        btnEntradas.setBackground(new java.awt.Color(192, 192, 192));
        btnEntradas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnEntradas.setForeground(new java.awt.Color(56, 56, 56));
        btnEntradas.setText("     Entradas");
        btnEntradas.setActionCommand("   Novo Pedido");
        btnEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEntradas.setContentAreaFilled(false);
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.setDefaultCapable(false);
        btnEntradas.setHideActionText(true);
        btnEntradas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntradas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEntradas.setOpaque(true);
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        painelMenu3.add(btnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 240, 60));

        btnProdutosEstoque.setBackground(new java.awt.Color(211, 211, 211));
        btnProdutosEstoque.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnProdutosEstoque.setForeground(new java.awt.Color(56, 56, 56));
        btnProdutosEstoque.setText("     Produtos em Estoque");
        btnProdutosEstoque.setActionCommand("   Visualizar Pedidos");
        btnProdutosEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnProdutosEstoque.setContentAreaFilled(false);
        btnProdutosEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutosEstoque.setDefaultCapable(false);
        btnProdutosEstoque.setHideActionText(true);
        btnProdutosEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProdutosEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnProdutosEstoque.setOpaque(true);
        btnProdutosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosEstoqueActionPerformed(evt);
            }
        });
        painelMenu3.add(btnProdutosEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 455, 240, 60));

        jPanel1.add(painelMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 1020));

        areaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaNovoPedido.setBackground(new java.awt.Color(255, 255, 255));
        areaNovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaNovoPedido.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaNovoPedido.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaNovoPedido.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaNovoPedido.setVisible(true);
        areaNovoPedido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNP.setBackground(new java.awt.Color(255, 255, 255));
        panelNP.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelNP.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelNP.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelNP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel3.setText("Quantidade");
        panelNP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(40, 40, 40));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        jButton1.setText("FINALIZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setRequestFocusEnabled(false);
        panelNP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        jPanel2.setBackground(new java.awt.Color(117, 166, 119));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelNP.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jLabel1.setBackground(new java.awt.Color(243, 243, 243));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jLabel1.setOpaque(true);
        panelNP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 102, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel6.setText("Ficha Técnica");
        panelNP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel7.setText("Total (R$)");
        panelNP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));
        panelNP.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 1570, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel8.setText("Lanche");
        panelNP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));

        combobox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setSelectedItem(null);
        combobox1.setLabeText("");
        panelNP.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 40));

        spinner2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        spinner2.setLabelText("");
        panelNP.add(spinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 102, 45));

        table1.fixTable(jScrollPane2);
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"aa", "a", "a", "a"},
                {"a", "a", "a", "a"},
                {"a", "aa", "a", "a"},
                {"aa", "a", "a", "a"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table1);

        panelNP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 170));

        areaNovoPedido.getContentPane().add(panelNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1050));

        areaPrincipal.add(areaNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        rodapePainel.setBackground(new java.awt.Color(255, 255, 255));

        lblCopyright.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright © 2023. Todos os direitos reservados ·Privacy·Terms");
        lblCopyright.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rodapePainelLayout = new javax.swing.GroupLayout(rodapePainel);
        rodapePainel.setLayout(rodapePainelLayout);
        rodapePainelLayout.setHorizontalGroup(
            rodapePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rodapePainelLayout.createSequentialGroup()
                .addContainerGap(1164, Short.MAX_VALUE)
                .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        rodapePainelLayout.setVerticalGroup(
            rodapePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rodapePainelLayout.createSequentialGroup()
                .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        areaPrincipal.add(rodapePainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 980, 1680, 50));

        bordaPainel.setBackground(new java.awt.Color(255, 255, 255));

        btnSair.setForeground(new java.awt.Color(34, 34, 34));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair 1.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bordaPainelLayout = new javax.swing.GroupLayout(bordaPainel);
        bordaPainel.setLayout(bordaPainelLayout);
        bordaPainelLayout.setHorizontalGroup(
            bordaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordaPainelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(26, 26, 26))
        );
        bordaPainelLayout.setVerticalGroup(
            bordaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordaPainelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSair)
                .addContainerGap(975, Short.MAX_VALUE))
        );

        areaPrincipal.add(bordaPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 0, 90, 1020));

        areaVisualizarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        areaVisualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaVisualizarPedidos.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setVisible(true);
        areaVisualizarPedidos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVP.setBackground(new java.awt.Color(255, 204, 204));
        panelVP.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelVP.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelVP.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelVP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Área Visualizar Pedidos");
        panelVP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 25, -1, -1));

        areaVisualizarPedidos.getContentPane().add(panelVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        jPanel1.add(areaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1670, 1020));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngredientesActionPerformed
        btnIngredientes.setBackground(Color.decode("#C0C0C0"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_btnIngredientesActionPerformed

    private void btnEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque2ActionPerformed
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
    }//GEN-LAST:event_btnEstoque2ActionPerformed

    private void btnLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanchesActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_btnLanchesActionPerformed

    private void btnPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidos2ActionPerformed
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
    }//GEN-LAST:event_btnPedidos2ActionPerformed

    private void btnProdutos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutos2ActionPerformed

    private void btnPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidos1ActionPerformed

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        btnNovoPedido.setBackground(Color.decode("#C0C0C0"));
        btnVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnVisualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPedidosActionPerformed
        btnVisualizarPedidos.setBackground(Color.decode("#C0C0C0"));
        btnNovoPedido.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(true);
    }//GEN-LAST:event_btnVisualizarPedidosActionPerformed

    private void btnProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos1ActionPerformed
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
    }//GEN-LAST:event_btnProdutos1ActionPerformed

    private void btnEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque1ActionPerformed
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
    }//GEN-LAST:event_btnEstoque1ActionPerformed

    private void btnFichaTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaTecnicaActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#C0C0C0"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_btnFichaTecnicaActionPerformed

    private void btnCalculoPorcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoPorcoesActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#C0C0C0"));
        btnLanches.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_btnCalculoPorcoesActionPerformed

    private void btnPedidos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidos3ActionPerformed
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
    }//GEN-LAST:event_btnPedidos3ActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        btnProdutosEstoque.setBackground(Color.decode("#D3D3D3"));
        btnEntradas.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnProdutosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosEstoqueActionPerformed
        btnProdutosEstoque.setBackground(Color.decode("#C0C0C0"));
        btnEntradas.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_btnProdutosEstoqueActionPerformed

    private void btnProdutos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos3ActionPerformed
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
    }//GEN-LAST:event_btnProdutos3ActionPerformed

    private void btnEstoque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoque3ActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

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
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaNovoPedido;
    private javax.swing.JDesktopPane areaPrincipal;
    private javax.swing.JInternalFrame areaVisualizarPedidos;
    private javax.swing.JPanel bordaPainel;
    private javax.swing.JButton btnCalculoPorcoes;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnEstoque1;
    private javax.swing.JButton btnEstoque2;
    private javax.swing.JButton btnEstoque3;
    private javax.swing.JButton btnFichaTecnica;
    private javax.swing.JButton btnIngredientes;
    private javax.swing.JButton btnLanches;
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JButton btnPedidos1;
    private javax.swing.JButton btnPedidos2;
    private javax.swing.JButton btnPedidos3;
    private javax.swing.JButton btnProdutos1;
    private javax.swing.JButton btnProdutos2;
    private javax.swing.JButton btnProdutos3;
    private javax.swing.JButton btnProdutosEstoque;
    private javax.swing.JLabel btnSair;
    private javax.swing.JButton btnVisualizarPedidos;
    private combobox.Combobox combobox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JPanel painelMenu1;
    private javax.swing.JPanel painelMenu2;
    private javax.swing.JPanel painelMenu3;
    private javax.swing.JPanel panelNP;
    private javax.swing.JPanel panelVP;
    private javax.swing.JPanel rodapePainel;
    private spinner.Spinner spinner2;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
