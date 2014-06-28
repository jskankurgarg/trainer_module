/*
 * MasterPage.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MasterPage extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form MasterPage */
	public MasterPage() {

		initComponents();

		setSize(600, 700);
		setResizable(false);
		ImageIcon toolIcon = new ImageIcon("images/logo2.jpg");
		//toolIcon.
		toolLabel.setIcon(toolIcon);

		ImageIcon titleIcon = new ImageIcon("images/tool_title_image.png");
		titleLabel.setIcon(titleIcon);

		ImageIcon companyIcon = new ImageIcon("images/zensar_logo_2.jpg");
		companyLabel.setIcon(companyIcon);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		topPanel = new javax.swing.JPanel();
		toolLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		companyLabel = new javax.swing.JLabel();
		contentPanel = new javax.swing.JPanel();
		moduleIdLabel = new javax.swing.JLabel();
		moduleSubjectLabel = new javax.swing.JLabel();
		authorNameLabel = new javax.swing.JLabel();
		selectCompilerLabel = new javax.swing.JLabel();
		moduleIdTextField = new javax.swing.JTextField();
		moduleSubjectTextField = new javax.swing.JTextField();
		authorNameTextField = new javax.swing.JTextField();
		compilerComboBox = new javax.swing.JComboBox();
		moduleNextButton = new javax.swing.JButton();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		openMenuItem = new javax.swing.JMenuItem();
		saveMenuItem = new javax.swing.JMenuItem();
		saveAsMenuItem = new javax.swing.JMenuItem();
		exitMenuItem = new javax.swing.JMenuItem();
		editMenu = new javax.swing.JMenu();
		cutMenuItem = new javax.swing.JMenuItem();
		copyMenuItem = new javax.swing.JMenuItem();
		pasteMenuItem = new javax.swing.JMenuItem();
		deleteMenuItem = new javax.swing.JMenuItem();
		helpMenu = new javax.swing.JMenu();
		contentsMenuItem = new javax.swing.JMenuItem();
		aboutMenuItem = new javax.swing.JMenuItem();
		menuBar1 = new javax.swing.JMenuBar();
		fileMenu1 = new javax.swing.JMenu();
		openMenuItem1 = new javax.swing.JMenuItem();
		saveMenuItem1 = new javax.swing.JMenuItem();
		saveAsMenuItem1 = new javax.swing.JMenuItem();
		exitMenuItem1 = new javax.swing.JMenuItem();
		editMenu1 = new javax.swing.JMenu();
		cutMenuItem1 = new javax.swing.JMenuItem();
		copyMenuItem1 = new javax.swing.JMenuItem();
		pasteMenuItem1 = new javax.swing.JMenuItem();
		deleteMenuItem1 = new javax.swing.JMenuItem();
		helpMenu1 = new javax.swing.JMenu();
		contentsMenuItem1 = new javax.swing.JMenuItem();
		aboutMenuItem1 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(new java.awt.GridBagLayout());

		jPanel2.setLayout(new java.awt.GridBagLayout());

		topPanel.setLayout(new java.awt.GridBagLayout());

		toolLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(toolLabel, gridBagConstraints);

		titleLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = 6;
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(titleLabel, gridBagConstraints);

		companyLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(companyLabel, gridBagConstraints);

		moduleIdLabel.setText("Module ID");

		moduleSubjectLabel.setText("Module Subject");

		authorNameLabel.setText("Author Name");

		selectCompilerLabel.setText("Select Compiler");

		moduleIdTextField.setMaximumSize(new java.awt.Dimension(6, 22));

		moduleSubjectTextField.setMaximumSize(new java.awt.Dimension(6, 22));


		compilerComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Java Compiler", ".Net Compiler" }));

		javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(
				contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanelLayout
				.setHorizontalGroup(contentPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								contentPanelLayout
										.createSequentialGroup()
										.addGap(88, 88, 88)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																moduleIdLabel)
														.addComponent(
																moduleSubjectLabel)
														.addComponent(
																authorNameLabel)
														.addComponent(
																selectCompilerLabel))
										.addGap(93, 93, 93)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																moduleIdTextField,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																moduleSubjectTextField,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																authorNameTextField)
														.addComponent(
																compilerComboBox,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(160, Short.MAX_VALUE)));
		contentPanelLayout
				.setVerticalGroup(contentPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								contentPanelLayout
										.createSequentialGroup()
										.addGap(50, 50, 50)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																moduleIdLabel)
														.addComponent(
																moduleIdTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(38, 38, 38)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																moduleSubjectLabel)
														.addComponent(
																moduleSubjectTextField,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(38, 38, 38)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																authorNameLabel)
														.addComponent(
																authorNameTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(44, 44, 44)
										.addGroup(
												contentPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																selectCompilerLabel)
														.addComponent(
																compilerComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(62, Short.MAX_VALUE)));

		moduleNextButton.setText("Next");
		moduleNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				moduleNextButtonMouseClicked(evt);
			}
		});

		fileMenu.setText("File");

		openMenuItem.setText("Open");
		fileMenu.add(openMenuItem);

		saveMenuItem.setText("Save");
		fileMenu.add(saveMenuItem);

		saveAsMenuItem.setText("Save As ...");
		fileMenu.add(saveAsMenuItem);

		exitMenuItem.setText("Exit");
		exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(exitMenuItem);

		menuBar.add(fileMenu);

		editMenu.setText("Edit");

		cutMenuItem.setText("Cut");
		editMenu.add(cutMenuItem);

		copyMenuItem.setText("Copy");
		editMenu.add(copyMenuItem);

		pasteMenuItem.setText("Paste");
		editMenu.add(pasteMenuItem);

		deleteMenuItem.setText("Delete");
		editMenu.add(deleteMenuItem);

		menuBar.add(editMenu);

		helpMenu.setText("Help");

		contentsMenuItem.setText("Contents");
		helpMenu.add(contentsMenuItem);

		aboutMenuItem.setText("About");
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		fileMenu1.setText("File");

		openMenuItem1.setText("Open");
		fileMenu1.add(openMenuItem1);

		saveMenuItem1.setText("Save");
		fileMenu1.add(saveMenuItem1);

		saveAsMenuItem1.setText("Save As ...");
		fileMenu1.add(saveAsMenuItem1);

		exitMenuItem1.setText("Exit");
		exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitMenuItemActionPerformed(evt);
			}
		});
		fileMenu1.add(exitMenuItem1);

		menuBar1.add(fileMenu1);

		editMenu1.setText("Edit");

		cutMenuItem1.setText("Cut");
		editMenu1.add(cutMenuItem1);

		copyMenuItem1.setText("Copy");
		editMenu1.add(copyMenuItem1);

		pasteMenuItem1.setText("Paste");
		editMenu1.add(pasteMenuItem1);

		deleteMenuItem1.setText("Delete");
		editMenu1.add(deleteMenuItem1);

		menuBar1.add(editMenu1);

		helpMenu1.setText("Help");

		contentsMenuItem1.setText("Contents");
		helpMenu1.add(contentsMenuItem1);

		aboutMenuItem1.setText("About");
		helpMenu1.add(aboutMenuItem1);

		menuBar1.add(helpMenu1);

		setJMenuBar(menuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						565, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(12, 12, 12)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										541, Short.MAX_VALUE).addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(topPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										541, Short.MAX_VALUE).addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(contentPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addGap(22, 22, 22))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(455, Short.MAX_VALUE)
								.addComponent(moduleNextButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										69,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(41, 41, 41)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										94,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(contentPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(moduleNextButton)
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void moduleNextButtonMouseClicked(java.awt.event.MouseEvent evt) {
		boolean flag = true;
		String msg = null;
		//System.out.println(moduleIdTextField.getText());
		if (moduleIdTextField.getText().length() == 0) {
			msg = "please provide the module Id";
			flag = false;
		} else if (moduleSubjectTextField.getText().trim().length() == 0) {
			msg = "please provide the module subject";
			flag = false;
		} else if (authorNameTextField.getText().trim().length() == 0) {
			msg = "please provide the author name";
			flag = false;
		}
		//validation over
		System.out.println(this.getModuleSubjectTextField());
		if (addTopicForm == null) {
			addTopicForm = new AddTopicForm(this);
		}
		if (flag == true) {//compare result of validation
			this.setVisible(false);
			addTopicForm.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, msg, "Error",
					JOptionPane.ERROR_MESSAGE);
			this.setVisible(true);
		}
	}

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}//GEN-LAST:event_exitMenuItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MasterPage().setVisible(true);
			}
		});
	}

	public void setAddTopicForm(AddTopicForm addTopicForm) {
		this.addTopicForm = addTopicForm;
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JMenuItem aboutMenuItem1;
	private javax.swing.JLabel authorNameLabel;
	private javax.swing.JTextField authorNameTextField;
	private javax.swing.JLabel companyLabel;
	private javax.swing.JComboBox compilerComboBox;
	private javax.swing.JPanel contentPanel;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem contentsMenuItem1;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem copyMenuItem1;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem cutMenuItem1;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JMenuItem deleteMenuItem1;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenu editMenu1;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenuItem exitMenuItem1;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu fileMenu1;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JMenu helpMenu1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuBar menuBar1;
	private javax.swing.JLabel moduleIdLabel;
	private javax.swing.JTextField moduleIdTextField;
	private javax.swing.JButton moduleNextButton;
	private javax.swing.JLabel moduleSubjectLabel;
	private javax.swing.JTextField moduleSubjectTextField;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem openMenuItem1;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem pasteMenuItem1;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem1;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JMenuItem saveMenuItem1;
	private javax.swing.JLabel selectCompilerLabel;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JLabel toolLabel;
	private javax.swing.JPanel topPanel;
	// End of variables declaration//GEN-END:variables

	private AddTopicForm addTopicForm;

	public String getModuleSubjectTextField() {
		return moduleSubjectTextField.getText();
	}

}