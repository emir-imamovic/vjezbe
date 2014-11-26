package vjezbe;

public class PrviZadatak {
	public static void main(String[] args) {
		
		System.out.println("Koliko elemenata zelite u nizu?");
		int clanova = TextIO.getlnInt();
		int []nizUnos = new int[clanova];
		int[] niz = unosNiza(clanova);
		for (int i = 0; i<niz.length; i++){
			System.out.print(niz[i] + " ");
		}
	}

	public static int[] unosNiza(int clanova) {
		int []niz=new int[clanova];
		for (int i = 0; i < clanova; i++) {
System.out.println("Unesite "+(i+1)+". element niza.");
			niz[i] = TextIO.getlnInt();
		}
		return niz;
		
	}
}
