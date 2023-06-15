import java.util.Random;

public class Ucak implements IUcak
{
	private int koltukSayisi = 350;
	private int koltukNo = 0;

	@Override
	public void ucakBilgileri()
	{
		Random random = new Random();
		koltukNo = random.nextInt(0, koltukSayisi);
		System.out.println("Koltuk Numaraniz: " + koltukNo);
		System.out.println("Ucret: " + random.nextInt(1000, 10000));

		System.out.println();
	}
}