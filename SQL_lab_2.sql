-- Początkowe polecenia
/*
DROP TABLE pracownicy; -- Inaczej kompilator wywali błąd że instenie już tabela

-- Tworzenie tabeli
CREATE TABLE pracownicy (id int,
                         imie varchar(30),
                         nazwisko varchar(30)
						);
                        

-- Dodawanie nowych rekordów w tabeli
INSERT INTO pracownicy (id, imie, nazwisko) VALUES (1, 'Jan', 'Kowalski');          
INSERT INTO pracownicy (id, imie, nazwisko) VALUES (2, 'Andrzej', 'Nowak');    

UPDATE pracownicy SET imie='Konrad' where id=1; -- Aktualizacja istniejących kolumn w rekordzie

-- Usuwanie rekordów w tabeli, where określa który wiersz chcemy usunąć (takie filtrowanie po warunku)
-- DELETE FROM pracownicy where id=2;

-- Wypisywanie zawartości tabeli ( '*' oznacza że chcemy wszystko co jest podane w tabeli )
SELECT * FROM pracownicy;
*/

-- Ćwiczonka z zajęć
-- Polecenie nr.1
CREATE table Books (ID int,
                    Title varchar,
                    Author varchar,
                    Price float,
                    Year int);

-- Polecenie nr.2
UPDATE Books SET Price=25.99 where Title='Harry Potter';

-- Polecenie nr.3
delete from Books where Year<2000;

-- Polecenie nr.4
select * from Books where Author='King' and Year>2010;

-- Polecenie nr.5
drop table Customers;

-- Polecenie nr.6
insert into Customers (id, nazwisko, wiek, address) values (104, 'Smith', 40, 'ul. Prosta 5, Warszawa')

-- Ćwiczenie zliczania
SELECT count(*) as cnt 
from samochody 
where rok_produkcji<2000;

-- Ćwiczono sumowania
select SUM(moc) as total
from samochody;

-- Ćwiczonko filtrowania
select *
from samochody
where karta_kredytowa is not null 
	and cena is not null
	and karta_kredytowa like '401%'; -- Wyrażenia regularne (% za oznacza że chcemy coś co zaczyna się do momentu %)

-- Zadanko do sprawdzenia z labów nr.2
/*
create table Authors (ID int,
                      Name varchar,
                      Country varchar
);
*/

/*
CREATE TABLE Books (ID int,
                    Title varchar,
                    Author_ID int,
                    Year int,
                    Price decimal,
                    FOREIGN key (Author_ID),
					PRIMARY key (ID)
);
*/

insert into Authors (ID, Name, Country)
VALUES
	(1, 'Smith', 'Poland'),
    (2, 'Chriss', 'USA'),
    (3, 'Alfred', 'Canada');
    
insert into Books (ID, Title, Author_ID, Year, Price)
VALUES
	(1, 'Last Summer', 1, 1999, 25.99),
    (2, 'First Summer', 1, 2003, 23.33),
    (3, 'Never created', 2, 2020, 44.01),
    (4, 'How to nothing', 2, 2019, 30.00),
    (5, "I don't like christmass", 3, 2001, 19.59);
    
select * from Books;

UPDATE Books
set Price=29.99
where Title="Harry Potter";

delete from Books
where Name="Smith";
