package belajar.io;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class BacaFile {
    public static void main(String[] xx) throws Exception {
        // 1. Deklarasikan object file
        File f = new File("input" + File.separator + "lovesomebody.txt");
        
        // 2. Buat reader
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        // 3. Looping, selama ada data baca dan tampilkan
        String data = br.readLine();
        while(data != null){
            System.out.println(data);
            data = br.readLine();
        }
        
        
        // 4. Setelah selesai diproses, tutup file
        br.close();
    }
}
