public class Ornek5
{
    public static void main(String[] args)
    {
        for (int sayi = 1; ; sayi++)
        {
            if(sayi % 20 == 0 && sayi % 19 == 0 && sayi % 18 == 0 && sayi % 17 == 0 && sayi % 16 == 0 && sayi % 14 == 0 && sayi % 13 == 0 && sayi % 11 == 0)
            {
                System.out.println(sayi);
                break;
            }
        }

        for (int emre = 1; ; emre++)
        {
            if(emre % 10 == 0 && emre % 9 == 0 && emre % 8 == 0 && emre % 7 == 0)
            {
                System.out.println(emre);
                break;
            }
        }
    }
}
