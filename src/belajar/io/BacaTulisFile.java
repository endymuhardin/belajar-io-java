package belajar.io;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;


public class BacaTulisFile{
    public static void main(String[] xx) throws Exception {
        // 1. File asal
        File fileAsal = new File("input" + File.separator + "lovesomebody.txt");
        
        // 2. Reader
        FileReader fr = new FileReader(fileAsal);
        BufferedReader br = new BufferedReader(fr);
        
        // 3. File tujuan
        File fileTujuan = new File("output"+File.separator+"lirik.txt");
        
        // 4. Writer
        FileWriter fw = new FileWriter(fileTujuan);
        
        // 5. Pindahkan dari fileAsal ke fileTujuan
        String data = br.readLine();
        while(data != null){
            fw.write(data);
            fw.write("\r\n");
            data = br.readLine();
        }
        
        // 6. Tutup
        fw.close();
        br.close();
    }
}
