TTITLE LEFT "Vyvoj vydavkov daneho typu za dane obdobie" SKIP 2
SELECT typ AS "Typ vydavku", suma, datum
FROM Vydaj_domacnosti
WHERE domacnost_id=&dom_id
AND typ='&typ'
AND to_number(to_char(datum,'MM')) > &od
AND to_number(to_char(datum,'MM')) < &do;