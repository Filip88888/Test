# ✅ TEST-RESULTS

## ✔️ Jedinični testovi

### TestCalculator.java

| Test metoda                | Ulazni izraz       | Očekivani rezultat | Status testa |
|---------------------------|--------------------|---------------------|--------------|
| testCalculateMixedOperations | 10+5*2-4/2         | 18.0                | ✅ Prošao     |
| testCalculateSimpleAddition  | 3+7                | 10.0                | ✅ Prošao     |
| testCalculateNegativeNumbers | -5+3               | -2.0                | ✅ Prošao     |

---

## ❗ Zapažanja

- Podržana je osnovna aritmetika sa prioritetom operacija.
- Negativni brojevi se pravilno interpretiraju (npr. `-5+3`).
- Kalkulator ne obrađuje razmake u izrazu (`5 + 3` izaziva grešku).
- Ne postoji detaljna poruka o grešci za neispravne izraze.
- Deljenje nulom izaziva `Infinity`, ali se ne javlja greška korisniku.

---

## 💡 Preporuke

- Dodati podršku za izraze sa razmacima (`trim()` ili preprocesiranje).
- Prikazati korisniku konkretniju poruku kada se vrati `"ERROR"`.
- Ukloniti višestruko kreiranje `Scanner` objekta (u `Start.java`).
- Refaktorisati metodu `Calculate()` radi smanjenja kognitivne složenosti.
- Razmotriti upotrebu regularnih izraza za napredno parsiranje izraza.

---

📅 Datum testa: *21. april 2025.*
