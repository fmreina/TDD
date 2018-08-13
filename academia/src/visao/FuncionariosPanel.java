package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.Gerenciador;
import tipo.TipoCargo;

public class FuncionariosPanel extends javax.swing.JPanel {

	// Variables declaration - do not modify
	private javax.swing.JButton alunosButton;
	private javax.swing.JButton cadastroButton;
	private javax.swing.JButton funcionariosButton;
	private javax.swing.JTable funcionariosjTable;
	private javax.swing.JButton homeButton;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JPanel menuPanel;
	private javax.swing.JButton novoFuncionarioButton;
	private javax.swing.JPanel rightPanel;
	private javax.swing.JButton sairButton;
	private javax.swing.JSeparator semapadorMenu;
	private javax.swing.JSeparator separadorRight;
	private javax.swing.JLabel tituloMenu;
	private javax.swing.JLabel tituloRight;
	// End of variables declaration

	private Gerenciador gerenciador;
	private TipoCargo cargo;

	public FuncionariosPanel(Gerenciador gerenciador, TipoCargo cargo) {
		this.gerenciador = gerenciador;
		this.cargo = cargo;
		this.initComponents();
	}

	public void setTableItems() {
		this.funcionariosjTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ "Adm", TipoCargo.ADM.getName() },
						{ "Trei", TipoCargo.TREINADOR.getName() },
						{ null, null },
						{ null, null },
						{ null, null }
				},
				new String[] {
						"Nome", "Cargo"
				}));
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
				FuncionariosPanel.this.gerenciador.goHome(FuncionariosPanel.this.cargo);
			}
		});
		this.cadastroButton = new javax.swing.JButton();
		this.cadastroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionariosPanel.this.gerenciador.goCadastroHome(FuncionariosPanel.this.cargo);
			}
		});
		this.funcionariosButton = new javax.swing.JButton();
		this.funcionariosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionariosPanel.this.gerenciador.goListaFuncionarios(FuncionariosPanel.this.cargo);
			}
		});
		this.alunosButton = new javax.swing.JButton();
		this.alunosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionariosPanel.this.gerenciador.goListaAlunos(FuncionariosPanel.this.cargo);
			}
		});
		this.sairButton = new javax.swing.JButton();
		this.sairButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionariosPanel.this.gerenciador.start();
			}
		});
		this.rightPanel = new javax.swing.JPanel();
		this.tituloRight = new javax.swing.JLabel();
		this.separadorRight = new javax.swing.JSeparator();
		this.novoFuncionarioButton = new javax.swing.JButton();
		this.jScrollPane2 = new javax.swing.JScrollPane();
		this.jScrollPane1 = new javax.swing.JScrollPane();
		this.funcionariosjTable = new javax.swing.JTable();

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
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
								.addComponent(this.sairButton)
								.addContainerGap()));

		this.rightPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		this.tituloRight.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.tituloRight.setText("Funcionários");

		this.novoFuncionarioButton.setText("Novo funcionário");

		this.funcionariosjTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ "Lusca", TipoCargo.ADM.getName() },
						{ "Ferrugem", TipoCargo.TREINADOR.getName() },
						{ null, null },
						{ null, null },
						{ null, null }
				},
				new String[] {
						"Nome", "Cargo"
				}));
		this.jScrollPane1.setViewportView(this.funcionariosjTable);

		this.jScrollPane2.setViewportView(this.jScrollPane1);

		javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(this.rightPanel);
		this.rightPanel.setLayout(rightPanelLayout);
		rightPanelLayout.setHorizontalGroup(
				rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(rightPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(this.separadorRight)
										.addComponent(this.novoFuncionarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
								.addContainerGap())
						.addGroup(rightPanelLayout.createSequentialGroup()
								.addGap(242, 242, 242)
								.addComponent(this.tituloRight)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		rightPanelLayout.setVerticalGroup(
				rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(rightPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.tituloRight)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.separadorRight, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(this.novoFuncionarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
