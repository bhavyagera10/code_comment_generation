package methodEmbedding.Speaking_in_Tongues.S.LYD873;

import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class gcj1
{
     public static void main(String args[])throws Exception
     {
         //Scanner in=new Scanner(System.in);
         //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         //BufferedReader br = new BufferedReader(new FileReader("gcj1.in"));
         //PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gcj1.out")));
         //PrintWriter pw = new PrintWriter(System.out);
         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rahul\\Desktop\\gcj1.in"));
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\rahul\\Desktop\\gcj1.out")));
         //StringTokenizer st;
         int n=Integer.parseInt(br.readLine());
         int i,k,j;
         char a[]={' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' ',' ',' ',' ',' ',' ',' '};
       
         for(i=0;i<n;i++)
         {
             String s1=br.readLine();
             int l=s1.length();
             pw.print("Case #"+(i+1)+": ");
             for(j=0;j<l;j++)
             {
                 pw.print(a[(int)(s1.charAt(j))]);
                }
                pw.println();
            }
         
        
        pw.flush();
        pw.close();
        System.exit(0);
     }
}
