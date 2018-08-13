package visao;

import static tipo.TipoCadastro.FUNCIONARIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import controle.Gerenciador;
import entidadeImpl.CadastroDTO;
import entidadeImpl.DateUtils;
import tipo.TipoCadastro;
import tipo.TipoCargo;

public class CadastroFormPanel extends javax.swing.JPanel {

	// Variables declaration - do not modify
	private javax.swing.JButton alunosButton;
	private javax.swing.JButton cadastroButton;
	private javax.swing.JButton funcionariosButton;
	private javax.swing.JButton homeButton;
	private javax.swing.JButton finalizarButton;
	private javax.swing.JComboBox<String> cargoComboBox;
	private javax.swing.JLabel nomeLabel;
	private javax.swing.JLabel rgLabel;
	private javax.swing.JLabel cpfLabel;
	private javax.swing.JLabel nascimentoLabel;
	private javax.swing.JLabel telefoneLabel;
	private javax.swing.JLabel enderecoLabel;
	private javax.swing.JLabel salarioLabel;
	private javax.swing.JLabel cargoLabel;
	private javax.swing.JTextField nomeField;
	private javax.swing.JTextField rgField;
	private javax.swing.JTextField cpfField;
	private JLabel idadeLabel;
	private JDatePickerImpl datePicker;
	private javax.swing.JTextField telefoneField;
	private javax.swing.JTextField enderecoField;
	private javax.swing.JTextField salarioField;
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
	TipoCadastro tipoCadastro;
	private JTextField usuarioField;
	private JTextField senhaField;

	public CadastroFormPanel(Gerenciador gerenciador, TipoCargo cargo, TipoCadastro tipoCadastro) {
		this.gerenciador = gerenciador;
		this.cargo = cargo;
		this.tipoCadastro = tipoCadastro;
		this.initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		this.menuPanel = new javax.swing.JPanel();
		this.tituloMenu = new javax.swing.JLabel();
		this.semapadorMenu = new javax.swing.JSeparator();
		this.homeButton = new javax.swing.JButton();
		this.cadastroButton = new javax.swing.JButton();
		this.funcionariosButton = new javax.swing.JButton();
		this.alunosButton = new javax.swing.JButton();
		this.sairButton = new javax.swing.JButton();
		this.rightPanel = new javax.swing.JPanel();
		this.tituloRight = new javax.swing.JLabel();
		this.tituloRight.setBounds(148, 14, 78, 21);
		this.separadorRight = new javax.swing.JSeparator();
		this.separadorRight.setBounds(435, 41, 0, 10);
		this.nomeLabel = new javax.swing.JLabel();
		this.nomeLabel.setBounds(54, 59, 45, 15);
		this.nomeField = new javax.swing.JTextField();
		this.nomeField.setBounds(111, 57, 290, 19);
		this.rgLabel = new javax.swing.JLabel();
		this.rgLabel.setBounds(72, 92, 27, 15);
		this.rgField = new javax.swing.JTextField();
		this.rgField.setBounds(111, 88, 290, 19);
		this.cpfLabel = new javax.swing.JLabel();
		this.cpfLabel.setBounds(71, 121, 31, 15);
		this.cpfField = new javax.swing.JTextField();
		this.cpfField.setBounds(114, 119, 287, 19);
		this.nascimentoLabel = new javax.swing.JLabel();
		this.nascimentoLabel.setBounds(14, 152, 88, 15);
//		this.nascimentoField = new javax.swing.JTextField();
//		this.nascimentoField.setBounds(114, 150, 218, 19);
//		this.nascimentoField.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusLost(FocusEvent e) {
//				if (!CadastroFormPanel.this.nascimentoField.getText().equals("")) {
//					// calcula idade
//					CadastroFormPanel.this.idadeLabel.setText("20 anos");
//					CadastroFormPanel.this.idadeLabel.setVisible(true);
//				}
//			}
//		});
		this.datePicker = this.generateDatePicker();
		this.datePicker.setBounds(114, 150, 193, 19);
		this.telefoneLabel = new javax.swing.JLabel();
		this.telefoneLabel.setBounds(38, 187, 67, 15);
		this.telefoneField = new javax.swing.JTextField();
		this.telefoneField.setBounds(117, 185, 287, 19);
		this.enderecoLabel = new javax.swing.JLabel();
		this.enderecoLabel.setBounds(34, 218, 71, 15);
		this.enderecoField = new javax.swing.JTextField();
		this.enderecoField.setBounds(117, 216, 287, 19);
		this.salarioLabel = new javax.swing.JLabel();
		this.salarioLabel.setBounds(46, 285, 59, 15);
		this.salarioLabel.setVisible(FUNCIONARIO.equals(this.tipoCadastro));
		this.cargoLabel = new javax.swing.JLabel();
		this.cargoLabel.setBounds(58, 252, 47, 15);
		this.cargoLabel.setVisible(FUNCIONARIO.equals(this.tipoCadastro));
		this.cargoComboBox = new javax.swing.JComboBox<>();
		this.cargoComboBox.setBounds(117, 247, 295, 24);
		this.cargoComboBox.setVisible(FUNCIONARIO.equals(this.tipoCadastro));
		this.salarioField = new javax.swing.JTextField();
		this.salarioField.setBounds(117, 283, 287, 19);
		this.salarioField.setVisible(FUNCIONARIO.equals(this.tipoCadastro));
		this.finalizarButton = new javax.swing.JButton();
		this.finalizarButton.setBounds(96, 357, 320, 25);
		this.finalizarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroDTO dto = new CadastroDTO();
				dto.setNome(CadastroFormPanel.this.nomeField.getText());
				dto.setRg(CadastroFormPanel.this.rgField.getText());
				dto.setCpf(CadastroFormPanel.this.cpfField.getText());
				dto.setDtNascimento(DateUtils.parseDate(datePicker.getJFormattedTextField().getText(), null));
				dto.setTelefone(CadastroFormPanel.this.telefoneField.getText());
				dto.setEndereco(CadastroFormPanel.this.enderecoField.getText());
				dto.setCargo((TipoCargo) CadastroFormPanel.this.cargoComboBox.getSelectedItem());
				dto.setSalario(CadastroFormPanel.this.salarioField.getText());
				dto.setTipoCadastro(CadastroFormPanel.this.tipoCadastro);
				dto.setUsuario(CadastroFormPanel.this.usuarioField.getText());
				dto.setSenha(CadastroFormPanel.this.senhaField.getText());

				//TODO: checar se há dados em branco
				
				CadastroFormPanel.this.gerenciador.finalizarCadastro(dto);
				CadastroFormPanel.this.gerenciador.goCadastroHome(CadastroFormPanel.this.cargo);
				
			}
		});

		this.menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		this.tituloMenu.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.tituloMenu.setText(this.cargo.getName().toUpperCase());

		this.homeButton.setText("Home");
		this.homeButton.setToolTipText("");
		this.homeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goHome(CadastroFormPanel.this.cargo);
			}
		});

		this.cadastroButton.setText("Cadastro");
		this.cadastroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goCadastroHome(CadastroFormPanel.this.cargo);
			}
		});

		this.funcionariosButton.setText("Funcionarios");
		this.funcionariosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goListaFuncionarios(CadastroFormPanel.this.cargo);
			}
		});

		this.alunosButton.setText("Alunos");
		this.alunosButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.goListaAlunos(CadastroFormPanel.this.cargo);
			}
		});

		this.sairButton.setText("Sair");
		this.sairButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFormPanel.this.gerenciador.start();
			}
		});

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

		this.nomeLabel.setText("Nome:");

		this.rgLabel.setText("RG:");

		this.cpfLabel.setText("CPF:");

		this.nascimentoLabel.setText("Nascimento:");

		this.telefoneLabel.setText("Telefone:");

		this.enderecoLabel.setText("Endereço:");

		this.salarioLabel.setText("Salário: ");

		this.cargoLabel.setText("Cargo:");

		this.cargoComboBox.setModel(new DefaultComboBoxModel(new TipoCargo[] { TipoCargo.ADM, TipoCargo.TREINADOR }));

		this.finalizarButton.setText("Finalizar");

		JLabel usuarioLabel = new JLabel("Usuário:");
		usuarioLabel.setBounds(45, 322, 60, 15);
		usuarioLabel.setVisible(FUNCIONARIO.equals(this.tipoCadastro));

		this.usuarioField = new JTextField();
		this.usuarioField.setBounds(117, 320, 102, 19);
		this.usuarioField.setText("user");
		this.usuarioField.setColumns(10);
		this.usuarioField.setVisible(FUNCIONARIO.equals(this.tipoCadastro));

		JLabel senhaLabel = new JLabel("Senha:");
		senhaLabel.setBounds(237, 322, 50, 15);
		senhaLabel.setVisible(FUNCIONARIO.equals(this.tipoCadastro));

		this.senhaField = new JTextField();
		this.senhaField.setBounds(299, 320, 105, 19);
		this.senhaField.setText("pass");
		this.senhaField.setColumns(10);
		this.senhaField.setVisible(FUNCIONARIO.equals(this.tipoCadastro));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.menuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(this.rightPanel, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(21, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(this.rightPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.menuPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
								.addContainerGap()));
		this.setLayout(layout);
		this.rightPanel.setLayout(null);
		this.rightPanel.add(this.separadorRight);
		this.rightPanel.add(this.tituloRight);
		this.rightPanel.add(this.rgLabel);
		this.rightPanel.add(this.nomeLabel);
		this.rightPanel.add(this.nomeField);
		this.rightPanel.add(this.rgField);
		this.rightPanel.add(this.telefoneLabel);
		this.rightPanel.add(this.cargoLabel);
		this.rightPanel.add(this.nascimentoLabel);
		this.rightPanel.add(this.cpfLabel);
		this.rightPanel.add(this.enderecoLabel);
		this.rightPanel.add(usuarioLabel);
		this.rightPanel.add(this.salarioLabel);
		this.rightPanel.add(this.enderecoField);
		this.rightPanel.add(this.cpfField);
		this.rightPanel.add(this.datePicker);
		this.rightPanel.add(this.telefoneField);
		this.rightPanel.add(this.usuarioField);
		this.rightPanel.add(senhaLabel);
		this.rightPanel.add(this.senhaField);
		this.rightPanel.add(this.salarioField);
		this.rightPanel.add(this.cargoComboBox);
		this.rightPanel.add(this.finalizarButton);
		
		idadeLabel = new JLabel("anos");
		idadeLabel.setBounds(331, 152, 70, 15);
		idadeLabel.setVisible(false);
		rightPanel.add(idadeLabel);
	}// </editor-fold>

	 private JDatePickerImpl generateDatePicker(){
	
		 Properties p = new Properties();
		 p.put("text.today", "today");
		 p.put("text.month", "month");
		 p.put("text.year", "year");
		
		 UtilDateModel model = new UtilDateModel();
		 JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		 JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		 datePicker.getJFormattedTextField().addPropertyChangeListener(new PropertyChangeListener() {
		 	public void propertyChange(PropertyChangeEvent evt) {
		 		String stringDate = datePicker.getJFormattedTextField().getText();
		 		if(stringDate != null && !stringDate.equals("")){
			 		Date data = DateUtils.parseDate(stringDate, null);
			 		idadeLabel.setText(DateUtils.calculateIdade(data));
			 		idadeLabel.setVisible(true);
		 		}
		 	}
		 });
		 return datePicker;
	
	 }
}
