import java.time.*;
import java.util.*;
public class Lokasyon implements ILokasyon
{
	private static ArrayList<String> lokasyonlar = new ArrayList<String>();
    public static String kalkisLokasyon = "";
    public static String varisLokasyon = "";
    public static String Tarih = "";
	public static String Saat = "";

	@Override
    public void lokasyonOlustur()
	{
		lokasyonlar.add("Adana,Adana Havalimani (ADA)");
    	lokasyonlar.add("Adana,Cukurova Havalimani (COV)");
    	lokasyonlar.add("Adiyaman,Adiyaman Havalimani (ADF)");
    	lokasyonlar.add("Agri,Agri Havalimani (AJI)");
    	lokasyonlar.add("Alanya,Gazipasa Alanya Havalimani (GZP)");
    	lokasyonlar.add("Amasya,Amasya Merzifon Havalimani (MZH)");
    	lokasyonlar.add("Ankara,Ankara Esenboga Havalimani (ESB)");
    	lokasyonlar.add("Antalya,Antalya Havalimani (AYT)");
    	lokasyonlar.add("Balikesir - Edremit,Koca Seyit Havalimani (EDO)");
    	lokasyonlar.add("Batman,Batman Havalimani (BAL)");
    	lokasyonlar.add("Bingol,Bingol Havalimani (BGG)");
    	lokasyonlar.add("Bursa,Bursa Yenisehir Havalimani (YEI)");
    	lokasyonlar.add("Canakkale,Canakkale Havalimani (CKZ)");
    	lokasyonlar.add("Denizli,Denizli Cardak Havalimani (DNZ)");
    	lokasyonlar.add("Diyarbakir,Diyarbakir Havalimani (DIY)");
    	lokasyonlar.add("Elazig,Elazig Havalimani (EZS)");
    	lokasyonlar.add("Erzincan,Erzincan Yildirim Akbulut Havalimani (ERC)");
    	lokasyonlar.add("Erzurum,Erzurum Havalimani (ERZ)");
    	lokasyonlar.add("Eskisehir,Hasan Polatkan Havalimani (AOE)");
    	lokasyonlar.add("Gaziantep,Gaziantep Havalimani (GZT)");
    	lokasyonlar.add("Hakkari,Yuksekova Havalimani (YKO)");
    	lokasyonlar.add("Hatay,Hatay Havalimani (HTY)");
    	lokasyonlar.add("Igdir,Igdir Sehit Bulent Aydin Havalimani (IGD)");
    	lokasyonlar.add("Isparta,Isparta Suleyman Demirel Havalimani (ISE)");
    	lokasyonlar.add("Istanbul,Istanbul Havalimani (IST)");
    	lokasyonlar.add("Istanbul,Sabiha Gokcen Havalimani (SAW)");
    	lokasyonlar.add("Izmir,Izmir Adnan Menderes Havalimani (ADB)");
    	lokasyonlar.add("Kahramanmaras,Kahramanmaras Havalimani (KCM)");
    	lokasyonlar.add("Kars,Kars Harakani Havalimani (KSY)");
    	lokasyonlar.add("Kastamonu,Kastamonu Havalimani (KFS)");
    	lokasyonlar.add("Kayseri,Kayseri Havalimani (ASR)");
    	lokasyonlar.add("Kocaeli,Kocaeli Cengiz Topel Havalimani (KCO)");
    	lokasyonlar.add("Konya,Konya Havalimani (KYA)");
    	lokasyonlar.add("Kutahya,Zafer Bolgesel Havalimani (KZR)");
    	lokasyonlar.add("Malatya,Malatya Havalimani (MLX)");
    	lokasyonlar.add("Mardin,Mardin Prof. Dr. Aziz Sancar Havalimani (MQM)");
    	lokasyonlar.add("Mugla-Bodrum,Milas-Bodrum Havalimani (BJV)");
    	lokasyonlar.add("Mugla-Dalaman,Dalaman Havalimani (DLM)");
    	lokasyonlar.add("Mus,Mus Havalimani (MSR)");
		lokasyonlar.add("Nevsehir,Nevsehir Kapadokya Havalimani (NAV)");
		lokasyonlar.add("Ordu-Giresun,Ordu-Giresun Havalimani (OGU)");
		lokasyonlar.add("Rize,Rize Artvin Havalimani (RZV)");
		lokasyonlar.add("Samsun,Samsun Carsamba Havalimani (SZF)");
		lokasyonlar.add("Siirt,Siirt Havalimani (SXZ)");
		lokasyonlar.add("Sinop,Sinop Havalimani (NOP)");
		lokasyonlar.add("Sivas,Sivas Nuri Demirag Havalimani (VAS)");
		lokasyonlar.add("Sanliurfa,Sanliurfa GAP Havalimani (GNY)");
		lokasyonlar.add("Sirnak,Sirnak Serafettin Elci Havalimani (NKT)");
		lokasyonlar.add("Tokat,Tokat Havalimani (TJK)");
		lokasyonlar.add("Trabzon,Trabzon Havalimani (TZX)");
		lokasyonlar.add("Usak,Usak Havalimani (USQ)");
		lokasyonlar.add("Van,Van Ferit Melen Havalimani (VAN)");
		lokasyonlar.add("Zonguldak,Zonguldak Havalimani (ONQ)");

		System.out.println();

		int lsecim = 0;

		for (int i = 0; i < lokasyonlar.size(); i++)
		{
		    System.out.println((i + 1) + ") " + lokasyonlar.get(i));
		}

		Scanner input1 = new Scanner(System.in);

		while (true)
		{
		    System.out.print("Lutfen Kalkis Lokasyonu Seciniz: ");
		    if (input1.hasNextInt())
		    {
		        lsecim = input1.nextInt();
		        if (lsecim > 0 && lsecim < 54)
		        {
		            kalkisLokasyon = lokasyonlar.get(lsecim - 1);
		            break;
		        }
		        else
		        {
		            System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
		    }
		    else
		    {
		        System.out.println("Lutfen Rakam Girin.");
		        input1.next();
		    }
		}

        System.out.println();

        int vsecim = 0;

        Scanner input2 = new Scanner(System.in);

		while (true)
		{
		    System.out.print("Lutfen Varis Lokasyonu Seciniz: ");
		    if (input2.hasNextInt())
		    {
		    	vsecim = input2.nextInt();
		        if (vsecim > 0 && vsecim < 54)
		        {
		        	if(lsecim != vsecim)
		        	{
		        		varisLokasyon = lokasyonlar.get(vsecim - 1);
			            break;
		        	}
		        	else
		        	{
		        		System.out.println("Kalkis Lokasyonu ile Varis Lokasyonu Ayni Olamaz.");
		        	}
		        }
		        else
		        {
		            System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
		        }
		    }
		    else
		    {
		        System.out.println("Lutfen Rakam Girin.");
		        input2.next();
		    }
		}

        System.out.println();

        LocalDate bugunTarih = LocalDate.now();
        LocalDate[] tarihler = new LocalDate[7];

        for (int i = 0; i < 7; i++)
        {
            tarihler[i] = bugunTarih.plusDays(i + 1);
        }

        for (int j = 0; j < 7; j++)
        {
            System.out.println((j + 1) + ") " + tarihler[j].toString());
        }

        int tsecim = 0;
        Scanner input3 = new Scanner(System.in);
        while (true)
        {
            System.out.print("Lutfen Tarih Seciniz: ");
            if (input3.hasNextInt())
            {
                tsecim = input3.nextInt();
                if (tsecim > 0 && tsecim < 8)
                {
                    Tarih = tarihler[tsecim - 1].toString();
                    break;
                }
                else
                {
                    System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
                }
            }
            else
            {
                System.out.println("Lutfen Rakam Girin.");
                input3.next();
            }
        }

        System.out.println();

        String[] saatler = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] dakikalar = {"00", "15", "30", "45"};
        String[] sabahAksam = {"AM", "PM"};
        Random rastgeleSayi = new Random();
        List<String> saatListesi = new ArrayList<>();
        String saat = "";

        while (saatListesi.size() < 10)
        {
            saat = saatler[rastgeleSayi.nextInt(12)] + ":" + dakikalar[rastgeleSayi.nextInt(4)] + " " + sabahAksam[rastgeleSayi.nextInt(2)];
            if (!saatListesi.contains(saat))
            {
                saatListesi.add(saat);
            }
        }

        Collections.sort(saatListesi);

        for (int i = 0; i < 10; i++)
        {
            System.out.println((i + 1) + ") " + saatListesi.get(i));
        }

        int ssecim = 0;
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("Lutfen Saat Seciniz: ");
            if (input.hasNextInt())
            {
                ssecim = input.nextInt();
                if (ssecim > 0 && ssecim < 11)
                {
                    Saat = saatListesi.get(ssecim - 1);
                    break;
                }
                else
                {
                    System.out.println("Gecersiz Secim. Lutfen Tekrar Deneyiniz.");
                }
            }
            else
            {
                System.out.println("Lutfen Rakam Girin.");
                input.next();
            }
        }

        System.out.println();
    }

    @Override
    public void lokasyonBilgileri()
    {
    	System.out.println("Kalkis Lokasyonu: " + kalkisLokasyon);
    	System.out.println("Varis Lokasyonu: " + varisLokasyon);
    	System.out.println("Ucus Tarihi: " + Tarih);
    	System.out.println("Ucus Saati: " + Saat);

    	System.out.println();
    }
}