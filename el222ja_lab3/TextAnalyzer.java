package Java1.el222ja_lab3;

public class TextAnalyzer {
	private String text; 

	public TextAnalyzer(String text) {
		this.text=text;
	}

	public int charCount() {
		int count = this.text.length();
		return count; }

	public int upperCaseCount() {
		int uppercase = 0;
		for(int i=0; i<this.text.length(); i++) {
				if (Character.isUpperCase(text.charAt(i))) {
					uppercase++;
				}
			}
		return uppercase;
	}

	public int whitespaceCount() {
		int spacecount = 0;
		for(int i=0; i<this.text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				spacecount++;
			}
		}
		return spacecount;
	}

	public int digitCount() {
		int digitcount = 0;
		for(int i=0; i<this.text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				digitcount++;
			}
		}
		return digitcount;
	} 

	public boolean containsChar(char c) {  
		for(int i=0; i<this.text.length(); i++) {
			if(text.charAt(i)==c) {
				return true; 
			} }
		return false; }

	public boolean containsString(String substr) {
		return this.text.contains(substr);
	}
}