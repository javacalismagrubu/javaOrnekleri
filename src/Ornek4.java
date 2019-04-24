public class Ornek4
{
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0 ;
        int toplam = 0;

        while(true)
        {
            if(num3 <= 4000000)
            {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

                if (num3 % 2 == 0)
                {
                    toplam += num3;
                }
            }

            else
                {
                break;
                }
        }

        System.out.print("\n"+toplam);

    }
}
