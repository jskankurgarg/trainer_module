/*
 * layout_4.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.event.ActionEvent;
import javax.swing.undo.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.html.HtmlUtility;

/**
 *
 * @author  __USER__
 */
public class FinishForm extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form layout_4 */
	public FinishForm() {
		initComponents();
		setSize(900, 700);
		setResizable(false);
		ImageIcon module_strip = new ImageIcon("images/module_strip.png");
		//toolIcon.
		imageLabel.setIcon(module_strip);
		/*
		 ImageIcon titleIcon = new ImageIcon("images/tool_title_image.png");
		 titleLabel.setIcon(titleIcon);

		 ImageIcon companyIcon = new ImageIcon("images/zensar_logo_2.jpg");
		 companyLabel.setIcon(companyIcon);
		 */
		manager = new UndoManager();
		emailTextField.getDocument().addUndoableEditListener(manager);
		//referenceTextArea.getDocument().addUndoableEditListener(manager);

	}

	public FinishForm(AddContentPage addContentPage) {
		this();
		this.addContentPage = addContentPage;
		// TODO Auto-generated constructor stub
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

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
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		emailTextField = new javax.swing.JTextField();
		linkURLTextField1 = new javax.swing.JTextField();
		linkURLTextField2 = new javax.swing.JTextField();
		linkURLTextField3 = new javax.swing.JTextField();
		linkNameTextField2 = new javax.swing.JTextField();
		linkNameTextField1 = new javax.swing.JTextField();
		linkNameTextField3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		infoLabel1 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		moduleSubjectNameLabel = new javax.swing.JLabel();
		moduleSubjectLabel = new javax.swing.JLabel();
		finishButton = new javax.swing.JButton();
		previousButton = new javax.swing.JButton();
		topPanel = new javax.swing.JPanel();
		imageLabel = new javax.swing.JLabel();
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

		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 204, 255)));

		jLabel1.setText("For more references you can visit the links");

		jLabel2.setText("For any query mail me at");

		linkURLTextField1.setBackground(new java.awt.Color(255, 255, 204));

		linkURLTextField2.setBackground(new java.awt.Color(255, 255, 204));

		linkURLTextField3.setBackground(new java.awt.Color(255, 255, 204));

		jLabel3.setText("Link Name");

		jLabel4.setText("Link URL");

		infoLabel1
				.setText("Your module is almost created,Press the FINISH button to complete the process.");

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
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(8,
																												8,
																												8)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																linkNameTextField1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																194,
																																Short.MAX_VALUE)
																														.addComponent(
																																linkNameTextField2,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																194,
																																Short.MAX_VALUE)
																														.addComponent(
																																linkNameTextField3,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																194,
																																Short.MAX_VALUE))
																										.addGap(10,
																												10,
																												10))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(10,
																												10,
																												10)
																										.addComponent(
																												jLabel3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												92,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								linkURLTextField3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								342,
																								Short.MAX_VALUE)
																						.addComponent(
																								linkURLTextField2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								342,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																169,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																linkURLTextField1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																342,
																																Short.MAX_VALUE))))
																		.addGap(68,
																				68,
																				68))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				275,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				347,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				142,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				emailTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				261,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				215,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				infoLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				503,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap(
																				119,
																				Short.MAX_VALUE)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												34,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																20,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																20,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				linkNameTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				linkNameTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				linkNameTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				linkURLTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				linkURLTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				linkURLTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				29,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(34, 34, 34)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																emailTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																29,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addComponent(
												infoLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(19, 19, 19)));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));
		jPanel3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(51, 204, 255)));

		moduleSubjectNameLabel.setText("subject name from lay_1");

		moduleSubjectLabel.setText("MODULE SUBJECT :");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												moduleSubjectLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												moduleSubjectNameLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												152,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(340, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap(18, Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																moduleSubjectLabel,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																moduleSubjectNameLabel,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE))
										.addContainerGap()));

		finishButton.setText("Finish");
		finishButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				finishButtonActionPerformed(evt);
			}
		});

		previousButton.setText("Previous");
		previousButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				previousButtonActionPerformed(evt);
			}
		});

		topPanel.setLayout(new java.awt.GridBagLayout());

		imageLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(imageLabel, gridBagConstraints);

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
				exitMenuItem1exitMenuItemActionPerformed(evt);
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
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		topPanel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		990,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		previousButton)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		finishButton,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		77,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(125,
																		125,
																		125)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jPanel1,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jPanel3,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										87,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(11, 11, 11)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										313, Short.MAX_VALUE)
								.addGap(88, 88, 88)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(finishButton)
												.addComponent(previousButton))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void helpMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void contentsMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("entered into help");
		Runtime run = Runtime.getRuntime();
		try {
			File currentDir = new File(".");
			String root = currentDir.getCanonicalPath();
			System.out.println(root);
			String helpLocation = root + File.separatorChar + "help"
					+ File.separatorChar + "Help_window.chm";
			Process child = Runtime.getRuntime().exec(
					"rundll32 url.dll,FileProtocolHandler " + helpLocation);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}

	private void contentsMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {

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

	private void exitMenuItem1exitMenuItemActionPerformed(
			java.awt.event.ActionEvent evt) {
		//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}

	protected void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.setVisible(false);
		addContentPage.setVisible(true);
	}

	protected void finishButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		try {
			Integration.module.setAuthorMailId(emailTextField.getText());
			Integration.setReference(linkNameTextField1,linkURLTextField1);
			Integration.module.references.clear();
			Integration.setReference(linkNameTextField1, linkURLTextField1);
			Integration.setReference(linkNameTextField2, linkURLTextField2);
			Integration.setReference(linkNameTextField3, linkURLTextField3);
			
/*			if (referenceTextField1.getText() != null
					&& referenceTextField1.getText().length() > 0) {
				Integration.module.addReference(referenceTextField1.getText());
			}
			if (referenceTextField2.getText() != null
					&& referenceTextField2.getText().length() > 0) {
				Integration.module.addReference(referenceTextField2.getText());
			}
			if (referenceTextField3.getText() != null
					&& referenceTextField3.getText().length() > 0) {
				Integration.module.addReference(referenceTextField3.getText());
			}
*/			HtmlUtility htmlUtility = new HtmlUtility();
			String output = htmlUtility.util(Integration.module);

			int optionType = JOptionPane.OK_CANCEL_OPTION;
			int messageType = JOptionPane.PLAIN_MESSAGE;
			//ImageIcon icon = new ImageIcon("//images//logo.jpg", "logo");
			int res = JOptionPane
					.showConfirmDialog(
							this,
							"Module is successfully created and saved.!\nClick OK to exit.",
							"Zensar Technologies", optionType, messageType,
							null);
			this.validate();
			if (res == JOptionPane.OK_OPTION) {
				System.out.println("OK_OPTION");
				this.dispose();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	protected void backToHomePageButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		addContentPage.addTopicForm.masterPage.setVisible(true);
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
				new FinishForm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JMenuItem aboutMenuItem1;
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
	private javax.swing.JTextField emailTextField;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenuItem exitMenuItem1;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu fileMenu1;
	private javax.swing.JButton finishButton;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JMenu helpMenu1;
	private javax.swing.JLabel imageLabel;
	private javax.swing.JLabel infoLabel1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTextField linkNameTextField1;
	private javax.swing.JTextField linkNameTextField2;
	private javax.swing.JTextField linkNameTextField3;
	private javax.swing.JTextField linkURLTextField1;
	private javax.swing.JTextField linkURLTextField2;
	private javax.swing.JTextField linkURLTextField3;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuBar menuBar1;
	private javax.swing.JLabel moduleSubjectLabel;
	private javax.swing.JLabel moduleSubjectNameLabel;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem openMenuItem1;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem pasteMenuItem1;
	private javax.swing.JButton previousButton;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem1;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JMenuItem saveMenuItem1;
	private javax.swing.JPanel topPanel;
	// End of variables declaration//GEN-END:variables
	private AddContentPage addContentPage;
	public UndoManager manager;

	public String getMail() {
		return emailTextField.getText();
	}

	public String getReference() {
		return null;
	}
}