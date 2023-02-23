package pkt2;

import java.util.Scanner;

import pkt.RastgeleKisi;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta RastgeleKisi paketi kullanılarak istenen sayıda rastgele kişi oluşturan paket eklenmiştir.
* </p>
*/
public class Program {

	public static void main(String[] args) {
		boolean karar=true;
		while (karar) {
			System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n");
			System.out.println("1- Rasgele Kişi Üret");
			System.out.println("2- Çıkış");
			RastgeleKisi YeniKisi = new RastgeleKisi();
			int secim=2;
			int KisiSayisi;
			Scanner in = new Scanner(System.in);
			secim=in.nextInt();
			if (secim==1) {
				System.out.println("Rastgele üretilecek kişi sayısını giriniz: ");
				KisiSayisi=in.nextInt();
				for (int i=1; i<KisiSayisi; i++) {
					System.out.println(YeniKisi.YeniKisiUret());
				}
				System.out.println(YeniKisi.YeniKisiUret()+"\n");
			}
			else if (secim==2) {
				karar=false;
			}
			else System.out.println("\n Hatalı seçim yaptınız. Tekrar deneyiniz. \n");
			
		}

	}
}


