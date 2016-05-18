TTITLE LEFT "Hospodarenie domacnosti - vypis pocet prijmov a ich celkovu sumu za zadane obdobie" SKIP 2
SELECT COUNT(*) AS "Pocet prijmov", 
SUM(suma) AS "Celkove prijmy"
FROM Prijem_domacnosti
WHERE domacnost_id=&dom_id
AND to_number(to_char(datum,'MM')) > &od
AND to_number(to_char(datum,'MM')) < &do;