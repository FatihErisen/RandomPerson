package pkt;

import java.util.Random;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta Kişi yaşı random kütüphanesi yardımıyla 0-100 aralığında rastgele yaş üreten method tanımlanmıştır.
* </p>
*/
public class Yas {
	public Random rnd = new Random();
	private int yas=0;
	
	public int YasUret() {
		yas=rnd.nextInt(100);
		return yas;
		
	}
}
