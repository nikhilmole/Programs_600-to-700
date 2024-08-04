import java.util.*;

class Program682
{
    public static void main(String[] Arg)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ").trim();
        String Arr[] = str.split(" ");

        int i = 0;
        int iMax = 0;
        String MaxStr = null;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > iMax)
            {
                iMax = Arr[i].length();
                MaxStr = Arr[i];
            }
        }
        System.out.println("Largest word is : "+Arr[MaxStr]);
        System.out.println("Largest length of world is : "+iMax);
        
    }
}
