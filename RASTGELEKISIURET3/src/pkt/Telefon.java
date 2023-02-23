package pkt;

import java.util.Random;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta Türkiye^de kullanılan cep telefonu numaralarına ait 31 adet alan kodundan oluşan bir liste ile 
* rastgele alan klodu seçilmiş ve kalan 7 random kütüphanesi yardımıyla rasgele oluşturulmuştur. .
* </p>
*/
public class Telefon {
	 public Random rnd = new Random();
	 public String TelNo = "";
	 
	 
	 public String TelUret() {
		 TelNo = "";
	     int Dizi[] = new int[9];
	     int [] UcuncuHane =  {501, 505, 506, 507, 551, 552, 553, 554, 555, 559,516, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 561, 541, 542, 543, 544, 545, 546, 547, 548, 549};
	     int telIndeks=rnd.nextInt(31);
	     Dizi[0]=0;
	     Dizi[1]=UcuncuHane[telIndeks];
	     
	     for (int indeks = 2; indeks < 9; indeks++) {
		        Dizi[indeks] = rnd.nextInt(9);
		        }
		
		for (int i = 0; i < 9; i++) {
			TelNo += Dizi[i];
		}
		return TelNo;
	       	}
}
