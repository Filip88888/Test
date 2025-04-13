Broj linija koda (LOC):

Calculator: 188 linija (uključujući prazne linije i komentare).
Start: 26 linija (uključujući prazne linije i komentare).


SonarQube (stari naziv SonarLint) je korišćen za analizu koda. 
Alat je identifikovao nekoliko problema u vezi sa stilom koda i efikasnošću.

1. Višestruko otvaranje Scanner objekta - scanIn = new Scanner(System.in);
2. Zatvaranje Scanner objekta unutar petlje - scanIn.close();
3. Nedostatak obrade grešaka prilikom unosa izraza, ako korisnik unese pogrešan izraz, kalkulator vraća "ERROR", ali bez objašnjenja.
4. Kognitivna složenost Calculator klase (mnogo dupliranih blokova koda)
5. Neodgovarajući naziv varijable (varijabla Expression koristi veliko slovo na početku).