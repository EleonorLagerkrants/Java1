package Java1.el222ja_lab3;

public class Pnr {

	static int[] getFirstpart(int[] a) {
		return a;
	}
	static int[] getSecondpart(int[] b) {
		return b;
	}

	static boolean isMale(int[] b) {
		if(b[2]%2!=0) {
			return true;
		}
		else return false; }

	static boolean isFemale(int[] b) {
		if(b[2]%2==0) {
			return true; }
		else return false;
	}

	static String toString(int[] a, int[] b) {
		String str = ""; 
		for(int i=0; i<a.length; i++){
			str = str+a[i]; }
		str = str+"-";
		for(int j=0; j<b.length; j++) {
			str= str+b[j];
		}
		return str; }
	static boolean isEqual(int[]a, int[] b, int[] c, int[] d) {
		for(int i=0; i<a.length; i++) {
			if(a[i]!=c[i]) 
				return false;
			else for(int j=0; j<b.length; j++) {
				if(d[j]!=b[j]) {
					return false;
				}}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = {8,7,0,3,2,7};
		int[] b = {1,2,9,4};

		int[] c = {8,7,0,3,2,7};
		int[] d = {1,2,9,4};

		System.out.println("Is Male: "+(Pnr.isMale(b)));
		System.out.println("Is Female: "+(Pnr.isFemale(b)));
		System.out.println("Pnr: "+(Pnr.toString(a, b)));
		System.out.println("Is Equal: "+(Pnr.isEqual(a, b, c, d)));
	}}
