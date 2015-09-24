
import Logiikka.ApuLuokat.Nappi;
import Logiikka.ApuLuokat.Tuomari;
import Logiikka.ApuLuokat.PalloRalli;
import Logiikka.kasittelijat.LyontienKasittelija;
import Logiikka.kasittelijat.NappienKasittelija;
import Logiikka.TekoalynLogiikka;
import Logiikka.PelaajanLogiikka;
import Logiikka.YhteisLogiikka;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aleksi
 */
public class Kayttoliittyma implements Runnable {

    private Tuomari tuomari;
    private JFrame frame;

    public Kayttoliittyma(Tuomari tuomari) {
        this.tuomari = tuomari;
    }

    public void luoAloitusNaytto(Container container) {
        JPanel aloitusNaytto = new JPanel(new GridLayout(2, 1));
        JPanel yla = new JPanel(new GridLayout(2, 1));
        JLabel selostus = new JLabel("Tervetuloa Pingis-simulaattoriin.Ilmassa on suuren urheilujuhlan tuntua. Arvotaan aloittaja painamalla OK.");
        JLabel tulostaulu = new JLabel(tuomari.toString());
        yla.add(selostus);
        yla.add(tulostaulu);
        aloitusNaytto.add(yla);
        JPanel ala = new JPanel(new GridLayout(4, 2));
        NappienKasittelija nk = new NappienKasittelija();
        PalloRalli ralli = new PalloRalli(tuomari.getPelaaja1(), tuomari.getPelaaja2());
        ralli.palloLoppuu();
        YhteisLogiikka logiikka = new YhteisLogiikka(selostus, tulostaulu, tuomari, nk, ralli);
                NappaimistonKuuntelija nappaimistonKuuntelija = new NappaimistonKuuntelija(logiikka, nk);
        nk.getOK().getButton().addKeyListener(nappaimistonKuuntelija);
        NappienKuuntelija kuuntelija = new NappienKuuntelija(nk, logiikka);

        for (Nappi nappi : nk.getNapit()) {
            nappi.getButton().addActionListener(kuuntelija);
            nappi.getButton().addKeyListener(nappaimistonKuuntelija);
            nappi.getButton().requestFocusInWindow();
            ala.add(nappi.getButton());
        }



        if (!tuomari.getPelaaja1().onkoIhmisenOhjaama()) {
            LyontienKasittelija lk = new LyontienKasittelija();
            logiikka.setTekoalynLogiikka1(new TekoalynLogiikka(selostus, tulostaulu, tuomari, nk, ralli, lk, tuomari.getPelaaja1()));

        } else {
            PelaajanLogiikka pl = new PelaajanLogiikka(selostus, tulostaulu, tuomari, nk, ralli, tuomari.getPelaaja1());
            kuuntelija.setPelaajanLogiikka(pl);
            nappaimistonKuuntelija.setPelaajanLogiikka(pl);

        }
        if (!tuomari.getPelaaja2().onkoIhmisenOhjaama()) {
            LyontienKasittelija lk = new LyontienKasittelija();
            logiikka.setTekoalynLogiikka2(new TekoalynLogiikka(selostus, tulostaulu, tuomari, nk, ralli, lk, tuomari.getPelaaja2()));
        } else {
            PelaajanLogiikka pl2 = new PelaajanLogiikka(selostus, tulostaulu, tuomari, nk, ralli, tuomari.getPelaaja1());
            kuuntelija.setPelaajanLogiikka(pl2);
            nappaimistonKuuntelija.setPelaajanLogiikka(pl2);
        }
        
        nk.kaikkiMuutNapitFalseksi(nk.getOK());
        ralli.pelaajanVuoro(tuomari.getSyottaja());
        aloitusNaytto.add(yla);
        aloitusNaytto.add(ala);
        container.add(aloitusNaytto);
    }

    @Override
    public void run() {
        this.frame = new JFrame(("Pingis-simulaattori"));
        frame.setPreferredSize(new Dimension(700, 700));
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        luoAloitusNaytto(frame.getContentPane());

        // frame.addKeyListener(nappaimisto);
        
//        frame.addKeyListener(new KeyAdapter() {
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("wattefuk");
//                super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        });
        //frame.requestFocus();
 
        frame.pack();
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);

    }

}
