create or replace procedure nastav_splatnost
(
    id in Vydaje_osoby.vydaj_id%type,
    day in integer
)
is
begin
    UPDATE Vydaje_osoby SET splatnost=datum+day WHERE vydaj_id=id; 
end;
/