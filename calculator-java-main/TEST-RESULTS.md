
# ✅ TEST-RESULTS

## 🔍 Testiranje funkcionalnosti (Black Box)

Testirano ponašanje kalkulatora sa različitim unosima:
- `2+2` → ✅ 4.0
- `5*3` → ✅ 15.0
- `10/2` → ✅ 5.0
- `10+5*2` → ✅ 20.0 (poštovan prioritet)
- `10+5/0` → ⚠️ Infinity (nema obrade greške)
- `abc+2` → ⚠️ ERROR (bez objašnjenja)

### Edge Cases
- `-5+3` → ✅ -2.0 (ispravno dodaje 0 na početku izraza)
- `+7-2` → ✅ 5.0
- `4++4` → ⚠️ ERROR

---

## 🧪 Jedinični test

Jedinični test implementiran za `Calculator.Calculate()` metodu, testira aritmetiku i poštovanje prioriteta operacija. Pokriva:
- Proste izraze
- Mešane operacije sa prioritetima
- Negativne brojeve

---

## ⚠️ Analiza sa SonarQube

1. **Višestruko otvaranje `Scanner` objekta** unutar petlje
2. **Zatvaranje `Scanner` unutar petlje** može izazvati probleme pri sledećim unosima
3. **Bez detaljnog objašnjenja za `ERROR` izlaze** (npr. greške u parsiranju)
4. **Duplirani blokovi koda u `Calculate()`** metodi povećavaju kognitivnu složenost
5. **Stil koda**: promenljive poput `Expression` koriste veliko slovo što nije u skladu sa Java konvencijama

---

## ✅ Preporuke

- Premestiti `Scanner` van petlje i zatvoriti ga nakon izlaska
- Refaktorisati `Calculate()` metodu da se izbegne duplirani kod (npr. korišćenjem petlji ili mapiranja)
- Dodati bolju obradu grešaka i korisničkih poruka (npr. `"Neispravan izraz"`)
- Poštovati Java naming konvencije (`expression` umesto `Expression`)
- Potencijalno proširiti podršku za decimalne brojeve i zagrade
