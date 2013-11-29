package belajar.io;

import java.util.List;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DemoHitungBatasSks {
    public static void main(String[] xx){
        BatasDao bd = new BatasDao();
        List<Batas> hasil = bd.bacaFile();
        
        Locale indonesia = new Locale("ID", "id");
        NumberFormat formatter = NumberFormat.getInstance(indonesia);
        ((DecimalFormat)formatter).applyPattern("0.00");
        
        System.out.println("+=========+=========+=======+");
        System.out.println("| IPK Min | IPK Max |  SKS  |");
        System.out.println("+=========+=========+=======+");
        
        for(Batas b : hasil){
            System.out.print("|  ");
            System.out.print(formatter.format(b.getIpkMin()));
            System.out.print("   |  ");
            System.out.print(formatter.format(b.getIpkMax()));
            System.out.print("   |  ");
            System.out.print(b.getSks());
            System.out.println("   |");
        }
        
        System.out.println("+=========+=========+=======+");
    }
}
