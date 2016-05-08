package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPSPeli {
    
    @Override
    public void teeToisenPelaajanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();
    }
}