# **(9) Problem Solving Brute Force**

## **Resume**
Dalam materi ini, saya memepelajari tentang paradigma problem solving, berbagai macam cara dalam melakukan problem solving, contohnya :
1. Brute Force/Complete Search, adalah sebuah metode problem solving dimana kita melakukan pencarian pada keseluruhan data untuk mencari sebuah solusi atau data, ciri - ciri brute force antara lain:
    - Baiknya digunakan jika tidak ada opsi lain, karena biasanya brute force mengguanakan time complexity O(n) atau bahkan O(n^)
    - Biasanya mudah dituliskan karena programnya langsung menuju pada intinya
    - Semua problem dapat dikerjakan oleh brute force jika kita tidak mementingkan lamanya proses
2. Divide and Conquer, yaitu sebuah metode problem solving yang membagi data kemudian menyelesaikan data - data yang telah terbagi untuk mencari problem solvenya, ciri - ciri D&C yaitu :
    - Divide, Membagi masalah besar menjadi beberapa bagian kecil
    - Conquer, ketika masalah sudah cukup kecil untuk diselesaikan maka masalah akan diselesaikan
    - Combine, jika dibutuhkan maka akan menggabungkan masalah - masalah kecil yang sudah diselesaikan untuk menyelesaikan masalah yang lebih besar
3. Greedy approach, yaitu metode yang mencari optimal choice dari data lokal dan berharap agar dapat mendapatkan solusi optimal global. beberapa contoh greedy yaitu :
    - Huffman Coding
    - Activity Selection
    - Algoritma Djikstra
    - dll

### Kegunaan
Kegunaan problem solving yaitu untuk mencari suatu data atau masalah dalam suatu struktur data, dengan mempelajari problem solving kita dapat menentukan problem solving apa yang akan kita gunakan untuk tipe data yang akan kita cari. dan juga untuk mempelajari kecepatan sebuah problem solving yang akan kita gunakan

## **Praktikum**
1. Problem 1 - Simple Equation
We have three different integers, x, y and z, which satisfy the following three relations:
    - x + y + z = A
    - xyz = B
    - x^2 + y^2 + z^2 = C
You are asked to write a program that solves for x, y and z for given values of A, B and C. (1 ≤ A, B, C ≤ 10000). Link Source codenya : [Section9SimpleEquation.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/praktikum/Section9SimpleEquation.java)

Hasil Screenshotnya : ![Section9SimpleEquation](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Simple%20Equation%20(1).PNG)
![Section9SimpleEquation](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Simple%20Equation%20(2).PNG)

2. Problem 2 - Money Change
Terdapat sebuah tempat untuk melakukan penukaran uang menjadi pecahan yang kecil. Pecahan uang tersebut diantaranya : 1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000. Buatlah sebuah program untuk menggerate hasil penukaran uang, dan hasil penukaran harus memenuhi hasil paling optimal dengan jumlah yang minimum! Pecahan yang ada memiliki jumlah yang tidak terbatas. Source codenya : [Section9MoneyChange.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/praktikum/Section9MoneyChange.java)

Hasil Screenshotnya : ![Section9MoneyChange.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Money%20Change.PNG)

3. Problem 3 - Dragon of Loowater
There are n dragon heads and m knights (1 ≤ n, m ≤ 20000). Each dragon head has a diameter and each knight has a height. A dragon head with diameter D can be chopped off by a knight with height H if D ≤ H. A knight can only chop off one dragon head. Given a list of diameters of the dragon heads and a list of heights of the knights, is it possible to chop off all the dragon heads? If yes, what is the minimum total height of the knights used to chop off the dragons’ heads?. Source codenya : [Section9DragonofLoowater.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/praktikum/Section9DragonofLoowater.java)

Hasil Screenshotnya : ![Section9DragonofLoowater.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Dragon%20of%20Loowater%20(1).PNG)
![Section9DragonofLoowater.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Dragon%20of%20Loowater%20(2).PNG)
![Section9DragonofLoowater.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Dragon%20of%20Loowater%20(3).PNG)
![Section9DragonofLoowater.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Dragon%20of%20Loowater%20(4).PNG)

4. Problem 4 - Binary Search
In a binary search we use the information that all the elements are sorted. Let’s try to solve the task in which we ask for the position of a value x in a sorted array. Let’s see how the number of candidates is reduced, for example for the value x = 31.
For every step of the algorithm we should remember the beginning and the end of the remaining slice of the array (respectively, variables beg and end). The middle element of the
slice can easily be calculated as mid = [(beg+end)/2]. Source codenya : [Section9BinarySearch.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/praktikum/Section9BinarySearch.java)

Hasil Screenshotnya : ![Section9BinarySearch.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0e28f6e5842eed895440b1d5039150b871ea1321/9_Problem%20Solving%20Brute%20Force/screenshots/Screenshot%20Section9%20Binary%20Search.PNG)
