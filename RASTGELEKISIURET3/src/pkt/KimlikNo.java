package pkt;

import java.util.Random;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta T.C. Kimlik Numarası algoritmasına uygun rastgele 11 haneli Kimlik Numaraları üretilmiştir.
* </p>
*/
public class KimlikNo {
	 public Random rnd = new Random();
	 public String KimlikNo = "";
	 private int tekler=0;
	 private int ciftler=0;
	 
	 public String KimlikNoUret() {
	        KimlikNo = "";
	        int Dizi[] = new int[11], tmp = 0;
	        Dizi[0]=rnd.nextInt(9)+1;
	        for (int indeks = 1; indeks < 9; indeks++) {
	                Dizi[indeks] = rnd.nextInt(10);
	        }
	        for (int indeks = 0; indeks < 9; indeks+=2) {
	        	tekler+=Dizi[indeks];
	        }
	        for (int indeks = 1; indeks < 8; indeks+=2) {
	        	ciftler+=Dizi[indeks];
	        }
	        Dizi[9] = (tekler * 7 - ciftler) % 10;
	        
	        tmp=tekler+ciftler+Dizi[9];
	        //for (int i = 0; i <10; i++) {
	          //  tmp += Dizi[i];
	        //}
	        Dizi[10] = tmp % 10;
	        for (int j = 0; j < 11; j++) {
	            KimlikNo += Dizi[j];  
	        }
	        tekler=0;
	        ciftler=0;
	        tmp=0;
	        return KimlikNo;
	        
	       	}
	 
	 public static String KimlikKontrol(String KimlikNo) {
	        String KimlikDondur = "";

	        double TekSayi = 0, CiftSayi = 0;
	        
	        int KNDizi[] = new int[KimlikNo.length()];
	        
	        if (KimlikNo.length() != 11) {
	            return "Geçersiz Kimlik No";
	        }
	        for (int i = 0; i < KimlikNo.length(); i++) {
	            KNDizi[i] = Integer.parseInt(KimlikNo.substring(i, i + 1));
	        }
	        for (int indeks = 0; indeks < 9; indeks+=2) {
	            TekSayi += KNDizi[indeks];
	        }
	        for (int indeks = 1; indeks < 9; indeks+=2) {
	                CiftSayi += KNDizi[indeks];
	            }
	        
	        if (KNDizi[9]!= (7*TekSayi - CiftSayi)%10 ) {
	            return "Geçersiz Kimlik No";
	        }
	        int toplam=0;
	        for (int i=0; i<10; i++) {
	        	toplam+=KNDizi[i];
	        }
	        if (KNDizi[10]!= toplam%10) {
	        	return "Geçersiz Kimlik No";
	        }
	        else {
	            return "Kimlik No Geçerlidir. ";
	        }
	    }

	 
	/* @Override
	public String toString() { 
		
		 return KimlikNo;
	}*/
}
