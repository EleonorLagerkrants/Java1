package Java1.el222ja_lab3;

public class Arrays {

	//Summerar alla talen i arrayen
	static int sum(int[]arr) {
		int total = 0; 
		for (int i=0; i<arr.length; i++) {
			total=total+arr[i]; }
		return (total);
	}
	// G�r arrayen till en string
	static String toString(int[] arr) {
		String str = "";
		for (int i=0; i<arr.length; i++) {
			str = str+arr[i]+" "; }
		return str;	
	}
	//L�gger till heltalet n till alla element i arrayen
	static int[]addN(int[] arr, int n) { 
		int[] addN = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			addN[i] = arr[i]+n;}
		return addN;
	}
	//Skapar en ny array reverse som �r arr bakl�nges
	static int[]reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			reverse[i]=arr[arr.length-i-1]; }
		return reverse;
	}
	// Kontrollerar om arrayen har ett element med v�rdet n
	static boolean hasN(int[] arr, int n) {
		for(int d: arr) {
			if(d==n)
				return true; 
		}
		return false;
	}
	//Skriver �ver alla element av v�ldet old med v�rdet nw
	static void replaceAll(int[]arr, int old, int nw) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==old) {
				arr[i]=nw;
			}} return;
	}
	//Sorterar arrayen i storleksordning
	static int[] sort(int[] arr) {
		int[] sortarr = new int[arr.length];
		sortarr = arr;
		for(int i=0; i<sortarr.length; i++) {
			for(int j=0; j<i; j++ ) {
				if(sortarr[i]<sortarr[j]) {
					int temp=sortarr[i];
					sortarr[i]=sortarr[j];
					sortarr[j]=temp; }
			}
		} return sortarr;
	}
	//Kontrollerar om arrayen inneh�ller en annan array
	static boolean hasSubsequence(int[] arr, int[] sub) {
		for(int i=0; i<arr.length; i++) {
			if(i+sub.length-1>=arr.length)
				return false;
			if(arr[i]==sub[0]) {
				boolean sant = true;
				for(int j=1; j<sub.length; j++){
					if(sub[j]!=arr[i+j]){ 
						sant = false; }}
				if(sant)
					return true; 
			}}
		return false;}

	public static void main(String[] args) {

		int[] arr = {7,3,2,9,1};
		int sum = Arrays.sum(arr);
		System.out.println("Summa: "+sum);

		String str = Arrays.toString(arr);
		System.out.println("arr= "+str);

		int n=3;
		String s = Arrays.toString(Arrays.addN(arr,n));
		System.out.println("Arr plus 3: "+s);

		String m = Arrays.toString(Arrays.reverse(arr));
		System.out.println("Arr reverse: "+m);

		System.out.println("Har arrayen talet "+n+"? "+(Arrays.hasN(arr, n)));

		int old = 2;
		int nw = 7;
		Arrays.replaceAll(arr, old, nw);
		System.out.println("Ers�tter arrayens "+old+" med "+nw+": "+(Arrays.toString(arr)));

		System.out.println("Sortering av arrayen: "+Arrays.toString(Arrays.sort(arr)));

		int[] sub = {1,3};
		System.out.print("Inneh�ller arr sub?: "+Arrays.hasSubsequence(arr, sub));


	}

}

