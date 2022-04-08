# **(32) Introduction Microservices and Spring Cloud**

## **Resume**
Pada section ini kita mempelajari tentang dasar - dasar Microservices.
Dalam pembuatan sebuah apliaksi kita dapat menggunakan 2 buah cara, yaitu :
1. Arsitektur Monolith adalah sebuah arsitektur Single Deployment Unit, dimana semua fitur dibuat dalam sebuah aplikasi besar
2. Arsitektur Microservices, adalah sebuah arsitektur dimana menggambarkan aplikasi - aplikasi kecil yang saling bekerja sama, aplikasi - aplikasi tersebut bertujuan untuk mengerjakan suatu pekerjaan dengan baik secara bersam - sama. Tiap aplikasi tersebut merupakan aplikasi independen, yang dapat di deploy dan diubah tanpa tergantung dengan aplikasi lain dan setiap komponen pada sistemnya dibuat dalam service. Komunikasi antar service biasanya melalui network call.

Perbedaan dari kedua arsitektur tersebut yaitu :
1. Monolith
    - Simple
    - Konsisten
    - Mudah untuk melakukan refactor
2. Microservice
    - Partial Deployment
    - Ketersediaan
    - Multiple Platform
    - Easy to Scale

Beberapa hal yang harus diperhatikan dalam Microservice yaitu :
1. Database per Service/ Shared Database
2. Dapat menggunakan database SQL dan NoSQL
3. Komunikasi dapat menggunakan RPI ata Messaging
    1. Remote Procedure Invocation ataupun Remote Procedure Call contohnya yaitu :
        - RESTful API
        - gRPC
        - ApacheThrift
        - SOAP
        - dll.
    2. Messaging
        - Redis
        - Apache Kafka
        - NSQ
        - Amazon Web Service
        - dll.
4. Tipe - Tipe Microservice
    - Stateless Microservice, yaitu microservice yang tidak memiliki database, biasanya digunakan untuk melakukan tugas sederhana, biasa juga digunakan sebagai utility untuk microservice lain dan tidak bergantung dengan microservice lainnya.
    - Persisteance Microservice, yaitu microservice yang memiliki database, biasa jufa disebut sebagai Master Data Microservice dan biasanya digunakan untuk mengolah data di database (CRUD).
    - Aggregation Microservice, yaitu microservice yang tergantung dengan microservice lainnya, biasanya digunakan sebagai pusat bussiness logic, microservice ini dapat memiliki database maupun tidak dan tidak bisa berdiri sendiri.
5. Service Orchestration
menggambarkan sebuah data centralized atau terpusat dimana pusatnya merupakan executable bussiness process yang mengkoordinir interaksi antara service. Service Orchestration termasuk management antara tiap service .
6. Service Choreography
deskripsi global dari layanan yang berpartisipasi, yang didefinisikan oleh pertukaran pesan, aturan interaksi dan kesepakatan antara dua atau lebih titik akhir. Koreografi ini menggunakan pendekatan desentralisasi untuk komposisi layanan. Koreografi ini menggambarkan interaksi antara beberapa service, sedangkan orkestrasi mewakili kontrol dari perspektif satu pihak. Ini berarti bahwa koreografi berbeda dari orkestrasi sehubungan dengan di mana logika yang mengontrol interaksi antara service yang terlibat harus berada.
7. API Gateway
API Gateway adalah suatu service yang dibuat khusus dan dijadikan sebagai pintu utama atau entry point dari dunia luar untuk masuk ke dalam service-serivce kita. Ini hampir sama dengan fascade layer pada OOP tetapi ada bagian sistem yang terdistribusi.

## **Praktikum**
Problem 1 - Centralized and Decentralized Database
Buatlah rancangan dalam bentuk diagram yang menampilkan :
1. Sebuah arsitektur aplikasi
2. Memiliki minimal 5 service
3. terdapat service yang melakukan shared database
4. terdapat service yang melakukan database per service

![Problem1](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/09e98b0f07ebd4bcbfb887b83242eb0749058f9e/32_Introduction%20Microservices%20and%20Spring%20Cloud/praktikum/MicroserviceRakhaProblem1.jpg)

Problem 2 - Services Communication
Dari rancangan Microservice diatas : 
1. buatlah rancangan jika antara service berkomunikasi menggunakan RPC
![Problem2 RPC](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/09e98b0f07ebd4bcbfb887b83242eb0749058f9e/32_Introduction%20Microservices%20and%20Spring%20Cloud/praktikum/MicroserviceRakhaProblem2%20-%20RPC.jpg)


2. buatlah rancangan jika antara service berkomunikasi menggunakan Messaging
![Problem2 Messaging](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/09e98b0f07ebd4bcbfb887b83242eb0749058f9e/32_Introduction%20Microservices%20and%20Spring%20Cloud/praktikum/MicroserviceRakhaProblem2%20-%20Message%20Broker.jpg)

Screenshotnya :
![Problem2 Messaging](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/09e98b0f07ebd4bcbfb887b83242eb0749058f9e/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/Screenshot1%20-%20Drawio.PNG)