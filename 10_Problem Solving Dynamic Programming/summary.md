# **(10) Problem Solving Dynamic Programming**

## **Resume**
Pada section 10 saya mempelajari tentang Dynamic Programming, dynamic programming adalah teknik untuk memecahkan masalah dengan cara memecahkan masalah menjadi beberapa subproblem dan kemudian mencari solusi optimal untuk semua masalah.
Karakteristik Dynamic Programming yaitu :

1. Overlappinng Subproblem 
Subproblem adalah versi kecil dari original problem. Setiap masalah mempunyai overlapping subproblem jika untuk memecahkan masalah subproblem dapat digunakan berkali - kali

2. Optimal Substructure Property
Setiap masalah mempunyai optimal Substructure Property, overall optimal solution dapat dibuat menggunakan optimal solution dari subproblem

### Metode Dynamic Programming
1. Top Down menggunakan Memoization
pada cara ini, kita mencoba untuk memecahkan masalah yang besar dengan cara menggunakan recursive untuk memecahkan masalah pada subproblem, setiap kita memecahkan masalah pada subproblem kita akan menyimpannya pada cache sehingga tidak ada perulangan, melainkan kita dapat mengambil hasil yang sudah dipecahkan.

2. Bottom Up menggunakan Tabulation
Tabulation adalah kebalikan dari top down dan menghindari adanya resursive, melainkan dengan menyimpan hasil dari subproblem pada n-dimensional table. lalu solusi dipindahkan keatas dan dikomputasi

## **Praktikum**
1. Problem 1 - Fibonacci Number Top-down
Write a function to calculate the nth Fibonacci number.
Fibonacci numbers are a series of numbers in which each number is the sum of the two preceding numbers. First few Fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, …
Source Codenya : [Section10FibonacciTopDown.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/praktikum/Section10FibonacciTopDown.java)

Hasil Screenshotnya : ![Section10FibonacciTopDown.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Fibonacci%20Top%20Down.PNG)

2. Problem 2 - Fibonacci Bottom Up
Write a function to calculate the nth Fibonacci number.
Fibonacci numbers are a series of numbers in which each number is the sum of the two preceding numbers. First few Fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, …
Sourcce Codenya : [Section10FibonacciBottomUp.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/praktikum/Section10FibonacciTopDown.java)

Hasil Screenshotnya : ![Section10FibonacciBottomUp.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Fibonacci%20bottom%20Up.PNG)

3. Problem 3 - Frog
There are N stones, numbered 1, 2, … , N. For each i (1 <= i <= N), the height of Stone i is hi.
There is a frog who is initially on Stone 1. He will repeat the following action some number of times to reach stone N:
If the frog is currently on Stone i, jump to Stone i + 1 or Stone i + 2. Here, a cost of | hi - hj | is incurred, where j is stone to land on. Find the minimum possible total cost incurred before the frog reaches Stone N.
Sourcce Codenya : [Section10Frog.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/praktikum/Section10Frog.java)

Hasil Screenshotnya : ![Section10Frog.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Frog.PNG)
![Section10Frog.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Frog%202.PNG)

4. Problem 4 - Roman Numerals
Tulis program go untuk mengkonversi dari angka normal ke Angka Romawi!
Sourcce Codenya : [Section10RomanNumerals.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/praktikum/Section10RomanNumerals.java)

Hasil Screenshotnya : ![Section10RomanNumerals.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Roman%20Numerals.PNG)
![Section10RomanNumerals.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4c2f17fcaf39e908f02c86413f4d1b85a34c1c27/10_Problem%20Solving%20Dynamic%20Programming/screenshots/Screenshot%20Roman%20Numerals%202.PNG)