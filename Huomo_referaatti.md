# Tero Huomo - Ohjelmistoarkkitehtuurin sisällyttäminen ketteriin ohjelmistotuotantomenetelmiin
## Referaatti
Arkkitehtuurivetoinen ohjelmistokehitys ja ketterä ohjelmistokehitys nähdään usein keskenään ristiriitaisina lähestymistapoina.
Ohjelmiston arkkitehtuurin - järjestelmän komponentteja, niiden välisiä yhteyksiä, osien fyysistä sijaintia, perusrakennetta ja
järjestelmän laajuisa ohjelmointikäytänteitä koskevat päätökset ja niiden kuvaus - suunnittelu on ollut keskeinen osa vesiputousmallia,
jossa järjestelmä on suunniteltu mahdollisimman tarkasti ennen toteutusta. Ketterät kehitysmenetelmät taas lähtevät siitä, että
ohjelmistoa tuotetaan pieni pala kerrallaan eikä mitään laajaa suunnitelmaa tehdä etukäteen vaan myös järjestelmän perusrakenteet
syntyvät orgaanisesti kehitystyön edetessä toiminnallisuus kerrallaan.

Käytännössä ketteriä menetelmiä käyttävät tiimit ovat omaksuneet erilaisia tapoja ratkaista tämä ristiriita; Huomo esittelee
tutkielmassaan viisi tällaista tapaa. Nämä käytänteet eivät ole ristiriidattomia ketterien kehitysmenetelmien ajatusten kanssa
mutta toisaalta ketterän ohjelmistokehityksen manifestin mukaan kehitysryhmän toimintaa voi muokata tarpeen vaatiessa projektin
ja ympäristön vaatimuksiin soveltuvaksi.

Niin kutsuttu Sprint 0 on käytänne, jossa projektin alkaessa käytetään oma sprintti projektin aloitustoimiin ennen varsinaisia
kehitysjaksoja. Tällaisiin toimiin kuuluu tyypillisesti mm. kehitysympäristön rakentaminen mutta tämä aloitussprintti voidaan
suunnata myös rakennettavan järjestelmän arkkitehtuurin suunnitteluun. Tämä tapa onkin Huomon siteeraaman Elorannan ja Koskimiehen
tutkimuksen mukaan käytössä monissa yhtiöissä. Sitä voi kuitenkin pitää ketterän kehitysprosessin vastaisena, sillä tällainen
sprint 0 ei tuota vielä asiakkaalle mitään toimivaa ohjelmistoa eikä siten myöskään suoraa arvoa.

Ohjelmistoarkkitehtuuri voidaan myös eriyttää omaksi prosessikseen, joka noudattaa omaa prosessimalliaan ja aikatauluaan. 
Ongelmaksi voi kuitenkin muodostua se, että arkkitehtuuriprosessi ei huomioi riittävästi muuttuvia vaatimuksia. Lisäksi 
arkkitehtuurin eriyttäminen voi olla vaikeaa, sillä ketterien menetelmien ajatuksena on, että rakenne ilmaantuu ohjelmistoa
toteutettaessa. Tämä lähestymistapa on lisäksi ristiriidassa sen ketterien menetelmien jakaman periaatteen kanssa, että 
kehitystiimi vastaa toteutuksesta - tällöin tiimiin ei luotettaisi ohjelmiston perusrakenteista päätettäessä.

Suunnittelupiikeillä ratkotaan suunnitteluun liittyviä haasteita ja uuden teknologian vaikutuksia järjestelmään. Niiden avulla
voidaan tutustua teknologian yksityiskohtiin ja tutkia vaihtoehtoisia lähestymistapoja. Suunnittelupiikkien käyttö ei ole
suoraan ristiriidassa ketterien menetelmien periaatteiden kanssa mutta ne vievät tiimiltä resursseja, mikä voi vaarantaa
sprintin tavoitteiden toteutumisen. 

Arkkitehtuurisprinttejä voidaan pitää laajennettuna versiona suunnittelupiikistä. Siinä koko kehitystiimi käyttää sprintin
ohjelmiston rakenteeseen liittyviin asioihin. Tähän liittyy ketterien menetelmien näkökulmasta samanlaisia ongelmia kuin
Sprint 0:n käyttöön.

Arkkitehtuuritarinoiden käytössä on kyse järjestelmän rakenneasioiden nostamisesta user storyjen rinnalle, vastaavanlaisina
vaatimuksina. Ne kuvaavat järjestelmän osia, jotka eivät näy asiakkaalle ja niitä kirjaavat asiakkaan sijasta kehitystiimin 3
jäsenet. Ne myös estimoidaan ja priorisoidaan vastaavalla tavalla kuin user storyt. Arkkitehtuuritarinat eivät ole varsinaisesti
ketterien menetelmien vastaisia; asiakasta voi kuitenkin olla vaikea saada sopimaan näiden tarinoiden priorisoinnista
varsinaisiin user storyihin nähden.

Näiden käytänteiden keskinäisestä paremmuudesta ei juurikaan ole tieteellistä vertailua tai ohjeita. Useat ohjelmistoyritykset
kuitenkin soveltavat näitä omassa toiminnassaan ollen pääosin tyytyväisiä valintoihinsa.
