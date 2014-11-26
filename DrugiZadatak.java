package vjezbe;

public class DrugiZadatak {
	public static void main(String[] args) {

		System.out.println("Koliko elemenata zelite u nizu?");
		int clanova = TextIO.getlnInt();
		int[] niz = unosNiza(clanova);

		int sum = sumaNiza(niz);
		System.out.println("Suma je: " + sumaNiza(niz));

		System.out.println("Minimum je: " + min(niz));
		System.out.println("Maximum je: " + max(niz));
		funkcija(niz);
	}
	public static int sumaNiza(int[] niz) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma = suma + niz[i];
		}
		return suma;
	}

	public static void funkcija(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static int[] unosNiza(int clanova) {
		int[] niz = new int[clanova];
		for (int i = 0; i < clanova; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza.");
			niz[i] = TextIO.getlnInt();
			System.out.println();
		}
		return niz;

	}
	public static int min(int [] niz) {
		int min = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < min) {
				min = niz[i];
			}
		}
			return min;

}
	public static int max(int [] niz) {
		int max = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
			return max;

}
}
