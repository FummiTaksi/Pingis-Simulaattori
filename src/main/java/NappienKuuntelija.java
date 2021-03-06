
import Logiikka.kasittelijat.NappienKasittelija;
import Logiikka.PelaajanLogiikka;
import Logiikka.YhteisLogiikka;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aleksi
 */
public class NappienKuuntelija implements ActionListener {

    private PelaajanLogiikka pl;
    private NappienKasittelija nk;
    private YhteisLogiikka logiikka;
    public NappienKuuntelija(NappienKasittelija nk,YhteisLogiikka logiikka) {
        this.nk = nk;
        this.logiikka = logiikka;
    }

    public void setPelaajanLogiikka(PelaajanLogiikka logiikka) {
        this.pl = logiikka;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        ((JComponent) e.getSource()).getParent().requestFocus();
        
        if (e.getActionCommand() == nk.getOK().toString()) {
           logiikka.kunPainetaanOK();
        } else {
            if (e.getActionCommand().equals(nk.getLyhytSyotto().toString())) {
                pl.lyhytSyotto();
            }
            if (e.getActionCommand() == nk.getPitkaSyotto().toString()) {
                pl.pitkaSyotto();
            }

            if (e.getActionCommand() == nk.getBlokki().toString()) {
                pl.blokki();
            }
            if (e.getActionCommand() == nk.getDeffu().toString()) {
                pl.deffu();
            }
            if (e.getActionCommand() == nk.getAlakierre().toString()) {
                pl.alakierre();
            }
            if (e.getActionCommand() == nk.getSpinni().toString()) {
                pl.spinni();
            }
            nk.kaikkiMuutNapitFalseksi(nk.getOK());
        }
    }

}
