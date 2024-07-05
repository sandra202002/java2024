import java.io.*;
import java.util.*;
class Files
{
    public static void main(String args[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        FileWriter f = new FileWriter("input.txt");
        BufferedWriter bw = new BufferedWriter(f);
        System.out.println("Enter the number of lines:");
        int n = s.nextInt();
        s.nextLine();  // Consume the newline

        System.out.println("enter conenets:");
        String line;
        int i=0;
        do{
            if(i==n) break;
            line=br.readLine();
            bw.write(line);
            bw.newLine();
            i++;
        }while(true);

        bw.close();
        
        FileReader fr=new FileReader("input.txt");
        BufferedReader  bfr=new BufferedReader(fr);
        String str;
        System.out.println("/n______the file is_______");
        while((str=bfr.readLine())!=null)
        {
            System.out.println(str);
        }
        bfr.close();
    }
}