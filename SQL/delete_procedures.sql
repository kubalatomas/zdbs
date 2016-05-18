create or replace procedure delete_osoba
(
	rc in Osoba.rod_cislo%type
)
is
begin 
	delete Osoba where rod_cislo=rc;
end;
/

create or replace procedure delete_adresa
(
	id in Adresa.adresa_id%type
)
is
begin 
	delete Adresa where adresa_id=id;
end;
/

create or replace procedure delete_domacnost
(
	id in Domacnost.domacnost_id%type
)
is
begin 
	delete Domacnost where domacnost_id=id;
end;
/

create or replace procedure delete_ucet
(
	id in Ucet.ucet_id%type
)
is
begin 
	delete Ucet where ucet_id=id;
end;
/

create or replace procedure delete_vydaje_osoby
(
	id in Vydaje_osoby.vydaj_id%type
)
is
begin 
	delete Vydaje_osoby where vydaj_id=id;
end;
/

create or replace procedure delete_prijem_osoby
(
	id in Prijem_osoby.prijem_id%type
)
is
begin 
	delete Prijem_osoby where prijem_id=id;
end;
/

create or replace procedure delete_vydaj_domacnosti
(
	id in Vydaj_domacnosti.vydaj_dom_id%type
)
is
begin 
	delete Vydaj_domacnosti where vydaj_dom_id=id;
end;
/

create or replace procedure delete_prijem_domacnosti
(
	id in Prijem_domacnosti.prijem_dom_id%type
)
is
begin 
	delete Prijem_domacnosti where prijem_dom_id=id;
end;
/