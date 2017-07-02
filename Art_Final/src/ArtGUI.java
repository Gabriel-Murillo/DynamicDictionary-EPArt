import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class ArtGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	/**
	 * 
	 */
	private JPanel contentPane; //Declares what will contain all of the features
	private JTextField classTextField; //Declares what will contain the type of the artTerm
	private JTextPane defTextField; //Declares what will contain the definition of the artTerm
	private JLabel background; //Declares what will be the background image 
	private JButton buttonPic; //Declares what will be the image at the bottom
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ArtGUI(artDictionary artTermsDict) { //The parameter 'artTermsDict' is an artDictionary Object that stores artTerms		
		
		//The window
		setResizable(false); 
		setTitle("Elements and Principles of Art"); 
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Text label for 'Classification'
		JLabel typeLabelText = new JLabel("Classification:");
		typeLabelText.setForeground(Color.WHITE);
		typeLabelText.setBounds(12, 185, 154, 34);
		contentPane.add(typeLabelText);
		typeLabelText.setHorizontalAlignment(SwingConstants.CENTER);
		typeLabelText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		typeLabelText.setBackground(Color.WHITE);
		
		//Drop down menu for the artTerms
		JComboBox<String> selectBox = new JComboBox<String>();
		selectBox.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		selectBox.setMaximumRowCount(16);
		//Adds all 16 artTerms to the drop down menu, plus a blank spot for a better visuals
		selectBox.addItem("");
		selectBox.addItem(artTermsDict.getName(0));
		selectBox.addItem(artTermsDict.getName(1));
		selectBox.addItem(artTermsDict.getName(2));
		selectBox.addItem(artTermsDict.getName(3));
		selectBox.addItem(artTermsDict.getName(4));
		selectBox.addItem(artTermsDict.getName(5));
		selectBox.addItem(artTermsDict.getName(6));
		selectBox.addItem(artTermsDict.getName(7));
		selectBox.addItem(artTermsDict.getName(8));
		selectBox.addItem(artTermsDict.getName(9));
		selectBox.addItem(artTermsDict.getName(10));
		selectBox.addItem(artTermsDict.getName(11));
		selectBox.addItem(artTermsDict.getName(12));
		selectBox.addItem(artTermsDict.getName(13));
		selectBox.addItem(artTermsDict.getName(14));
		selectBox.addItem(artTermsDict.getName(15));
		
		//If a specific name is selected from the drop down menu, the class, definition, and image display will change.
		selectBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectBox.removeItem("");
				@SuppressWarnings("unchecked")
				JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
                String selected = (String) comboBox.getSelectedItem(); 
                
                if(selected.toString().equals(artTermsDict.getName(0))){ //If the first term is selected...
                	classTextField.setText(artTermsDict.getType(0)); // ...then the class text field and
                	defTextField.setText(artTermsDict.getDef(0)); // ...the text field will change.
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/line1.jpg")); //Saves the image to 'img'
            		buttonPic.setIcon(img); //Sets the image to 'img'
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/lineback.JPG")); //Saves the background image to 'img'
            		background.setIcon(img2); //Sets the background image to 'img'
                }
                else if(selected.toString().equals(artTermsDict.getName(1))) {
                	classTextField.setText(artTermsDict.getType(1));
                	defTextField.setText(artTermsDict.getDef(1));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/shape1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/shape.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(2))) {
                	classTextField.setText(artTermsDict.getType(2));
                	defTextField.setText(artTermsDict.getDef(2));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/form1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/form.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(3))) {
                	classTextField.setText(artTermsDict.getType(3));
                	defTextField.setText(artTermsDict.getDef(3));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/color1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/color.jpg"));
            		background.setIcon(img2);              
                }
                else if(selected.toString().equals(artTermsDict.getName(4))) {
                	classTextField.setText(artTermsDict.getType(4));
                	defTextField.setText(artTermsDict.getDef(4));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/value1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/value.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(5))) {
                	classTextField.setText(artTermsDict.getType(5));
                	defTextField.setText(artTermsDict.getDef(5));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/texture1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/texture.JPG"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(6))) {
                	classTextField.setText(artTermsDict.getType(6));
                	defTextField.setText(artTermsDict.getDef(6));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/space1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/space.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(7))) {
                	classTextField.setText(artTermsDict.getType(7));
                	defTextField.setText(artTermsDict.getDef(7));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/perspective1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/perspective.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(8))) {
                	classTextField.setText(artTermsDict.getType(8));
                	defTextField.setText(artTermsDict.getDef(8));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/pattern1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/pattern.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(9))) {
                	classTextField.setText(artTermsDict.getType(9));
                	defTextField.setText(artTermsDict.getDef(9));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/rhythm1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/rhythm.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(10))) {
                	classTextField.setText(artTermsDict.getType(10));
                	defTextField.setText(artTermsDict.getDef(10));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/movement1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/movement.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(11))) {
                	classTextField.setText(artTermsDict.getType(11));
                	defTextField.setText(artTermsDict.getDef(11));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/proportion1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/proportion.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(12))) {
                	classTextField.setText(artTermsDict.getType(12));
                	defTextField.setText(artTermsDict.getDef(12));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/scale1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/scale.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(13))) {
                	classTextField.setText(artTermsDict.getType(13));
                	defTextField.setText(artTermsDict.getDef(13));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/balance1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/balance.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(14))) {
                	classTextField.setText(artTermsDict.getType(14));
                	defTextField.setText(artTermsDict.getDef(14));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/unity1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/unity.jpg"));
            		background.setIcon(img2);
                }
                else if(selected.toString().equals(artTermsDict.getName(15))) {
                	classTextField.setText(artTermsDict.getType(15));
                	defTextField.setText(artTermsDict.getDef(15));
                	
                	ImageIcon img = new ImageIcon(this.getClass().getResource("/emphasis1.jpg"));
            		buttonPic.setIcon(img);
            		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/emphasis.jpg"));
            		background.setIcon(img2);
                }
			}
		});
		
		classTextField = new JTextField(); //Instantiates the text field that presents the class 
		classTextField.setHorizontalAlignment(SwingConstants.LEFT);
		classTextField.setFont(new Font("Yu Gothic Light", Font.PLAIN, 25));
		classTextField.setBackground(Color.WHITE);
		classTextField.setEditable(false);
		classTextField.setBounds(41, 226, 290, 49);
		contentPane.add(classTextField);
		classTextField.setColumns(10);
		
		selectBox.setBounds(41, 123, 290, 49);
		contentPane.add(selectBox);
		
		defTextField = new JTextPane(); //Instantiates the text field that presents the definition 
		defTextField.setBackground(Color.WHITE);
		defTextField.setEditable(false);
		defTextField.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		defTextField.setBounds(42, 337, 486, 140);
		contentPane.add(defTextField);
		
		JLabel defLabel = new JLabel("Definition:"); //Declares and instantiates the text label for 'Definition'
		defLabel.setForeground(Color.WHITE);
		defLabel.setBounds(12, 288, 122, 36);
		contentPane.add(defLabel);
		defLabel.setHorizontalAlignment(SwingConstants.CENTER);
		defLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		defLabel.setBackground(Color.WHITE);
		
		buttonPic = new JButton(""); //Instantiates what will store the image
		ImageIcon img = new ImageIcon(this.getClass().getResource("/background1.jpg"));
		buttonPic.setIcon(img);
		buttonPic.setBounds(12, 490, 570, 262);
		contentPane.add(buttonPic);
		
		JLabel titleText = new JLabel("Elements and Principles of Art"); //Declares and instantiates the text label for the title
		titleText.setBounds(12, 0, 582, 60);
		contentPane.add(titleText);
		titleText.setHorizontalAlignment(SwingConstants.LEFT);
		titleText.setForeground(Color.WHITE);
		titleText.setBackground(Color.WHITE);
		titleText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 40));
		
		JLabel selectText = new JLabel("Select an element or principle of art:"); //Declares and instantiates the text label for "selectText"
		selectText.setForeground(Color.WHITE);
		selectText.setBounds(12, 73, 392, 37);
		contentPane.add(selectText);
		selectText.setBackground(Color.WHITE);
		selectText.setHorizontalAlignment(SwingConstants.CENTER);
		selectText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		
		background = new JLabel(""); //Instantiates what will contain the background image
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/background1.jpg"));
		background.setIcon(img2);
		background.setBounds(0, 0, 594, 765);
		contentPane.add(background);
	}
}
