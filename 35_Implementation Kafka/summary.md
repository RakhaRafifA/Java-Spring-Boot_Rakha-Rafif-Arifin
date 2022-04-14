# **(35) Implementation Kafka**

## **Resume**
Pada section ini kita mempelajari tentang microservice dan komunikasi pada microservices, khususnya Messaging Communication

Microservices, adalah sebuah struktur pengembangan perangkat lunak yang terdiri dari bagian - bagian perangkat lunka yang bekerja sama untuk membangun sebuah perangkat lunak yang lebih besar. Arsitektur microservice dapat membuat scaling lebih mudah dan mempermudah kita dalam mendevelop aplikasi tersebut. Beberapa keuntungan menggunakan microservice yaitu :
1. Agility
2. Flexible scaling
3. Easy Development
4. Technological Freedom
5. Reusable Code
6. Resilience

Komunikasi dalam microservice dapat dibagi menjadi 3, yaitu :
1. REST API communication
2. Messaging Communication
3. RPC communication

pada section ini kita mempelajari tentang microservice coimmunication khusunya messaging communication menggunakan kafka, kenapa menggunakan kafka?
1. Real-time data processing
2. Application activity tracking
3. Logging and/or monitoring system

## **Praktikum**
1. Tambahkan dependency untuk kafka
2. Jalankan zookeper dan Broker pada kafka
3. Konfigurasi Topic
4. Konfigurasi producer
5. Konfigurasi Consumer

Challange
We have three services on server like product catalog, user and order. Product catalog have data like product list, User have data user data list
Service order needs data from catalog and user when order created solve this issue using Spring Kafka.

Untuk source codenya dapat dilihat di : [Kafka Implementation Section35](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/35_Implementation%20Kafka/praktikum/section35)

Hasil Screenshotnya :

1. Jalankan Spring Boot
![Running Spring](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot1%20-%20Running%20Spring%20Boot.PNG)

2. List Topic yang dibuat otomatis setelah spring boot dijalankan
![Screenshot2](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot2%20-%20Topic%20list.PNG)

3. Isi dalam tiap topic sebelum diinput data
![Screenshot3](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot3%20-%20Topic%20Sebelum%20Diinput.PNG)

4. input data pada product_catalog menggunakan postman
![screenshot4](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot4%20-%20Post%20Product.PNG)

5. input data pada user menggunakan postman
1[Screenshot5](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot5%20-%20Post%20User.PNG)

6. Isi topic setelah diinput data
![Screenshot6](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/dc0dfdf6edcad3422d1eaaab458f8e552d6331e9/35_Implementation%20Kafka/screenshot/Screenshot6%20-%20Isi%20Topic%20setelah%20Diinput.PNG)