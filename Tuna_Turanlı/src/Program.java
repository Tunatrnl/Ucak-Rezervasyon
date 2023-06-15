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