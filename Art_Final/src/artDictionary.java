import java.util.ArrayList;

public class artDictionary{ //Stores art terms in an array list
	ArrayList<artTerm> artDict; 
	private artTerm word1;//word1-word16: Declares 16 artTerms
	private artTerm word2;
	private artTerm word3;
	private artTerm word4;
	private artTerm word5;
	private artTerm word6;
	private artTerm word7;
	private artTerm word8;
	private artTerm word9;
	private artTerm word10;
	private artTerm word11;
	private artTerm word12;
	private artTerm word13;
	private artTerm word14;
	private artTerm word15;
	private artTerm word16;
	
	public artDictionary() { 
		artDict = new ArrayList<artTerm>(); //instantiates the array list that will store 16 artTerms
	}
	
	public void constructTerms() { //Instantiates all 16 words
		word1 = new artTerm("Line","Element","Line is the path of a point moving through space.");
		word2 = new artTerm("Shape","Element","Shape implies spatial form and is usually perceived as two-dimensional.");
		word3 = new artTerm("Form","Element","Form has depth, length, and width and resides in space. It is perceived as three-dimensional.");
		word4 = new artTerm("Color","Element","Colors all come from the three primaries and black and white. They have three properties- hue, value, and intensity.");
		word5 = new artTerm("Value","Element","Value refers to relative lightness and darkness and is perceived in terms of varying levels of contrast.");
		word6 = new artTerm("Texture","Element","Texture refers to the tactile qualities of a surface (actual) or so to the visual representation of such surface qualities (implied).");
		word7 = new artTerm("Space","Element","Space refers to the area in which art is organized.");
		word8 = new artTerm("Perspective","Principle","Perspective is representing a volume of space or a 3-dimensional object on a flat surface.");
		word9 = new artTerm("Pattern","Principle","Pattern refers to the repetition or reoccurrence of a design element, exact or varied, which establishes a visual beat.");
		word10 = new artTerm("Rhythm","Principle","Rhythm or movement refers to the suggestion of motion through the use of various elements.");
		word11 = new artTerm("Movement","Principle","Rhythm or movement refers to the suggestion of motion through the use of various elements.");
		word12 = new artTerm("Proportion","Principle","Proportion is the size relationship of parts to a whole and to one another.");
		word13 = new artTerm("Scale","Principle","Scale refers to relating size to a constant, such as a human body.");
		word14 = new artTerm("Balance","Principle","Balance is the impression of equlibrium in a pictorial or sculptural composition. Balance is often referred to as symmetrical, asymmetrical, or radial.");
		word15 = new artTerm("Unity","Principle","Unity is achieved when the components of a work of art are perceived as harmonious, giving the work a sense of completion.");
		word16 = new artTerm("Emphasis","Principle","Emphasis refers to the created center of interest, the place in an artwork where your eye first lands.");
	}
	
	public void addTerms() { //Adds all 16 words to the array list
		artDict.add(word1);
		artDict.add(word2);
		artDict.add(word3);
		artDict.add(word4);
		artDict.add(word5);
		artDict.add(word6);
		artDict.add(word7);
		artDict.add(word8);
		artDict.add(word9);
		artDict.add(word10);
		artDict.add(word11);
		artDict.add(word12);
		artDict.add(word13);
		artDict.add(word14);
		artDict.add(word15);
		artDict.add(word16);
	}
	
	public String getName(int index) { //E.g.: getName(0) will return "Line"
		return artDict.get(index).getName();
	}
	
	public String getType(int index) { //E.g.: getType(0) will return "Element"
		return artDict.get(index).getType();
	}
	
	public String getDef(int index) { //E.g.: getDef(0) will return "Line is the path of a point moving through space."
		return artDict.get(index).getDef();
	}
}

