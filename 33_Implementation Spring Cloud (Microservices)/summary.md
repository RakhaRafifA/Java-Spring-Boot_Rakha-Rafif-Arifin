# **(33) Implementation Spring Cloud (Microservices)**

## **Resume**
Pada section ini kita membahas tentang implementasi dari microservice, disini khususnya kita menggunakan eureka untuk menemukan aplikasi apa saja yang bekerja dibawah eureka server.
Eureka server adalah sebuah applikasi yang memegang informasi tentang semua client yang terhubung dengan eureka server, setiap microservice yang terhubung dengan eureka, eureka dapat mengetahui aplikasi tersebut bekerja pada port berapa dan juga mengetahui ip addressnya.
Untuk membuat sebuah eureka server kita mebutuhkan minimal 2 aplikasi java yang akan digunakan sebagai server dan client, berikut langkah - langkahnya :

1. Membuat aplikasi spring boot minimal 2, untuk server dan client
2. tambahkan : "<spring-cloud.version>2020.0.5</spring-cloud.version>" pada pom.xml di bagian properties, baik untuk server maupun client
3. tambahkan : "<dependency><groupId>org.springframework.cloud</groupId><artifactId>spring-cloud-starter-netflix-eureka-server</artifactId></dependency>" pada pom.xml untuk server
4. tambahkan : "<dependency><groupId>org.springframework.cloud</groupId><artifactId>spring-cloud-starter-netflix-eureka-client</artifactId></dependency>" pada pom.xml untuk client
5. tambahkan :
    - server.port=8761
    - eureka.client.register-with-eureka=false
    - eureka.client.fetch-registry=false
    pada application.properties eureka server, port 8761 merupakan port bawaan eureka
6. tambahkan : 
    - server.port=8083
    - spring.application.name=service-product
    - eureka.instance.lease-renewal-interval-in-second=1
    - eureka.instance.lease-expiration-duration-in-seconds=2
    - eureka.client.serviceUrl.default-zone=htt://localhost:8761/rakhasection33
    - eureka.client.lease.duration=5
    pada application.properties eureka client, port dapat diubah semaunya asalkan tidak ada port yang sama untuk masing - masing microservice
7. tambahkan : "@EnableEurekaServer", untuk eureka server, kemudian jalankan
8. tambahkan : "@EnableEurekaClient" untuk eureka client, lalu jalankan
9. untuk mengecek apakah eureka telah bekerja dan eureka client terdeteksi pada eureka server, kita dapat membuka website localhost:8761

## **Praktikum**
Problem - Create Microservice System
Buatlah sebuah aplikasi dengan menerapkan microservices yang terdiri dari minimum 3 service!
Buktikanlah bahwa sistem dapat berjalan dengan normal dengan screenshot request menggunakan postman!

Source codenya dapat dilihat di :
[praktikum section 33](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/33_Implementation%20Spring%20Cloud%20(Microservices)/praktikum)

1. Eureka Server :
![eureka server](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot1%20-%20Eureka.PNG)

2. Request POST Postman :
![Post](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot2%20-%20POST%20user.PNG)
![Post](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot2%20-%20POST%20stock.PNG)
![Post](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot2%20-%20POST%20product.PNG)

3. Request GET Postman
![Get](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot3%20-%20GET%20user.PNG)
![Get](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot3%20-%20GET%20stock.PNG)
![Get](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot3%20-%20GET%20product.PNG)

4. Request PUT Postman
![Put](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot4%20-%20PUT%20user.PNG)
![Put](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot4%20-%20PUT%20stock.PNG)
![Put](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot4%20-%20PUT%20product.PNG)

5. Request DELETE Postman
![Delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot5%20-%20DELETE%20user.PNG)
![Delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot5%20-%20DELETE%20stock.PNG)
![Delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot5%20-%20DELETE%20product.PNG)

6. Request GET setelah delete
![Get after delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot6%20-%20GET%20user%20after%20delete.PNG)
![Get after delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot6%20-%20GET%20stock%20after%20delete.PNG)
![Get after delete](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/e18b89c02f3aabd02cc812c5bcfb5d38773fb612/33_Implementation%20Spring%20Cloud%20(Microservices)/screenshot/Screenshot6%20-%20GET%20product%20after%20delete.PNG)
