/*
 * AddTopicForm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.undo.*;

/**
 *
 * @author  __USER__
 */
public class AddTopicForm extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form AddTopicForm */
	public AddTopicForm() {
		model = new javax.swing.DefaultListModel();

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
		topicNameTextField.getDocument().addUndoableEditListener(manager);
		descriptionTextArea.getDocument().addUndoableEditListener(manager);

	}

	public AddTopicForm(MasterPage masterPage) {
		// TODO Auto-generated constructor stub
		this();
		this.masterPage = masterPage;
		displayTopicForm(true);
		System.out.println(masterPage.getModuleSubjectTextField());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		topPanel = new javax.swing.JPanel();
		imageLabel = new javax.swing.JLabel();
		topicInfoPanel = new javax.swing.JPanel();
		topicNameLabel = new javax.swing.JLabel();
		topicNameTextField = new javax.swing.JTextField();
		addTopicButton = new javax.swing.JButton();
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
		moduleSubjectNameLabel = new javax.swing.JLabel();
		moduleSubjectLabel = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		topicListScrollPane = new javax.swing.JScrollPane();
		topicList = new javax.swing.JList();
		topicListLabel = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		deleteTopicButton = new javax.swing.JButton();
		renameButton = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		descriptionTextArea = new javax.swing.JTextArea();
		addDescriptionButton = new javax.swing.JButton();
		backButton = new javax.swing.JButton();
		addContentButton = new javax.swing.JButton();
		messageLabel = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		undoMenuItem = new javax.swing.JMenuItem();
		redoMenuItem = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(204, 204, 255));
		setForeground(new java.awt.Color(204, 204, 255));

		topPanel.setLayout(new java.awt.GridBagLayout());

		imageLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(imageLabel, gridBagConstraints);

		topicInfoPanel.setBackground(new java.awt.Color(204, 204, 204));
		topicInfoPanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 204, 255)));

		topicNameLabel.setText("Topic Name");

		topicNameTextField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						topicNameTextFieldActionPerformed(evt);
					}
				});

		addTopicButton.setText("Add Topic");
		addTopicButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				addTopicButtonMouseClicked(evt);
			}
		});
		addTopicButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addTopicButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout topicInfoPanelLayout = new javax.swing.GroupLayout(
				topicInfoPanel);
		topicInfoPanel.setLayout(topicInfoPanelLayout);
		topicInfoPanelLayout
				.setHorizontalGroup(topicInfoPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								topicInfoPanelLayout
										.createSequentialGroup()
										.addComponent(
												topicNameLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												topicNameTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												208,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(44, 44, 44)
										.addComponent(
												addTopicButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												107,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(359, Short.MAX_VALUE)));
		topicInfoPanelLayout
				.setVerticalGroup(topicInfoPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								topicInfoPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												topicInfoPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																topicNameLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																22,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																topicNameTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																addTopicButton))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

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

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 204, 255)));

		moduleSubjectNameLabel.setText("from first page");

		moduleSubjectLabel.setText("MODULE SUBJECT :");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(moduleSubjectLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 120,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(moduleSubjectNameLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 429,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(217, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																moduleSubjectLabel)
														.addComponent(
																moduleSubjectNameLabel))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel2.setBackground(new java.awt.Color(204, 204, 204));
		jPanel2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 204, 255)));

		topicList.setModel(model);
		topicList
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		topicList.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				topicListMouseClicked(evt);
			}
		});
		topicList
				.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
					public void valueChanged(
							javax.swing.event.ListSelectionEvent evt) {
						topicListValueChanged(evt);
					}
				});
		topicListScrollPane.setViewportView(topicList);

		topicListLabel.setText("Topics Name");

		jButton1.setText("/\\");
		jButton1.setToolTipText("move up topic");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton3.setText("\\/");
		jButton3.setToolTipText("move down topic");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		deleteTopicButton.setText("Delete");
		deleteTopicButton.setEnabled(false);
		deleteTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						deleteTopicButtonActionPerformed(evt);
					}
				});

		renameButton.setText("Rename");
		renameButton.setEnabled(false);
		renameButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				renameButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(47,
																				47,
																				47)
																		.addComponent(
																				renameButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				81,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				deleteTopicButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				73,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								topicListScrollPane,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								249,
																								Short.MAX_VALUE)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												topicListLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												101,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton3)))))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton3)
														.addComponent(
																topicListLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																26,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												topicListScrollPane,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												307, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																renameButton)
														.addComponent(
																deleteTopicButton))
										.addContainerGap()));

		descriptionTextArea.setColumns(20);
		descriptionTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		descriptionTextArea.setRows(5);
		descriptionTextArea.setEnabled(false);
		jScrollPane3.setViewportView(descriptionTextArea);

		addDescriptionButton.setText("save description");
		addDescriptionButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						addDescriptionButtonActionPerformed(evt);
					}
				});

		backButton.setText("Previous");
		backButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				backButtonMouseClicked(evt);
			}
		});
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
			}
		});

		addContentButton.setText("Next");
		addContentButton.setEnabled(false);
		addContentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addContentButtonActionPerformed(evt);
			}
		});

		messageLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 14));
		messageLabel.setForeground(new java.awt.Color(0, 153, 51));

		jLabel1.setText("Topic Description");

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
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																497,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				addDescriptionButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				backButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				addContentButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				80,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(37,
																				37,
																				37)
																		.addComponent(
																				messageLabel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				132,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(15, 15, 15)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addComponent(
																messageLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																19,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																addContentButton)
														.addComponent(
																backButton)
														.addComponent(
																addDescriptionButton))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jMenu1.setText("File");

		jMenuItem1.setText("Exit");
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");

		undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Z,
				java.awt.event.InputEvent.CTRL_MASK));
		undoMenuItem.setText("Undo");
		undoMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				undoMenuItemActionPerformed(evt);
			}
		});
		jMenu2.add(undoMenuItem);

		redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Y,
				java.awt.event.InputEvent.CTRL_MASK));
		redoMenuItem.setText("Redo");
		redoMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				redoMenuItemActionPerformed(evt);
			}
		});
		jMenu2.add(redoMenuItem);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("Help");

		jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_H,
				java.awt.event.InputEvent.ALT_MASK));
		jMenuItem3.setText("Contents");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem3);

		jMenuItem2.setText("About");
		jMenu3.add(jMenuItem2);

		jMenuBar1.add(jMenu3);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														topPanel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														796, Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(2, 2, 2)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						topicInfoPanel,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jPanel2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jPanel3,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										81,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(5, 5, 5)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(topicInfoPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPanel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(81, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void topicListMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		descriptionTextArea.setFocusable(isDisplayable());
	}

	protected void addDescriptionButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Integration.setTopicDescription(this);
		/*		if (model.getSize() > 1) {
		 descriptionTextArea.setText("");
		 }
		 */
		Thread message = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageLabel.setText("description saved.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				messageLabel.setText("");
			}
		});
		message.start();
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
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

	private void redoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			manager.redo();
		} catch (Exception ex) {
		}
	}

	private void undoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			manager.undo();
		} catch (Exception ex) {
		}
	}

	protected void addTopicButtonMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	//move up button action performed
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int moveMe = topicList.getSelectedIndex();
		if (moveMe != 0) {
			//except at top position
			swap(moveMe, moveMe - 1);
			topicList.setSelectedIndex(moveMe - 1);
			topicList.ensureIndexIsVisible(moveMe - 1);
		}
	}

	//move down button action performed
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

		int moveMe = topicList.getSelectedIndex();
		if (moveMe != model.getSize() - 1) {
			// except at bottom position
			swap(moveMe, moveMe + 1);
			topicList.setSelectedIndex(moveMe + 1);
			topicList.ensureIndexIsVisible(moveMe + 1);
		}

	}

	protected void backButtonMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	private void topicNameTextFieldActionPerformed(
			java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	protected void backButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		masterPage.setAddTopicForm(this);
		masterPage.setVisible(true);
	}

	private void addContentButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (addContentPage == null) {
			addContentPage = new AddContentPage(this);
		}
		this.setVisible(false);
		System.out.println("calling displayContentPage:  " + addContentPage);
		addContentPage.displayContentPage(true);
	}

	private void swap(int a, int b) {
		Object aObject = model.getElementAt(a);
		Object bObject = model.getElementAt(b);
		model.set(a, bObject);
		model.set(b, aObject);
		Integration.swapTopic(a, b);
	}

	private void renameButtonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (!topicList.isSelectionEmpty()) {
				String newTopicName = JOptionPane.showInputDialog(
						"Enter new name for the Topic : ",
						topicList.getSelectedValue());
				newTopicName = newTopicName.trim();
				if (newTopicName.length() == 0) {
					JOptionPane.showMessageDialog(this,
							"Please enter topic name", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (model.contains(newTopicName)) {
					JOptionPane.showMessageDialog(this, "Topic already exists",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					int topicIndex = topicList.getSelectedIndex();
					model.set(topicIndex, newTopicName);
					Integration.renameTopic(newTopicName, topicIndex);
				}
			} else {
				JOptionPane.showMessageDialog(this, "Please Select Any Topic",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(this,
					"Please select any sub topic!!", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private void topicListValueChanged(javax.swing.event.ListSelectionEvent evt) {
		addContentButton.setEnabled(true);
		deleteTopicButton.setEnabled(true);
		renameButton.setEnabled(true);
		descriptionTextArea.setCaretColor(Color.blue);

		//descriptionTextArea.setCursor(null);
		int topicIndex = topicList.getSelectedIndex();

		//for debugging purpose
		System.out.println("index,model-size value before if condition : "
				+ topicIndex + "," + model.getSize());

		if (topicIndex == -1 && model.getSize() >= 0) {
			topicIndex = 0;
			int topicListSize = Integration.module.topicList.size();
			System.out.println("size of topic list : " + topicListSize);
			if (topicListSize > 0) {
				descriptionTextArea.setText(Integration.module.topicList.get(
						topicIndex).getTopicDescription());
			}
		} else if (topicIndex > -1) {
			//System.out.println("index value : " + topicIndex);//for debugging purpose
			int topicListSize = Integration.module.topicList.size();
			System.out.println("size of topic list : " + topicListSize);
			if (topicListSize > 0) {
				descriptionTextArea.setText(Integration.module.topicList.get(
						topicIndex).getTopicDescription());
			}
		}
		System.out.println("inside topic list value changed--->topic index : "
				+ topicIndex);
		descriptionTextArea.setEnabled(true);
		descriptionTextArea.setEditable(true);

		descriptionTextArea.requestFocusInWindow();
		//descriptionTextArea.setText("");
		isModifiable(true);
		topicList.validate();
	}

	protected void addTopicButtonActionPerformed(ActionEvent evt) {
		String newTopic = topicNameTextField.getText();
		newTopic = newTopic.trim();
		if (newTopic.length() == 0) {
			JOptionPane.showMessageDialog(this, "Please enter topic-name",
					"Error", JOptionPane.ERROR_MESSAGE);
		}

		else if (model.contains(newTopic)) {
			JOptionPane.showMessageDialog(this, "Topic already exists",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			newTopic = newTopic.trim();
			model.addElement(newTopic);

			descriptionTextArea.setText("");
			//adding Integration function....
			Integration.setTopicPage(newTopic);
		}
		System.out.println(model.contains(newTopic.trim()));
		topicNameTextField.setText("");
		descriptionTextArea.setText("");
		topicList.repaint();

	}

	protected void deleteTopicButtonActionPerformed(ActionEvent evt) {
		if (!topicList.isSelectionEmpty()) {
			System.out.println("inside delete action.........");
			int topicIndex = topicList.getSelectedIndex();
			System.out.println("topic index : " + topicIndex
					+ " \t model-size : " + model.getSize());
			model.remove(topicIndex);
			descriptionTextArea.setText("");
			Integration.deleteTopic(topicIndex);
			//model.removeElementAt(topicIndex);
			if (model.size() == 0) {
				isModifiable(false);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Please Select Any Topic",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void isModifiable(boolean setValue) {
		deleteTopicButton.setEnabled(setValue);
		renameButton.setEnabled(setValue);
		addContentButton.setEnabled(setValue);
		jButton1.setEnabled(setValue);
		jButton3.setEnabled(setValue);
	}

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}//GEN-LAST:event_exitMenuItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public String getTopicName() {
		// TODO Auto-generated method stub
		return (String) topicList.getSelectedValue();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddTopicForm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JButton addContentButton;
	private javax.swing.JButton addDescriptionButton;
	private javax.swing.JButton addTopicButton;
	private javax.swing.JButton backButton;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JButton deleteTopicButton;
	public javax.swing.JTextArea descriptionTextArea;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JLabel imageLabel;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel messageLabel;
	private javax.swing.JLabel moduleSubjectLabel;
	private javax.swing.JLabel moduleSubjectNameLabel;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem redoMenuItem;
	private javax.swing.JButton renameButton;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JPanel topPanel;
	private javax.swing.JPanel topicInfoPanel;
	public javax.swing.JList topicList;
	private javax.swing.JLabel topicListLabel;
	private javax.swing.JScrollPane topicListScrollPane;
	private javax.swing.JLabel topicNameLabel;
	public javax.swing.JTextField topicNameTextField;
	private javax.swing.JMenuItem undoMenuItem;
	// End of variables declaration//GEN-END:variables
	protected MasterPage masterPage;
	private javax.swing.DefaultListModel model;
	private AddContentPage addContentPage;
	public UndoManager manager;
	private Runtime run;
	private Process child;

	public void displayTopicForm(boolean value) {
		moduleSubjectNameLabel.setText(masterPage.getModuleSubjectTextField());
		setVisible(value);
	}

}