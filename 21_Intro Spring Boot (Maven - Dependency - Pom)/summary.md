# **(21) Intro Spring Boot (Maven - Dependency - Pom)**

## **Resume**
pada section 20 ini kita mempelajari tentang cara kerja dari API. API atau Application Programming Interface adalah fungsi atau prosedur yang menjembatani antara client dan server, API berfungsi sebagai pelayan yang mengirimkan pesanan dari client ke server untuk selanjutnya direspon oleh server sesuai dengan pesanan client, jenis API yang paling sering digunakan terdapat 2 jenis

1. REST API, atau Representational State Transfer adalah gaya arsitektur yang memungkinkan program untuk berkomunikasi satu sama lain, dirancang terutama untuk berfungsi dengan komponen seperti file, komponen media, dan objek pada perangkat keras tertentu. REST dirancang untuk mengatasi kekurangan SOAP dan menawarkan cara yang lebih mudah untuk mengakses layanan web

2. SOAP API, atau Simple Object Access Protocol. Microsoft membuat SOAP pada tahun 1998 dan merupakan bagian integral dari Service-Oriented Architecture (SOA).SOAP bergantung secara eksklusif pada Extensible Markup Language (XML) untuk layanan pengiriman pesan. SOAP adalah protokol resmi, lengkap dengan fitur keamanan built-in dan memiliki aturan yang ketat. SOAP sangat kompleks dan menggunakan sejumlah besar bandwidth dan sumber daya lainnya.

pada pembelajaran kali ini kita difokuskan pada penggunaan REST API, REST API menggunakan file dengan tipe JSON, atau Javascript Object Notation JSON adalah turunan JavaScript yang digunakan dalam transfer dan penyimpanan data.

saat kita mengakses sebuah web melalui http ada beberapa code yang menggambarkan respon yang kita dapat, berikut beberapa contoh HTTP Response Code :
1. 200, OK
2. 201, Created
3. 400, Bad Request
4. 401, Unauthorized
5. 404, Not Found
6. 405, Method not allowed
7. 500, Internal Server Error
8. 502, Bad Gateway 

untuk menjalankan API kita dapat menggunakan beberapa aplikasi seperti Katalon, Apache Jmeter, SoapUI dan Postman, disini kita akan memakai postman. Postman merupakan HTTP client untuk menlakukan test web services yang dapat mempermudah test, dan mengembangkan dokumen API dengan mengizinkan user untuk memberikan simple atau complex HTTP request.

Beberapa tips dalam API yaitu :

1. dalam menuliskan End point, kita direkomendasikan untuk menggunakan kata benda, bukan kata kerja, contohnya :
    - kita dapat menuliskan GET/books/123 daripada menuliskan GET/addBooks/123
    - kita dapat menuliskan DELETE/books/123 daripada menuliskan GET/DeleteBooks/123
    - kita dapat menuliskan POST/books daripada menuliskan POST/DeleteAllBooks
    - kita dapat menuliskan PUT/books/123 daripada menuliskan POST/Books/123/delete
    hal ini lebih efisien karena kita telah membuat request pada awal endpoint, jadi tidak perlu menambahkan kata kerja didalam endpoint
2. dalam menuliskan endpoint kita juga direkomendasikan untuk menggunakan kata jamak, contohnya :
    - GET/cars/123 daripada GET/car/123
    - POST/cars/123 daripada POST/car/123
    - GET/cars= daripada GET/car
    karena dalam sebuah document atau column pasti ada beberapa field, oleh karena itu kita harus menggunakan kata jamak
3. menggunakan resource nesting untuk menunjukan hirarki relationshipnya, contoh
    - /users <- nama user
    - /users/123 <- user spesifik
    - /users/123/orders <- order yang sesuai dengan user spesifik
    - /users/123/orders/0001 <- order spesifik yang sesuai dengan user spesifik

berikut contoh Format Respon JSON :
{
    "code"      : 200
    "message"   : "Succes get data"
    "status"    : "success"
    "data"      : {         }
}

Berikut beberapa contoh filtering, sorting, paging dan field selection
1. Filtering :
    - GET/users?country=USA
    - GET/users?creation_date=2019-22-11
2. Sorting :
    - GET/users?sort=birthdate_date:asc
    - GET/users?sort=birthdate_date:desc
3. Paging :
    - GET/users?limit=100
    - GET/users?offset=2
4. Field Selection :
    - GET/users/123?fields=username,email (untuk spesifik user)
    - GET/users?fields=username,email (untuk semua user)

## **Praktikum**
1. Buatlah project springboot yang dapat menampilkan pesan "Hello World" dalam 3 endpoint berikut!
    - GET/v1/messages
    - POST/v1/messages
    - DELETE/v1/messages
2. Dari 3 endpoint tersebut sebutkan masing - masing perbedaanya :
perbedaanya yaitu : 
    - Perintah request delete digunakan untuk menghapus data pada database
    - Perintah request get digunakan untuk mengambil atau menampilkan data yang ada pada database sesuai dengan data yang di request
    - Perintah request post digunakan untuk masukan data atau mengubah data yang ada pada database

untuk source code dan projectnya bisa dilihat di : [package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/praktikum/section21)

hasil screenshotnya : 
![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot1%20-%20controller%20class%20-%20GET.PNG)

![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot2%20-%20controller%20class%20-%20POST.PNG)

![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot3%20-%20controller%20class%20-%20DELETE.PNG)

![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot4%20-%20controllerGET.PNG)

![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot5%20-%20controllerPOST.PNG)

![package com.rakharafifa.section21](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/01f332926577c17b0ebac09b99315259aa413521/21_Intro%20Spring%20Boot%20(Maven%20-%20Dependency%20-%20Pom)/screenshots/Screenshot6%20-%20controllerDELETE.PNG)