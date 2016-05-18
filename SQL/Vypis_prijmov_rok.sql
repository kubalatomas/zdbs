TTITLE LEFT "Vypis predpokladanych prijmov zadanej domacnosti na dalsi rok" SKIP 2
SELECT typ AS "Predpokladany prijem", suma AS "Suma" 
FROM prijem_domacnosti WHERE domacnost_id=&dom_id;
