package fr.gtm.banque;

import java.math.BigInteger;

public class Banque {

	public boolean verifnBanque(int nBanque) {
		
		int x = Integer.toString(nBanque).length();
		
		if(x==5) {
			
			return true;
		} return false;
	}
	
	public boolean verifcodeEta(int codeEta) {
		
		int x = Integer.toString(codeEta).length();
		
		if(x==5) {
			return true;
		} return false;
	}
	

	public void nCompteInsert(StringBuilder nCompte) {
		while (nCompte.length()<11) {
			
			nCompte.insert(0, 0);
		} 
		
//		String s = new StringBuilder(nCompte).toString();
//		int x = Integer.parseInt(s);
			
		}
		public boolean verifRib(int rib) {
			
		}
	
	}
