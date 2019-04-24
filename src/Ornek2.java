public class Ornek2
{
    public static void main(String[] args)
    {
        int sayac = 0;
        int toplam = 0;

        for(int sayi=0;sayi<=1000;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                toplam += sayi;
                sayac++;
            }
        }

        System.out.print(sayac-2+" tane asal sayinin toplami : "+toplam);
    }
}
