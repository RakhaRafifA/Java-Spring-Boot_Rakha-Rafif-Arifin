# **14_Database Schema - DDL - DML Join - Union - Agregasi - Subquery - Function (DBMS)**

## Resume
Pada section ini, saya mempelajari tentang DBMS, khususunya MySQL, Pada section ini kita berfokus pada DBMS khususnya MySQL, berikut beberapa contoh relationship :
1. One to One, yaitu relationship antara sebuah table dan tabel lainnya yang terhubung tanpa adanya hubungan dengan table lain
2. One to Many, yaitu relationship antara sebuah tabel dan table lainnya yang salah satu tablenya mempunyai hubungan dengan beberapa table lainnya
3. Many to Many, yaitu hubungan antara sebuah table dan table lainnya, yang masing2 tabel mempunyai hubungan dengan table lainnya.

### RDBMS
RDMS yaitu Relational Database Management Systems, yaitu software yang menggunakan Realtional Database Model sebagai dasarnya seperti MySQL, berikut beberapa jenis perinta SQL yaitu:
1. DDL, atau Data Definition Language merupakan bahasa pemrograman dalam komputer yang dapat dimanfaatkan untuk membuat maupun memodifikasi struktur dari suatu objek dalam database yang utamanya berbentuk skema. Contoh penggunaannya pada MySQL yaitu:
    - CREATE DATABASE nama_database, Yaitu syntax pada mysql untuk membuat sebuah database
    - CREATE TABLE nama_table, digunakan untuk membuat table pada database
    - DROP TABLE nama_table, yaitu syntax yang digunakan untuk drop/delete sebuah table
    - RENAME TABLE nama_table TO nama_table_baru, yaitu syntax yang digunakan untuk mengubah nama table yang telah dibuat.
    - ALTER TABLE nama_table, digunakan untuk mengedit table yang telah kita buat.
2. DML, atau Data Manipulation Table adalah perintah yang digunakan untuk memanipulasi data yang ada dalam table dari suatu database. Contohnya :
    - INSERT INTO nama_table(value), yaiut syntax yang digunakan untuk memasukan data pada table.
    - SELECT * FROM nama_table, yaitu syntax yang digunakan untuk memilih seluruh data pada table.
    - UPDATE nama_table SET, yaitu syntax yang digunakan untuk merubah atau update data yang telah ada dalam table.
    - DELETE FROM nama_table, yaitu syntax yang digunakan untuk menghapus data yang ada dalam table.
    - SELECT nama_kolom FROM nama_table WHERE nama_kolom LIKE '%h%', yaitu syntax yang digunakan untuk mencari data pada table
    - SELECT nama_kolom FROM nama_table WHERE nama_kolom LIKE '%h%' OR nama_kolom BERWEEN value AND value, yaitu syntax yang digunakan untuk mencari data
    - SELECT nama_kolom FROM nama_table WHERE nama_kolom LIKE '%h%' OR nama_kolom BERWEEN value AND value ORDER BY value DESC, yaitu syntax yang digunakan untuk mengurutkan data.
    - SELECT nama_kolom FROM nama_table WHERE nama_kolom LIKE '%h%' OR nama_kolom BERWEEN value AND value ORDER BY value DESC LIMIT value, yaitu syntax untuk memberikan limit/ batasan

## **Praktikum**
1. Membuat ERD dengan Draw.io, linknya : [RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/b8efd36898e52b075f305a7bdf1abf9bf7aa42cb/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/praktikum/Praktikum%20MySQL.txt)

ERDnya [ERD Database Soal1](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/b8efd36898e52b075f305a7bdf1abf9bf7aa42cb/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/praktikum/RakhaRafifArifin_Section13_Database.drawio.png)

Hasil Screenshotnya : ![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/b8efd36898e52b075f305a7bdf1abf9bf7aa42cb/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshots%20ERD%20soal%201.PNG)

2. Membuat database sesuai dengan tugas latihan, Hasil Screenshotnya ![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%201%20(create%20databases%20and%20table).PNG)
![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%202%20(create%20table).PNG)
![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%203%20(menambahkan%20kolom%20dan%20rename%20table).PNG)
![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%204%20(drop%20table%20shipping).PNG)
![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%205%20(create%20relationships%20between%20table).PNG)
![RakhaRafifArifin_Section13_Database](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/06130a13081673d4e101f5f05daa6dbdd3e3a07f/13_Database%20Schema%20-%20DDL%20-%20DML%20Join%20-%20Union%20-%20Agregasi%20-%20Subquery%20-%20Function%20(DBMS)/screenshots/Screenshot%206%20(create%20relationships%20between%20tables).PNG)