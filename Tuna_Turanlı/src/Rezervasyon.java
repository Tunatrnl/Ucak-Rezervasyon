public class Rezervasyon implements IRezervasyon
{
	@Override
    public void rezervasyonOlustur()
	{
		Musteri musteri = new Musteri();
		Lokasyon lokasyon = new Lokasyon();
		Ucak ucak = new Ucak();

		musteri.musteriOlustur();
		lokasyon.lokasyonOlustur();

		musteri.musteriBilgileri();
		lokasyon.lokasyonBilgileri();
		ucak.ucakBilgileri();
    }
}