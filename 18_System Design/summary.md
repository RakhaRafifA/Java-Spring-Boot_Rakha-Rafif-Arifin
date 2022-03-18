# **(18) System Design**
Pada section ini kita mempelajari tentang:
1. Diagram Design, contoh diagram design yang paling sering digunakan yaitu :
    - Flowchart
    - Use Case
    - ERD (Entity Relationships Diagram)
    - HLA (High Level Architecture)
2. Karakteristik dari ditributed systems, contohnya yaitu :
    - Scalibility
    - Reliability
    - Availability
    - Efficiency
    - Serviceability or Manageability
3. Horizontal Scaling dan Vertical Scaling
    - Horizontal Scaling yaitu jenis scalling dengan menambah database baru
    - Verticall Scaling yaitu dengan cara mengupgrade code pada aplikasi, database atau upgrade hardware
4. Job/Work Queue
5. Load Balancing adalah metode untuk membagi pekerjaan pada beberapa cluster agar traffic data tidak terlalu besar pada satu titik
6. Monolithic dan Microservices
    - Monolithic application adalah base code yang mempunyai beberapa modul
    - Microservices adalah service independen yang terdiri dari beberapa service yang saling terhubung dan berkolaborasi untuk membangun sebuah aplikasi
7. SQL vs NoSQL, SQL adalah database yang bersifat rasional yang memiliki skema dan menerapkan ACID (atomicity, consistency, isolation, dan durability), sedangkan NoSQL yaitu databse yang tidak mempunyai, kelebihan dari NoSQL yaitu lebih cepat digunakan dan schema less
8. Caching atau cache adalah short term memory pada komputer yang dapat menyimpan data sementara seperti gambar - gambar pada web sehingga jika kita meload kembali web yang telah kita kunjungi maka waktunya akan lebih cepat karena data - datanya telah tersimpan dalam cache
9. Database Indexing yaitu penamaan pada database, seperti penamaan table, field dan column agar lebih mudah dalam mencari dan mengupdate database
10. Database Replication yaitu pembuatan database baru yang serupa dengan database utama sebagai cadangan jika ada masalah pada database utama