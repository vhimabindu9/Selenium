public class CurrencyBills {
    public static void main(String a[])
    {
        int[] currency=new int[]{100,50,20,10,5,2,1};


        System.out.print(fewestBills(currency,3));

    }

    public static int fewestBills(int[]  currency,int value)
    {
        int fewestBills=0;

        int i=0;
        while(true)
        {
            if(value > currency[i])
            {
                value=value-currency[i];
                fewestBills++;
            }
            else if(value == currency[i])
            {
                fewestBills++;
                break;
            }
            else
            {
                i++;
            }
        }
        return fewestBills;
    }

}
