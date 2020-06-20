package windowsbuilder.views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.CompoundBorder;

public class windowbuigui extends JFrame {
	private JTextField textField;
	private JLabel lblName;
	private JLabel lblSex;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rdmale;
	private JRadioButton rdvegeterain;
	private JLabel lblType;
	private JRadioButton rbnonveg;
	private JRadioButton rdfemale;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JLabel lblSpecialInstruction;
	private JScrollPane scrollPane_4;
	private JTextArea textArea_1;
	private JButton btnOrder_2;
	private JButton btnOrder;
	private JLabel lblCustomerType;
	private JScrollPane srlcustomers;
	private JComboBox cbcustomertype;
	private JList lstcustomers;
	private JLabel lblDrinks;
	private JCheckBox chckbxCoke;
	private JCheckBox chckbxCokeWithIce;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenuItem mntmExit;
	private JMenuItem mntmNewFile;
	private JMenuItem mntmSaveFile;
	private JMenuItem mntmOpenFile;
	private JMenu mnCheckBoxOption;
	private JMenu mnRadioBoxOption;
	private JCheckBoxMenuItem chckbxmntmCb;
	private JCheckBoxMenuItem chckbxmntmCb_1;
	private JRadioButtonMenuItem rdbtnmntmRd;
	private JRadioButtonMenuItem rdbtnmntmRd_1;
	private JPopupMenu popupMenu;
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmPaste;
	private JMenuItem mntmCopy;
	private JMenuItem mntmRefersh;
	private JMenuItem mntmFormatText;
	private JMenuItem mntmLayout;
	private JMenuItem mntmRefresh;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JProgressBar pborders;
	//component model//
	
//DefaultListModel customerList=new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowbuigui frame = new windowbuigui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public windowbuigui() {
		initcomponents();
		createEvents();
		
	}

	private void createEvents() {
			 mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					About ab=new About();
					ab.setModal(true);
					ab.setVisible(true);
				}
			});
			 mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
								int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
					if(ret == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				}
			});
			 lstcustomers.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					lstcustomers.getSelectedIndex();
					//JOptionPane.showMessageDialog(null, "click to select");
					/*if(lstcustomers.getName().toLowerCase().contains("singh"))
					{
						chckbxCokeWithIce.setSelected(false);
					}
					else
					{
						chckbxCoke.setSelected(true);
					}*/
				}
			});
			 lstcustomers.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
				lstcustomers.setToolTipText("("+e.getX()+","+e.getY()+")");
				}
			});
			 btnOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pborders.setValue(pborders.getValue()+1);
					if(pborders.getValue() >= pborders.getMaximum()) {
						pborders.setForeground(Color.green);
					}
					else if(pborders.getValue() >=(pborders.getMaximum()-pborders.getMinimum())/2) {
						pborders.setForeground(Color.yellow);
					}
					else
					{
					pborders.setForeground(Color.cyan);	
					}
					
					JOptionPane.showMessageDialog(null, "order  is conformed");
					JOptionPane.showMessageDialog(null, lstcustomers.getSelectedValue());
					JOptionPane.showMessageDialog(null, cbcustomertype.getSelectedItem());
					//customerList.addElement("test"); 
					if(rdmale.isSelected()) {
						JOptionPane.showMessageDialog(null, "male selected!");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "female selected!");
					}
					if(rdvegeterain.isSelected()) {
						JOptionPane.showMessageDialog(null, "you are vegeterian!");
					}
					else {
						JOptionPane.showMessageDialog(null, "you are nunvegeterian");
					}
					if(chckbxCoke.isSelected()) 
					{
						JOptionPane.showMessageDialog(null, "coke selected!");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "coke with ice!");
					}
				//customerList.addElement("trick");	
				}
				
			});
		 }
	

	private void initcomponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\TILAKRAJ SINGH RAO\\Downloads\\hacking.png"));
		setTitle("my first GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 420);
		
		lblName = new JLabel("first name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lblSex = new JLabel("sex:");
		
		rdmale = new JRadioButton("male");
		buttonGroup_3.add(rdmale);
		
		rdfemale = new JRadioButton("female");
		buttonGroup_3.add(rdfemale);
		
		lblType = new JLabel("type");
		
		rdvegeterain = new JRadioButton("vegiterina ");
		buttonGroup_2.add(rdvegeterain);
		
		rbnonveg = new JRadioButton("non - vegeterain");
		buttonGroup_2.add(rbnonveg);
		
		lblSpecialInstruction = new JLabel("special instruction:");
		
		scrollPane_4 = new JScrollPane();
		
		btnOrder_2 = new JButton("order");
		
		btnOrder = new JButton("order");		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "customers", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		lblDrinks = new JLabel("drinks:");
		
		chckbxCoke = new JCheckBox("coke");
		
		chckbxCokeWithIce = new JCheckBox("coke with ice");
		
		popupMenu = new JPopupMenu();
		addPopup(getContentPane(), popupMenu);
		
		mntmPaste = new JMenuItem("paste");
		popupMenu.add(mntmPaste);
		
		mntmCopy = new JMenuItem("copy");
		popupMenu.add(mntmCopy);
		
		mntmRefersh = new JMenuItem("refersh");
		popupMenu.add(mntmRefersh);
		
		pborders = new JProgressBar();
		pborders.setStringPainted(true);
		pborders.setMaximum(10);
		pborders.setBackground(SystemColor.inactiveCaption);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDrinks)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxCoke)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxCokeWithIce)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnOrder)
							.addGap(2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblType)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdvegeterain))
										.addComponent(lblSex))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdmale)
											.addGap(4)
											.addComponent(rdfemale))
										.addComponent(rbnonveg)))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblSpecialInstruction)
										.addGap(13)
										.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
									.addComponent(pborders, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
					.addGap(86)
					.addComponent(btnOrder_2)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdfemale)
										.addComponent(rdmale)
										.addComponent(lblSex))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblType)
										.addComponent(rdvegeterain)
										.addComponent(rbnonveg))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(235)
											.addComponent(btnOrder_2))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblSpecialInstruction))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblDrinks)
												.addComponent(chckbxCoke)
												.addComponent(chckbxCokeWithIce))
											.addGap(18)
											.addComponent(pborders, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnOrder)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 332, Short.MAX_VALUE)))
					.addGap(32))
		);
		
		lblCustomerType = new JLabel("Customer type:");
		
		cbcustomertype = new JComboBox();
		cbcustomertype.setModel(new DefaultComboBoxModel(new String[] {"students", "couple", "stag", "family", "others"}));
		cbcustomertype.setSelectedIndex(4);
		
		JLabel lblCustomers = new JLabel("Customers:");
		
		srlcustomers = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCustomerType)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbcustomertype, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCustomers)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(srlcustomers, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCustomerType)
						.addComponent(cbcustomertype, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCustomers)
							.addContainerGap(254, Short.MAX_VALUE))
						.addComponent(srlcustomers, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
		);
		
		lstcustomers = new JList();
		//lstcustomers = new JList(customerList);
		lstcustomers.setValueIsAdjusting(true);
		lstcustomers.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		lstcustomers.setToolTipText("kksd\r\nalikdf\r\nddf\r\ndsd\r\ndfdsfd\r\nkdjkjdk\r\nd");
		lstcustomers.setModel(new AbstractListModel() {
			String[] values = new String[] {"tilakraj", "alok", "mayank", "shubham"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstcustomers.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstcustomers.setSelectedIndex(0);
		srlcustomers.setViewportView(lstcustomers);
		
		lstcustomers = new JList();
		lstcustomers.setModel(new AbstractListModel() {
			String[] values = new String[] {"tilakraj singh rao", "alok", "shubham", "mayank singh"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		srlcustomers.setViewportView(lstcustomers);
		panel.setLayout(gl_panel);
		
		textArea_1 = new JTextArea();
		scrollPane_4.setViewportView(textArea_1);
		
		popupMenu_1 = new JPopupMenu();
		addPopup(textArea_1, popupMenu_1);
		
		mntmFormatText = new JMenuItem("format text");
		popupMenu_1.add(mntmFormatText);
		
		mntmLayout = new JMenuItem("layout");
		popupMenu_1.add(mntmLayout);
		
		mntmRefresh = new JMenuItem("refresh");
		popupMenu_1.add(mntmRefresh);
		getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon("C:\\code repositor\\windows builder\\src\\windowsbuilder\\resources\\icon.png"));
		mnFile.add(mntmExit);
		
		mntmNewFile = new JMenuItem("New file");
		mnFile.add(mntmNewFile);
		
		mntmOpenFile = new JMenuItem("open file");
		mnFile.add(mntmOpenFile);
		
		mntmSaveFile = new JMenuItem("Save file");
		mnFile.add(mntmSaveFile);
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mnCheckBoxOption = new JMenu("check box option");
		mnEdit.add(mnCheckBoxOption);
		
		chckbxmntmCb_1 = new JCheckBoxMenuItem("cb 2");
		mnCheckBoxOption.add(chckbxmntmCb_1);
		
		chckbxmntmCb = new JCheckBoxMenuItem("cb 1");
		mnCheckBoxOption.add(chckbxmntmCb);
		
		mnRadioBoxOption = new JMenu("radio box option");
		buttonGroup_4.add(mnRadioBoxOption);
		mnEdit.add(mnRadioBoxOption);
		
		rdbtnmntmRd = new JRadioButtonMenuItem("rd 1");
		buttonGroup_4.add(rdbtnmntmRd);
		mnRadioBoxOption.add(rdbtnmntmRd);
		
		rdbtnmntmRd_1 = new JRadioButtonMenuItem("rd 2");
		buttonGroup_4.add(rdbtnmntmRd_1);
		mnRadioBoxOption.add(rdbtnmntmRd_1);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
