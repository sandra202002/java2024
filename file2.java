import java.io.*;

class file2 {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw1 = new FileWriter("even.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        FileWriter fw2 = new FileWriter("odd.txt");
        BufferedWriter bw2 = new BufferedWriter(fw2);
        
        String s;
        int n;
        while ((s = br.readLine()) != null) {
            n = Integer.parseInt(s);
            if (n % 2 == 0) {
                bw1.write(s);
                bw1.newLine();
            } else {
                bw2.write(s);
                bw2.newLine();
            }
        }
        
        br.close();
        bw1.close();
        bw2.close();
    }
}
