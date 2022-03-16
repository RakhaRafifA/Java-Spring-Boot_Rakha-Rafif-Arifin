# **(16) Introduction NoSQL & MongoDB**

## **Resume**
Pada section 16 ini kita memepelajari tentan g NoSQL, atau Not Only SQL, No SQL bukan merupakan relational database yang menyediakan DBMS yang lebih fleksibel dibandingkan dengan model RDBMS dengan menghindari :
    - Effort pada sifat transaksi ACID
    - Kompleksitas SQL
    - Design Schema didepan
    - Transactions (ditangani oleh aplikasi lain)
Kelebihan dari NoSQL yaitu:
    - Schema less
    - Fast Development
    - Support big size file
    - Support Cluster
No SQL direkomendasikan untuk digunakan saat kita membangun database yang membutuhkan skema fleksibel, ACID tidak diperlukan, tersdistribusi, data logging dan data sementara. Namun NoSQL tidak direkomendasikan saat kita mebuat database untuk data finansial, data transaksi, bussiness critical, ACID - compliant.
Kaidah CAP, yaitu :
    - Consistency, setiap proses baca mendapatkan data dari proses penulisan terakhir
    - Availability, setiap request mendapatkan respond yang bukan error
    - Partition, DBMS tetap dapat beroperasi meskipun ada kesalahan jaringan.
contoh - contoh aplikasi NoSQL yang dapat kita gunakan :
1. Redis, yaitu aplikasi yang menggunakan Key / Value, contoh lainnya yaitu : Memcached dan Riak
2. Cassandra, yaiut aplikasi yang menggunakan column - family, contoh lainnya yaitu : Hbase dan Hypertable
3. Neo4j, noSQL berbasis Graph contoh lainnya yaitu : OrientDB dan ArangoDB
4. MongoDB, document Based databse, contoh lainnya yaitu : Elastic search, Couchbase dan RavenDB

## **Praktikum**
Praktikum MongoDB dengan membuat database pada mongodb dan melakukan beberapa perintah DDL dan DML, untuk text syntax yang saya gunakan dapat dilihat di : [Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/praktikum/Prakitkum_NoSQL_Section16.txt)

Hasil Screenshotnya :
![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%201%20(database,collection%20dan%20input%20operators).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%202%20(Create%20bagian%20b,c,d,e).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%203%20(Create%20bagian%20f).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%204%20(Create%20bagian%20g%20dan%20h).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%205%20(Create%20bagian%20i%20dan%20j).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%206%20(Read%20bagian%20a%20dan%20b).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%207%20(Read%20bagian%20c%20dan%20d).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%208%20(Read%20bagian%20e).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%209%20(Update%20bagian%20a).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%2010%20(Update%20bagian%20b).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%2011%20(Delete%20bagian%20a).PNG)

![Praktikum NoSQL Section16](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/15e06302bb7ec3b8959fcb0afdcfbc01e38cfb57/16_Introduction%20NoSQL%20&%20MongoDB/screenshots/Screenshot%2011%20(Delete%20bagian%20b).PNG)
