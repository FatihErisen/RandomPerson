# RasgeleKisi
Rasgele kişi üreten kütüphane ve bu kütüphaneyi kullanarak istenilen sayıda kişi üreten java uygulaması
## RasgeleKisiUret Kütüphanesi
Bu kütüphane Kisi, Yas, Telefon, KimlikNo, IMEINo ve RastgeleKisi  isimli sınıflar içermektedir. 
Kisi, Yas, Telefon, KimlikNo, IMEINo ve RastgeleKisi isimli sınıflarından oluşan RASTGELEKISIURET isimli proje Export > Jar File adımları ile RASTGELEKISIURET.jar ismi ile dışa aktarılmalı, ardından test uygulamasına import edilmelidir. 

### Kisi Sınıfı
Kisi sınıfında RasgeleIsimler isimli, boyutu 200 olan bir liste oluşturuldu. Liste içerisine internet ortamından elde edilen 200 adet isim ve soyisim eklendi. Random kütüphanesi kullanılarak oluşturulan 0-200 aralığındaki rastgele indeks numarası ile listeden rastgele isim döndüren Kisi isimli fonksiyon oluşturuldu.

###  Yas Sınıfı
Yas sınıfında Random Kütüphanesi kullanılarak 0-100 aralığındaki rastgele yaşı döndüren YasUret fonksiyonu bulunmaktadır.

###  Telefon Sınıfı
Telefon sınıfında ülkemizde kullanılan cep telefonu numarası formatına uygun 11 haneli cep telefonları oluşturan TelUret isimli fonksiyon oluşturuldu. TelUret fonksiyonu boyutu 11 olan bir TelNo isimli bir String döndürecek şekilde yazıldı. TelNo yazısı için önce boyutu 9 olan boş dizi oluşturuldu.
Bu dizinin içeriği şu şekilde tasarland: ilk index: 0, ikinci dizin: üç haneli alan kodu, sonraki dizinler rasgele rakam.

###  KimlikNo Sınıfı 
KimlikNo sınıfında ülkemizdeki T.C. Kimlik Numarası Algoritmasına uygun rastgele kimlik numaraları üreten KimlikNoUret isimli fonksiyon oluşturuldu.

### IMEINo Sınıfı 
IMEINo sınıfında Imei Numarası Algoritmasına uygun rastgele Imei numaraları üreten IMEIUret isimli fonksiyon oluşturuldu.

###  RastgeleKisi Sınıfı 
RastgeleKisi sınıfında yukarıdaki diğer 5 sınıfın birer elemanı oluşturularak YeniKisi isimli String değere eklendi ve YeniKisi değeri döndürüldü. 

## Test Uygulaması 
RASTGELEKISIURET.jar  kütüphanesi içe aktarılarak kullanılabilir. 

Uygulama Ekran Görüntü:
![](https://github.com/FatihErisen/RasgeleKisi/blob/main/rasgelekisi.)
