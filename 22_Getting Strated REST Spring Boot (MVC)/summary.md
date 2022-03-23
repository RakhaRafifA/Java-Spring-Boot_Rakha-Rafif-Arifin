# **(22) Getting Started REST Spring Boot (MVC)**

## **Resume**
Pada section 22 ini kita mempelajari tentang, HTTP (Hypertext Transfer Protocol) yang akan digunakan oleh Spring Boot untuk menghubungkan web dengan data pada Sring melalui API.
lalu kita juga mempelajari common lifecycle pada maven, atau dapat kita sebut task
1. Validasi, mengecek semua informasi yang dibutuhkan untuk membangun program tersebut tersedia
2. Compile, mengcompile source code
3. Test Compile, mengcompile test source code
4. Test, menjalankan unit test
5. package, mengcompile package source code ke distributable format, seperti jar, war, dll.
6. integration - test, memproses dan mendeploy package jika dibutuhkan untuk menjalankan integration test
7. install, install packagae ke repositori local
8. deploy, mengcopy package ke remote repository

Apa itu Spring boot?
Spring boot adalah sebuah framework yang mempermudah kita untuk membuat sebuah stand-alone, production-grade yang bisa "hanya dijalankan", terdapat 2 type framework yaitu :
1. Opinionated, yaitu framework lengkap (Web Server, Controller, Data access)
2. Non Opinionated, Modular (web Server)
beberapa kelebihan spring boot yaitu :
1. menawarkan fleksibilitas dalam konfigurasi java beans, XML dan database transactions
2. menawarkan powerful batch processing dan manages reset endpoint
3. pada spring boot semuanya dikonfigurasikan secara otomatis, tidak ada konfigurasi manual yang dibutuhkan
4. menawarkan annotation - based spring application
5. mudah dalam management dependency
6. didalamnya termasuk embedded servlet container

Arsitektur Spring Boot yaitu :
    - Presentation Layer, yang terdapat dalam controll class
    - Bussiness Logic Layer, yang terdapat pada service class
    - Data Access Layer, yang terdapat pada repository class

Berikut beberapa anotasi pada JSB :
1. @RestController, digunakan untuk controller class
2. @RequestMapper, digunakan untuk penamaan path
3. @GetMapping, digunakan untuk GET method
4. @PostMapping, digunakan untuk POST method
5. @PutMapping, digunakan untuk PUT method
6. @DeleteMapping, digunakan untuk DELETE method

## **Praktikum**
1. Problem 1 - H2 Database
buatlah project springboot dengan database H2 dan struktur MVC yang memiliki 3 endpoint berikut!
    - GET/v1/posts
        malihat seluruh data post yang tersimpan dalam database
    - POST/v1/posts
        menerima dapa post dan menyimpan dalam database
    - DELETE/v1/posts/{id}
        menghapus data post dari database

2. Problem 2 - Repository
Cobalah gunakan CRUD repository dan JPA repository dan jelaskan perbedaannya

Perbedaan CRUD repository dan JPA repository yaitu CRUD repository hanya dapat menjalankan perintah - perintah CRUD, sedangkan JPA repository dapat menjalankan perintah - perintah CRUD dan juga dapat menjalankan JPA-related method seperti flushing dan delete record secara batch

untuk praktikum section 22 dapat dilihat di : [praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/praktikum/section22)

Hasil screenshotnya :
![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot1%20-%20GET%20-%20sebelum%20diinput%20data.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot2%20-%20POST%20-%20data1.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot3%20-%20POST%20-%20data2.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot4%20-%20POST%20-%20data3.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot5%20-%20GET%20-%20data%20setelah%20diinputkan.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot6%20-%20DELETE%20-%20delete%20id%201.PNG)

![praktikum section 22](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/94d40c37ce3cd13a9d5b136ced9b1d2a241b1bc2/22_Getting%20Strated%20REST%20Spring%20Boot%20(MVC)/screenshots/Screenshot7%20-%20GET%20-%20data%20setelah%20di%20delete.PNG)