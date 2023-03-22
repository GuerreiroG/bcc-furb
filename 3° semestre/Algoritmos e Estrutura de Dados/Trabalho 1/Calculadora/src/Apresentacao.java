import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Apresentacao {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CALCULADORA");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 36));
		lblTitulo.setBounds(148, 20, 285, 32);
		panel.add(lblTitulo);
		
		JRadioButton rdbtnPilhaVetor = new JRadioButton("Pilha Vetor");
		rdbtnPilhaVetor.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPilhaVetor.setFont(new Font("Arial", Font.BOLD, 20));
		buttonGroup.add(rdbtnPilhaVetor);
		rdbtnPilhaVetor.setSelected(true);;
		rdbtnPilhaVetor.setBounds(148, 109, 143, 39);
		panel.add(rdbtnPilhaVetor);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pilha Lista");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 20));
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(281, 109, 152, 39);
		panel.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField.setBounds(112, 194, 344, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnCalcular.setBounds(162, 282, 119, 39);
		panel.add(btnCalcular);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnLimpar.setBounds(291, 282, 119, 39);
		panel.add(btnLimpar);
	}
}
