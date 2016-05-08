package ohtu.kivipaperisakset;

public class KPSPelaajaVsTekoaly extends KPSPeli implements TekoalyPeli {
    
    private Alykkyys tekoaly;
    
    public void asetaTekoaly(Alykkyys alykkyys) {
        tekoaly = alykkyys;
    }
    
    @Override
    public void teeToisenPelaajanSiirto() {
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }
    
}
