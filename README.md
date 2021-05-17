This repository contains one of the tasks for the university course Advanced Java. The original description of the task is copied to the README and can be viewed below.

## 1 Implementációban erős függőség: new operátor osztály létrehozás.

Egy ifjú kollégád munkáját review-zod, és a következő felépítést találtad:

Van egy Store osztály, a következő elemekkel:

- add metódus, amely bead egy terméket a raktárba. StoreFullException dobódik, ha már nem fér be a raktárba
- remove metódus, amely kivesz egy terméket a raktárból StoreEmptyException kivétel dobódik, ha a raktár már üres.
- reset metódus, ami törli a raktár tartalát.
- getProductCount metódus, ami visszaadja a raktárban lévő termékek számát.
- A termék lehet ArrayListben vagy Queu-ban

és egy Consumer osztályt, létrehoz egy Store példányt.

- Hozz létre benne egy consume metódust, ami megpróbál kivenni egy terméket a raktárból és visszaadja azt. (kivételt nem kezeli.)

valamint egy Producer osztályt, amely egy Store példányt.

- Hozz létre benne egy produce metódust, ami megpróbál létrehozni és betenni a raktárba egy terméket. (kivételt nem kezeli.) A termék neve legyen product és a sorszáma. pl. product0, product1,
 
A probléma, hogy a Consumer és Producer osztály egy másik osztálytól függ (Erős függőség, nem lehet jól egység tesztelni, nem elég rugalmas, nem lehet kicserélni részeit).

1. Közben már a kód is elveszett. Hozz létre egy git repositorty-t, benne egy kommitot, miben ezt a nem túl jó kód található
2. Hozz létre egy másik brachet, amiben a Store osztálynak van egy intefésze, amit implementál, valamint a Producer és Consumer osztályok függőségként kapják meg az új Store referenciát a szokásos konvenciók használata mellett.
3. Még jobb ötletünk van válasszuk szét a Store interface-t 2 további részre: StoreReader (remove metódus)  és StoreWirter (add metódus), alakítsd tovább a kódot, hogy a Producer és Consumer csak a megfelelő interfész referenciát kapják.
