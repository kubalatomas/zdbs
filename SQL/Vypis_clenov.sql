TTITLE LEFT "Vypis clenov domacnosti zvolenej domacnosti spolu s aktualnym vekom" SKIP 2
SELECT meno, priezvisko, to_number(to_char(sysdate,'YYYY')) - to_number(to_char(datum_narodenia,'YYYY')) 
AS vek FROM osoba 
WHERE domacnost_id=&dom_id;