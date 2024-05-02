package evalalgo1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreArticles;
		double prixHT;
		double prixTTC;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Bienvenue dans le programme de calcul du prix TTC.");
		
		System.out.println("Indiquer le prix de l'article : ");
		
		prixHT = sc.nextDouble();
		
		System.out.println("Le prix Hors Taxes de l'article est : " + prixHT);
		
		System.out.println("Indiquer le nombre d'articles : ");
		
		nombreArticles = sc.nextInt();
		
		prixTTC = prixHT * nombreArticles;
		
		
		
		if (prixHT >= 10) {
			prixTTC = prixTTC + (prixTTC * 20 / 100);
		}
		
		else {
			prixTTC = prixTTC + (prixTTC * 5 / 100);
		}
		
		System.out.println("Le montant à payer est de : " + prixTTC + ".");
		
		
		sc.close();
	}

}
