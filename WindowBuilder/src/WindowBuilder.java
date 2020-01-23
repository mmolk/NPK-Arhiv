import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class WindowBuilder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder frame = new WindowBuilder();
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
	public WindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton gumbich = new JButton("JButton");
		gumbich.setFont(new Font("Impact", Font.PLAIN, 18));
		gumbich.setBackground(new Color(0, 51, 0));
		gumbich.setForeground(Color.MAGENTA);
		gumbich.setToolTipText("Buttoncic");
		gumbich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		gumbich.setBounds(269, 36, 110, 73);
		panel.add(gumbich);
		
		JLabel labelca = new JLabel("TEXT");
		labelca.setForeground(new Color(0, 0, 139));
		labelca.setHorizontalAlignment(SwingConstants.CENTER);
		labelca.setFont(new Font("Segoe Script", Font.BOLD, 30));
		labelca.setBackground(new Color(0, 0, 204));
		labelca.setBounds(83, 108, 110, 44);
		panel.add(labelca);
		
		JRadioButton rdbtnRadio = new JRadioButton("Radio");
		rdbtnRadio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		rdbtnRadio.setForeground(new Color(124, 252, 0));
		rdbtnRadio.setBackground(new Color(255, 0, 255));
		rdbtnRadio.setBounds(269, 135, 110, 44);
		panel.add(rdbtnRadio);
	}
}
