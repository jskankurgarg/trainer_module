/*
 * Lay1Panel.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

/**
 *
 * @author  __USER__
 */
public class Lay1Panel extends javax.swing.JPanel {

	/** Creates new form Lay1Panel */
	public Lay1Panel() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		moduleIdLabel = new javax.swing.JLabel();
		moduleNameLabel = new javax.swing.JLabel();
		authorNameLabel = new javax.swing.JLabel();
		selectCompilerLabel = new javax.swing.JLabel();
		moduleIdTextField = new javax.swing.JTextField();
		moduleTextField = new javax.swing.JTextField();
		authorNameTextField = new javax.swing.JTextField();
		selectCompilerComboBox = new javax.swing.JComboBox();

		moduleIdLabel.setText("Module ID");

		moduleNameLabel.setText("Module Name");

		authorNameLabel.setText("Author Name");

		selectCompilerLabel.setText("Select the Compiler");

		moduleIdTextField.setText("jTextField1");

		moduleTextField.setText("jTextField2");

		authorNameTextField.setText("jTextField3");

		selectCompilerComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		selectCompilerComboBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						selectCompilerComboBoxActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(62, 62, 62)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				selectCompilerLabel,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				192,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				moduleNameLabel)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								authorNameLabel,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								93,
																								Short.MAX_VALUE)
																						.addComponent(
																								moduleIdLabel,
																								javax.swing.GroupLayout.Alignment.LEADING))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				104,
																				Short.MAX_VALUE)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																moduleIdTextField,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																113,
																Short.MAX_VALUE)
														.addComponent(
																moduleTextField)
														.addComponent(
																authorNameTextField)
														.addComponent(
																selectCompilerComboBox,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(47, 47, 47)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(35, 35, 35)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																moduleIdLabel)
														.addComponent(
																moduleIdTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																moduleTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																moduleNameLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																17,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												35, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																authorNameTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																authorNameLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																18,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																selectCompilerComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																selectCompilerLabel))
										.addGap(34, 34, 34)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(19, 19, 19)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(24, 24, 24)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(17, Short.MAX_VALUE)));
	}

	//GEN-END:initComponents
	private void selectCompilerComboBoxActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel authorNameLabel;
	private javax.swing.JTextField authorNameTextField;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel moduleIdLabel;
	private javax.swing.JTextField moduleIdTextField;
	private javax.swing.JLabel moduleNameLabel;
	private javax.swing.JTextField moduleTextField;
	private javax.swing.JComboBox selectCompilerComboBox;
	private javax.swing.JLabel selectCompilerLabel;
	// End of variables declaration//GEN-END:variables

}