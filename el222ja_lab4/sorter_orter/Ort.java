package Java1.el222ja_lab4.sorter_orter;

public class Ort implements Comparable<Ort> {
	private String ortnamn;
	private int postnummer;
	
	public Ort (int postnummer, String ortnamn) {
		this.ortnamn=ortnamn;
		this.postnummer=postnummer;}
		
	public String toString() {
		String string = postnummer+" "+ortnamn;
		return string;	
		}
	
	@Override
	public int compareTo(Ort o) {
		return postnummer-o.postnummer;
	}
	
	
	

}
