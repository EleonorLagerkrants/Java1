package Java1.el222ja_lab3;

public class MultiDisplay {

	private String displayMessage;
	private int displayCount;

	public MultiDisplay() { }

	public void setDisplayMessage(String msg) { 
		displayMessage=msg;
	}

	public void setDisplayCount(int count) {
		displayCount=count;
	}

	public void display() { 
		for(int i=0; i<displayCount; i++) {
			System.out.println(displayMessage); }
	}

	public void display(String str, int count) {
		displayMessage=str;
		for(int i=0; i<count; i++) {
			System.out.println(str);
		}
	}

	public String getDisplayMessage() {
		return displayMessage;
	}
}