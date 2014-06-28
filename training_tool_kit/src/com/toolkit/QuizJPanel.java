/*
 * QuizJPanel2.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;

/**
 *
 * @author  __USER__
 */
public class QuizJPanel extends javax.swing.JPanel {

	/** Creates new form QuizJPanel2 */
	public QuizJPanel() {
		initComponents();
		autoSelectOnDelClickCheckBox.setVisible(false);
		deleteButton.setVisible(true);
		i = i + 1;
		System.out.println("i value " + i);
		questionLabel.setText("Q. " + i);
		this.validate();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		buttonGroup1 = new javax.swing.ButtonGroup();
		questionLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		aRadioButton = new javax.swing.JRadioButton();
		buttonGroup1.add(aRadioButton);
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		deleteButton = new javax.swing.JButton();
		autoSelectOnDelClickCheckBox = new javax.swing.JCheckBox();
		bRadioButton = new javax.swing.JRadioButton();
		buttonGroup1.add(bRadioButton);
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		cRadioButton = new javax.swing.JRadioButton();
		buttonGroup1.add(cRadioButton);
		jLabel3 = new javax.swing.JLabel();
		dRadioButton = new javax.swing.JRadioButton();
		buttonGroup1.add(dRadioButton);
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
 
		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				formMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				formMouseExited(evt);
			}
		});

		questionLabel.setText("Q.");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel1.setText("A");

		jLabel5.setText("Description");

		jTextArea3.setColumns(20);
		jTextArea3.setRows(5);
		jScrollPane3.setViewportView(jTextArea3);

		deleteButton.setText("X");
		deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				deleteButtonMouseClicked(evt);
			}

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				deleteButtonMouseEntered(evt);
			}
		});

		autoSelectOnDelClickCheckBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						autoSelectOnDelClickCheckBoxActionPerformed(evt);
					}
				});

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel2.setText("B");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel3.setText("C");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14));
		jLabel4.setText("D");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
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
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										questionLabel)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(11,
																																		11,
																																		11)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addGroup(
																																						layout.createSequentialGroup()
																																								.addGroup(
																																										layout.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																												.addGroup(
																																														layout.createSequentialGroup()
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		aRadioButton)
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		jLabel1))
																																												.addGroup(
																																														layout.createSequentialGroup()
																																																.addComponent(
																																																		bRadioButton)
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		jLabel2))
																																												.addGroup(
																																														layout.createSequentialGroup()
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		cRadioButton)
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		jLabel3))
																																												.addGroup(
																																														javax.swing.GroupLayout.Alignment.TRAILING,
																																														layout.createSequentialGroup()
																																																.addComponent(
																																																		dRadioButton)
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																																.addComponent(
																																																		jLabel4)
																																																.addGap(10,
																																																		10,
																																																		10)))
																																								.addPreferredGap(
																																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																								.addGroup(
																																										layout.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.TRAILING,
																																												false)
																																												.addComponent(
																																														jTextField3)
																																												.addComponent(
																																														jTextField4,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														294,
																																														Short.MAX_VALUE)
																																												.addComponent(
																																														jTextField2,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														338,
																																														Short.MAX_VALUE)
																																												.addComponent(
																																														jTextField1)))
																																				.addComponent(
																																						jScrollPane3,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						380,
																																						Short.MAX_VALUE)))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jScrollPane1,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		391,
																																		Short.MAX_VALUE))))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										348,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(39, 39,
																		39))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		autoSelectOnDelClickCheckBox)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		deleteButton)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														autoSelectOnDelClickCheckBox)
												.addComponent(
														deleteButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														19,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(13, 13, 13)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		128,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jLabel1)
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						aRadioButton))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						bRadioButton)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel3)
																												.addComponent(
																														cRadioButton))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										dRadioButton))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextField4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jTextField3,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel4)))))
												.addComponent(questionLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel5)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	protected void autoSelectOnDelClickCheckBoxActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void deleteButtonMouseEntered(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		AddQuizPanel quizPanel = (AddQuizPanel) (getParent().getParent()
				.getParent().getParent().getParent().getParent().getParent());
		//= new AddQuizPanel();
		System.out.println("start delete method form QuizJPanel2 ");
		autoSelectOnDelClickCheckBox.setSelected(true);
		quizPanel.removeQuizPanel();
		System.out.println("selection done auto... "
				+ autoSelectOnDelClickCheckBox.isSelected());

		System.out.println("end delete method form addtextJPanel");
		this.validate();

	}

	private void formMouseExited(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void formMouseEntered(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JRadioButton aRadioButton;
	private javax.swing.JCheckBox autoSelectOnDelClickCheckBox;
	private javax.swing.JRadioButton bRadioButton;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JRadioButton cRadioButton;
	private javax.swing.JRadioButton dRadioButton;
	private javax.swing.JButton deleteButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	public javax.swing.JLabel questionLabel;
	// End of variables declaration//GEN-END:variables
	public static int i = 0;

	
	
	public boolean isSelected() {
		// TODO Auto-generated method stub
		System.out.println(autoSelectOnDelClickCheckBox.isSelected()
				+ " in QuizPanel");
		return autoSelectOnDelClickCheckBox.isSelected();

	}

}