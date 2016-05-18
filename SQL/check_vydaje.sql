CREATE OR REPLACE TRIGGER check_vydaje
 BEFORE DELETE ON Ucet
 declare
  pocet integer;
BEGIN
 SELECT count(vydaj_dom_id) INTO pocet FROM Vydaj_domacnosti
 WHERE Vydaj_domacnosti.ucet_id = ucet_id;
 IF pocet > 0 THEN
 RAISE_APPLICATION_ERROR(-20000,
 'ERROR - NIE JE MOZNE VYMAZAT UCET');
 END IF;
 NULL;
END;
/