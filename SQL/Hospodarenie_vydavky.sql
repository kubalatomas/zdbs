TTITLE LEFT "Hospodarenie domacnosti - vypis pocet vydavkov a ich celkovu sumu za zadane obdobie" SKIP 2
SELECT COUNT(*) AS "Pocet vydavkov", 
SUM(suma) AS "Celkove vydavky"
FROM Vydaj_domacnosti
WHERE domacnost_id=&dom_id
AND to_number(to_char(datum,'MM')) > &od
AND to_number(to_char(datum,'MM')) < &do;
