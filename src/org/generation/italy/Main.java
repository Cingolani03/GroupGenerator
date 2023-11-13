package org.generation.italy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		String [] nomi= {"tiberia","persico","lozzi","cuccuru","cuomo","patitucci",
				"tanase","di biase","lo re","pagliarini","fanasca","germani","foco",
				"pignataro","troiani","cingolani","fanelli","faraoni","turino","hubecu",
				"franco","luzzi","ganesio","martinez","dascalu","sgarlata","allegrini",
				"barone","bellucci","mingione","trovato"};
		ArrayList<String> listaAssenti=new ArrayList<>();
		int gruppi,dimensione,i,conta=0,personeAggiunte=0;	
		String assenti,nome;
		
		System.out.println("ci sono persone assenti ?");
		assenti=sc.nextLine();
		if(assenti.equals("si"));
		do {
			
				System.out.println("inserisci il cognome dell'assente");
				nome=sc.nextLine();
				listaAssenti.add(nome);
			System.out.println("ci sono altri assenti ?");
			assenti=sc.nextLine();
		}while(assenti.equals("si"));
		
		
		int n=r.nextInt(nomi.length)+1;
		String risposta;
		
		System.out.println("quanti gruppi si devono formare ?");
		gruppi=Integer.parseInt(sc.nextLine()); 
		if(gruppi>nomi.length) {
			System.out.println("numero dei gruppi non valido");
			gruppi=31;
		}
		dimensione=nomi.length/gruppi;
		
		
		for(i=0;i<gruppi;i++) {
			ArrayList<String> gruppo=new ArrayList<>();
			conta=0;
			while (conta<dimensione) {
				n=r.nextInt(nomi.length);
				if(nomi[n]!="estratto" && !listaAssenti.contains(nomi[n])) {
					gruppo.add(nomi[n]);
					nomi[n]="estratto";
					conta+=1;
					personeAggiunte++;
				}
			
			}
			if(i==gruppi-1 ) {
				
				while( personeAggiunte<nomi.length) {
					if(nomi[n]!="estratto" && !listaAssenti.contains(nomi[n]));
					nomi[n]="estratto";
					conta+=1;
					personeAggiunte++;
				}
				}
			System.out.println(gruppo); 
		}
	}

}
