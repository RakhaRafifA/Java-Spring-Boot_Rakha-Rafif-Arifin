# **(26) JPA (Spring Database No SQL)**

## **Resume**
Pada section kali ini, kita mempelajari tentang spring boot menggunakan databse NoSQL pada MongoDB, berikut langkah2nya :
1. membuat project spring dengan dependency : 
    - Spring Web
    - Spring Data MongoDB
    - Lombok

2. Struktur folder MVC terdiri dari
    - Controller
    - Model
    - Repository
    - Service

3. Konfigurasi Data source pada application.properties, berikut syntaxnya :
    - spring.data.mongodb.host=localhost
    - spring.data.mongodb.port=27017
    - spring.data.mongodb.database=section26

4. Membuat Model dengan minimal 3 annotation :
    - @Data, digunakan untuk anotasi lombok agar kita tidak perlu membuat setter dan getter
    - @Document("Nama Collection"), digunakan untuk memberikan nama pada collection yang ingin dibuat
    - @Id, digunakan untuk menandakan field tersebut sebagai id dan akan dibuatkan isi unik khusus yang berbeda dengan id lainnya

5. Membuat Repository, dengan ketentuan:
    - menambahkan anotasi @Repository
    - repository merupakan interface class dan extend ke MongoRepository
    - memberikan class model dan tipe data id sesuai dengan model

6. Membuat interface service, interface service berisikan method - method yang akan kita buat dan akan diimplementasikan ke service implement

7. Membuat Service Implement class, dengan ketentuan :
    - Memberikan anotasi @Srvice, untuk memberitahukan pada system bahwa class ini yang digunakan sebagai class service
    - Memberikan anotasi @RequiredArgsConstructor, untuk menggantiknan dependency injection object final
    - Class ini mengimplementkan kelas interface service
    - Memanggil repository yang berhubungan
    - Override semua method yang ada pada interface service

8. Membuat class controller dengan ketentuan :
    - Memberikan anotasi @RestController, yang digunakan untuk meberitahu sistem bahwa class ini yang akan digunakan sebagai controller
    - Memberikan anotasi @RequestMapping("/endpoint"), untuk memberikan endpoint dasar pada semua Mapping yang digunakan
    - Memberikan anotasi @RequiredArgsConstructor, untuk menggantiknan dependency injection object final
    - memanggil Product service

## **Praktikum**
Buatlah Project spring boot dengan database MongoDB dan struktur MVC yang dapat melakukan CRUD data berikut :
    - Product :
        - id
        - name
        - price
    - Transaction :
        - id
        - customer_name
        - transaction_details
        - is_paid
        - created_at
    - TransactionDetail
        - id
        - transaction_id
        - product_id
        - quantity

untuk source codenya dapat dilihat di [praktikum section 26](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/26_JPA%20(Spring%20Database%20No%20SQL)/praktikum/section25)

Hasil screenshotnya :
![praktikum section 26](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/aa21f9a1cc156d6b729ca733c61c1e12aaa07f41/26_JPA%20(Spring%20Database%20No%20SQL)/screenshots/Screenshot1%20-%20GET%20product.PNG)

![praktikum section 26](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/aa21f9a1cc156d6b729ca733c61c1e12aaa07f41/26_JPA%20(Spring%20Database%20No%20SQL)/screenshots/Screenshot2%20-%20GET%20transaction.PNG)

![praktikum section 26](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/aa21f9a1cc156d6b729ca733c61c1e12aaa07f41/26_JPA%20(Spring%20Database%20No%20SQL)/screenshots/Screenshot3%20-%20GET%20transaction%20details.PNG)

![praktikum section 26](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/aa21f9a1cc156d6b729ca733c61c1e12aaa07f41/26_JPA%20(Spring%20Database%20No%20SQL)/screenshots/Screenshot4%20-%20Mongo%20Database.PNG)