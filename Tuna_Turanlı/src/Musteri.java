import java.util.*;
public class Musteri implements IMusteri
{
	private long TC;
	private String ad;
	private String soyad;
	private long telefon;
	private int yas;
	private int engel;

	@Override
    public void musteriOlustur()
	{
		while(true)
		{
			try
			{
				Scanner input1 = new Scanner(System.in);
				System.out.print("T.C. Kimlik Numaranizi Giriniz: ");
				TC = input1.nextLong();

				if(Long.toString(TC).length() == 11)
					break;
				else
					System.out.println("T.C. Kimlik Numarasi 11 Haneden Olusur.");
			}
			catch(Exception e)
			{
				System.out.println("Lutfen Sayi Giriniz.");
			}
		}

		Scanner input2 = new Scanner(System.in);
		System.out.print("Adinizi Giriniz: ");
		ad = input2.nextLine();

		Scanner input3 = new Scanner(System.in);
		System.out.print("Soyadinizi Giriniz: ");
		soyad = input3.nextLine();

		while(true)
		{
			Scanner input4 = new Scanner(System.in);
			try
			{
				System.out.print("Telefon Numaranizi Giriniz: ");
				telefon = input4.nextLong();

				if(Long.toString(telefon).length() == 10)
					break;
				else
					System.out.println("Telefon Numarasi 10 Haneden Olusur.");
			}
			catch(Exception e)
			{
				System.out.println("Lutfen Sayi Giriniz.");
			}
		}

		while(true)
		{
			Scanner input5 = new Scanner(System.in);
			try
			{
				System.out.print("Yasinizi Giriniz: ");
				yas = input5.nextInt();

				if(yas > 0 && yas < 101)
					break;
				else
					System.out.println("1 - 100 Yas Arasi Yolcular Ucak Kullanabilir.");
			}
			catch(Exception e)
			{
				System.out.println("Lutfen Sayi Giriniz.");
			}
		}

		while(true)
		{
			Scanner input6 = new Scanner(System.in);
			try
			{
				System.out.print("Engel Durumunuzu Giriniz (1 --> Var, 2 --> Yok): ");
				engel = input6.nextInt();

				if(engel > 0 && engel < 3)
					break;
				else
					System.out.println("1 veya 2 Secenegini Secebilirsiniz.");
			}
			catch(Exception e)
			{
				System.out.println("Lutfen Rakam Giriniz.");
			}
		}
    }

    @Override
    public void musteriBilgileri()
    {
    	System.out.println("Musteri'nin Adi Soyadi: " + ad + " " + soyad);
    	System.out.println("Musteri'nin T.C. Kimlik Numarasi: " + TC);
    	System.out.println("Musteri'nin Telefon Numarasi: " + telefon);
    	System.out.println("Musteri'nin Yasi: " + yas);
    	System.out.println("Musteri'nin Engel Durumu: " + ((engel == 1) ? "Var" : "Yok"));

    	System.out.println();
    }
}