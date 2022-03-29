# **(24) JPA (Spring Database SQL)**

## **Resume**
Pada section ini kita mempelajari tentang pembuatan spring boot dengan database yang terhubung dengan postgresql, selain itu kita juga mempelajarai tentang Arsitektur spring boot.
Dalam spring boot biasanya kita mempunyai beberapa class, diantaranya:
1. Spring Application, yaitu class utama / main yang akan dijalankan saat kita merunning spring boot
2. Controller, yaitu vlass yang menyimpan controller atau perintah - perintah yang akan dijalankan sesuai dengan endpoint yang terdapat pada controller ini.
3. Service/Bussiness, yaitu class yang berisi logic - logic yang akan dijalankan sebelum diarahkan ke repository
4. Repository, yaitu class yang menjembatani request dengan database, semua perintah yang mengakses database harus melewati class ini.

## **Praktikum**
1. Buatlah sebuah project yang dapat melakukan CRUD lengkap yang memuat REST API endpoint, repository dan Service
2. Tambahkan sebuah CRUD lagi dalam project tersebut

untuk source codenya dapat dilihat di [praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/tree/main/24_JPA(Spring%20Database%20SQL)/praktikum/section24)

Hasil screenshotnya :
![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot1%20-%20Database.PNG)

![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot2%20-%20POST.png)

![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot3%20-%20GET.PNG)

![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot4%20-%20PUT.PNG)

![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot5%20-%20DELETE.PNG)

![praktikum section24](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/098c02b8d3a7ddfb1fb896f5d4db80f2378023a5/24_JPA(Spring%20Database%20SQL)/screenshot/Screenshot6%20-%20GET%20setelah%20put%20dan%20delete.PNG)