# Startdocument Voor Het winkelcentrum

Startdocument van **Steffan van der Werf en Chris Klunder**.

## Probleem omschrijving

### Invoer & Uitvoer

in dit stuk ga ik de in en uitvoer producten beschrijven. 
#### Input

In de tabel hier onder ga ik het over de input omschrijven. (de input dat de gebruiker moet in vullen om de applicatie te laten werken)

|Case|Type|Conditie|
|----|----|----------|
||`String`||


#### Output

|Case|Type|
|----|---|
| ||

#### Berekeningen

| Case              | Calculation                        |
|-------------------| ---------------------------------- |
|            |  |


#### Opmerkingen

* Input word gecorntoleerd

## Klassen diagram

![Klassen diagram](klassenDiagram.png "Eerste versie van het klassen diagram")

## Testplan

in dit hoofstuk ga ik de testcases omschrijven die de applicatie gaan testen.

### Test Data

In de volgende tabellen ga je alle data vinden die nodig is om de applicatie te testen
#### Club

| ID           | Input                                    | Code                                |
|--------------|------------------------------------------|-------------------------------------|
| `club`       | name: HBO Sport, location: Emmen         | `new Club("HBO Sport", "Emmen")`    |
| `            |                                      | ``                 |

### Testgevallen

In dit hoofstuk ga ik de stappen omschrijven om de test uit te voeren als een basis lijn.

#### #1 GetClubRecord

het testen of ik een athleet terug krijg.

| Step | Input        | Action                 | Expected output |
| ---- | ------------ | ---------------------- | --------------- |
| 1    | `Club` | `addAtlete(athleet)` |                 |
| 2    | `Club` | `addAtlete(athleet2)` |                 |
| 3    | `Club` | `GetClubRecord()`          | Klunder Athleet            |