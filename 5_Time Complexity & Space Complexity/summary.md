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