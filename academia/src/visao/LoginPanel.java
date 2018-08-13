package visao;

import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import controle.Gerenciador;
import entidadeImpl.Funcionario;
import excecao.UsuarioOuSenhaInvalidosException;

//public class LoginPanel extends javax.swing.JFrame {
public class LoginPanel extends javax.swing.JPanel {

	private Gerenciador gerenciador;

	private JLabel errorMessageLabel;
	private JLabel jLabel1;
	private JPanel loginPanel;
	private JPanel imagemPanel;
	private JButton loginButton;
	private JButton sairButton;
	private JLabel senhaLabel;
	private JPasswordField senhaTextField;
	private JLabel tituloLabel;
	private JLabel usuarioLabel;
	private JTextField usuarioTextField;

	public LoginPanel(Gerenciador gerenciador) {
		this.gerenciador = gerenciador;
		this.initComponents();
		this.errorMessageLabel.setVisible(false);
	}

	private void handleLoginClicked(java.awt.event.ActionEvent evt) {
		try {
			Funcionario funcionarioValido = this.gerenciador.autenticate(this.usuarioTextField.getText(), this.senhaTextField.getText());
			if (funcionarioValido != null) {
				this.gerenciador.showHome(funcionarioValido);
			}
		} catch (UsuarioOuSenhaInvalidosException e) {
			this.markError();
		}
	}

	private void handleSairClicked(java.awt.event.ActionEvent evt) {
		this.gerenciador.sair();
	}

	private void markError() {
		this.errorMessageLabel.setVisible(true);

		this.usuarioTextField.setText("");
		this.senhaTextField.setText("");
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		this.loginPanel = new javax.swing.JPanel();
		this.tituloLabel = new javax.swing.JLabel();
		this.errorMessageLabel = new javax.swing.JLabel();
		this.usuarioLabel = new javax.swing.JLabel();
		this.senhaLabel = new javax.swing.JLabel();
		this.usuarioTextField = new javax.swing.JTextField();
		this.senhaTextField = new javax.swing.JPasswordField();
		this.sairButton = new javax.swing.JButton();
		this.loginButton = new javax.swing.JButton();
		this.imagemPanel = new javax.swing.JPanel();

		// this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		this.loginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		this.tituloLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.tituloLabel.setText("ACADEMIA");

		this.errorMessageLabel.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
		this.errorMessageLabel.setForeground(new java.awt.Color(223, 24, 24));
		this.errorMessageLabel.setText("Usuário ou senha inválidos");

		this.usuarioLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.usuarioLabel.setText("Usuário:");

		this.senhaLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
		this.senhaLabel.setText("Senha:");

		this.sairButton.setText("Sair");
		this.sairButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LoginPanel.this.handleSairClicked(evt);
			}
		});

		this.loginButton.setText("Login");
		this.loginButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LoginPanel.this.handleLoginClicked(evt);
			}
		});

		javax.swing.GroupLayout gl_loginPanel = new javax.swing.GroupLayout(this.loginPanel);
		gl_loginPanel.setHorizontalGroup(
				gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_loginPanel.createSequentialGroup()
												.addComponent(this.loginButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
												.addGap(32)
												.addComponent(this.sairButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
												.addGap(12))
										.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_loginPanel.createSequentialGroup()
														.addComponent(this.usuarioLabel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
																.addComponent(this.usuarioTextField, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
																.addComponent(this.tituloLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_loginPanel.createSequentialGroup()
														.addComponent(this.senhaLabel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(this.senhaTextField, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_loginPanel.createSequentialGroup()
												.addComponent(this.errorMessageLabel)
												.addGap(67)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_loginPanel.setVerticalGroup(
				gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
								.addGap(43)
								.addComponent(this.tituloLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(this.errorMessageLabel)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(this.usuarioLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(this.usuarioTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(7)
								.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(this.senhaLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(this.senhaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(this.loginButton)
										.addComponent(this.sairButton))
								.addContainerGap(72, Short.MAX_VALUE)));
		this.loginPanel.setLayout(gl_loginPanel);

		this.imagemPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		JLabel label = new JLabel("");
		Image icon = new ImageIcon(LoginPanel.class.getResource("/resources/gym.jpg")).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(icon));

		javax.swing.GroupLayout gl_imagemPanel = new javax.swing.GroupLayout(this.imagemPanel);
		gl_imagemPanel.setHorizontalGroup(
				gl_imagemPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE));
		gl_imagemPanel.setVerticalGroup(
				gl_imagemPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE));
		this.imagemPanel.setLayout(gl_imagemPanel);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.imagemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(this.loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(this.imagemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(this.loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));

	}// </editor-fold>
}