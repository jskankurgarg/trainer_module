/*
 * AddMediaJPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package com.toolkit;

/**
 *
 * @author  __USER__
 */
public class AddMediaJPanel extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form AddMediaJPanel */
	private static int count = 0;

	public String toString() {
		return mediaTypeLabel.getText() + "-" + (++count);
		/*
		 * sample return value 
		 * videos-1
		 * images-3
		 * audios-6
		 */
	}

	public AddMediaJPanel() {
		initComponents();
		this.setSize(50, 75);
		previewButton.setVisible(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		mediaNameSelectedLabel = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		mediaFileNameLabel = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		previewButton = new javax.swing.JButton();
		autoSelectOnDelClick = new javax.swing.JCheckBox();
		fileNameLabel = new javax.swing.JLabel();
		mediaTypeLabel = new javax.swing.JLabel();

		setBackground(new java.awt.Color(153, 153, 153));

		mediaNameSelectedLabel.setText("Media Selected : ");

		jSeparator3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(153, 204, 255)));

		mediaFileNameLabel.setText("Media Name");

		jButton1.setText("/\\");

		jButton2.setText("\\/");

		jButton3.setText("X");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		previewButton.setText("preview");

		autoSelectOnDelClick.setVisible(false);

		fileNameLabel.setText("File Name :");

		mediaTypeLabel.setText("media type");

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
												.addComponent(fileNameLabel)
												.addComponent(
														mediaNameSelectedLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		mediaTypeLabel,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		117,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		29,
																		Short.MAX_VALUE)
																.addComponent(
																		autoSelectOnDelClick)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		previewButton)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		43,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton3))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		mediaFileNameLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		371,
																		Short.MAX_VALUE)
																.addContainerGap())))
				.addComponent(jSeparator3,
						javax.swing.GroupLayout.DEFAULT_SIZE, 479,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton3)
												.addComponent(jButton1)
												.addComponent(previewButton)
												.addComponent(jButton2)
												.addComponent(
														autoSelectOnDelClick)
												.addComponent(mediaTypeLabel)
												.addComponent(
														mediaNameSelectedLabel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														23, Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(fileNameLabel)
												.addComponent(
														mediaFileNameLabel))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jSeparator3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

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
	private javax.swing.JCheckBox autoSelectOnDelClick;
	private javax.swing.JLabel fileNameLabel;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JLabel mediaFileNameLabel;
	private javax.swing.JLabel mediaNameSelectedLabel;
	private javax.swing.JLabel mediaTypeLabel;
	private javax.swing.JButton previewButton;

	// End of variables declaration//GEN-END:variables
	public void setText(String text, String type) {
		mediaFileNameLabel.setText(text);
		mediaTypeLabel.setText("[" + type + "]");
	}

	public boolean isSelected() {
		System.out.println(autoSelectOnDelClick.isSelected() + " in AddText");
		return autoSelectOnDelClick.isSelected();
	}

	public String getMediaInfo() {
		return mediaFileNameLabel.getText() + "," + mediaTypeLabel.getText();
	}

	public void setMediaInfo(String mediaName) {
		// TODO Auto-generated method stub

	}
}