package belajar.io;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class BatasDao{
    public List<Batas> bacaFile(){
        try {
            // 0. Object penampungan hasil
            List<Batas> hasil = new ArrayList<Batas>();
        
            // 1. Deklarasikan object file
            File f = new File("input" + File.separator + "batas.txt");
            
            // 2. Buat reader
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            // 3. Looping, selama ada data baca dan tampilkan
            String data = br.readLine();
            data = br.readLine(); // skip header
            while(data != null){
                // 3.a. Parsing data
                String[] kolom = data.split(",");
                BigDecimal ipkMin = new BigDecimal(kolom[0]);
                BigDecimal ipkMax = new BigDecimal(kolom[1]);
                Integer sks = Integer.parseInt(kolom[2]);
                
                // 3.b. Masukkan ke object
                Batas b = new Batas();
                b.setIpkMin(ipkMin);
                b.setIpkMax(ipkMax);
                b.setSks(sks);
                
                // 3.c. Kumpulkan object di hasil akhir
                hasil.add(b);
                
                data = br.readLine();
            }
            
            
            // 4. Setelah selesai diproses, tutup file
            br.close();
            
            // 5. Return hasil
            return hasil;
        } catch (Exception err){
            System.out.println("Terjadi error : "+err.getMessage());
            return new ArrayList<Batas>();
        }
    }
}
