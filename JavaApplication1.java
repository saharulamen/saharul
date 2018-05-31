import java.util.*;
import java.io.*;
public class JavaApplication1 {
      public static void main(String[] args) {

          System.out.println("Enter a string to count character occurance:");
          Scanner sc1 = new Scanner(System.in); 
          String str = sc1.nextLine(); 
          getOccuringChar(str);

	System.out.println("Enter a string to convert to uppercase:");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] s1=s.split(" ");

for(String x:s1)
{
    int i=0;
    for(Character ch:x.toCharArray())
    {
        if(i%2==0)
            System.out.print(Character.toUpperCase(ch));
        else
            System.out.print(Character.toLowerCase(ch));
        i++;
    }
    System.out.print(" ");
}

      }
          static final int MAX_CHAR = 256; 
static void getOccuringChar(String str) 
    { 
        // Create an array 
        int count[] = new int[MAX_CHAR]; 
        int len = str.length(); 
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        } 
    }
   
}
