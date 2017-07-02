import java.awt.EventQueue;

public class MainRun {

	public static void main(String[] args){ 
		artDictionary artTermsDict = new artDictionary(); //Constructs an artDictionary object that contains an array list
		artTermsDict.constructTerms(); //Constructs all 16 terms
		artTermsDict.addTerms(); //Adds all 16 terms to the array list 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtGUI frame = new ArtGUI(artTermsDict); //Takes the parameter 'artTermsDict,' which is an artDictionary object
					frame.setVisible(true); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
