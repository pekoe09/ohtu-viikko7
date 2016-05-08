package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {
    
    protected Tuomari tuomari;
    protected static final Scanner scanner = new Scanner(System.in);
    protected String ekanSiirto;
    protected String tokanSiirto;
    
    public void pelaa() {
        tuomari = new Tuomari();
        
        teeEkanPelaajanSiirto();
        teeToisenPelaajanSiirto();
        
        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            kirjaaJaKuulutaTulos();
            teeEkanPelaajanSiirto();            
            teeToisenPelaajanSiirto();
        }

        naytaLopetusviesti();
    };
    
    private void kirjaaJaKuulutaTulos() {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }
    
    private void teeEkanPelaajanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine(); 
    }
    
    public abstract void teeToisenPelaajanSiirto();
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    protected void naytaLopetusviesti() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
}
