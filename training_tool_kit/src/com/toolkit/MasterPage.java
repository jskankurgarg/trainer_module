/*
 * MasterPage.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.undo.*;
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

		setSize(900, 700);
		setResizable(false);
		ImageIcon module_strip = new ImageIcon("images/module_strip.png");
		//		ImageIcon toolIcon = new ImageIcon("images/elearning_right_most.png");
		imageLabel.setIcon(module_strip);

		/*		ImageIcon titleIcon = new ImageIcon("images/trainer_toolkit_middle.jpg");
		 titleLabel.setIcon(titleIcon);

		 ImageIcon companyIcon = new ImageIcon("images/zensar_logo_2.jpg");
		 companyLabel.setIcon(companyIcon);
		 */
		manager = new UndoManager();
		moduleIdTextField.getDocument().addUndoableEditListener(manager);
		moduleSubjectTextField.getDocument().addUndoableEditListener(manager);
		authorNameTextField.getDocument().addUndoableEditListener(manager);
		moduleIdTextField.requestFocusInWindow();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		topPanel = new javax.swing.JPanel();
		imageLabel = new javax.swing.JLabel();
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
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
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

		imageLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(imageLabel, gridBagConstraints);

		contentPanel.setBackground(new java.awt.Color(255, 255, 255));
		contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createTitledBorder(""), "",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.TOP));

		moduleIdLabel.setText("Module ID");

		moduleSubjectLabel.setText("Module Subject");

		authorNameLabel.setText("Author Name");

		selectCompilerLabel.setText("Select Compiler");

		moduleIdTextField.setMaximumSize(new java.awt.Dimension(6, 22));

		moduleSubjectTextField.setMaximumSize(new java.awt.Dimension(6, 22));
		moduleSubjectTextField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						moduleSubjectTextFieldActionPerformed(evt);
					}
				});

		authorNameTextField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						authorNameTextFieldActionPerformed(evt);
					}
				});

		compilerComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "Please Select", "Java Compiler",
						".Net Compiler", "None" }));
		compilerComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				compilerComboBoxActionPerformed(evt);
			}
		});

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
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
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
																Short.MAX_VALUE))));
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
										.addContainerGap()));

		moduleNextButton.setText("Next");
		moduleNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				moduleNextButtonMouseClicked(evt);
			}
		});
		moduleNextButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				moduleNextButtonActionPerformed(evt);
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

		jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Z,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setText("Undo");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		editMenu1.add(jMenuItem1);

		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Y,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Redo");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		editMenu1.add(jMenuItem2);

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
		helpMenu1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				helpMenu1ActionPerformed(evt);
			}
		});

		contentsMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_H,
				java.awt.event.InputEvent.ALT_MASK));
		contentsMenuItem1.setText("Contents");
		contentsMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				contentsMenuItem1MouseClicked(evt);
			}
		});
		contentsMenuItem1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						contentsMenuItem1ActionPerformed(evt);
					}
				});
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
						582, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(12, 12, 12)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										560, Short.MAX_VALUE).addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(topPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										562, Short.MAX_VALUE).addContainerGap())
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(497, Short.MAX_VALUE)
								.addComponent(moduleNextButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										75,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addGap(259, 259, 259)
								.addComponent(contentPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE)));
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
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(contentPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										40, Short.MAX_VALUE)
								.addComponent(moduleNextButton)
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void compilerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			manager.redo();
		} catch (Exception ex) {
		}
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			manager.undo();
		} catch (Exception ex) {
		}
	}

	private void contentsMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void helpMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void contentsMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("entered into help");
		run = Runtime.getRuntime();
		try {
			File currentDir = new File(".");
			String root = currentDir.getCanonicalPath();
			System.out.println(root);
			String helpLocation = root + File.separatorChar + "help"
					+ File.separatorChar + "Help_window.chm";
			child = Runtime.getRuntime().exec(
					"rundll32 url.dll,FileProtocolHandler " + helpLocation);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}

	protected void moduleNextButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		boolean flag = true;
		String msg = null;
		System.out.println("moduleNextButtonMouseClicked");
		if (moduleIdTextField.getText().trim().length() == 0) {
			msg = "please provide the module Id";
			flag = false;
		} else if (moduleSubjectTextField.getText().trim().length() == 0) {
			msg = "please provide the module subject";
			flag = false;
		} else if (authorNameTextField.getText().trim().length() == 0) {
			msg = "please provide the author name";
			flag = false;
		} else if (compilerComboBox.getSelectedItem() == "Please Select") {
			msg = "please select the compiler";
			flag = false;
		}

		if (addTopicForm == null) {
			addTopicForm = new AddTopicForm(this);
		}
		if (flag == true) {
			this.setVisible(false);
			addTopicForm.displayTopicForm(true);
			System.out.println("start next button event....");
			/// adding integration function.....
			Integration.setModulePage(this);
			System.out.println("end next button event....");
		} else {
			JOptionPane.showMessageDialog(this, msg, "Error",
					JOptionPane.ERROR_MESSAGE);
			this.setVisible(true);
		}
	}

	protected void moduleSubjectTextFieldActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	private void moduleNextButtonMouseClicked(java.awt.event.MouseEvent evt) {

	}

	private void authorNameTextFieldActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
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
	public javax.swing.JTextField authorNameTextField;
	public javax.swing.JComboBox compilerComboBox;
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
	private javax.swing.JLabel imageLabel;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuBar menuBar1;
	private javax.swing.JLabel moduleIdLabel;
	public javax.swing.JTextField moduleIdTextField;
	private javax.swing.JButton moduleNextButton;
	private javax.swing.JLabel moduleSubjectLabel;
	public javax.swing.JTextField moduleSubjectTextField;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem openMenuItem1;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem pasteMenuItem1;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem1;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JMenuItem saveMenuItem1;
	private javax.swing.JLabel selectCompilerLabel;
	private javax.swing.JPanel topPanel;
	// End of variables declaration//GEN-END:variables

	private AddTopicForm addTopicForm;
	public UndoManager manager;
	private Runtime run;
	private Process child;

	public String getModuleSubjectTextField() {
		// TODO Auto-generated method stub
		return moduleSubjectTextField.getText();
	}

}