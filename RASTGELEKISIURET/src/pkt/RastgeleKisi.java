package pkt;
/**
*
* @author Fatih ERİŞEN ve erisenfatih@gmail.com
* @since 14.12.2022
* <p>
* Bu sınıfta IMEINo, KimlikNo, Kisi, Telefon ve Yas sınıflarından gelen methodlar ile rasgele kişi oluşturma methodu oluşturulmuştur..
* </p>
*/

public class RastgeleKisi {
	KimlikNo kimlikNo = new KimlikNo();
	Kisi kisi = new Kisi();
	IMEINo imei = new IMEINo();
	String kont=imei.IMEIUret();
	Yas yas = new Yas();
	Telefon tel = new Telefon();
	
	public String YeniKisiUret() {
		String YeniKisi= kimlikNo.KimlikNoUret() 
				+ "  "+ kisi.Kisi() 
				+ "  " + yas.YasUret() 
				+ "  " + tel.TelUret()
				+ " (" + imei.IMEIUret() + ")";
		return YeniKisi;
		
	}
		
}
