package visao;

public class Modal extends javax.swing.JPanel {

	/**
	 * Creates new form AdmHomePanel
	 */
	public Modal() {
		this.initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		this.jLabel1 = new javax.swing.JLabel();
		this.jSeparator1 = new javax.swing.JSeparator();
		this.jButton1 = new javax.swing.JButton();
		this.jButton2 = new javax.swing.JButton();
		this.jLabel2 = new javax.swing.JLabel();

		this.jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
		this.jLabel1.setText("Atenção!");

		this.jButton1.setText("Confirmar");

		this.jButton2.setText("Cancelar");

		this.jLabel2.setText("blah blah blah");
		this.jLabel2.setToolTipText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
												.addContainerGap()
												.addComponent(this.jSeparator1))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addGap(161, 161, 161)
																.addComponent(this.jLabel1))
														.addGroup(layout.createSequentialGroup()
																.addGap(159, 159, 159)
																.addComponent(this.jButton1)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(this.jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addGap(173, 173, 173)
																.addComponent(this.jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGap(0, 142, Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(this.jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(35, 35, 35)
								.addComponent(this.jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(this.jButton1)
										.addComponent(this.jButton2))
								.addContainerGap()));
	}// </editor-fold>

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration
}
