public class Ornek6
{
    public static void main(String[] args)
    {
        int toplam1 = 0;
        int toplam2 = 0;
        int sonuc = 0;

        for (int i = 1; i <= 20; i++)
        {
            toplam1 += Math.pow(i,2);
        }

        for (int i = 1; i <= 20; i++)
        {
            toplam2 += i;
        }

        sonuc = (int)Math.pow(toplam2,2) - toplam1;

        System.out.println(sonuc);

    }
}
