Cześć, zapraszam do rozwiązania poniższego testu rekrutacyjnego składającego się z dwóch zadań algorytmicznych.
Poprawność rozwiązania nie jest wyłącznie oceniana, brane pod uwagę są również takie elementy jak:
* przygotowanie projektu możliwego do zaimportowania przez inną osobę
* czysty kod
* optymalność rozwiązania
* organizacja commitów
* testy jednostkowe różnych przypadków (dowolny sposób)
* łatwość uruchomienia kodu i sprawdzenia działania przez inną osobę (sprawdzającego)
Rozwiązanie zadań powinno zająć ok. 2.5 godziny. Nie stresuj się, jeżeli nie uda się wszystkiego zrobić - ocenie podlega przede wszystkim sposób podejścia do problemu.
## Zadanie 1
Kostki domina są reprezenowane w formie Stringa, który składa się z poniższych znaków:
* | - kostka domina stoi nienaruszona
* / - kostka domina przewraca się w prawą stronę
* \ - kostka domina przewraca się w lewą stronę
Twoim zadaniem jest napisanie algorytmu wyznaczającego nowy literał zawierający powyższe znaki po X iteracjach, podczas których zachodzą zmiany w sąsiednich kostkach
X jest parametrem wejściowym.
Przykładowo dla ciągu wejściowego:
```
||//||\||/\|
```
Zastosowanie 1 iteracji algorytmu powinno dać wynik:
```
||///\\||/\|
```
Dodatkowo: Napisz algorytm wsteczny, pokazujący jak wyglądał ciąg kostek domina przed zastosowaniem X iteracji algorytmu z pierwszej części zadania
Przykładowo dla ciągu wejściowego:
```
||////\\\|////|
```
Zastosowanie 2 iteracji algorytmu wstecznego powinno dać wynik:
```
||//||||\|//|||
```
## Zadanie 2
W świecie gier Pokemon każdy ruch oraz pokemon mają określone typy, które determinują skuteczność (liczbę obrażeń) poszczególnych ruchów przeciw poszczególnym typom pokemonów.
Jeżeli dany typ ruchu (ataku) jest efektywny przeciwko danemu typowi pokemona, to obrażenia są podwajane.
Jeżeli dany typ ruchu (ataku) nie jest efektywny przeciwko danemu typowi pokemona, to obrażenia są połowiczne.
Jeżeli dany typ ruchu (ataku) nie ma efektu przeciwko danemu typowi pokemona, to obrażenia są zerowe.
Przykładowo typ wodny dobrze sprawdza się przeciwko typowi ognistemu, co skutkuje zdublowaniem obrażeń.
Dodatkowo niektóre pokemony mogą mieć kilka typów - w takim przypadku należy uwzględnić efektywność ruchu przeciwko każdemu z nich (iloczyn).
Napisz program, który na podstawie typu ruchu (ataku) obliczy efektywność (współczynnik obrażeń) przeciwko pokemonowi o danymi typie (lub typach)
Przykładowe dane wejściowe:
```
 fire -> grass
 fighting -> ice rock
 psychic -> poison dark
 water -> normal
 fire -> rock
```
Dane wyjściowe:
```
2x
4x
0x
1x
0.5x
```
W celu określenia efektywności ruchów skorzystaj z PokeAPI: https://pokeapi.co/api/v2/type/{type}
