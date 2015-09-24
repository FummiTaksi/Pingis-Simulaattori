
import Logiikka.ApuLuokat.Nappi;
import Logiikka.PelaajanLogiikka;
import Logiikka.YhteisLogiikka;
import Logiikka.kasittelijat.NappienKasittelija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aleksi
 */
public class NappaimistonKuuntelija implements KeyListener {

    private YhteisLogiikka yl;
    private PelaajanLogiikka pl;
    private NappienKasittelija nk;

    public NappaimistonKuuntelija(YhteisLogiikka logiikka, NappienKasittelija nk) {
        this.yl = logiikka;
        this.nk = nk;

    }

    public void setPelaajanLogiikka(PelaajanLogiikka logiikka) {
        this.pl = logiikka;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        System.out.println("olemme täällä -- test.");
    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("olemme täällä.");
        if (painetaankoNappia(nk.getOK(), KeyEvent.VK_ENTER, e)) {
            yl.kunPainetaanOK();
        }
        if (painetaankoNappia(nk.getLyhytSyotto(), KeyEvent.VK_1, e)) {
//            System.out.println("Changg");
            pl.lyhytSyotto();
        }
        if (painetaankoNappia(nk.getPitkaSyotto(), KeyEvent.VK_2, e)) {
            pl.pitkaSyotto();
        }

        if (painetaankoNappia(nk.getAlakierre(), KeyEvent.VK_3, e)) {
            pl.alakierre();
        }
        if (painetaankoNappia(nk.getDeffu(), KeyEvent.VK_4, e)) {
            pl.deffu();
        }
        if (painetaankoNappia(nk.getBlokki(), KeyEvent.VK_5, e)) {
            pl.blokki();
        }
        if (painetaankoNappia(nk.getSpinni(), KeyEvent.VK_6, e)) {
            pl.spinni();

        }

    }

    public boolean painetaankoNappia(Nappi nappi, int keycode, KeyEvent e) {
//        System.out.println("Painetaan nappia: " + nappi);
//        System.out.println("Nappi on päällä: " + nk.onkoNappiPaalla(nappi));
        if (!nk.onkoNappiPaalla(nappi)) {
            return false;
        }
//        System.out.println("Onko keycodet samat: " +  keycode + " = " + e.getKeyCode());
        if (e.getKeyCode() != keycode) {
            return false;
        }
////        System.out.println("");
        return true;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
