package ohtu.kivipaperisakset;

public class KPSPeliFactory {
    
    public static KPSPeli teePeli (String vastaus) {        
        KPSPeli peli = null;

        if (vastaus.endsWith("a")) {
            peli = new KPSPelaajaVsPelaaja();
        } else if (vastaus.endsWith("b")) {
            peli = new KPSPelaajaVsTekoaly();     
            ((TekoalyPeli)peli).asetaTekoaly(new Tekoaly());
        } else if (vastaus.endsWith("c")) {
            peli = new KPSPelaajaVsTekoaly();
            ((TekoalyPeli)peli).asetaTekoaly(new TekoalyParannettu(20));
        } 
        
        return peli;
    }    
}
