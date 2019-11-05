import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;

    public static void main(String args[]) {
      System.out.println(Hex());
    }


    public static int Hex()  {
        String number = "6";
        if (number.length() > 0)
        {
            try
            {
                Arg1 = Integer.parseInt(number);
            }
            catch (NumberFormatException e)
            {
                System.err.println("Argument" + number + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println();

        }
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem, num;
	num = Arg1;
	String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);
        return num;
    }
}
