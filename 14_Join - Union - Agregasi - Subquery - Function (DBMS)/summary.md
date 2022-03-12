# **14_Database Schema - DDL - DML Join - Union - Agregasi - Subquery - Function (DBMS)**

## Resume
Melanjutkan dari section sebelumnya pada section ini kita lebih difokuskan pada :
1. Join, yaitu sebuah klausa untuk mengkombinasikan record dari dua atau lebih table, join terbagi lagi menjadi 3 yaitu :
    - Inner Join, yaitu salah satu join yang digunakan untuk menggabungkan 2 atau lebih table yang memenuhi syarat
    - Left Join, yang akan mengembalikan semua baris dari table di sebelah kiri yang dikenal dengan kondisi ON dan hanya baris dati tabel kanan yang memenuhi kondisi Join
    - Right Join, hampir sama dengan Left Join, namun data yang akan ditampilkan semua yaitu table yang ada pada posisi kanan.
2. Union, yaitu sebuah cara untuk menggabungkan 2 tabel atau lebih dengan syarat jumlah field yang dipanggil dan dikeluarkan harus sama
3. Aggregate, yaitu fungsi dimana nilai beberapa baris dikelompokan bersama untuk membentuk nilai ringkasan tunggal, contohnya fungsi :
    - SUM, fungsi untuk mencari jumlah dari data
    - MAX, fungsi yang digunakan untuk menampilkan data terbesar
    - MIN, fungsi yang digunakan untuk menampilkan data terkecil
    - AVG, fungsi yang digunakan untuk mencari nilai rata - rata pada tabel
    - COUNT, fungsi yang digunakan untuk menghitung jumlah data
    - HAVING, fungsi yang digunakan untuk mencari data dengan kriteria tertentu dimana kriteria berupa fungsi agregat
4. Sub-Query, atau nested query adalah query didalam query SQL lain, yang digunakan untuk mengembalikan data yang akan digunakan dalam query utama sebagai syarat untuk lebih membatasi data yang akan diambil biasanya digambarkan dengan operator =, <, >, >=, <= dengan syarat harus tertutup dengan kurung
5. Function, adalah sekumpulan statement yang akan mengembalikan sebuah nilai balik pada pemanggilnya 

### Kegunaan
Kegunaan yang didapat dari section ini yaitu bagaimana kita mengolah data pada database dengan cara yang benar dan efisien

## **Praktikum**
1. File txt dari praktikum section 14 dapat dilihat disini : [praktikum section 14.txt](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/praktikum/praktikum%20section%2014.txt)

2. Hasil Screenshotnya :
![Screenshot 1](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%201%20(insert%205%20operator%20and%203%20product%20type).PNG)

![Screenshot 2](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%202%20(INSERT%20bagian%20c,%20d%20dan%20e).PNG)

![Screenshot 3](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%203%20(INSERT%20bagian%20f).PNG)

![Screenshot 4](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%204%20(INSERT%20bagian%20g%20dan%20h).PNG)

![Screenshot 5](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%205%20(INSERT%20bagian%20i).PNG)

![Screenshot 6](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%206%20(INSERT%20bagian%20j).PNG)

![Screenshot 7](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%207%20(SELECT%20bagian%20a%20dan%20b).PNG)

![Screenshot 8](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%208%20(SELECT%20bagian%20c,%20d,%20e%20dan%20f).PNG)

![Screenshot 9](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%209%20(UPDATE%20bagian%20a%20dan%20b).PNG)

![Screenshot 10](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%2010%20(DELETE%20bagian%20a%20dan%20b).PNG)

![Screenshot 11](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%2011%20(JOIN%20bagian%201,2,3,dan%204).PNG)

![Screenshot 12](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/5658b4ebf372d8061a6ffdbd86a164dd1b4b169a/14_Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%2012%20(JOIN%20bagian%205).PNG)