/*
 * AddTextJPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.event.AncestorListener;

/**
 *
 * @author  __USER__
 */
public class AddTextJPanel extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form AddTextJPanel */
	private static int count = 0;

	public String toString() {
		return "text-" + (++count);
	}

	public AddTextJPanel() {
		initComponents();
		model = new javax.swing.DefaultListModel();
		autoSelectOnDelClick.setVisible(false);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		addTextPanelLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		editorPane = new javax.swing.JEditorPane();
		jSeparator1 = new javax.swing.JSeparator();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		autoSelectOnDelClick = new javax.swing.JCheckBox();

		setBackground(new java.awt.Color(153, 153, 153));

		addTextPanelLabel.setText("enter text ");

		jScrollPane1.setViewportView(editorPane);

		jButton1.setText("\\/");

		jButton2.setText("/\\");
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton2MouseClicked(evt);
			}
		});
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("X");
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButton3MouseClicked(evt);
			}
		});
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		autoSelectOnDelClick
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						autoSelectOnDelClickActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(addTextPanelLabel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										61,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										204, Short.MAX_VALUE)
								.addComponent(autoSelectOnDelClick)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton3))
				.addComponent(jSeparator1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 435,
						Short.MAX_VALUE).addComponent(jScrollPane1));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jButton3)
																.addComponent(
																		jButton1)
																.addComponent(
																		jButton2)
																.addComponent(
																		addTextPanelLabel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		29,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														autoSelectOnDelClick))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										192,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:Moving text Box up

		AddContentPage cp = (AddContentPage) (getParent().getParent()
				.getParent().getParent().getParent().getParent().getParent());
		System.out.println("move up addtextJPanel");
		//remaining 

	}

	protected void jButton3ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	private void autoSelectOnDelClickActionPerformed(
			java.awt.event.ActionEvent evt) {

		System.out.println("CLicked.......");

	}

	private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
		//delete code
		AddContentPage cp = (AddContentPage) (getParent().getParent()
				.getParent().getParent().getParent().getParent().getParent());
		//= new AddContentPage();
		System.out.println("start delete method form addtextJPanel");
		autoSelectOnDelClick.setSelected(true);
		cp.removeTextPanel();
		System.out.println("selection done auto "
				+ autoSelectOnDelClick.isSelected());

		System.out.println("end delete method form addtextJPanel");
		this.validate();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel addTextPanelLabel;
	private javax.swing.JCheckBox autoSelectOnDelClick;
	public javax.swing.JEditorPane editorPane;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration//GEN-END:variables
	public javax.swing.DefaultListModel model;

	public void setLabelText(String text) {
		addTextPanelLabel.setText(text);
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		System.out.println(autoSelectOnDelClick.isSelected() + " in AddText");
		return autoSelectOnDelClick.isSelected();

	}

	public String getText() {
		return editorPane.getText();
	}

	public void setText(String value) {
		// TODO Auto-generated method stub
		editorPane.setText(value);
	}
}