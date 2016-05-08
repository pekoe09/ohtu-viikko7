# Kasper Hirvikoski: Metriikat käytänteiden tukena ohjelmiston laadun arvioimisessa
## Referaatti
Hirvikoski kuvaa tutkielmassaan neljää erilaista metriikkaa, joilla pyritään tukemaan ohjelmistokehityksen 
laadunvarmistamista kehitystyön aikana. Kukin näistä menetelmistä tarkastelee koodia eri näkökulmista; tavoitteena on 
tunnistaa virheherkkiä alueita, joihin voidaan metriikan osoittamana kohdistaa laadunvarmistusta tarkemmin. Mitään 
parasta ratkaisua ei ole; kukin menetelmä antaa osittaisen kuvan ohjelmiston laadusta ja siten ne rinnakkain käytettynä
tukevat toisiaan.

Koodikirnu-menetelmässä mitataan koodiin tehtyjä muutoksia tietyn ajanjakson sisällä esim versionhallintajärjestelmästä
saatavien tietojen avulla. Tausta-ajatuksena on, että useasti muutettava koodi on virheherkempää. Menetelmä käyttää 
suhteellisia mittareita kuten käsiteltyjen koodirivien määrä suhteessa kaikkien koodirivien määrään tai käsiteltyjen ja 
poistettujen rivien määrä suhteessa muutosten määrään. Mitä suurempia mittalukuja saadaan, sitä virhealttiimpaa koodin
katsotaan olevan.

Verkkoanalyysissä esitetään järjestelmän komponenttien keskinäisiä riippuvuuksia verkkona. Mitä enemmän jollain komponentilla
on riippuvuuksia, sitä virhealttiimpi se yleisesti ottaen on. Tässä menetelmässä käytettäviä mittareita ovat mm. solmun keskeisyys
(riippuvuuksien määrä ja riippuvuuspolun lyhyys)sekä naapurisolmuihin kytkeytymistä kuvaavan ns. egoverkon koko ja sisäiset 
polut. 

Testikattavuudella pyritään arvioimaan testien todennäköisyyttä havaita mahdollisia virheitä. Suurempi testikattavuus korreloi 
tutkimusten mukaan käänteisesti julkaisun jälkeisten virheilmoitusten määrän kanssa. Toisaalta on kuitenkin todettu, että
optimaalinen testikattavuus ei ole 100%, sillä testirivien määrä kasvaa eksponentiaalisesti pyrittäessä kohti täydellistä
kattavuutta kun taas virheherkkyys vähenee vain lineaarisesti. Optimaalinen kattavuustaso vaihteleekin ohjelmistosta riippuen.

Siinä missä testikattavuus vain heijastaa sitä, mitä osia koodista on katettu testitapauksilla, mutaatiotestaus pyrkii
arvioimaan testien laatua. Lisäksi sen on havaittu parantavan testien laatua suoraan. Mutaatiotestauksessa tehdään ohjelmistoon
yksittäisiä virheitä (ohjelman mutanttiversioita) ja tutkitaan, jäävätkö nämä testeissä kiinni. Mitä suuremman määrän
mutanteista testit havaitsevat, sitä parempia ne ovat laadullisesti. Koska potentiaalisten mutanttiversioiden määrä on
tolkuton, keskeistä onkin valita tutkittavaksi oleellisimmat tapaukset.

Loppujen lopuksi kehittäjien käytänteillä on kuitenkin suurin laadullinen merkitys - pelkät mekaaniset metriikat eivät riitä
laadun takeeksi. Siten ohjelmistotuotantomenetelmät nousevat keskeiseen rooliin; tältä osin tutkimukset tukevat näkemystä,
että ketteristä kehitysprosesseista saadaan hyötyä ohjelmistojen laadunvarmistuksessa.
