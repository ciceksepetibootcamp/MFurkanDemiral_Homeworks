# Çiçek Sepeti Bootcamp Ödev 1

>**Önemli:** config.properties dosyasını kendi bilgilerin ile düzenlemelisin.
>
![howtoeditconfigfile1](https://user-images.githubusercontent.com/37184598/142984893-0475334b-a5f7-4a96-9f71-234f04e88a0f.gif)

>How to work
>
https://user-images.githubusercontent.com/37184598/142985273-d2f73617-7048-4937-b962-8201d65113c0.mp4

Test Senaryosu
>-Çiçek sepeti anasayfasına giriş yap.

>-Tarayıcı ekranını tam ekran yap.

>-Kampanya popupını kapat.

>-Adres popupını kapat.

>-Çerez uyarısını kapat.

>-Siteye login ol.

>-Ürün ara ve bir ürün seç.

>-Ürünü favorilere ekle.

>-Favorilerim sayfasına git.

>-Favoriye eklenen ürünün ismini doğrula.

>-Ürünü favorilerden çıkar.

Merhabalar

Bootcampin ilk ödevi olduğu için basit bir senaryoyu otomatize ettim.
İlk olarak kampanya haftasında olduğumuz için ekrana çıkan popupı kapatmam gerekiyordu.

 ```java
    //Açılan popup ile etkileşime geçebilmek için switchTo methodunu kullandım.
    Driver.get().switchTo().frame(Driver.get().findElement(By.className("ab-modal-interactions")));
    Driver.get().findElement(By.className("close-icon")).click();
   ```

Bu işlem tamamlandıktan sonra sayfanın kendisine dönmem, adres popupını ve çerez uyarısını kapatmam gerekiyordu.

```java
    //Anasayfaya geri döndüğüm kısım.
    Driver.get().switchTo().defaultContent();
    //Adres popupı ve çerezleri kapattığım kısım.
    Driver.get().findElement(By.className("js-subheader-close")).click();
    Driver.get().findElement(By.className("js-policy-close")).click();
   ```

Sonrası zaten ödev kısmı oraya girmiyorum, iyi çalışmalar :)

