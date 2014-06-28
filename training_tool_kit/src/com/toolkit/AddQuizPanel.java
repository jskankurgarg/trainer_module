/*
 * AddQuizPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  __USER__
 */
public class AddQuizPanel extends javax.swing.JFrame {

	/** Creates new form AddQuizPanel */
	public AddQuizPanel() {
		model = new javax.swing.DefaultListModel();
		initComponents();
		setSize(700, 650);
		setResizable(false);
		layout = new java.awt.GridLayout(0, 1, 5, 5);
		contentPanel.setLayout(layout);
		ImageIcon toolIcon = new ImageIcon("images/logo2.jpg");
		//toolIcon.
		toolLabel.setIcon(toolIcon);

		ImageIcon titleIcon = new ImageIcon("images/tool_title_image.png");
		titleLabel.setIcon(titleIcon);

		ImageIcon companyIcon = new ImageIcon("images/zensar_logo_2.jpg");
		companyLabel.setIcon(companyIcon);
		quizPanel2 = new QuizJPanel();

		contentPanel.add(quizPanel2);
		this.validate();

	}

	public AddQuizPanel(AddContentPage addContentPage) {
		this();
		this.addContentPage = addContentPage;
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		contentPanel = new javax.swing.JPanel();
		topPanel = new javax.swing.JPanel();
		toolLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		companyLabel = new javax.swing.JLabel();
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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Add More Questions");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Finish");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		contentPanel.setBackground(new java.awt.Color(153, 153, 153));
		contentPanel.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		contentPanel.setLayout(new java.awt.GridBagLayout());
		jScrollPane1.setViewportView(contentPanel);

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

		contentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_H,
				java.awt.event.InputEvent.ALT_MASK));
		contentsMenuItem.setText("Contents");
		contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				contentsMenuItemActionPerformed(evt);
			}
		});
		helpMenu.add(contentsMenuItem);

		aboutMenuItem.setText("About");
		helpMenu.add(aboutMenuItem);

		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

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
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						topPanel,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						659,
																						Short.MAX_VALUE)
																				.addComponent(
																						jScrollPane1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						659,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addContainerGap())
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		74,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(26, 26,
																		26)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(topPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										94,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(jButton1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										432,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.out.println("entered into help");
		run = Runtime.getRuntime();
		try {
			child = Runtime.getRuntime().exec(
					"rundll32 url.dll,FileProtocolHandler D:\\data\\help.chm");

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (addContentPage == null) {
			addContentPage = new AddContentPage(this);
		}
		this.setVisible(false);
		addContentPage.displayContentPage(true);
		
		
		
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		quizPanel2 = new QuizJPanel();
		System.out.println("obj created.");
		contentPanel.add(quizPanel2);

		this.validate();
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
				new AddQuizPanel().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem aboutMenuItem;
	private javax.swing.JLabel companyLabel;
	private javax.swing.JPanel contentPanel;
	private javax.swing.JMenuItem contentsMenuItem;
	private javax.swing.JMenuItem copyMenuItem;
	private javax.swing.JMenuItem cutMenuItem;
	private javax.swing.JMenuItem deleteMenuItem;
	private javax.swing.JMenu editMenu;
	private javax.swing.JMenuItem exitMenuItem;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JMenu helpMenu;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuItem openMenuItem;
	private javax.swing.JMenuItem pasteMenuItem;
	private javax.swing.JMenuItem saveAsMenuItem;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JLabel toolLabel;
	private javax.swing.JPanel topPanel;
	// End of variables declaration//GEN-END:variables
	private javax.swing.DefaultListModel model;
	public AddCodePanel codeJPanel;
	public QuizJPanel quizPanel2;
	private GridLayout layout;
	public Txtbox tbox;
	private AddContentPage addContentPage;
	private Runtime run;
	private Process child;

	public void displayQuizPage(boolean value) {
		setVisible(value);
	}

	public void removeQuizPanel() {
		// TODO Auto-generated method stub
		System.out.println("start removeQuizpanel method");

		for (Component panel : contentPanel.getComponents()) {

			System.out.println("Entered component");
			boolean checkValue = false;
			if (panel instanceof QuizJPanel) {
				QuizJPanel tempPanel = (QuizJPanel) panel;
				System.out.println("checking check value..");
				checkValue = tempPanel.isSelected();
				System.out.println("CheckValue " + checkValue);
				
				
				//code for saving  calling integration
				//Integration.setQuizPage(this);
			}
			if (checkValue == true) {
				System.out.println("Entered to delete");
				contentPanel.remove(panel);
				System.out
						.println("-----------------------------------------------------------------------");
				System.out.println(getClass() + ":  deleting quiz panel ....");
				shuffle();
			}
		}

	}

	public void shuffle() {//very useful method
		Stack<Component> panels = new Stack<Component>();
		int count = 0;
		for (Component c : contentPanel.getComponents()) {

			if (c instanceof QuizJPanel) {
				count++;
				QuizJPanel tempPanel = (QuizJPanel) c;
				tempPanel.questionLabel.setText("Q. " + count);
			}
			panels.push(c);
			System.out.println("shuffle count \n----------->" + count);
		}
		QuizJPanel.i = count;
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

}