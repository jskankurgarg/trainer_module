/*
 * Layout_three.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  __USER__
 */
public class AddContentPage extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form Layout_three */
	public AddContentPage() {
		model = new javax.swing.DefaultListModel();
		initComponents();
		layout = new java.awt.GridLayout(0, 1, 5, 5);
		contentPanel.setLayout(layout);
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
		listContentPanel = new java.util.ArrayList<JPanel>();
		browseButton.setEnabled(false);
		addTextButton.setEnabled(false);
		addCodeButton.setEnabled(false);
		moveUpSubTopicButton.setEnabled(false);
		moveDownSubTopicButton.setEnabled(false);
		newPagePanel.setVisible(false);
	}

	public AddContentPage(AddTopicForm addTopicForm) {
		this();
		this.addTopicForm = addTopicForm;
		System.out.println("calling displayContentPage:  " + this);
		this.displayContentPage(true);
	}

	public AddContentPage(AddQuizPanel addQuizPanel) {
		this();
		this.addQuizPanel = addQuizPanel;
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPopupMenu1 = new javax.swing.JPopupMenu();
		modulePanel = new javax.swing.JPanel();
		moduleNameLabel = new javax.swing.JLabel();
		topicNameLabel = new javax.swing.JLabel();
		moduleNameValueLabel = new javax.swing.JLabel();
		topicNameValueLabel = new javax.swing.JLabel();
		subTopicPanel = new javax.swing.JPanel();
		scrollbarTopicsLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		subTopicList = new javax.swing.JList();
		renameSubTopicButton = new javax.swing.JButton();
		deleteSubTopicButton = new javax.swing.JButton();
		moveUpSubTopicButton = new javax.swing.JButton();
		moveDownSubTopicButton = new javax.swing.JButton();
		nextButtonLayout = new javax.swing.JButton();
		topPanel = new javax.swing.JPanel();
		imageLabel = new javax.swing.JLabel();
		backButtonLayout = new javax.swing.JButton();
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
		contentScrollPane = new javax.swing.JScrollPane();
		contentPanel = new javax.swing.JPanel();
		subTopicInfoPanel = new javax.swing.JPanel();
		subTopicLabel = new javax.swing.JLabel();
		subTopicTextField = new javax.swing.JTextField();
		addSubTopicButton = new javax.swing.JButton();
		messageLabel = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		addTextButton = new javax.swing.JButton();
		addCodeButton = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		mediaLabel = new javax.swing.JLabel();
		mediaComboBox = new javax.swing.JComboBox();
		browseButton = new javax.swing.JButton();
		newPagePanel = new javax.swing.JPanel();
		newPageButton = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		addQuizButton = new javax.swing.JButton();
		saveButton = new javax.swing.JButton();
		saveButton.setText("Save");
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		undoMenuItem = new javax.swing.JMenuItem();
		redoMenuItem = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		ContentsMenuItem = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		modulePanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 204, 255)));

		moduleNameLabel.setText("Module Name");

		topicNameLabel.setText("Topic Name");

		moduleNameValueLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
		moduleNameValueLabel.setText("Java");

		topicNameValueLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
		topicNameValueLabel.setText("writing first java program");

		javax.swing.GroupLayout modulePanelLayout = new javax.swing.GroupLayout(
				modulePanel);
		modulePanel.setLayout(modulePanelLayout);
		modulePanelLayout.setHorizontalGroup(modulePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						modulePanelLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(moduleNameLabel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										89,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(moduleNameValueLabel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										226,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(topicNameLabel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										76,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(topicNameValueLabel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										380, Short.MAX_VALUE)));
		modulePanelLayout
				.setVerticalGroup(modulePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								modulePanelLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(
												moduleNameLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
												topicNameLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												23,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(topicNameValueLabel)
										.addComponent(moduleNameValueLabel)));

		subTopicPanel.setBackground(new java.awt.Color(204, 204, 204));
		subTopicPanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 204, 255)));

		scrollbarTopicsLabel.setText(" Sub Topic Names");

		subTopicList.setModel(model);
		subTopicList
				.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
					public void valueChanged(
							javax.swing.event.ListSelectionEvent evt) {
						subTopicListValueChanged(evt);
					}
				});
		subTopicList.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				subTopicListFocusLost(evt);
			}
		});
		jScrollPane1.setViewportView(subTopicList);

		renameSubTopicButton.setText("Rename");
		renameSubTopicButton.setEnabled(false);
		renameSubTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						renameSubTopicButtonActionPerformed(evt);
					}
				});

		deleteSubTopicButton.setText("Delete");
		deleteSubTopicButton.setEnabled(false);
		deleteSubTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						deleteSubTopicButtonActionPerformed(evt);
					}
				});

		moveUpSubTopicButton.setText("/\\");
		moveUpSubTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						moveUpSubTopicButtonActionPerformed(evt);
					}
				});

		moveDownSubTopicButton.setText("\\/");
		moveDownSubTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						moveDownSubTopicButtonActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout subTopicPanelLayout = new javax.swing.GroupLayout(
				subTopicPanel);
		subTopicPanel.setLayout(subTopicPanelLayout);
		subTopicPanelLayout
				.setHorizontalGroup(subTopicPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								subTopicPanelLayout
										.createSequentialGroup()
										.addContainerGap(32, Short.MAX_VALUE)
										.addComponent(scrollbarTopicsLabel)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(moveUpSubTopicButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(moveDownSubTopicButton)
										.addContainerGap())
						.addGroup(
								subTopicPanelLayout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addComponent(renameSubTopicButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												deleteSubTopicButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												77,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(35, Short.MAX_VALUE))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 218,
								Short.MAX_VALUE));
		subTopicPanelLayout
				.setVerticalGroup(subTopicPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								subTopicPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												subTopicPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																scrollbarTopicsLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																26,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																moveUpSubTopicButton)
														.addComponent(
																moveDownSubTopicButton))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												348,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												subTopicPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																deleteSubTopicButton,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																28,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																renameSubTopicButton,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																29,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(29, Short.MAX_VALUE)));

		nextButtonLayout.setText("Next");
		nextButtonLayout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextButtonLayoutActionPerformed(evt);
			}
		});

		topPanel.setLayout(new java.awt.GridBagLayout());

		imageLabel.setText(" ");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		topPanel.add(imageLabel, gridBagConstraints);

		backButtonLayout.setText("Previous");
		backButtonLayout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonLayoutActionPerformed(evt);
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

		contentPanel.setBackground(new java.awt.Color(153, 153, 153));
		contentPanel.setLayout(new java.awt.GridBagLayout());
		contentScrollPane.setViewportView(contentPanel);

		subTopicInfoPanel.setBackground(new java.awt.Color(204, 204, 204));
		subTopicInfoPanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 204, 255)));

		subTopicLabel.setText("Sub Topic Name");

		subTopicTextField
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						subTopicTextFieldActionPerformed(evt);
					}
				});

		addSubTopicButton.setText("Add Sub Topic");
		addSubTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						addSubTopicButtonActionPerformed(evt);
					}
				});

		messageLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 14));
		messageLabel.setForeground(new java.awt.Color(0, 153, 0));

		javax.swing.GroupLayout subTopicInfoPanelLayout = new javax.swing.GroupLayout(
				subTopicInfoPanel);
		subTopicInfoPanel.setLayout(subTopicInfoPanelLayout);
		subTopicInfoPanelLayout
				.setHorizontalGroup(subTopicInfoPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								subTopicInfoPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												subTopicLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												subTopicTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												209,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(31, 31, 31)
										.addComponent(
												addSubTopicButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												127,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												56, Short.MAX_VALUE)
										.addComponent(
												messageLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												287,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		subTopicInfoPanelLayout
				.setVerticalGroup(subTopicInfoPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								subTopicInfoPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												subTopicInfoPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																subTopicInfoPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				subTopicLabel)
																		.addComponent(
																				addSubTopicButton)
																		.addComponent(
																				subTopicTextField,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																messageLabel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																23,
																Short.MAX_VALUE))
										.addContainerGap()));

		jPanel1.setBackground(new java.awt.Color(153, 153, 153));
		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 102, 102)));

		addTextButton.setText("Add Text");
		addTextButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addTextButtonActionPerformed(evt);
			}
		});

		addCodeButton.setText("Add Code");
		addCodeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addCodeButtonActionPerformed(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(153, 153, 153));
		jPanel2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 102, 102)));

		mediaLabel.setText("Media Type:");

		mediaComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "none", "videos", "audios", "images" }));
		mediaComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mediaComboBoxActionPerformed(evt);
			}
		});

		browseButton.setText("Add Media");
		browseButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				browseButtonActionPerformed(evt);
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
										.addContainerGap()
										.addComponent(
												mediaLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												67,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												mediaComboBox,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												browseButton,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												100, Short.MAX_VALUE)
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
														.addComponent(
																mediaLabel)
														.addComponent(
																mediaComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																24,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																browseButton))
										.addContainerGap(19, Short.MAX_VALUE)));

		newPagePanel.setBackground(new java.awt.Color(153, 153, 153));
		newPagePanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(102, 102, 102)));

		newPageButton.setText("New Page");
		newPageButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newPageButtonActionPerformed(evt);
			}
		});

		jButton3.setText("<");

		jButton2.setText(">");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout newPagePanelLayout = new javax.swing.GroupLayout(
				newPagePanel);
		newPagePanel.setLayout(newPagePanelLayout);
		newPagePanelLayout
				.setHorizontalGroup(newPagePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								newPagePanelLayout
										.createSequentialGroup()
										.addContainerGap(40, Short.MAX_VALUE)
										.addGroup(
												newPagePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																newPagePanelLayout
																		.createSequentialGroup()
																		.addGap(6,
																				6,
																				6)
																		.addComponent(
																				jButton3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton2))
														.addComponent(
																newPageButton,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																104,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		newPagePanelLayout
				.setVerticalGroup(newPagePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								newPagePanelLayout
										.createSequentialGroup()
										.addComponent(newPageButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												newPagePanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton3))));

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
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(addTextButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(addCodeButton)
										.addGap(18, 18, 18)
										.addComponent(
												newPagePanel,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addContainerGap()));
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
																addTextButton)
														.addComponent(
																addCodeButton)))
						.addGroup(
								jPanel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												newPagePanel,
												javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												56, Short.MAX_VALUE)));

		addQuizButton.setText("Add Quiz");
		addQuizButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addQuizButtonActionPerformed(evt);
			}
		});
		addQuizButton.setVisible(false);

		saveButton.setText("Save");
		saveButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveButtonActionPerformed(evt);
			}
		});

		jMenu1.setText("File");

		jMenuItem1.setText("Exit");
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");

		undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Z,
				java.awt.event.InputEvent.CTRL_MASK));
		undoMenuItem.setText("Undo");
		jMenu2.add(undoMenuItem);

		redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Y,
				java.awt.event.InputEvent.CTRL_MASK));
		redoMenuItem.setText("Redo");
		jMenu2.add(redoMenuItem);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("Help");

		ContentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_H,
				java.awt.event.InputEvent.ALT_MASK));
		ContentsMenuItem.setText("Contents");
		ContentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ContentsMenuItemActionPerformed(evt);
			}
		});
		jMenu3.add(ContentsMenuItem);

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
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														837, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		subTopicPanel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						contentScrollPane,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						611,
																						Short.MAX_VALUE)
																				.addComponent(
																						jPanel1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										addQuizButton,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										94,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(10,
																										10,
																										10)
																								.addComponent(
																										saveButton,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										63,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										backButtonLayout)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										nextButtonLayout,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										98,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addComponent(
														subTopicInfoPanel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														modulePanel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										83,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(modulePanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(subTopicInfoPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		contentScrollPane,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		393,
																		Short.MAX_VALUE))
												.addComponent(
														subTopicPanel,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(backButtonLayout)
												.addComponent(nextButtonLayout)
												.addComponent(addQuizButton)
												.addComponent(
														saveButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	protected void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String subTopicName = (String) subTopicList.getSelectedValue();
		String topicName = topicNameValueLabel.getText();
		saveButtonActionPerformed(topicName, subTopicName);
		Thread message = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				messageLabel.setText("subtopic saved.");
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

	protected void saveButtonActionPerformed(String topicName,
			String subTopicName) {
		System.out.println("performing SAVE BUTTON ACTION....");
		if (contentPanel.getComponents().length != 0) {
			Integration.removeSubTopicContents(topicName, subTopicName);
		}
		for (Component panel : contentPanel.getComponents()) {
			//FOR ADDING PANEL
			Integration.setSubTopicContent(topicName, subTopicName, panel);
			System.out.println("adding contents to sub topic...." + panel);

			/*			// FOR REMOVING PANEL
			 contentPanel.remove(panel);
			 */
			this.repaint();

		}
		System.out.println("SAVE BUTTON ACTION completed....");
	}

	private void ContentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
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

	protected void addQuizButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if (addQuizPanel == null) {
			addQuizPanel = new AddQuizPanel(this);
		}
		this.setVisible(false);
		addQuizPanel.displayQuizPage(true);
	}

	protected void newPageButtonActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String pageName = "->Page ";
		int subTopicIndex = subTopicList.getSelectedIndex();
		SubTopic subtopic = (SubTopic) subTopicList.getSelectedValue();
		subtopic.pageNo++;
		pageName += subtopic.pageNo;
		model.insertElementAt(pageName, subTopicIndex);
		//subtopic.subTopicStack.push();
	}

	public void removeTextPanel() {
		System.out.println("start removeTextpanel method");

		for (Component panel : contentPanel.getComponents()) {

			//	} (Component panel : contentPanel.getComponents()) {

			System.out.println("Entered");
			boolean checkValue = false;
			if (panel instanceof AddTextJPanel) {
				AddTextJPanel tempPanel = (AddTextJPanel) panel;
				checkValue = tempPanel.isSelected();
			} else if (panel instanceof AddCodePanel) {
				AddCodePanel tempPanel = (AddCodePanel) panel;
				checkValue = tempPanel.isSelected();
			} else if (panel instanceof AddMediaJPanel) {
				AddMediaJPanel tempPanel = (AddMediaJPanel) panel;
				checkValue = tempPanel.isSelected();
			}
			if (checkValue == true) {
				contentPanel.remove(panel);
				System.out
						.println("-----------------------------------------------------------------------");
				System.out.println(getClass() + ":  deleting text panel ....");
				shuffle();
			}
		}

	}

	private void moveDownSubTopicButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		int moveMe = subTopicList.getSelectedIndex();
		if (moveMe != model.getSize() - 1) {
			// not already at bottom
			swap(moveMe, moveMe + 1);
			subTopicList.setSelectedIndex(moveMe + 1);
			subTopicList.ensureIndexIsVisible(moveMe + 1);
		}
	}

	private void moveUpSubTopicButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		int moveMe = subTopicList.getSelectedIndex();
		if (moveMe != 0) {
			// not already at top
			swap(moveMe, moveMe - 1);
			subTopicList.setSelectedIndex(moveMe - 1);
			subTopicList.ensureIndexIsVisible(moveMe - 1);
		}
	}

	private void swap(int a, int b) {
		Object aObject = model.getElementAt(a);
		Object bObject = model.getElementAt(b);
		model.set(a, bObject);
		model.set(b, aObject);
		String topicName = topicNameValueLabel.getText();
		Integration.swapSubTopic(topicName, a, b);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	protected void mediaComboBoxActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void subTopicTextFieldActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void subTopicListFocusLost(FocusEvent evt) {

	}

	public void shuffle() {//very useful method
		panels = new Stack<Component>();
		int count = 0;
		for (Component c : contentPanel.getComponents()) {
			panels.push(c);
			System.out.println(c + "\n----------->" + count++);
		}
		// this.getContentPane().removeAll();    
		//   Collections.shuffle(panels);    
		Stack<Component> reversedPanels = new Stack<Component>();
		while (!panels.isEmpty()) {
			reversedPanels.push(panels.pop());
		}
		while (!reversedPanels.empty())
			contentPanel.add(reversedPanels.pop());
		((JPanel) getContentPane()).revalidate();
		this.repaint();
	}

	private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {
		//System.out.println("asd");

		mediaPanel = new AddMediaJPanel();
		String selectedMedia = (String) mediaComboBox.getSelectedItem();
		System.out.println("selected media : " + selectedMedia);
		if (selectedMedia.equalsIgnoreCase("none")) {
			JOptionPane.showMessageDialog(this,
					"Please select any media type!!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			JFileChooser jf = new JFileChooser();
			jf.showOpenDialog(this);

			File file = jf.getSelectedFile();
			final String fileName = file.getName();
			System.out.println("file name-->" + fileName + "--");
			if (Utility.validateFileFormat(selectedMedia, fileName)) {
				FileInputStream fis;
				System.out.println("File.separatorChar-->" + File.separatorChar
						+ "--");
				try {
					String location = selectedMedia + File.separatorChar
							+ fileName;
					System.out.println("starting file operations...location-->"
							+ location + "--");
					fis = new FileInputStream(file);
					byte[] buffer = new byte[(int) file.length()];
					fis.read(buffer);
					FileOutputStream fos = new FileOutputStream(location);
					fos.write(buffer);
					fis.close();
					fos.close();
					System.out
							.println("file successfully copied to correct folder...");
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(this,
							"File does not exists!!", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (IOException e) {
					JOptionPane
							.showMessageDialog(
									this,
									"File upload failed due to some internal error!!\nPlease try after some time!!",
									"Error", JOptionPane.ERROR_MESSAGE);
				}
				mediaPanel.setText(file.getName(), selectedMedia);
				contentPanel.add(mediaPanel);
				this.validate();
			} else {
				JOptionPane.showMessageDialog(this,
						"File extension not supported!!!", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	protected void deleteSubTopicButtonActionPerformed(ActionEvent evt) {
		try {
			if (!subTopicList.isSelectionEmpty()) {
				int subTopicIndex = subTopicList.getSelectedIndex();
				model.remove(subTopicIndex);
				String topicName = topicNameValueLabel.getText();

				Integration.deleteSubTopic(topicName, subTopicIndex);

				if (model.size() == 0) {
					isModifiable(false);
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

	protected void renameSubTopicButtonActionPerformed(ActionEvent evt) {
		try {
			if (!subTopicList.isSelectionEmpty()) {
				String newSubTopicName = JOptionPane.showInputDialog(
						"Enter new name for the Topic : ",
						subTopicList.getSelectedValue());
				if (model.contains(newSubTopicName)) {
					JOptionPane.showMessageDialog(this, "Topic already exists",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					int subtopicIndex = subTopicList.getSelectedIndex();
					model.set(subtopicIndex, newSubTopicName);
					String topicName = topicNameValueLabel.getText();

					Integration.renameSubTopic(topicName, subtopicIndex,
							newSubTopicName);
				}
			} else {
				JOptionPane.showMessageDialog(this,
						"Please Select Any SubTopic", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(this,
					"Please select any sub topic!!", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void subTopicListValueChanged(
			javax.swing.event.ListSelectionEvent evt) {
		System.out.println("performing SUB TOPIC LIST VALUE CHANGED  event...");
		isModifiable(true);
		if (model.getSize() > 0) {
			String subTopicName = (String) subTopicList.getSelectedValue();
			String topicName = topicNameValueLabel.getText();
			for (Component comp : contentPanel.getComponents()) {
				contentPanel.remove(comp);
			}
			contentPanel.validate();
			/*		
			 int selected = subTopicList.getSelectedIndex();
			 int previous = selected == evt.getFirstIndex() ? evt.getLastIndex() : evt.getFirstIndex();
			 System.out.println("Selected:" + selected);
			 System.out.println("Previous:" + previous);
			
			 String lastSelectedSubTopicName=(String)model.getElementAt(previous);
			
			 //saving previous content before loading the current subtopic contents
			 saveButtonActionPerformed(topicName,lastSelectedSubTopicName);
			 */
			//loading the current subtopic contents
			System.out.println("before integration subtopic name : "
					+ subTopicName);
			Integration.getSubTopicContent(topicName, subTopicName, this);
		}
		System.out.println("end of SUB TOPIC LIST VALUE CHANGED event...");
	}

	protected void addSubTopicButtonActionPerformed(ActionEvent evt) {
		String subTopicName = subTopicTextField.getText();
		subTopicName = subTopicName.trim();
		if (subTopicName.length() != 0) {
			if (model.contains(subTopicName)) {
				JOptionPane.showMessageDialog(this, "Topic already exists",
						"Error", JOptionPane.ERROR_MESSAGE);
			} else {
				model.addElement(subTopicName);
				//adding Integration function....
				Integration.setSubtopicName(topicNameValueLabel.getText(),
						subTopicTextField.getText());
			}
			System.out.println(model.contains(subTopicName.trim()));
			subTopicTextField.setText("");
		} else {
			JOptionPane.showMessageDialog(this, "Please enter any name!!",
					"Error", JOptionPane.ERROR_MESSAGE);

		}
		subTopicList.validate();
		subTopicList.repaint();
	}

	protected void addTextButtonActionPerformed(ActionEvent evt) {

		textJPanel = new AddTextJPanel();
		contentPanel.add(textJPanel);
		textJPanel.editorPane.requestFocusInWindow();
		listContentPanel.add(textJPanel);

		System.out.println("add text button");
		//layout.addLayoutComponent("textJPanel",textJPanel);
		this.validate();
	}

	protected void addCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		codeJPanel = new AddCodePanel();
		contentPanel.add(codeJPanel);
		codeJPanel.codeEditorPane.requestFocusInWindow();
		System.out.println("add code button");
		this.validate();
	}

	protected void isModifiable(boolean setValue) {
		deleteSubTopicButton.setEnabled(setValue);
		renameSubTopicButton.setEnabled(setValue);
		browseButton.setEnabled(setValue);
		addTextButton.setEnabled(setValue);
		addCodeButton.setEnabled(setValue);
		addQuizButton.setEnabled(setValue);
		moveDownSubTopicButton.setEnabled(setValue);
		moveUpSubTopicButton.setEnabled(setValue);

	}

	private void backButtonLayoutActionPerformed(java.awt.event.ActionEvent evt) {
		/*for(Component comp: subTopicList.getComponents()){
			subTopicList.remove(comp);
		}*/
		model.clear();
		this.setVisible(false);
		addTopicForm.setVisible(true);
	}

	private void nextButtonLayoutActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int checkList = model.size();
			if (checkList == 0) {
				throw new EmptyListException();
			}
			if (finishForm == null) {
				finishForm = new FinishForm(this);
			}
			this.setVisible(false);
			finishForm.setVisible(true);
		} catch (EmptyListException e) {
			JOptionPane.showMessageDialog(this, "please create any subtopic!!",
					"Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
	}

	/**
	 * @param args the command line arguments
	 */
	public void displayContentPage(boolean value) {
		System.out.println("inside displayContentPage :" + addTopicForm);

		moduleNameValueLabel.setText(addTopicForm.masterPage
				.getModuleSubjectTextField());
		System.out.println("--" + addTopicForm.getTopicName() + "--");
		topicNameValueLabel.setText(addTopicForm.getTopicName());
		this.setVisible(value);
		populateSubTopicList();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddContentPage().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem ContentsMenuItem;
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JButton addCodeButton;
	private javax.swing.JButton addQuizButton;
	private javax.swing.JButton addSubTopicButton;
	private javax.swing.JButton addTextButton;
	private javax.swing.JButton backButtonLayout;
	private javax.swing.JButton browseButton;
	public javax.swing.JPanel contentPanel;
	private javax.swing.JScrollPane contentScrollPane;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JButton deleteSubTopicButton;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JLabel imageLabel;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPopupMenu jPopupMenu1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JComboBox mediaComboBox;
	private javax.swing.JLabel mediaLabel;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel messageLabel;
	private javax.swing.JLabel moduleNameLabel;
	private javax.swing.JLabel moduleNameValueLabel;
	private javax.swing.JPanel modulePanel;
	private javax.swing.JButton moveDownSubTopicButton;
	private javax.swing.JButton moveUpSubTopicButton;
	private javax.swing.JButton newPageButton;
	private javax.swing.JPanel newPagePanel;
	private javax.swing.JButton nextButtonLayout;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem redoMenuItem;
	private javax.swing.JButton renameSubTopicButton;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JButton saveButton;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JLabel scrollbarTopicsLabel;
	private javax.swing.JPanel subTopicInfoPanel;
	private javax.swing.JLabel subTopicLabel;
	public javax.swing.JList subTopicList;
	private javax.swing.JPanel subTopicPanel;
	public javax.swing.JTextField subTopicTextField;
	private javax.swing.JPanel topPanel;
	private javax.swing.JLabel topicNameLabel;
	private javax.swing.JLabel topicNameValueLabel;
	private javax.swing.JMenuItem undoMenuItem;
	// End of variables declaration//GEN-END:variables
	public javax.swing.DefaultListModel model;
	protected AddTopicForm addTopicForm;
	private FinishForm finishForm;
	private List<JPanel> listContentPanel;
	public AddTextJPanel textJPanel;
	private GridLayout layout;
	public AddCodePanel codeJPanel;
	public AddMediaJPanel mediaPanel;
	public AddQuizPanel addQuizPanel;
	public Stack<Component> panels;
	private Runtime run;
	private Process child;

	public String getTopicName() {
		// TODO Auto-generated method stub
		return topicNameValueLabel.getText();
	}

	public void populateSubTopicList() {
		// TODO Auto-generated method stub
		System.out.println("populating subtopic jlist...");
		Integration.setSubTopicJList(topicNameValueLabel.getText(), this);
	}

}