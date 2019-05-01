import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {

	private JFrame frmTransposicinColumnar;
	private JTextField textField_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private ButtonGroup Group;
	private JLabel lblTexto;
	private JLabel lblResultado;
	private JTextArea textArea;
	private JTextArea textArea_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmTransposicinColumnar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTransposicinColumnar = new JFrame();
		frmTransposicinColumnar.setTitle("Transposici\u00F3n Columnar");
		frmTransposicinColumnar.setBounds(100, 100, 529, 499);
		frmTransposicinColumnar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Comenzar");
		btnNewButton.setBounds(202, 239, 117, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					try {
						textArea_1.setText(encryption(textArea.getText(), textField_1.getText()));
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Fallo en el encriptado."); 
					}
					
				}else {
					try {
						textArea_1.setText(decryption(textArea.getText(), textField_1.getText()));
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null,"Fallo en el desencriptado. Palabra clave incorrecta."); 
					}
					
					
				}
			}
		});
		frmTransposicinColumnar.getContentPane().setLayout(null);
		frmTransposicinColumnar.getContentPane().add(btnNewButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Desencriptar");
		rdbtnNewRadioButton_1.setBounds(258, 206, 109, 23);
		frmTransposicinColumnar.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton = new JRadioButton("Encriptar");
		rdbtnNewRadioButton.setBounds(175, 206, 81, 23);
		frmTransposicinColumnar.getContentPane().add(rdbtnNewRadioButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 179, 299, 20);
		frmTransposicinColumnar.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		Group = new ButtonGroup();
		Group.add(rdbtnNewRadioButton);
		Group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Palabra clave:");
		lblNewLabel.setBounds(63, 182, 94, 14);
		frmTransposicinColumnar.getContentPane().add(lblNewLabel);
		
		lblTexto = new JLabel("Texto:");
		lblTexto.setBounds(60, 11, 46, 14);
		frmTransposicinColumnar.getContentPane().add(lblTexto);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(60, 272, 71, 14);
		frmTransposicinColumnar.getContentPane().add(lblResultado);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(63, 36, 402, 132);
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scroll.setBounds(63, 36, 402, 132);
		frmTransposicinColumnar.getContentPane().add(scroll);
		
		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(63, 301, 402, 132);
		JScrollPane scroll2 = new JScrollPane(textArea_1);
	    scroll2.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scroll2.setBounds(63, 301, 402, 132);
		frmTransposicinColumnar.getContentPane().add(scroll2);
		
	}
	private static String encryption(String in1, String in2){
		System.out.print("Enter Message: ");
		String plainText = in1.toUpperCase().replace(" ", "");
		StringBuilder msg = new StringBuilder(plainText);

		System.out.print("Enter Keyword: ");
		String keyword = in2.toUpperCase();

		// assigning numbers to keywords
		int[] kywrdNumList = keywordNumAssign(keyword);

		// printing keyword
		for (int i = 0, j = 1; i < keyword.length(); i++, j++) {
			System.out.print(keyword.substring(i, j) + " ");
		}
		System.out.println();

		for (int i: kywrdNumList){
			System.out.print(i + " ");

		}

		System.out.println();
		System.out.println("-------------------------");

		// in case characters don't fit the entire grid perfectly.
		int extraLetters = msg.length() % keyword.length();
		//System.out.println(extraLetters);
		int dummyCharacters = keyword.length() - extraLetters;
//        System.out.println(dummyCharacters);

		if (extraLetters != 0){
			for (int i = 0; i < dummyCharacters; i++) {
				msg.append(".");
			}
		}

		int numOfRows = msg.length() / keyword.length();

		// Converting message into a grid
		char[][] arr = new char[numOfRows][keyword.length()];

		int z = 0;
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < keyword.length(); j++) {
				arr[i][j] = msg.charAt(z);
				z++;
			}

		}

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < keyword.length(); j++) {
				System.out.print(arr[i][j] + " ");
			} // inner for loop
			System.out.println();
		} // for loop

		// cipher text generation
		StringBuilder cipherText = new StringBuilder();

		System.out.println();
		// getting locations of numbers
		String numLoc = getNumberLocation(keyword, kywrdNumList);
		System.out.println("Location of numbers: " + numLoc);
		System.out.println();

		for (int i = 0, k = 0; i < numOfRows; i++, k++) {
			int d;
			if (k == keyword.length()){
				break;
			} else {
				d = Character.getNumericValue(numLoc.charAt(k));
			}
			for (int j = 0; j < numOfRows; j++) {
				cipherText.append(arr[j][d]);
			}
		}

		System.out.println("Cipher Text: " + cipherText);
		return cipherText.toString();

	} // encryption method

	private static String decryption(String in1, String in2){


		System.out.print("Enter Message: ");
		String msg = in1.toUpperCase().replace(" ", "");

		System.out.print("Enter Keyword: ");
		String keyword = in2.toUpperCase();

		int numOfRows = msg.length() / keyword.length();

		// array with dummy values
		char[][] arr = new char[numOfRows][keyword.length()];

		// assigning numbers to keywords
		int[] kywrdNumList = keywordNumAssign(keyword);

		String numLoc = getNumberLocation(keyword, kywrdNumList);

		for (int i = 0, k = 0; i < msg.length(); i++, k++) {
			int d = 0;
			if (k == keyword.length()){
				k = 0;
			} else {
				d = Character.getNumericValue(numLoc.charAt(k));
			}

			for (int j = 0; j < numOfRows; j++, i++) {
				arr[j][d] = msg.charAt(i);
			} // for loop
			--i;
		}



		StringBuilder plainText = new StringBuilder();

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < keyword.length(); j++) {
				plainText.append(arr[i][j]);
			} // inner for loop
		} // for loop

		System.out.println("Plain Text: " + plainText);
		return plainText.toString();

	} // decryption function

	private static String getNumberLocation(String keyword, int[] kywrdNumList) {
		String numLoc = "";
		for (int i = 1; i < keyword.length() + 1; i++) {
			for (int j = 0; j < keyword.length(); j++) {
				if (kywrdNumList[j] == i){
					numLoc += j;
				}
			}
		}
		return numLoc;
	} // getting number location function

	private static int[] keywordNumAssign(String keyword) {
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] kywrdNumList = new int[keyword.length()];

		int init = 0;
		for (int i = 0; i < alpha.length(); i ++){
			for (int j = 0; j < keyword.length(); j++) {
				if (alpha.charAt(i) == keyword.charAt(j)){
					init++;
					kywrdNumList[j] = init;
				}
			} // inner for
		} // for
		return kywrdNumList;
	} // keyword number assignment function
}
