Pingis-simulaattori rakennekuvaus

Lyonti-rajapinnan toteuttavat luokat kuvaavat kaikki peliss� olevat ly�nnit. Ly�nnill� on todenn�k�isyys ja ArrayList 
Lyonti-olioista,jolla kyseiseen ly�ntiin voi vastata.

Pelaaja-luokka pit�� kirjaa pelaajan nimest� ja siit�, onko pelaaja ihmisen vai tietokoneen ohjaama.

Nappi-luokka tuntee yhden Lyonti-olion ja yhden JButtonin, johon ly�nti yhdistet��n.

NappienKasittelija-luokka tuntee kaikki k�ytt�liittym�ss� olevat Napit. T�ss� luokassa my�s s��dell��n, mitk� napit ovat
p��ll� ja mitk� eiv�t.

Lyontienkasittelija-luokkaa tuntee kaikki pelin ly�nnit. Ly�ntienk�sittelij�� k�ytet��n TekoalynLogiikassa, kun tahdotaan 
arpoa mink� ly�nnin teko�ly valitsee.

Palloralli- luokka pit�� kirjaa jokaisen pallorallin kulusta: Kumman pelaajan vuoro on, mihin ly�ntiin h�nen kuuluu vastata,
onko palloralli k�ynniss� vai ei. Pallorallissa on my�s metodi ly�nnin ly�miselle.

Tuomari-luokka pit�� kirjaa pelin pistetilanteesta. Luokalla on metodit pisteiden lis��misen pelaajille ja tarkastelut 
sille kenen sy�tt�vuoro on ja milloin peli p��ttyy.

Abstraktissa luokassa Logiikka suoritetaan pelin toiminnot kun joku tietty ly�nti ly�d��n, ja mit� tehd��n kun 
ly�nti menee p�yt��n tai kun se menee ohi. Tuntee NappienKasittelijan ja laittaa napit valmiiksi riippuen mihin ly�ntiin
vastataan.

Logiikka-luokan periv� luokka PelaajanLogikka pit�� huolta ihmisen tekemist� toimenpiteist�: Mit� tehd��n kun ihminen 
ly� tietyn ly�nnin.

Logiikka-luokan periv� TekoalynLogiikka pit�� huolta teko�lyn ly�ntivalinnoista: Mill� ly�nneill� teko�ly vastaa ihmisen
ly�ntiin.

Logiikka-luokan periv� YhteisLogiikka tekee pelin etenemisen mahdolliseksi : Milloin on kutsuttava pelaajanLogiikkaa ja
milloin tekoalynLogiikkaa jotta peli etenee: Mit� tehd��n OK-napin painamisen j�lkeen? Mit� tehd��n kun palloralli on lop-
punut? Mit� tehd��n uuden pallon alkaessa ? N�ihin kysymyksiin YhteisLogiikka l�yt�� vastauksen.

Pelialusta-luokka toimii logiikan ja k�ytt�liittym�n v�liss� : Se vaihtaa JFramen tulos- ja selostuskentti� riippuen pelin
kulusta. 

NappaimistonKuuntelija ja NappienKuuntelija kuuntelevat k�ytt�j�n painalluksia ja siirtyv�t pelaajanlogiikkaan suorittamaan
tarvittavat toimenpiteet.

K�ytt�liittym�ss� luodaan tarvittavat oliot, tehd��n peli-ikkuna ja k�ynnistet��n peli.



