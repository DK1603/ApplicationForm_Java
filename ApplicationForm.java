import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ApplicationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// variables for user inputs
	private JTextField userName;
	private JTextField birthDate;
	private JTextField email;
	private JTextField phoneNum;
	private JTextField degree;
	private JTextField gpaGrad;
	private JTextField country;
	private JTextField attendedUni;
	private JTextField userAddr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm frame = new ApplicationForm();
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
	// A method to create a DocumentListener
	private DocumentListener createDocumentListener(JTextField textField) {
		return new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				textField.setForeground(Color.BLACK);
			}

			public void removeUpdate(DocumentEvent e) {
				textField.setForeground(Color.BLACK);
			}

			public void changedUpdate(DocumentEvent e) {
				// Plain text components do not fire these events
			}
		};
	}

	private DocumentListener createDocumentListener(JTextArea textArea) {
		return new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				textArea.setForeground(Color.BLACK);
			}

			public void removeUpdate(DocumentEvent e) {
				textArea.setForeground(Color.BLACK);
			}

			public void changedUpdate(DocumentEvent e) {
				// Plain text components do not fire these events
			}
		};
	}

	public ApplicationForm() {
		setTitle("SKKU - New Student Enrollment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		// logoLbl.setBackground (new Color (0, 0, 0, 0));

		JLabel heading = new JLabel("Application Form");
		heading.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 30));
		heading.setForeground(Color.WHITE);
		heading.setBounds(303, 33, 251, 56);
		contentPane.add(heading);

		JLabel motto = new JLabel("“Inspiring Future, Grand Challenge”");
		motto.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		motto.setForeground(Color.WHITE);
		motto.setBounds(23, 404, 289, 73);
		contentPane.add(motto);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(getClass().getResource("skku_logo.png")));
		logo.setBounds(73, 489, 180, 173);
		contentPane.add(logo);

		userName = new JTextField();
		userName.setBounds(357, 187, 197, 26);
		contentPane.add(userName);
		userName.setColumns(10);

		JLabel applicantName = new JLabel("Applicant's Name*");
		applicantName.setBounds(395, 171, 126, 16);
		contentPane.add(applicantName);

		birthDate = new JTextField();
		birthDate.setColumns(10);
		birthDate.setBounds(585, 187, 197, 26);
		contentPane.add(birthDate);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(357, 240, 197, 26);
		contentPane.add(email);

		JLabel lblBirthDate = new JLabel("Birth Date*");
		lblBirthDate.setBounds(647, 171, 68, 16);
		contentPane.add(lblBirthDate);

		JLabel lblEmail = new JLabel("Email*");
		lblEmail.setBounds(434, 225, 52, 16);
		contentPane.add(lblEmail);

		JLabel lblNewLabel = new JLabel("Degree*");
		lblNewLabel.setBounds(654, 278, 61, 16);
		contentPane.add(lblNewLabel);

		phoneNum = new JTextField();
		phoneNum.setColumns(10);
		phoneNum.setBounds(585, 240, 197, 26);
		contentPane.add(phoneNum);

		JLabel lblNewLabel_1 = new JLabel("Attended university(Graduates)");
		lblNewLabel_1.setBounds(585, 334, 197, 16);
		contentPane.add(lblNewLabel_1);

		degree = new JTextField();
		degree.setColumns(10);
		degree.setBounds(585, 296, 197, 26);
		contentPane.add(degree);

		JLabel lblNewLabel_2 = new JLabel("GPA (Graduates)");
		lblNewLabel_2.setBounds(409, 334, 123, 16);
		contentPane.add(lblNewLabel_2);

		gpaGrad = new JTextField();
		gpaGrad.setColumns(10);
		gpaGrad.setBounds(357, 355, 197, 26);
		contentPane.add(gpaGrad);

		JLabel lblNewLabel_3 = new JLabel("Phone number*");
		lblNewLabel_3.setBounds(626, 225, 109, 16);
		contentPane.add(lblNewLabel_3);

		country = new JTextField();
		country.setColumns(10);
		country.setBounds(357, 296, 197, 26);
		contentPane.add(country);

		JLabel lblNewLabel_4 = new JLabel("Country*");
		lblNewLabel_4.setBounds(425, 278, 61, 16);
		contentPane.add(lblNewLabel_4);

		attendedUni = new JTextField();
		attendedUni.setColumns(10);
		attendedUni.setBounds(585, 355, 197, 26);
		contentPane.add(attendedUni);

		JLabel lblNewLabel_5 = new JLabel("Home Address*");
		lblNewLabel_5.setBounds(521, 400, 109, 16);
		contentPane.add(lblNewLabel_5);

		userAddr = new JTextField();
		userAddr.setBounds(444, 417, 251, 26);
		contentPane.add(userAddr);
		userAddr.setColumns(10);

		JLabel lblNewLabel6 = new JLabel("Personal Statement (more than 100 words)*");
		lblNewLabel6.setBounds(434, 455, 281, 16);
		contentPane.add(lblNewLabel6);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 481, 289, 122);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JTextPane description = new JTextPane();
		description.setEditable(false);
		description.setFont(new Font("Avenir Next", Font.PLAIN, 18));
		description.setForeground(Color.WHITE);
		description.setText(
				"Sungkyunkwan University is \na national university with 625 \nyears of glorious history and \nshining tradition and is a \nrepresentative symbol of a \nleading university which leads \nthe new era.");
		description.setBounds(31, 188, 281, 188);
		description.setBackground(new Color(0, 0, 0, 0));
		description.setOpaque(false);

		contentPane.add(description);

		// adding DocumentListener to each JTextField during their initialization so
		// that whenever user tries to correct the exception the font will become black
		// again
		userName.getDocument().addDocumentListener(createDocumentListener(userName));
		birthDate.getDocument().addDocumentListener(createDocumentListener(birthDate));
		email.getDocument().addDocumentListener(createDocumentListener(email));
		phoneNum.getDocument().addDocumentListener(createDocumentListener(phoneNum));
		country.getDocument().addDocumentListener(createDocumentListener(country));
		degree.getDocument().addDocumentListener(createDocumentListener(degree));
		attendedUni.getDocument().addDocumentListener(createDocumentListener(attendedUni));
		gpaGrad.getDocument().addDocumentListener(createDocumentListener(gpaGrad));
		userAddr.getDocument().addDocumentListener(createDocumentListener(userAddr));
		textArea.getDocument().addDocumentListener(createDocumentListener(textArea));

		JButton submitBtn = new JButton("Submit Application");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nameInput = userName.getText();
				String ageInput = birthDate.getText();
				String emailInput = email.getText();
				String phoneInput = phoneNum.getText();
				String addressInput = userAddr.getText();
				String degreeInput = degree.getText();
				String countryInput = country.getText();
				// String uniInput = attendedUni.getText();
				// String gpaInput = gpaGrad.getText();
				String essay = textArea.getText();

				// setting the background to white color
				userName.setForeground(Color.BLACK);
				birthDate.setForeground(Color.BLACK);
				email.setForeground(Color.BLACK);
				phoneNum.setForeground(Color.BLACK);
				country.setForeground(Color.BLACK);
				degree.setForeground(Color.BLACK);
				attendedUni.setForeground(Color.BLACK);
				gpaGrad.setForeground(Color.BLACK);
				userAddr.setForeground(Color.BLACK);
				textArea.setForeground(Color.BLACK);

				// creating array of strings to store error messages
				String excepMsg = new String();
				int numOfException = 1;
				try { // start of try

					// code for determining exceptions for Application Name
					String[] words = nameInput.split(" ");
					if (nameInput.equals("")) {

						excepMsg += numOfException + ") You forgot to fill the Name text field. Please fill it\n";
						numOfException++;
					} else if (words.length > 0 && words.length <= 1) {
						userName.setForeground(Color.RED);
						excepMsg += numOfException + ") You forgot to write your name or surname\n";
						numOfException++;
					}

					// code for determining exceptions for BirthDate
					if (ageInput.equals("")) {
						excepMsg += numOfException + ") You forgot to fill the Birth Date text field. Please fill it\n";
						numOfException++;
					} else {
						int numOfSlash = 0;
						for (int i = 0; i < ageInput.length(); i++)
							if (ageInput.toCharArray()[i] == '/') // counts the number of slashes, if there are exactly
																	// 2 of them -> no exception
								numOfSlash++;
						if (numOfSlash != 2) {
							birthDate.setForeground(Color.RED);
							excepMsg += numOfException + ") Birthdate must be in '06/06/1995' format\n";
							numOfException++;
						}
					}

					// code for determining exceptions for Email
					if (emailInput.equals("")) {
						excepMsg += numOfException + ") You forgot to fill the Email text field. Please fill it\n";
						numOfException++;
					} else if ((!emailInput.contains("@")) || !(emailInput.contains("."))) {
						email.setForeground(Color.RED);
						excepMsg += numOfException + ") Email must be in example@some.some\n";
						numOfException++;
					}

					// code for determining exceptions for Phone Number
					boolean isNumber = true;
					int numOfDash = 0; // counts the number of dashes in a string

					if (phoneInput.equals("")) {
						excepMsg += numOfException
								+ ") You forgot to fill the Phone Number text field. Please fill it\n";
						numOfException++;
					} else {
						for (int i = 0; i < phoneInput.length(); i++) {
							if (phoneInput.charAt(i) == '-')
								numOfDash++;
							else {
								if (!Character.isDigit(phoneInput.charAt(i))) {
									
									isNumber = false;
									break;
								}
							}
						}
						if ((numOfDash != 2) || !(isNumber) || (phoneInput.length() != 13)) {   // if numofDash is exactly
																								// 2,
																								// phone number consist
																								// only of digits and
																								// the length of the
																								// string is 13 -> no
																								// exception
							phoneNum.setForeground(Color.RED);

							excepMsg += numOfException + ") Proper format for a phone number is 010-2158-0222\n";
							numOfException++;
						}
					}

					// code for determining exceptions for Country
					if (countryInput.equals("")) {
						excepMsg += numOfException + ") You forgot to fill the Country text field. Please fill it\n";
						numOfException++;
					}
					else if (countryInput.matches(".*\\d.*")) { // This checks if the string contains any digit
						country.setForeground(Color.RED);
						excepMsg += numOfException + ") Country field should not contain numbers.\n";
						numOfException++;
					}

					// debug
					System.out.println("phoneInput: " + phoneInput);
					System.out.println("numOfDash: " + numOfDash);
					System.out.println("isNumber: " + isNumber);
					System.out.println("phoneInput.length(): " + phoneInput.length());

					// code for determining exceptions for Degree
					if (degreeInput.equals("")) {
						excepMsg += numOfException + ") You forgot to fill the Degree text field. Please fill it\n";
						numOfException++;
					}
					else if (degreeInput.matches(".*\\d.*")) { // This checks if the string contains any digit
						degree.setForeground(Color.RED);
						excepMsg += numOfException + ") Degree field should not contain numbers.\n";
						numOfException++;
					}

					else if (!degreeInput.toLowerCase().equals("bachelor")
							&& !degreeInput.toLowerCase().equals("undergraduate")) {
						String uni = attendedUni.getText();
						String gpa = gpaGrad.getText();
						if (uni.equals("")) {
							attendedUni.setForeground(Color.RED);
							excepMsg += numOfException
									+ ") For graduate, you forgot to fill the Attended University field. Please fill it\n";
							numOfException++;
						} else if (uni.matches(".*\\d.*")) { // This checks if the string contains any digit
							attendedUni.setForeground(Color.RED);
							excepMsg += numOfException + ") Attended University field should not contain numbers.\n";
							numOfException++;
						}

						if (gpa.equals("")) {
							gpaGrad.setForeground(Color.RED);
							excepMsg += numOfException + ") For graduate, you forgot to fill the GPA field. Please fill it\n";
							numOfException++;
						} else {
							try {
								double gpaValue = Double.parseDouble(gpa);
								if (gpaValue > 4.5 || gpaValue < 0) {
									gpaGrad.setForeground(Color.RED);
									excepMsg += numOfException + ") GPA must be between 0 and 4.5\n";
									numOfException++;
								}
							} catch (NumberFormatException exception) {
								gpaGrad.setForeground(Color.RED);
								excepMsg += numOfException + ") GPA must be a numeric value\n";
								numOfException++;
							}
						}

					}

					// code for determining exceptions for Personal Statement
					String[] wordsEssay = essay.split(" "); // string to store the separated words of the essay not just
															// the characters
					if (essay.equals("")) {
						excepMsg += numOfException
								+ ") You forgot to fill the Personal Statement text field. Please fill it\n";
						numOfException++;
					} else if (wordsEssay.length < 100) {
						textArea.setForeground(Color.RED);
						excepMsg += numOfException + ") Your Personal Statement must be at least 100 words\n";
						numOfException++;
					}

					// code for determining exceptions for Home Address
					if (addressInput.equals("")) {
						excepMsg += numOfException
								+ ") You forgot to fill the Home Address text field. Please fill it\n";
						numOfException++;
					} else {
						int numOfCommas = 0;
						for (int i = 0; i < addressInput.length(); i++) {
							if (addressInput.toCharArray()[i] == ',')
								numOfCommas++;
						}
						if (numOfCommas != 3) { // if numOfCommas is not exactly 3 -> wrong format(exception)
							userAddr.setForeground(Color.RED);
							excepMsg += numOfException
									+ ") Your address must be in 'number, street, distinct, city' format\n";
							numOfException++;
						}
					}

					// if string 'message' is empty -> no exceptions
					// if no exceptions occurred -> show the success screen and cleans all text
					// fields, otherwise shows all the error messages

					if (!excepMsg.equals(""))
						throw new Exception(excepMsg);
					else {
						JOptionPane.showMessageDialog(null, "Successfully submitted", "Success Message",
								JOptionPane.INFORMATION_MESSAGE);
						userName.setText("");
						birthDate.setText("");
						email.setText("");
						phoneNum.setText("");
						userAddr.setText("");
						country.setText("");
						attendedUni.setText("");
						degree.setText("");
						gpaGrad.setText("");
						textArea.setText("");
					}
					// end of try
				} catch (Exception err) {
					// showing an error
					JOptionPane.showMessageDialog(null, excepMsg, "You have following problems",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		submitBtn.setBounds(496, 638, 148, 37);
		contentPane.add(submitBtn);

		JLabel greenBG = new JLabel("");
		greenBG.setBounds(0, 0, 800, 704);
		greenBG.setIcon(new ImageIcon(getClass().getResource("greenBg.jpg")));
		contentPane.add(greenBG);

	}

}
