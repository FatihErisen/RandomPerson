package pkt;

import java.util.Random;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta imei algoritmasına uygun rastgele 15 haneli imei numaraları üretilmiştir.
* </p>
*/
public class IMEINo {
	 private static final char[] Imei = null;
	public Random rnd = new Random();
	 public String ImeiNo = "";
	 private int tekler=0, ciftlerin2kati=0, ciftler=0, sonTerim=0;
	 
	 
	 public String IMEIUret() {
		 ImeiNo = "";
	        int Dizi[] = new int[15], tmp = 0;
//	        Dizi[0]=rnd.nextInt(9) + 1;
	        for (int indeks = 0; indeks < 14; indeks++) {
	                Dizi[indeks] = rnd.nextInt(9);
	        }
	        for (int indeks = 1; indeks < 14; indeks+=2) {
	        	ciftlerin2kati=2*Dizi[indeks];
	        	if (ciftlerin2kati>9) {
	        		ciftler+=(ciftlerin2kati-9);
	        	}
	        	else {
	        		ciftler+=ciftlerin2kati;
	        	};
	        }
	        for (int indeks = 0; indeks < 14; indeks+=2) {
	        	tekler+=Dizi[indeks];
	        }
	        sonTerim=tekler+ciftler;
	        
	        Dizi[14] = 10-(sonTerim%10);
	        
	        for (int j = 0; j < 15; j++) {
	        	ImeiNo += Dizi[j];
	        }
	        return ImeiNo;
	       	}
	 
	/* @Override
	public String toString() { 
		
		 return KimlikNo;
	}*/
//	 public String toString() {
//	    	// TODO Auto-generated method stub
//	    	return String.valueOf(ImeiNo); 
//	    }
	 
	 public static String ImeiKontrol(String Imei) {
	        String ImeiDondur = "";
	        System.out.println("imei: " + Imei);
	        System.out.println("imei len: " +Imei.length());
	        
	        
	        
	        
	        
	        double TekSayi = 0, CiftSayi = 0;
	        
	        int ImeiDizi[] = new int[Imei.length()];
	        
	        if (ImeiDizi.length != 15) {
	            return "Geçersiz Imei1";
	        }
	        for (int i = 0; i < Imei.length(); i++) {
	            ImeiDizi[i] = Integer.parseInt(Imei.substring(i, i + 1));
	        }
	        for (int i = 0; i <= 12; i += 2) {
	            TekSayi += ImeiDizi[i];
	        }
	        for (int i = 1; i <= 13; i += 2) {
	            if (ImeiDizi[i] * 2 > 9) {
	                CiftSayi += ImeiDizi[i] * 2 - 9;
	            } else {
	                CiftSayi += ImeiDizi[i] * 2;
	            }
	        }
	        double tmp = ((Math.ceil((TekSayi + CiftSayi) / 10)) * 10);
	        for (int i = 0; i < 15; i++) {
	            ImeiDondur += ImeiDizi[i];
	        }
	        if (tmp - (TekSayi + CiftSayi) == ImeiDizi[14]) {
	            return "Geçerli Imei";
	        } else {
	            return "Geçersiz Imei";
	        }
	    }

}
