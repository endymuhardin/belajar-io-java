package belajar.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TulisFile{
    public static void main(String[] xx) throws IOException {
        // 1. File tujuan
        File f = new File("output"+File.separator+"hasil.txt");
        
        // 2. Buat writer
        FileWriter fw = new FileWriter(f);
        
        // 3. Tulis data ke writer
        fw.write("Hello World");
        
        // 4. Setelah selesai, tutup
        fw.close();
    }
}
