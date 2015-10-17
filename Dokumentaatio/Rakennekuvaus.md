Pingis-simulaattori rakennekuvaus

Lyonti-rajapinnan toteuttavat luokat kuvaavat kaikki pelissä olevat lyönnit. Lyönnillä on todennäköisyys ja ArrayList 
Lyonti-olioista,jolla kyseiseen lyöntiin voi vastata.

Pelaaja-luokka pitää kirjaa pelaajan nimestä ja siitä, onko pelaaja ihmisen vai tietokoneen ohjaama.

Nappi-luokka tuntee yhden Lyonti-olion ja yhden JButtonin, johon lyönti yhdistetään.

NappienKasittelija-luokka tuntee kaikki käyttöliittymässä olevat Napit. Tässä luokassa myös säädellään, mitkä napit ovat
päällä ja mitkä eivät.

Lyontienkasittelija-luokkaa tuntee kaikki pelin lyönnit. Lyöntienkäsittelijää käytetään TekoalynLogiikassa, kun tahdotaan 
arpoa minkä lyönnin tekoäly valitsee.

Palloralli- luokka pitää kirjaa jokaisen pallorallin kulusta: Kumman pelaajan vuoro on, mihin lyöntiin hänen kuuluu vastata,
onko palloralli käynnissä vai ei. Pallorallissa on myös metodi lyönnin lyömiselle.

Tuomari-luokka pitää kirjaa pelin pistetilanteesta. Luokalla on metodit pisteiden lisäämisen pelaajille ja tarkastelut 
sille kenen syöttövuoro on ja milloin peli päättyy.

Abstraktissa luokassa Logiikka suoritetaan pelin toiminnot kun joku tietty lyönti lyödään, ja mitä tehdään kun 
lyönti menee pöytään tai kun se menee ohi. Tuntee NappienKasittelijan ja laittaa napit valmiiksi riippuen mihin lyöntiin
vastataan.

Logiikka-luokan perivä luokka PelaajanLogikka pitää huolta ihmisen tekemistä toimenpiteistä: Mitä tehdään kun ihminen 
lyö tietyn lyönnin.

Logiikka-luokan perivä TekoalynLogiikka pitää huolta tekoälyn lyöntivalinnoista: Millä lyönneillä tekoäly vastaa ihmisen
lyöntiin.

Logiikka-luokan perivä YhteisLogiikka tekee pelin etenemisen mahdolliseksi : Milloin on kutsuttava pelaajanLogiikkaa ja
milloin tekoalynLogiikkaa jotta peli etenee: Mitä tehdään OK-napin painamisen jälkeen? Mitä tehdään kun palloralli on lop-
punut? Mitä tehdään uuden pallon alkaessa ? Näihin kysymyksiin YhteisLogiikka löytää vastauksen.

Pelialusta-luokka toimii logiikan ja käyttöliittymän välissä : Se vaihtaa JFramen tulos- ja selostuskenttiä riippuen pelin
kulusta. 

NappaimistonKuuntelija ja NappienKuuntelija kuuntelevat käyttäjän painalluksia ja siirtyvät pelaajanlogiikkaan suorittamaan
tarvittavat toimenpiteet.

Käyttöliittymässä luodaan tarvittavat oliot, tehdään peli-ikkuna ja käynnistetään peli.



