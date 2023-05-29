package views;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;



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
        rodapePainel = new javax.swing.JPanel();
        lblCopyright = new javax.swing.JLabel();
        bordaPainel = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        areaNovoPedido = new javax.swing.JInternalFrame();
        panelNP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        colorBtn1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        combobox1 = new combobox.Combobox();
        spinner2 = new spinner.Spinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        fotoVP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        areaVisualizarPedidos = new javax.swing.JInternalFrame();
        panelVP = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javaswingdev.swing.table.Table();
        jButton2 = new javax.swing.JButton();
        areaLanche = new javax.swing.JInternalFrame();
        panelLanche = new javax.swing.JPanel();
        fotoVP1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        colorBtn4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        colorBtn5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        colorBtn6 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        table3 = new javaswingdev.swing.table.Table();
        areaIngredientes = new javax.swing.JInternalFrame();
        panelIngredientes = new javax.swing.JPanel();
        fotoVP2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        colorBtn7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        colorBtn8 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        colorBtn9 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        table4 = new javaswingdev.swing.table.Table();
        areaFichaTecnica = new javax.swing.JInternalFrame();
        panelIngredientes1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        colorBtn19 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        colorBtn20 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        colorBtn21 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        table8 = new javaswingdev.swing.table.Table();
        areaCalculoPorcoes = new javax.swing.JInternalFrame();
        panelPE1 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        colorBtn18 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField21 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        colorBtn22 = new javax.swing.JPanel();
        areaEntradas = new javax.swing.JInternalFrame();
        panelEntradas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        colorBtn15 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        colorBtn16 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        colorBtn17 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        table6 = new javaswingdev.swing.table.Table();
        jTextField16 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        areaProdutoEstoque = new javax.swing.JInternalFrame();
        panelPE = new javax.swing.JPanel();
        fotoVP3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        table5 = new javaswingdev.swing.table.Table();
        jTextField12 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

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
        panelNP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(109, 109, 109));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        jButton1.setText("FINALIZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setRequestFocusEnabled(false);
        panelNP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn1.setBackground(new java.awt.Color(117, 166, 119));

        javax.swing.GroupLayout colorBtn1Layout = new javax.swing.GroupLayout(colorBtn1);
        colorBtn1.setLayout(colorBtn1Layout);
        colorBtn1Layout.setHorizontalGroup(
            colorBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn1Layout.setVerticalGroup(
            colorBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelNP.add(colorBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel6.setText("Ficha Técnica");
        panelNP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel7.setText("Total (R$)");
        panelNP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));
        panelNP.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel8.setText("Lanche");
        panelNP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        combobox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setSelectedItem(null);
        combobox1.setLabeText("");
        panelNP.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 40));

        spinner2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        spinner2.setLabelText("");
        panelNP.add(spinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 102, 45));

        table1.fixTable(jScrollPane2);
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"pao de hamburguer", "1", "un"},
                {"hamburguer", "1", "un"},
                {"ovo", "1", "un"},
                {"queijo fatiado", "0,01", "kg"}
            },
            new String [] {
                "Ingrediente", "Qnt", "Und. Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setShowGrid(true);
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
        }

        panelNP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 610, 450));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FOTO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVPLayout = new javax.swing.GroupLayout(fotoVP);
        fotoVP.setLayout(fotoVPLayout);
        fotoVPLayout.setHorizontalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVPLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        fotoVPLayout.setVerticalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVPLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panelNP.add(fotoVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 213, 213));

        jTextField1.setBackground(new java.awt.Color(243, 243, 243));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField1.setName(""); // NOI18N
        jTextField1.setEditable(false);
        jTextField1.setOpaque(true);
        panelNP.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 102, 45));

        areaNovoPedido.getContentPane().add(panelNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1050));

        areaPrincipal.add(areaNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaVisualizarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        areaVisualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaVisualizarPedidos.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaVisualizarPedidos.setVisible(true);
        areaVisualizarPedidos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVP.setBackground(new java.awt.Color(255, 255, 255));
        panelVP.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelVP.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelVP.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelVP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel9.setText("Total Vendas (R$)");
        panelVP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField2.setName(""); // NOI18N
        panelVP.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));
        panelVP.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel11.setText("Data");
        panelVP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jLabel1.setBackground(new java.awt.Color(103, 103, 103));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel1.setOpaque(true);
        panelVP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(243, 243, 243));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField3.setName(""); // NOI18N
        jTextField3.setOpaque(true);
        panelVP.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        table1.fixTable(jScrollPane3);
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "hamburguer", "1", "5,60", "12,00", "12,00", "01/02/2023"},
                {"1", "hamburguer", "1", "5,60", "12,00", "12,00", "01/02/2023"},
                {"1", "hamburguer", "2", "5,60", "12,00", "24,00", "01/02/2023"},
                {"2", "x-buguer duplo", "1", "8,69", "16,00", "16,00", "01/02/2023"}
            },
            new String [] {
                "id lanche", "Lanche", "Qnt", "Custo Unt.", "Valor Unt.", "Valor Total Venda", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setShowGrid(true);
        jScrollPane3.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(3).setResizable(false);
            table2.getColumnModel().getColumn(4).setResizable(false);
            table2.getColumnModel().getColumn(5).setResizable(false);
            table2.getColumnModel().getColumn(6).setResizable(false);
        }

        panelVP.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        jButton2.setText("OK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelVP.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        areaVisualizarPedidos.getContentPane().add(panelVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaLanche.setBackground(new java.awt.Color(255, 255, 255));
        areaLanche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaLanche.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaLanche.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaLanche.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaLanche.setVisible(true);
        areaLanche.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLanche.setBackground(new java.awt.Color(255, 255, 255));
        panelLanche.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FOTO");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP1Layout = new javax.swing.GroupLayout(fotoVP1);
        fotoVP1.setLayout(fotoVP1Layout);
        fotoVP1Layout.setHorizontalGroup(
            fotoVP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP1Layout.setVerticalGroup(
            fotoVP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelLanche.add(fotoVP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 240, 240));

        jLabel4.setBackground(new java.awt.Color(103, 103, 103));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel4.setOpaque(true);
        panelLanche.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField4.setName(""); // NOI18N
        panelLanche.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jButton3.setText("OK");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLanche.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel13.setText("id");
        panelLanche.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(243, 243, 243));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField5.setName(""); // NOI18N
        jTextField5.setOpaque(true);
        panelLanche.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 188, 45));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel14.setText("Produto/Lanche");
        panelLanche.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel15.setText("Preço de venda (R$)");
        panelLanche.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(243, 243, 243));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField6.setName(""); // NOI18N
        jTextField6.setOpaque(true);
        panelLanche.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 45));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(109, 109, 109));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton4.setText("NOVO");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(5);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelLanche.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn4.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn4Layout = new javax.swing.GroupLayout(colorBtn4);
        colorBtn4.setLayout(colorBtn4Layout);
        colorBtn4Layout.setHorizontalGroup(
            colorBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn4Layout.setVerticalGroup(
            colorBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(109, 109, 109));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton5.setText("EDITAR");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(5);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelLanche.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 100, 129, 40));

        colorBtn5.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn5Layout = new javax.swing.GroupLayout(colorBtn5);
        colorBtn5.setLayout(colorBtn5Layout);
        colorBtn5Layout.setHorizontalGroup(
            colorBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn5Layout.setVerticalGroup(
            colorBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 100, 10, 40));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(109, 109, 109));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jButton6.setText("EXCLUIR");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setIconTextGap(5);
        jButton6.setRequestFocusEnabled(false);
        panelLanche.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 129, 40));

        colorBtn6.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn6Layout = new javax.swing.GroupLayout(colorBtn6);
        colorBtn6.setLayout(colorBtn6Layout);
        colorBtn6Layout.setHorizontalGroup(
            colorBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn6Layout.setVerticalGroup(
            colorBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 150, 10, 40));
        panelLanche.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        table1.fixTable(jScrollPane4);
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "hamburguer", "11,00", "..."},
                {"2", "x-burguer duplo", "16,00", "..."}
            },
            new String [] {
                "id ", "Lanche", "Preço Venda", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setShowGrid(true);
        jScrollPane4.setViewportView(table3);
        if (table3.getColumnModel().getColumnCount() > 0) {
            table3.getColumnModel().getColumn(0).setResizable(false);
            table3.getColumnModel().getColumn(0).setHeaderValue("id_AI");
            table3.getColumnModel().getColumn(1).setResizable(false);
            table3.getColumnModel().getColumn(2).setResizable(false);
            table3.getColumnModel().getColumn(3).setResizable(false);
        }

        panelLanche.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        areaLanche.getContentPane().add(panelLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        areaIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaIngredientes.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaIngredientes.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaIngredientes.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaIngredientes.setVisible(true);
        areaIngredientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        panelIngredientes.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("FOTO");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP2Layout = new javax.swing.GroupLayout(fotoVP2);
        fotoVP2.setLayout(fotoVP2Layout);
        fotoVP2Layout.setHorizontalGroup(
            fotoVP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP2Layout.setVerticalGroup(
            fotoVP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelIngredientes.add(fotoVP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 240, 240));

        jLabel10.setBackground(new java.awt.Color(103, 103, 103));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel10.setOpaque(true);
        panelIngredientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField7.setName(""); // NOI18N
        panelIngredientes.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jButton7.setText("OK");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIngredientes.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel17.setText("id");
        panelIngredientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(243, 243, 243));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField8.setName(""); // NOI18N
        jTextField8.setOpaque(true);
        panelIngredientes.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel18.setText("Ingrediente");
        panelIngredientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(109, 109, 109));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton8.setText("NOVO");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.setIconTextGap(5);
        jButton8.setRequestFocusEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelIngredientes.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn7.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn7Layout = new javax.swing.GroupLayout(colorBtn7);
        colorBtn7.setLayout(colorBtn7Layout);
        colorBtn7Layout.setHorizontalGroup(
            colorBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn7Layout.setVerticalGroup(
            colorBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(109, 109, 109));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton9.setText("EDITAR");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton9.setIconTextGap(5);
        jButton9.setRequestFocusEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelIngredientes.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 100, 129, 40));

        colorBtn8.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn8Layout = new javax.swing.GroupLayout(colorBtn8);
        colorBtn8.setLayout(colorBtn8Layout);
        colorBtn8Layout.setHorizontalGroup(
            colorBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn8Layout.setVerticalGroup(
            colorBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 100, 10, 40));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(109, 109, 109));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jButton10.setText("EXCLUIR");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton10.setIconTextGap(5);
        jButton10.setRequestFocusEnabled(false);
        panelIngredientes.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 129, 40));

        colorBtn9.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn9Layout = new javax.swing.GroupLayout(colorBtn9);
        colorBtn9.setLayout(colorBtn9Layout);
        colorBtn9Layout.setHorizontalGroup(
            colorBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn9Layout.setVerticalGroup(
            colorBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 150, 10, 40));
        panelIngredientes.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        table1.fixTable(jScrollPane5);
        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "pao de hamburguer", "20", "1", "un", "1,00"},
                {"2", "hamburguer", "20", "1", "un", "1,52"},
                {"3", "ovo", "20", "1", "un", "0,83"},
                {"4", "queijo fatiado", "0,2", "0,01", "kg", "0,38"},
                {"5", "bacon fatiado", "0,2", "0,01", "kg", "0,36"},
                {"6", "alface", "0,6", "0,03", "pes", "0,18"},
                {"7", "batata palha", "0,2", "0,01", "kg", "0,28"},
                {"8", "embalagens p/ hamburguer", "20", "10", "un", "1,05"}
            },
            new String [] {
                "id ", "Ingrediente", "Qnt. Minima", "Qnt. Unt", "Und. Medida", "Custo Unt."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table4.setShowGrid(true);
        jScrollPane5.setViewportView(table4);
        if (table4.getColumnModel().getColumnCount() > 0) {
            table4.getColumnModel().getColumn(0).setResizable(false);
            table4.getColumnModel().getColumn(1).setResizable(false);
            table4.getColumnModel().getColumn(1).setHeaderValue("Ingrediente");
            table4.getColumnModel().getColumn(2).setResizable(false);
            table4.getColumnModel().getColumn(2).setHeaderValue("Qnt. Minima");
            table4.getColumnModel().getColumn(3).setResizable(false);
            table4.getColumnModel().getColumn(3).setHeaderValue("Qnt. Unt");
            table4.getColumnModel().getColumn(4).setResizable(false);
            table4.getColumnModel().getColumn(4).setHeaderValue("Und. Medida");
            table4.getColumnModel().getColumn(5).setResizable(false);
            table4.getColumnModel().getColumn(5).setHeaderValue("Custo Unt.");
        }

        panelIngredientes.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        areaIngredientes.getContentPane().add(panelIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaFichaTecnica.setBackground(new java.awt.Color(255, 255, 255));
        areaFichaTecnica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaFichaTecnica.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaFichaTecnica.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaFichaTecnica.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaFichaTecnica.setVisible(true);
        areaFichaTecnica.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngredientes1.setBackground(new java.awt.Color(255, 255, 255));
        panelIngredientes1.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes1.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes1.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelIngredientes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(103, 103, 103));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel35.setOpaque(true);
        panelIngredientes1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField19.setName(""); // NOI18N
        panelIngredientes1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jButton23.setText("OK");
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIngredientes1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("id");
        panelIngredientes1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(243, 243, 243));
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField20.setName(""); // NOI18N
        jTextField20.setOpaque(true);
        panelIngredientes1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel37.setText("Lanche");
        panelIngredientes1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(109, 109, 109));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton24.setText("NOVO");
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton24.setIconTextGap(5);
        jButton24.setRequestFocusEnabled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        panelIngredientes1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn19.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn19Layout = new javax.swing.GroupLayout(colorBtn19);
        colorBtn19.setLayout(colorBtn19Layout);
        colorBtn19Layout.setHorizontalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn19Layout.setVerticalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(109, 109, 109));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton25.setText("EDITAR");
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton25.setIconTextGap(5);
        jButton25.setRequestFocusEnabled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        panelIngredientes1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 100, 129, 40));

        colorBtn20.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn20Layout = new javax.swing.GroupLayout(colorBtn20);
        colorBtn20.setLayout(colorBtn20Layout);
        colorBtn20Layout.setHorizontalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn20Layout.setVerticalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 100, 10, 40));

        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(109, 109, 109));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jButton26.setText("EXCLUIR");
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton26.setIconTextGap(5);
        jButton26.setRequestFocusEnabled(false);
        panelIngredientes1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 129, 40));

        colorBtn21.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn21Layout = new javax.swing.GroupLayout(colorBtn21);
        colorBtn21.setLayout(colorBtn21Layout);
        colorBtn21Layout.setHorizontalGroup(
            colorBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn21Layout.setVerticalGroup(
            colorBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 150, 10, 40));
        panelIngredientes1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        table1.fixTable(jScrollPane9);
        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "hamburguer", "pao de hamburguer", "1", "un", "1,00"},
                {"1", "hamburguer", "hamburguer", "1", "un", "1,52"},
                {"1", "hamburguer", "ovo", "1", "un", "0,83"},
                {"1", "hamburguer", "queijo fatiado", "0,01", "kg", "0,38"},
                {"1", "hamburguer", "bacon fatiado", "0,01", "kg", "0,36"},
                {"1", "hamburguer", "alface", "0,03", "pes", "0,18"},
                {"1", "hamburguer", "batata palha", "0,01", "kg", "0,28"},
                {"1", "hamburguer", "embalagens p/ hamburguer", "1", "un", "1,05"},
                {"2", "x-burguer duplo", "pao de hamburguer", "1", "un", "1,00"},
                {"2", "x-burguer duplo", "hambuguer", "2", "un", "3,04"},
                {"2", "x-burguer duplo", "ovo", "2", "un", "1,67"},
                {"2", "x-burguer duplo", "queijo fatiado", "0,02", "kg", "0,77"},
                {"2", "x-burguer duplo", "bacon fatiado", "0,02", "kg", "0,71"},
                {"2", "x-burguer duplo", "alface", "0,03", "pes", "0,18"},
                {"2", "x-burguer duplo", "batata palha", "0,01", "kg", "0,28"},
                {"2", "x-burguer duplo", "embalagens p/ hamburguer", "1", "un", "1,05"}
            },
            new String [] {
                "id_lanche", "Lanche", "Ingrediente", "Qnt.", "Und. medida", "Custo qnt."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table8.setShowGrid(true);
        jScrollPane9.setViewportView(table8);
        if (table8.getColumnModel().getColumnCount() > 0) {
            table8.getColumnModel().getColumn(0).setResizable(false);
            table8.getColumnModel().getColumn(1).setResizable(false);
            table8.getColumnModel().getColumn(2).setResizable(false);
            table8.getColumnModel().getColumn(3).setResizable(false);
            table8.getColumnModel().getColumn(4).setResizable(false);
            table8.getColumnModel().getColumn(5).setResizable(false);
        }

        panelIngredientes1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        areaFichaTecnica.getContentPane().add(panelIngredientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaCalculoPorcoes.setBackground(new java.awt.Color(255, 255, 255));
        areaCalculoPorcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaCalculoPorcoes.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaCalculoPorcoes.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaCalculoPorcoes.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaCalculoPorcoes.setVisible(true);
        areaCalculoPorcoes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPE1.setBackground(new java.awt.Color(255, 255, 255));
        panelPE1.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField17.setName(""); // NOI18N
        panelPE1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 100, 45));

        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField22.setName(""); // NOI18N
        panelPE1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, 45));

        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField23.setName(""); // NOI18N
        panelPE1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 100, 45));

        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField24.setName(""); // NOI18N
        panelPE1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 100, 45));

        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField25.setName(""); // NOI18N
        panelPE1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 365, 320, 45));

        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField26.setName(""); // NOI18N
        panelPE1.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 365, 100, 45));

        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField27.setName(""); // NOI18N
        panelPE1.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 365, 100, 45));

        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField28.setName(""); // NOI18N
        panelPE1.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 365, 100, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Produto/lanche");
        panelPE1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Qnt.");
        panelPE1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 100, 30));

        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField18.setName(""); // NOI18N
        panelPE1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 45));

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(109, 109, 109));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar.png"))); // NOI18N
        jButton20.setText("LIMPAR");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton20.setIconTextGap(5);
        jButton20.setRequestFocusEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        panelPE1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 100, 129, 40));

        colorBtn18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout colorBtn18Layout = new javax.swing.GroupLayout(colorBtn18);
        colorBtn18.setLayout(colorBtn18Layout);
        colorBtn18Layout.setHorizontalGroup(
            colorBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn18Layout.setVerticalGroup(
            colorBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPE1.add(colorBtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 100, 10, 40));
        panelPE1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1570, 30));

        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField21.setName(""); // NOI18N
        panelPE1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 240, 45));

        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField29.setName(""); // NOI18N
        panelPE1.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 320, 45));

        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField30.setName(""); // NOI18N
        panelPE1.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 100, 45));

        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField31.setName(""); // NOI18N
        panelPE1.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 100, 45));

        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField32.setName(""); // NOI18N
        panelPE1.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 100, 45));

        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField33.setName(""); // NOI18N
        panelPE1.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 475, 320, 45));

        jTextField34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField34.setName(""); // NOI18N
        panelPE1.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 475, 100, 45));

        jTextField35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField35.setName(""); // NOI18N
        panelPE1.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 475, 100, 45));

        jTextField36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField36.setName(""); // NOI18N
        panelPE1.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 475, 100, 45));

        jTextField37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField37.setName(""); // NOI18N
        panelPE1.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 320, 45));

        jTextField38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField38.setName(""); // NOI18N
        panelPE1.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 100, 45));

        jTextField39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField39.setName(""); // NOI18N
        panelPE1.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 100, 45));

        jTextField40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField40.setName(""); // NOI18N
        panelPE1.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 585, 320, 45));

        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField41.setName(""); // NOI18N
        panelPE1.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 585, 100, 45));

        jTextField42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField42.setName(""); // NOI18N
        panelPE1.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 585, 100, 45));

        jTextField43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField43.setName(""); // NOI18N
        panelPE1.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 585, 100, 45));

        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField44.setName(""); // NOI18N
        panelPE1.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 100, 45));

        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField45.setName(""); // NOI18N
        panelPE1.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 100, 45));

        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField46.setName(""); // NOI18N
        panelPE1.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 100, 45));

        jTextField47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField47.setName(""); // NOI18N
        panelPE1.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 100, 45));

        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField48.setName(""); // NOI18N
        panelPE1.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 320, 45));

        jTextField49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField49.setName(""); // NOI18N
        panelPE1.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 695, 320, 45));

        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField50.setName(""); // NOI18N
        panelPE1.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 695, 100, 45));

        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField51.setName(""); // NOI18N
        panelPE1.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 695, 100, 45));

        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField52.setName(""); // NOI18N
        panelPE1.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 695, 100, 45));

        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField53.setName(""); // NOI18N
        panelPE1.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 320, 45));

        jTextField54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField54.setName(""); // NOI18N
        panelPE1.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 750, 100, 45));

        jTextField55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField55.setName(""); // NOI18N
        panelPE1.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 750, 100, 45));

        jTextField56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField56.setName(""); // NOI18N
        panelPE1.add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 750, 100, 45));

        jTextField57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField57.setName(""); // NOI18N
        panelPE1.add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 805, 320, 45));

        jTextField58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField58.setName(""); // NOI18N
        panelPE1.add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 805, 100, 45));

        jTextField59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField59.setName(""); // NOI18N
        panelPE1.add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 805, 100, 45));

        jTextField60.setEditable(false);
        jTextField60.setBackground(new java.awt.Color(243, 243, 243));
        jTextField60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField60.setName(""); // NOI18N
        jTextField60.setOpaque(true);
        panelPE1.add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 870, 210, 45));

        jTextField61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField61.setName(""); // NOI18N
        panelPE1.add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 805, 100, 45));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Custo Total de Produção (R$):");
        panelPE1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 870, 210, 45));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel38.setText("Itens");
        panelPE1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel39.setText("Und. Medida");
        panelPE1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 100, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel40.setText("Custo (R$)");
        panelPE1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 100, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel41.setText("Qnt. de porções");
        panelPE1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 30));

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(109, 109, 109));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculadora.png"))); // NOI18N
        jButton21.setText("CALCULAR");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton21.setIconTextGap(5);
        jButton21.setRequestFocusEnabled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        panelPE1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn22.setBackground(new java.awt.Color(67, 0, 153));

        javax.swing.GroupLayout colorBtn22Layout = new javax.swing.GroupLayout(colorBtn22);
        colorBtn22.setLayout(colorBtn22Layout);
        colorBtn22Layout.setHorizontalGroup(
            colorBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn22Layout.setVerticalGroup(
            colorBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPE1.add(colorBtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        areaCalculoPorcoes.getContentPane().add(panelPE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaCalculoPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaEntradas.setBackground(new java.awt.Color(255, 255, 255));
        areaEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaEntradas.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaEntradas.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaEntradas.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaEntradas.setVisible(true);
        areaEntradas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEntradas.setBackground(new java.awt.Color(255, 255, 255));
        panelEntradas.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelEntradas.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelEntradas.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelEntradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(103, 103, 103));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel26.setOpaque(true);
        panelEntradas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField13.setName(""); // NOI18N
        panelEntradas.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jButton15.setText("OK");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEntradas.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 50, 47, 45));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel27.setText("id");
        panelEntradas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(243, 243, 243));
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField14.setName(""); // NOI18N
        jTextField14.setOpaque(true);
        panelEntradas.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 350, 45));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel28.setText("Ingrediente");
        panelEntradas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(109, 109, 109));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton16.setText("NOVO");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton16.setIconTextGap(5);
        jButton16.setRequestFocusEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        panelEntradas.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 50, 129, 40));

        colorBtn15.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn15Layout = new javax.swing.GroupLayout(colorBtn15);
        colorBtn15.setLayout(colorBtn15Layout);
        colorBtn15Layout.setHorizontalGroup(
            colorBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn15Layout.setVerticalGroup(
            colorBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 50, 10, 40));

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(109, 109, 109));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton17.setText("EDITAR");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton17.setIconTextGap(5);
        jButton17.setRequestFocusEnabled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        panelEntradas.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 100, 129, 40));

        colorBtn16.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn16Layout = new javax.swing.GroupLayout(colorBtn16);
        colorBtn16.setLayout(colorBtn16Layout);
        colorBtn16Layout.setHorizontalGroup(
            colorBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn16Layout.setVerticalGroup(
            colorBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 100, 10, 40));

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(109, 109, 109));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jButton18.setText("EXCLUIR");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton18.setIconTextGap(5);
        jButton18.setRequestFocusEnabled(false);
        panelEntradas.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 150, 129, 40));

        colorBtn17.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn17Layout = new javax.swing.GroupLayout(colorBtn17);
        colorBtn17.setLayout(colorBtn17Layout);
        colorBtn17Layout.setHorizontalGroup(
            colorBtn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn17Layout.setVerticalGroup(
            colorBtn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 150, 10, 40));
        panelEntradas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        table1.fixTable(jScrollPane7);
        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "pao de hamburguer", "100", "un", "99,80", "01/05/2023"},
                {"2", "hamburguer", "100", "un", "152,00", "01/05/2023"},
                {"3", "ovo", "100", "un", "83,33", "01/05/2023"},
                {"4", "queijo fatiado", "1", "kg", "38,40", "01/05/2023"},
                {"5", "bacon fatiado", "1", "kg", "35,67", "01/05/2023"},
                {"6", "alface", "3", "pes", "17,97", "01/05/2023"},
                {"7", "batata palha", "1", "kg", "27,70", "01/05/2023"},
                {"8", "embalagens p/ hamburguer", "100", "un", "104,65", "01/05/2023"},
                {"1", "pao de hamburguer", "250", "un", "99,80", "01/05/2023"}
            },
            new String [] {
                "id_ingrediente", "Ingrediente", "Quantidade", "Und. medida", "Custo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table6.setShowGrid(true);
        jScrollPane7.setViewportView(table6);
        if (table6.getColumnModel().getColumnCount() > 0) {
            table6.getColumnModel().getColumn(0).setResizable(false);
            table6.getColumnModel().getColumn(1).setResizable(false);
            table6.getColumnModel().getColumn(2).setResizable(false);
            table6.getColumnModel().getColumn(3).setResizable(false);
            table6.getColumnModel().getColumn(4).setResizable(false);
            table6.getColumnModel().getColumn(5).setResizable(false);
        }

        panelEntradas.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(243, 243, 243));
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField16.setName(""); // NOI18N
        jTextField16.setOpaque(true);
        panelEntradas.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, 45));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel30.setText("Und. medida");
        panelEntradas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 30));

        areaEntradas.getContentPane().add(panelEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

        areaProdutoEstoque.setBackground(new java.awt.Color(255, 255, 255));
        areaProdutoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaProdutoEstoque.setMaximumSize(new java.awt.Dimension(1702, 1070));
        areaProdutoEstoque.setMinimumSize(new java.awt.Dimension(1702, 1070));
        areaProdutoEstoque.setPreferredSize(new java.awt.Dimension(1702, 1070));
        areaProdutoEstoque.setVisible(true);
        areaProdutoEstoque.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPE.setBackground(new java.awt.Color(255, 255, 255));
        panelPE.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelPE.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelPE.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelPE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FOTO");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP3Layout = new javax.swing.GroupLayout(fotoVP3);
        fotoVP3.setLayout(fotoVP3Layout);
        fotoVP3Layout.setHorizontalGroup(
            fotoVP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP3Layout.setVerticalGroup(
            fotoVP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelPE.add(fotoVP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 240, 240));

        jLabel20.setBackground(new java.awt.Color(103, 103, 103));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel20.setOpaque(true);
        panelPE.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField9.setName(""); // NOI18N
        panelPE.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 45));

        jButton11.setText("OK");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPE.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 50, 47, 45));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel21.setText("Pesquisar");
        panelPE.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(243, 243, 243));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField10.setName(""); // NOI18N
        jTextField10.setOpaque(true);
        panelPE.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 350, 45));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel22.setText("Ingrediente");
        panelPE.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel23.setText("Estoque mínimo");
        panelPE.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 30));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(243, 243, 243));
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField11.setName(""); // NOI18N
        jTextField11.setOpaque(true);
        panelPE.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 45));
        panelPE.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        table1.fixTable(jScrollPane6);
        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "pao de hamburguer", "350", "20", "un", "Estoque estável"},
                {"2", "2", "hamburguer", "100", "20", "un", "Estoque estável"},
                {"3", "3", "ovo", "100", "20", "un", "Estoque estável"},
                {"4", "4", "queijo fatiado", "1", "0,2", "kg", "Estoque estável"},
                {"5", "5", "bacon fatiado", "1", "0,2", "kg", "Estoque estável"},
                {"6", "6", "alface", "3", "0,6", "pes", "Estoque estável"},
                {"7", "7", "batata palha", "1", "0,2", "kg", "Estoque estável"},
                {"8", "8", "embalagens p/ hamburguer", "100", "20", "un", "Estoque estável"}
            },
            new String [] {
                "id_AI", "id_ingrediente", "Ingrediente", "Total estoque", "Estoque min.", "Und. medida", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table5.setShowGrid(true);
        jScrollPane6.setViewportView(table5);
        if (table5.getColumnModel().getColumnCount() > 0) {
            table5.getColumnModel().getColumn(0).setResizable(false);
            table5.getColumnModel().getColumn(0).setHeaderValue("id_AI");
            table5.getColumnModel().getColumn(1).setResizable(false);
            table5.getColumnModel().getColumn(2).setResizable(false);
            table5.getColumnModel().getColumn(3).setResizable(false);
            table5.getColumnModel().getColumn(4).setResizable(false);
            table5.getColumnModel().getColumn(4).setHeaderValue("Estoque min.");
            table5.getColumnModel().getColumn(5).setResizable(false);
            table5.getColumnModel().getColumn(6).setResizable(false);
            table5.getColumnModel().getColumn(6).setHeaderValue("Status");
        }

        panelPE.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1160, 450));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(243, 243, 243));
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField12.setName(""); // NOI18N
        jTextField12.setOpaque(true);
        panelPE.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 45));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel24.setText("Und. medida");
        panelPE.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 140, 30));

        areaProdutoEstoque.getContentPane().add(panelPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 1000));

        areaPrincipal.add(areaProdutoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1610, 1025));

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
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(true);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnIngredientesActionPerformed

    private void btnEstoque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque2ActionPerformed
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
        
        btnEntradas.setBackground(Color.decode("#C0C0C0"));
        btnProdutosEstoque.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnEstoque2ActionPerformed

    private void btnLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanchesActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#C0C0C0"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnLanchesActionPerformed

    private void btnPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidos2ActionPerformed
        btnNovoPedido.setBackground(Color.decode("#C0C0C0"));
        btnVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));
        
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);

        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
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
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnVisualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPedidosActionPerformed
        btnVisualizarPedidos.setBackground(Color.decode("#C0C0C0"));
        btnNovoPedido.setBackground(Color.decode("#D3D3D3"));
        
        btnNovoPedido.setIcon(null);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(true);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnVisualizarPedidosActionPerformed

    private void btnProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos1ActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#C0C0C0"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
        

    }//GEN-LAST:event_btnProdutos1ActionPerformed

    private void btnEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque1ActionPerformed
        btnEntradas.setBackground(Color.decode("#C0C0C0"));
        btnProdutosEstoque.setBackground(Color.decode("#D3D3D3"));

        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnEstoque1ActionPerformed

    private void btnFichaTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFichaTecnicaActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#C0C0C0"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(true);
        areaCalculoPorcoes.setVisible(false);

    }//GEN-LAST:event_btnFichaTecnicaActionPerformed

    private void btnCalculoPorcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoPorcoesActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#C0C0C0"));
        btnLanches.setBackground(Color.decode("#D3D3D3"));
        
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(true);
        
    }//GEN-LAST:event_btnCalculoPorcoesActionPerformed

    private void btnPedidos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidos3ActionPerformed
        btnNovoPedido.setBackground(Color.decode("#C0C0C0"));
        btnVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));
        
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnPedidos3ActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        btnProdutosEstoque.setBackground(Color.decode("#D3D3D3"));
        btnEntradas.setBackground(Color.decode("#C0C0C0"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnProdutosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosEstoqueActionPerformed
        btnProdutosEstoque.setBackground(Color.decode("#C0C0C0"));
        btnEntradas.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(true);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
        
    }//GEN-LAST:event_btnProdutosEstoqueActionPerformed

    private void btnProdutos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos3ActionPerformed
        btnIngredientes.setBackground(Color.decode("#D3D3D3"));
        btnFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        btnCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        btnLanches.setBackground(Color.decode("#C0C0C0"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
        

        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnProdutos3ActionPerformed

    private void btnEstoque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoque3ActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new LanchesCadastro().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new LanchesEditar().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new IngredientesCadastro().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new IngredientesEditar().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        new FichaEntrada().setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        new FichaEditar().setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        new PorcoesCalcular().setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        new EstoqueEntrada().setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        new EstoqueEditar().setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

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
    private javax.swing.JInternalFrame areaCalculoPorcoes;
    private javax.swing.JInternalFrame areaEntradas;
    private javax.swing.JInternalFrame areaFichaTecnica;
    private javax.swing.JInternalFrame areaIngredientes;
    private javax.swing.JInternalFrame areaLanche;
    private javax.swing.JInternalFrame areaNovoPedido;
    private javax.swing.JDesktopPane areaPrincipal;
    private javax.swing.JInternalFrame areaProdutoEstoque;
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
    private javax.swing.JPanel colorBtn1;
    private javax.swing.JPanel colorBtn15;
    private javax.swing.JPanel colorBtn16;
    private javax.swing.JPanel colorBtn17;
    private javax.swing.JPanel colorBtn18;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private javax.swing.JPanel colorBtn21;
    private javax.swing.JPanel colorBtn22;
    private javax.swing.JPanel colorBtn4;
    private javax.swing.JPanel colorBtn5;
    private javax.swing.JPanel colorBtn6;
    private javax.swing.JPanel colorBtn7;
    private javax.swing.JPanel colorBtn8;
    private javax.swing.JPanel colorBtn9;
    private combobox.Combobox combobox1;
    private javax.swing.JPanel fotoVP;
    private javax.swing.JPanel fotoVP1;
    private javax.swing.JPanel fotoVP2;
    private javax.swing.JPanel fotoVP3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JPanel painelMenu1;
    private javax.swing.JPanel painelMenu2;
    private javax.swing.JPanel painelMenu3;
    private javax.swing.JPanel panelEntradas;
    private javax.swing.JPanel panelIngredientes;
    private javax.swing.JPanel panelIngredientes1;
    private javax.swing.JPanel panelLanche;
    private javax.swing.JPanel panelNP;
    private javax.swing.JPanel panelPE;
    private javax.swing.JPanel panelPE1;
    private javax.swing.JPanel panelVP;
    private javax.swing.JPanel rodapePainel;
    private spinner.Spinner spinner2;
    private javaswingdev.swing.table.Table table1;
    private javaswingdev.swing.table.Table table2;
    private javaswingdev.swing.table.Table table3;
    private javaswingdev.swing.table.Table table4;
    private javaswingdev.swing.table.Table table5;
    private javaswingdev.swing.table.Table table6;
    private javaswingdev.swing.table.Table table8;
    // End of variables declaration//GEN-END:variables
}
