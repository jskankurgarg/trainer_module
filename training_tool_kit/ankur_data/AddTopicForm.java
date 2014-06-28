/*
 * AddTopicForm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

	public AddTopicForm(MasterPage masterPage) {
		// TODO Auto-generated constructor stub
		this();
		setVisible(true);
		this.masterPage = masterPage;
		System.out.println(masterPage.getModuleSubjectTextField());
		moduleSubjectNameLabel.setText(masterPage.getModuleSubjectTextField());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		topPanel = new javax.swing.JPanel();
		toolLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		companyLabel = new javax.swing.JLabel();
		moduleSubjectLabel = new javax.swing.JLabel();
		moduleSubjectNameLabel = new javax.swing.JLabel();
		topicListScrollPane = new javax.swing.JScrollPane();
		topicList = new javax.swing.JList();
		deleteTopicButton = new javax.swing.JButton();
		backButton = new javax.swing.JButton();
		addContentButton = new javax.swing.JButton();
		topicInfoPanel = new javax.swing.JPanel();
		topicNameLabel = new javax.swing.JLabel();
		topicDescriptionLabel = new javax.swing.JLabel();
		topicNameTextField = new javax.swing.JTextField();
		topicDescriptionScrollPane = new javax.swing.JScrollPane();
		topicDescriptionTextArea = new javax.swing.JTextArea();
		addTopicButton = new javax.swing.JButton();
		topicListLabel = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		descriptionTextArea = new javax.swing.JTextArea();
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
		renameButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

		moduleSubjectLabel.setText("MODULE SUBJECT :");

		moduleSubjectNameLabel.setText("from first page");

		topicList.setModel(model);
		topicList
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		topicList
				.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
					public void valueChanged(
							javax.swing.event.ListSelectionEvent evt) {
						topicListValueChanged(evt);
					}
				});
		topicListScrollPane.setViewportView(topicList);

		deleteTopicButton.setText("Delete Topic");
		deleteTopicButton.setEnabled(false);
		deleteTopicButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						deleteTopicButtonActionPerformed(evt);
					}
				});

		backButton.setText("Back");
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

		addContentButton.setText("Add Content");
		addContentButton.setEnabled(false);
		addContentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addContentButtonActionPerformed(evt);
			}
		});

		topicNameLabel.setText("Topic Name");

		topicDescriptionLabel.setText("Brief Description");

		topicDescriptionTextArea.setColumns(20);
		topicDescriptionTextArea.setRows(5);
		topicDescriptionScrollPane.setViewportView(topicDescriptionTextArea);

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

		topicListLabel.setText("List of Topics ");

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
										.addContainerGap()
										.addGroup(
												topicInfoPanelLayout
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
																		.addGap(45,
																				45,
																				45))
														.addGroup(
																topicInfoPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				topicDescriptionLabel,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGap(28,
																				28,
																				28)))
										.addGroup(
												topicInfoPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																addTopicButton,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																127,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																topicInfoPanelLayout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				topicInfoPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								topicDescriptionScrollPane,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								393,
																								Short.MAX_VALUE)
																						.addComponent(
																								topicNameTextField,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								393,
																								Short.MAX_VALUE))
																		.addGap(40,
																				40,
																				40))))
						.addGroup(
								topicInfoPanelLayout
										.createSequentialGroup()
										.addComponent(
												topicListLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(476, Short.MAX_VALUE)));
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
																30,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																topicNameTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												topicInfoPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																topicDescriptionLabel)
														.addComponent(
																topicDescriptionScrollPane,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																70,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												topicInfoPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																topicInfoPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				addTopicButton)
																		.addGap(40,
																				40,
																				40))
														.addGroup(
																topicInfoPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				topicListLabel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));

		descriptionTextArea.setColumns(20);
		descriptionTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
		descriptionTextArea.setRows(5);
		descriptionTextArea.setEnabled(false);
		jScrollPane3.setViewportView(descriptionTextArea);

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

		renameButton.setText("Rename");
		renameButton.setEnabled(false);
		renameButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				renameButtonActionPerformed(evt);
			}
		});

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
																.addGap(120,
																		120,
																		120)
																.addComponent(
																		moduleSubjectLabel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		120,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		moduleSubjectNameLabel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		152,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		topPanel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		571,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(23, 23,
																		23)
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
																										topicListScrollPane,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										159,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		renameButton)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		deleteTopicButton)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		backButton)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		addContentButton))
																												.addComponent(
																														jScrollPane3,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														394,
																														Short.MAX_VALUE))))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										94,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														moduleSubjectNameLabel)
												.addComponent(
														moduleSubjectLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(topicInfoPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										158,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jScrollPane3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		196,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						addContentButton)
																				.addComponent(
																						backButton)
																				.addComponent(
																						deleteTopicButton)
																				.addComponent(
																						renameButton)))
												.addComponent(
														topicListScrollPane,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														228, Short.MAX_VALUE))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	protected void addTopicButtonMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void backButtonMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub

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
		addContentPage.setVisible(true);
	}

	private void renameButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String newTopicName = JOptionPane
				.showInputDialog("Enter new name for the Topic : ");
		int oldTopicIndex = topicList.getSelectedIndex();
		model.set(oldTopicIndex, newTopicName);

	}

	private void topicListValueChanged(javax.swing.event.ListSelectionEvent evt) {
		addContentButton.setEnabled(true);
		deleteTopicButton.setEnabled(true);
		renameButton.setEnabled(true);
		descriptionTextArea.setCaretColor(Color.blue);
		descriptionTextArea.setText("hi this is empty now");
		isModifiable(true);
	}

	protected void addTopicButtonActionPerformed(ActionEvent evt) {
		String newTopic = topicNameTextField.getText();
		String newTopicDescription = topicDescriptionTextArea.getText();

		if (model.contains(newTopic.trim())) {
			JOptionPane.showMessageDialog(this, "Topic already exists",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			newTopic = newTopic.trim();
			model.addElement(newTopic);
		}
		System.out.println(model.contains(newTopic.trim()));
		topicNameTextField.setText("");
	}

	protected void deleteTopicButtonActionPerformed(ActionEvent evt) {
		int topicIndex = topicList.getSelectedIndex();
		model.remove(topicIndex);
		if (model.size() == 0) {
			isModifiable(false);
		}

	}

	protected void isModifiable(boolean setValue) {
		deleteTopicButton.setEnabled(setValue);
		renameButton.setEnabled(setValue);
		addContentButton.setEnabled(setValue);
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
				new AddTopicForm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JButton addContentButton;
	private javax.swing.JButton addTopicButton;
	private javax.swing.JButton backButton;
	private javax.swing.JLabel companyLabel;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JButton deleteTopicButton;
	private javax.swing.JTextArea descriptionTextArea;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel moduleSubjectLabel;
	private javax.swing.JLabel moduleSubjectNameLabel;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JButton renameButton;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JLabel toolLabel;
	private javax.swing.JPanel topPanel;
	private javax.swing.JLabel topicDescriptionLabel;
	private javax.swing.JScrollPane topicDescriptionScrollPane;
	private javax.swing.JTextArea topicDescriptionTextArea;
	private javax.swing.JPanel topicInfoPanel;
	private javax.swing.JList topicList;
	private javax.swing.JLabel topicListLabel;
	private javax.swing.JScrollPane topicListScrollPane;
	private javax.swing.JLabel topicNameLabel;
	private javax.swing.JTextField topicNameTextField;
	// End of variables declaration//GEN-END:variables
	protected MasterPage masterPage;
	private javax.swing.DefaultListModel model;
	private TreeMap<String, String> topics = new TreeMap<String, String>();
	private AddContentPage addContentPage;

}