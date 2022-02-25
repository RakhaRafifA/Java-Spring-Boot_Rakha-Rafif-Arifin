# **(5) Time Complexity and Space Comlexity**

## **Resume**
Dalam materi ini saya mempelajari tentang Big-O notation yang berguna untuk mengetahui apa saja notasi yang ada dan waktu yang dibutuhkan tiap notasi untuk mengerjakan suatu program, diantaranya adalah:
1. Constant time, O(1), yaitu notasi dimana waktu yang digunakan tetap sama meskipun input sizenya meningkat ataupun berkurang
2. Linear time, yaitu notasi yang mempunyai waktu kerja yang meningkat sesaui dengan input yang ada, notasi ini mempunyai 2 cabang yaitu:
    - O(n)
    - O(n+m)
3. Logarithmic time, O(log n), yaitu notasi ynag memiliki waktu kerja yang sedikit - sedikit meningkat mengikuti size inputnya
4. Quadratic Time, O(n^2), yaitu notasi dimana waktu notasinya meningkat dengan signifikan sesuai dengan perpangkatan fungsi yang ada

Selain itu saya juga memepelajari tentang time limit, contoh
1. Jika n <= 1.000.000, notasi yang sebaiknya digunakan yaitu O(n) atau O(log n)
2. Jika n <= 10.000, notasi yang sebaiknya digunakan yaitu O(n^2)
3. Jika n <= 500, notasi yang sebaiknya digunakan yaitu O(n^3)

### Kegunaan
Dengan mengetahui bagaimana cara kerja notasi notasi dalam programming dan waktu yang dibutuhkan tiap notasi untuk menyelesaikan suatu masalah, kita dapat menentukan apa saja notasi yang harus kita gunakan dalam menyelesaikan suatu masalah dan apa saja notasi - notasi yang dapat kita hindari untuk menjaga agar proses bekerja dengan cepat.

## **Praktikum Time Complexity and Space Comlexity**
1. Problem 1, mencari bilangan prima dari input yang sudah diberikan dengan output true atau false, berikut source codenya [Section5BilangaPrima.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/praktikum/Section5BilangaPrima.java)

berikut Screenshot test runningnya ![Section5BilangaPrima.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/screenshots/Screenshot%20Section5%20Bilangan%20Prima.PNG)

2. Problem 2, mencari exponentation atau perpangkatan bilangan menggunakan notasi O(1), berikut source codenya [Section5FastExponentation.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/praktikum/Section5FastExponentiation.java)

berikut Screenshot test runningnya ![Section5FastExponentation.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/screenshots/Screenshot%20Section5%20Fast%20Exponentation.PNG)

3. Problem 3, Menggabungkan 2 array berisi string dimana tidak ada perulangan data, berikut source codenya [Section5ArrayMerge.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/praktikum/Section5ArrayMerge.java)

berikut Screenshot test runningnya ![Section5ArrayMerge.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/screenshots/Screenshot%20Section5%20Array%20Merge.PNG)

4. Problem 4, mencari angka yang hanya muncul sekali, berikut source codenya [Section5AngkaMunculSekali.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/praktikum/Section5AngkaMunculSekali.java)

berikut Screenshot test runningnya ![Section5AngkaMunculSekali.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/screenshots/Screenshot%20Section5%20Angka%20Muncul%20Sekali.PNG)

5. Problem 5, mencari hasil tambah dari data yang ada pada array agar sesaui dengan targetnya, berikut source codenya [Section5PairWithTargetSum.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/praktikum/Section5PairWithTargetSum.java)

berikut Screenshot test runningnya ![Section5PairWithTargetSum.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/0a0137b554f4e287f4d8e31c0c742f18ef1c193e/5_Time%20Complexity%20&%20Space%20Complexity/screenshots/Screenshot%20Section5%20Pair%20Sum.PNG)