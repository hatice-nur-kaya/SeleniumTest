##  Manuel Test Senaryosu

Sepet sayfasındaki işlemler için işlevsel test senaryoları geliştiriniz.
### CEVAP

Test senaryoları 3 şekilde yapılabilmektedir.
•	Beyaz Kutu Tekniği
•	Siyah Kutu Tekniği
•	Gri Kutu Tekniği
Beyaz Kutu Tekniğinde yazılımın kodunun iç yapısının bilinerek, ölçümlenerek test senaryolarının tasarlandığı tekniktir. İki çeşittir 
•	Komut test tasarım tekniği: Komut kodda direkt olarak gerçekleşmesini istediğimiz bir işleve denir.
•	Karar test tasarım tekniği: Karar kapsamı kodumuzun içerisindeki if else, while, switch gibi birden fazla sonuç oluşturabilecek karar noktalarıdır. 
Siyah Kutu Tekniğinde azılımın iç yapısı hakkında bilgi sahibi olunmadan yani koda bakılmadan sistemin işlevselliğini ölçmeye yarayan test tekniğidir.
Gri Kutu Test tekniğinde hem Kara Kutu hem de Beyaz Kutu testinin bir kombinasyonudur.
Senaryo :

2.	Test Otomasyonu (UI)

Aşağıdaki test senaryosunu Cucumber, Selenium ve istediğiniz programlama dili ile geliştiriniz.

1.	Ana sayfa açılır. (www.e-bebek.com)
2.	Arama çubuğuna "biberon" yazılır.
3.	Arama yapılır.
4.	İlk ürüne tıklanır.
5.	"Sepete Ekle" butonuna tıklanır.
6.	"Sepeti Gör” butonuna tıklanır.
7.	Ürünün sepete eklendiği kontrol edilir.

3.	Test Otomasyonu – API

API isteği sonucunun (HTTP Status Code) kontrolünü gerçekleştiren aşağıdaki test senaryosunu
istediğiniz programlama dili ile geliştiriniz.

Senaryo: Seçilecek birer tane GET ve POST isteği için “HTTP Status Code” 200 (başarılı), değilse
(başarısız) olan test senaryosu. (http://generator.swagger.io)

3.SORU CEVABI:
GET:
>    pm.test("Status is 200", () => {
>    pm.response.to.have.status(200)
>    });

POST:
>   pm.test("Status is 201", () => {
>   pm.response.to.have.status(201)
>   });

4.	Hata Raporlama

E-Bebek web sitesi ya da mobil uygulamasında en az 2 adet hata bularak standartlara uygun bir
şekilde raporlayınız.
•	iPad Air cihazı gibi farklı boyuttaki cihazlar için slider içerisindeki resim responsive yapıda değil
 <img src="[gorsel-link](https://github.com/HNK-hub/SeleniumTest/blob/master/exception1.png)" width="auto">

* Açıklama alanı olarak oluşturulan paragraf yazı tipi boyutunun küçük olduğunu düşünüyorum. Bunun yerine bu açıklamalar Blog sayfası altında düzenlenebilir.
  <img src="[gorsel-link](https://github.com/HNK-hub/SeleniumTest/blob/master/exception1.png)" width="auto">
*	Backend kısmında karşılaşılan hata tüm input değerlerini verilen sınır değere göre girildiği zaman hata dönderiyor
  <img src="[gorsel-link]([https://github.com/HNK-hub/SeleniumTest/blob/master/exception1.png](https://github.com/HNK-hub/SeleniumTest/blob/master/exception3.png))" width="auto">
* Sunucu Hatası : Ürün araması yaparken CLIENT hatası dönderiyor.
 <img src="[gorsel-link]([https://github.com/HNK-hub/SeleniumTest/blob/master/exception1.png](https://github.com/HNK-hub/SeleniumTest/blob/master/exception4.png))" width="auto">
 * 
