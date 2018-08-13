package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.Gerenciador;
import tipo.TipoCargo;

public class CadastroFormPanel extends javax.swing.JPanel {

	// Variables declaration - do not modify
	private javax.swing.JButton alunosButton;
	private javax.swing.JLabel anosLabel;
	private javax.swing.JButton cadastroButton;
	private javax.swing.JButton funcionariosButton;
	private javax.swing.JButton homeButton;
	private javax.swing.JLabel idadeLabel;
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JPanel menuPanel;
	private javax.swing.JPanel rightPanel;
	private javax.swing.JButton sairButton;
	private javax.swing.JSeparator semapadorMenu;
	private javax.swing.JSeparator separadorRight;
	private javax.swing.JLabel tituloMenu;
	private javax.swing.JLabel tituloRight;
	// End of variables declaration
	private Gerenciador gerenciador;
	private TipoCargo cargo;

	public CadastroFormPanel(Gerenciador gerenciador, TipoCargo cargo) {
		this.gerenciador = gerenciador;
		this.cargo = cargo;
		this.initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		this.menuPanel = new javax.swing.JPanel();
		this.tituloMenu = new javax.swing.JLabel();
		this.semapadorMenu = new javax.swing.JSeparator();
		this.homeButton = new javax.swing.JButton();
		this.homeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goHome(CadastroFormPanel.this.cargo);
			}
		});
		this.cadastroButton = new javax.swing.JButton();
		this.cadastroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goCadastroHome(CadastroFormPanel.this.cargo);
			}
		});
		this.funcionariosButton = new javax.swing.JButton();
		this.funcionariosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goListaFuncionarios(CadastroFormPanel.this.cargo);
			}
		});
		this.alunosButton = new javax.swing.JButton();
		this.alunosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goListaAlunos(CadastroFormPanel.this.cargo);
			}
		});
		this.sairButton = new javax.swing.JButton();
		this.sairButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.start();
			}
		});
		this.rightPanel = new javax.swing.JPanel();
		this.tituloRight = new javax.swing.JLabel();
		this.separadorRight = new javax.swing.JSeparator();
		this.jLabel1 = new javax.swing.JLabel();
		this.jTextField1 = new javax.swing.JTextField();
		this.jLabel2 = new javax.swing.JLabel();
		this.jTextField2 = new javax.swing.JTextField();
		this.jLabel3 = new javax.swing.JLabel();
		this.jTextField3 = new javax.swing.JTextField();
		this.jLabel4 = new javax.swing.JLabel();
		this.jTextField4 = new javax.swing.JTextField();
		this.idadeLabel = new javax.swing.JLabel();
		this.anosLabel = new javax.swing.JLabel();
		this.jLabel5 = new javax.swing.JLabel();
		this.jTextField5 = new javax.swing.JTextField();
		this.jLabel6 = new javax.swing.JLabel();
		this.jTextField6 = new javax.swing.JTextField();
		this.jLabel7 = new javax.swing.JLabel();
		this.jLabel8 = new javax.swing.JLabel();
		this.jComboBox1 = new javax.swing.JComboBox<>();
		this.jTextField7 = new javax.swing.JTextField();
		this.jButton1 = new javax.swing.JButton();

		this.menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		this.tituloMenu.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.tituloMenu.setText(this.cargo.getName().toUpperCase());

		this.homeButton.setText("Home");
		this.homeButton.setToolTipText("");

		this.cadastroButton.setText("Cadastro");

		this.funcionariosButton.setText("Funcionarios");

		this.alunosButton.setText("Alunos");

		this.sairButton.setText("Sair");

		javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(this.menuPanel);
		this.menuPanel.setLayout(menuPanelLayout);
		menuPanelLayout.setHorizontalGroup(
				menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(menuPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(this.semapadorMenu, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(this.homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.cadastroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.funcionariosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.alunosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
												.addGap(0, 0, Short.MAX_VALUE)
												.addComponent(this.tituloMenu))
										.addComponent(this.sairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));
		menuPanelLayout.setVerticalGroup(
				menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(menuPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.tituloMenu)
								.addGap(10, 10, 10)
								.addComponent(this.semapadorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.homeButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.cadastroButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.funcionariosButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.alunosButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(this.sairButton)
								.addContainerGap()));

		this.rightPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		this.tituloRight.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.tituloRight.setText("Cadastro");

		this.jLabel1.setText("Nome:");

		this.jTextField1.setText("jTextField1");

		this.jLabel2.setText("RG:");

		this.jTextField2.setText("jTextField2");

		this.jLabel3.setText("CPF:");

		this.jTextField3.setText("jTextField3");

		this.jLabel4.setText("Nascimento:");

		this.jTextField4.setText("jTextField4");

		this.idadeLabel.setText("jLabel5");

		this.anosLabel.setText("anos");

		this.jLabel5.setText("Telefone:");

		this.jTextField5.setText("jTextField5");

		this.jLabel6.setText("Endereço:");

		this.jTextField6.setText("jTextField6");

		this.jLabel7.setText("Salário: ");

		this.jLabel8.setText("Cargo:");

		this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		this.jTextField7.setText("jTextField7");

		this.jButton1.setText("Finalizar");

		javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(this.rightPanel);
		this.rightPanel.setLayout(rightPanelLayout);
		rightPanelLayout.setHorizontalGroup(
				rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(rightPanelLayout.createSequentialGroup()
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(rightPanelLayout.createSequentialGroup()
												.addContainerGap()
												.addComponent(this.separadorRight))
										.addGroup(rightPanelLayout.createSequentialGroup()
												.addGap(146, 146, 146)
												.addComponent(this.tituloRight)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(rightPanelLayout.createSequentialGroup()
												.addContainerGap()
												.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(rightPanelLayout.createSequentialGroup()
																.addGap(40, 40, 40)
																.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(this.jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(this.jLabel1))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(this.jTextField1)
																		.addComponent(this.jTextField2)))
														.addGroup(rightPanelLayout.createSequentialGroup()
																.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(this.jLabel4)
																				.addComponent(this.jLabel3)
																				.addGroup(rightPanelLayout.createSequentialGroup()
																						.addComponent(this.jLabel5)
																						.addGap(4, 4, 4)))
																		.addComponent(this.jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																				rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(this.jLabel7)
																						.addComponent(this.jLabel8)))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(this.jTextField6)
																		.addComponent(this.jTextField3)
																		.addGroup(rightPanelLayout.createSequentialGroup()
																				.addComponent(this.jTextField4)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(this.idadeLabel)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(this.anosLabel))
																		.addComponent(this.jTextField5)
																		.addComponent(this.jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(this.jTextField7)))))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
												.addGap(0, 21, Short.MAX_VALUE)
												.addComponent(this.jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		rightPanelLayout.setVerticalGroup(
				rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(rightPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.tituloRight)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.separadorRight, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel1)
										.addComponent(this.jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel2)
										.addComponent(this.jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel3)
										.addComponent(this.jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel4)
										.addComponent(this.jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.idadeLabel)
										.addComponent(this.anosLabel))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabel5))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel6)
										.addComponent(this.jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel8)
										.addComponent(this.jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabel7))
								.addGap(18, 18, 18)
								.addComponent(this.jButton1)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		this.idadeLabel.getAccessibleContext().setAccessibleName("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(this.rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));
	}// </editor-fold>
}
