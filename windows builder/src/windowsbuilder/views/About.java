package windowsbuilder.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setForeground(Color.DARK_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\TILAKRAJ SINGH RAO\\Downloads\\hacking.png"));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.menu);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JTextArea txtrAuthorTilakrajSingh = new JTextArea();
		txtrAuthorTilakrajSingh.setBackground(SystemColor.menu);
		txtrAuthorTilakrajSingh.setForeground(SystemColor.windowText);
		txtrAuthorTilakrajSingh.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 17));
		txtrAuthorTilakrajSingh.setEditable(false);
		txtrAuthorTilakrajSingh.setText("Author: Tilakraj singh rao\r\ncompany: RAo\r\nReleased: 5 june 2019\r\nversion : 1.0\r\nType: free software");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrAuthorTilakrajSingh, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(txtrAuthorTilakrajSingh, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
