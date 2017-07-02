public class artTerm { //artTerm < artDict < artGUI < MainRun
	private String name;
	private String type;
	private String definition;

	public artTerm(String n, String t, String d) { //Constructs a term with a name, type, and definition
		name = n;
		type = t;
		definition = d;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getDef() {
		return definition;
	}
}

