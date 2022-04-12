# **(34) Introduction Apache Kafka**

## **Resume**
Pada section ini kita mempelajari tentang kafka.
Apache kafka adalah sebuah publish-subscribe messaging system. Messaging system adalah system yang bisa digunakan untuk mengirimkan message antar proses, aplikasi dan server. Pada dasarnya kafka adalah sebuah message broker yang bertujuan untuk mengirimkan pesan dari sebuah producer yang akan diterima oleh sebuah consumer. Di dalam kafka, setiap pesan yang masuk hanya akan ditambahkan saja tidak akan dilakukan perubahan pada adata sebelumnya.

Beberapa hal tentang kafka :
1. Producer : Applikasi yang mengirimkan pesan
2. Consumer : Applikasi yang menerima pesan
3. Message : Informasi yang dikirim oleh producer ke consumer
4. Connection : connection adalah sebuah tcp connection antara aplikasi dan kafka broker
5. Topic : adalah sebuah nama category/feed dimana message disimpan
6. Topic partition : topik pada kafka dapat dibagi menjadi beberapa partisi yang memungkinkan kita untuk memecah data ke beberapa broker
7. Replicas : adalah sebuah partisi backup, replika tidak digunakan untuk read dan write data, replika hanya digunakan untuk mencegah kehilangan data
8. Consumer Group : merupakan grup yang berisikan consumer yang mensubscribe ke topik spesifik
9. Offset : offset adalah sebuah id unik dari sebuah record partition
10. Node : node adalah sebuah komputer ppada apache kafka cluster
11. Cluster : cluster adalahkumpulan dari node atau kumpulan dari komputer

## **Praktikum**
Problem 1 - Kafka Messaging
Jalankan server kafka dan kirimkan pesan menggunakan kafka publisher!
ambillah pesan tersebuh menggunakan kafka consumer!

Problem 2 - Kafka Topics
Simulasikan Problem 1 dengan menambah topik baru!
Minimum 3 Topics

Jawab :
1. Pertama Download Kafka pada website [kafka download](https://kafka.apache.org/downloads) download scala, lalu extract
2. Copy folder yang sudah di extract lalu pindahkan ke C:, setelah itu rename folder menjadi "kafka"
3. Atur konfigurasi pada zookeper.properties dan server.properties, ubah direktori dengan direktori yang sesuai
4. Buka CMD dan jalankan zookeeper dengan syntax : ".\bin\windows\zookepeer-server-start.bat .\config\zookeeper.properties" lalu biarkan, dan jangan close cmd, seperti dibawah ini :
![screenshot zookeeper](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/71d121e180aa2bb3b9847394d8396f90260572b4/34_Introduction%20Apache%20Kafka/screenshot/Screenshot1%20-%20Zookeeper.PNG)

5. Buka CMD baru, lalu jalankan kafka server dengan syntax : ".\bin\windows\kafka-server-start.bat .\config\server.properties" lalu biarkan, dan jangan close cmd, seperti dibawah ini :
![screenshot kafka server](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/71d121e180aa2bb3b9847394d8396f90260572b4/34_Introduction%20Apache%20Kafka/screenshot/Screenshot2%20-%20Kafka%20Server.PNG)

6. Buka CMD baru, lalu buatlah topik yang ingin digunakan, disini saya membuat 4 topik, dengan 1 topik untuk problem 1 dan 3 topik untuk problem 2, 
untuk syntaxnya yaitu : ".\bin\windows\kafka-topics.bat --create --topic NamaTopic --botstrap-server localhost:9092 --replication-factor 1 --partitions 1"
hasilnya seperti dibawah ini :
![screenshot create topics](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/71d121e180aa2bb3b9847394d8396f90260572b4/34_Introduction%20Apache%20Kafka/screenshot/Screenshot3%20-%20List%20Topic.PNG)

7. Buka CMD baru, lalu kita akan memasukan pesan pada topic dengan syntax : ".\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic NamaTopic"
jika sudah selesai, maka kita dapat menggunakan shortcut Ctrl+C untuk keluar
hasilnya seperti dibawah ini :
![screenshot input topics](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/71d121e180aa2bb3b9847394d8396f90260572b4/34_Introduction%20Apache%20Kafka/screenshot/Screenshot4%20-%20Input%20Topic.PNG)

8. Buka CMD baru, lalu kita akan menampilkan ini dari tiap topic, dengan syntax : ".\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NamaTopic --from-beginning", lalu jika sudah selesai, maka kita dapat menggunakan shortcut Ctrl+C untuk keluar
hasilnya seperti dibawah ini :
![screenshot show topics](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/71d121e180aa2bb3b9847394d8396f90260572b4/34_Introduction%20Apache%20Kafka/screenshot/Screenshot5%20-%20Consume%20Message.PNG)