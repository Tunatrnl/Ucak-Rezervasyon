# Java OOP Ödevi

## İnterfaceler ve Sınıflar
* ILokasyon --> Lokasyon => lokasyonOlustur ve lokasyonBilgileri adında iki metodu içerir.
* ! lokasyonOlustur => Bu metod; lokasyon bilgisini (kalkış ve varış yeri), tarih ve saat bilgisini kullanıcıdan alır.
* ! lokasyonBilgileri => Girilen verileri ekrana yazdırır.
* ArrayList<String> lokasyonlar => Lokasyonları tutan dizidir.
* kalkisLokasyon => Kalkış lokasyon bilgisini tutan alandır.
* varisLokasyon => Varış lokasyon bilgisini tutan alandır.
* Tarih => Rezervasyon tarih bilgisini tutan alandır.
* Saat => Rezervasyon saat bilgisini tutan alandır.

* IMusteri --> Musteri => musteriOlustur ve musteriBilgileri adında iki metodu içerir.
* ! musteriOlustur => Bu metod; müşteri bilgisini (T.C. Kimlik Numarası, ad, soyad, telefon numarası, yaş, engel durumu) kullanıcıdan alır.
* ! musteriBilgileri => Girilen verileri ekrana yazdırır.

* IRezervasyon --> Rezervasyon => rezervasyonOlustur metodunu içerir.
* ! rezervasyonOlustur => Bu metod; uygulamada bulunan sınıflardan nesne oluşturur ve gerekli metodları (musteriOlustur, lokasyonOlustur, ucakBilgileri) çağırır.

* IUcak --> Ucak => ucakBilgileri metodunu içerir.
* ! koltukSayisi => Uçakta bulunan koltuk sayısını tutan alandır.
* ! koltukNo => Program tarafından belirlenen koltu numarasını tutan alandır.
* ! ucakBilgileri => Bu metod; koltuk ve ücret bilgisini ekrana yazdırmak için kullanılır.

## ILokasyon
public interface ILokasyon
{
    void lokasyonOlustur();
    void lokasyonBilgileri();
}

## IMusteri
public interface IMusteri
{
    void musteriOlustur();
    void musteriBilgileri();
}

## IRezervasyon
public interface IRezervasyon
{
    void rezervasyonOlustur();
}

## IUcak
public interface IUcak
{
    void ucakBilgileri();
}

## Lokasyon
public class Lokasyon implements ILokasyon
{
    private static ArrayList<String> lokasyonlar = new ArrayList<String>();
    public static String kalkisLokasyon = "";
    public static String varisLokasyon = "";
    public static String Tarih = "";
    public static String Saat = "";

    @Override
    public void lokasyonOlustur() { }

    @Override
    public void lokasyonBilgileri() { }
}

## Musteri
public class Musteri implements IMusteri
{
    private long TC;
    private String ad;
    private String soyad;
    private long telefon;
    private int yas;
    private int engel;

    @Override
    public void musteriOlustur() { }

    @Override
    public void musteriBilgileri() { }
}

## Program
public class Program
{
    public static void main(String[] args)
    {
        System.out.println("Ucak Rezervasyon Sistemi");

        Rezervasyon rezervasyon = new Rezervasyon();
        rezervasyon.rezervasyonOlustur();

        System.out.print("Iyi Ucuslar Dileriz");
    }
}

## Rezervasyon
public class Rezervasyon implements IRezervasyon
{
    @Override
    public void rezervasyonOlustur() { }
}

## Ucak
public class Ucak implements IUcak
{
    private int koltukSayisi = 350;
    private int koltukNo = 0;

    @Override
    public void ucakBilgileri() { }
}