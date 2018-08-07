package visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.Academia;

public class LoginPanel extends javax.swing.JFrame {

	private Academia academia;
	
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

	public LoginPanel() {
		this.initComponents();
		this.errorMessageLabel.setVisible(false);
	}

	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// System.out.println(usuarioTextField.getText() +" - "+ senhaTextField.getText()+ " - "+ senhaTextField.getPassword());
//		String user = "adm";
//		String pass = "adm";
//
//		if (!user.equals(this.usuarioTextField.getText()) || !pass.equals(this.senhaTextField.getText())) {
//			this.markError();
//			this.errorMessageLabel.setVisible(true);
//		} else {
//			new AdmHomePanel().setVisible(true);
//			this.setVisible(false);
//		}
		
//		academia.getAlunos()
//		academia.autenticarUsuario(funcionario, usuario, senha);
	}

	private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void markError() {
		// this.usuarioTextField.setCaretColor(Color.red);
		// this.senhaTextField.setCaretColor(Color.red);

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

		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
				LoginPanel.this.loginButton1ActionPerformed(evt);
			}
		});

		this.loginButton.setText("Login");
		this.loginButton.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LoginPanel.this.loginButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout gl_loginPanel = new javax.swing.GroupLayout(this.loginPanel);
		this.loginPanel.setLayout(gl_loginPanel);
		gl_loginPanel.setHorizontalGroup(
				gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_loginPanel.createSequentialGroup()
												.addComponent(this.loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(32, 32, 32)
												.addComponent(this.sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(12, 12, 12))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(gl_loginPanel.createSequentialGroup()
														.addComponent(this.usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(this.usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(this.tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_loginPanel.createSequentialGroup()
														.addComponent(this.senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(this.senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_loginPanel.createSequentialGroup()
												.addComponent(this.errorMessageLabel)
												.addGap(67, 67, 67)))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_loginPanel.setVerticalGroup(
				gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.errorMessageLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(7, 7, 7)
								.addGroup(gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(this.senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(gl_loginPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.loginButton)
										.addComponent(this.sairButton))
								.addContainerGap(21, Short.MAX_VALUE)));

		this.imagemPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		javax.swing.GroupLayout gl_imagemPanel = new javax.swing.GroupLayout(this.imagemPanel);
		this.imagemPanel.setLayout(gl_imagemPanel);
		gl_imagemPanel.setHorizontalGroup(
				gl_imagemPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 284, Short.MAX_VALUE));
		gl_imagemPanel.setVerticalGroup(
				gl_imagemPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
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

		this.pack();
	}// </editor-fold>

}