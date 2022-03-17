# **(17) Introduction NoSQL & MongoDB 2**

## **Resume**
Pada section 17 ini, kita mempelajarai tentang cara menginstall mongoDB dan basic operation pada mongoDB, berikut beberapa contoh operation pada MongoDB:
1. Collection
    - use nama_database, untuk membuat database
    - db.createCollection('nama_collection'), untuk mebuat collection atau table
2. Insert
    - db.nama_collection.insert({nama_document:"value"}), untuk membuat dan memasukan data pada document atau column
    - db.nama_collection.insert([{nama_document1:"value1"}, {nama_document2:"value2"}]), untuk melakukan bulk insert
3. Find
    - db.nama_collection.find(), untuk menampilkan semua data pada collection tersebut
    - db.nama_collection.find({nama_document:"value"}), untuk menampilkan data dengan parameter
    - db.nama_collection.find({nama_document:"value"}), {$set:{nama_subdocument:{nama_subdokumen:"value"}}}), untuk mencari dookumen didalam dokumen
    - db.nama_collection.find({nama_document.nama_subdokumen:"value"}), untuk mencari dookumen didalam dokumen
    - db.nama_collection.find({nama_document:"value"}, {nama_dokumen:"value"}), untuk menampilkan dokumen spesifik
    - db.nama_collection.find().sort({nama_document:1}), untuk sorting ascending
    - db.nama_collection.find().sort({nama_document:-1}), untuk sorting descending
    - db.nama_collection.find().limit(jumlah_limit), untuk membatasi output yang dikeluarkan
    - db.nama_collection.count() atau db.nama_collection.find({nama_document:"value"}).count(), untuk menghitung jumlah value dalam collection tersebut
4. Update
    - db.nama_collection.update({nama_document:"value_lama"}, {nama_document:"value_baru"}), untuk update isi atau merubah isi document
    - db.nama_collection.update({nama_document:"value"}, {$set:{nama_document:"value"}}), untuk menambahkan document dan value baru
    - db.nama_collection.update({nama_document:"value"}, {$inc:{nama_document:1}}), untuk menambahkan value sebanyak 1
    - db.nama_collection.update({nama_document:"value"}, {$unset:{value:""}}), untuk membatalkan set
    - db.nama_collection.update({nama_document:"value"}, {$rename:{nama_document:"value_baru"}}), untuk merename ulang value didalam document
5. Remove
    - db.nama_collection.remove({nama_document:"value"}), untuk menghapus dokumen
    - db.nama_collection.update({nama_document:"value"}, {justOne:true}), untuk menghapus satu dokumen
6. Comparison, contoh: db.nama_collection.find({nama_document:{$comparisson : "value"}}), beberapa comparisson dalam mongoDB yaitu:
    - $eq = equals, yaitu untuk mencari data yang setara atau sama dengan data yang ingin dicari
    - $ne = not equals, yaitu untuk mencari data yang tidak setara atau tidak sama dengan data yang ingin dicari
    - $gt = greater than, yaitu untuk mencari data yang lebih besar dari value yang diberikan
    - $gte = greater than equals, yaitu untuk mencari data yang lebih besar atau sama dengan value yang diberikan
    - $in = inside, untuk mencari data dalam array spesifik
    - $nin = not inside, untuk mencari data yang tidak ada dalam array spesifik
    - $lt = lesser than, yaitu untuk mencari data yang lebih kecil dari value yang diberikan
    - $lte = lesser than equals, yaitu untuk mencari data yang lebih kecil atau setara value yang diberikan
7. Logical,
    - $or, untuk mencari data yang sesuai pada value 1 atau value 2, jika salah satu value terpenuhi maka data akan ditampilkan
    - $and, untuk mencari data yang sesuai pada value 1 dan value 2, jika salah satu value tidak terpenuhi maka data tidak akan ditampilkan
    - $in, untuk mencari data pada array tertentu, jika data tersebut ada maka akan ditampilkan
    - $nin, untuk mencari data yang tidak ada pada array tertentu, jika data tersebut tidak ada maka akan ditampilkan
    - $not, untuk mencari data yang tidak sama dengan value yang diberikan
8. Evaluator
    - $regex, untuk mencari data spesifik seperti LIKE pada SQL
9. Array / Embedded Document
    - $all, untuk menampilkan semua data pada array
    - $size, untuk mencari data yang mempunyai value yang sama dengan $size
    - $slice, untuk membagi data pada array
    - $push, untuk memasukan data pada array
    - $pop, untuk menampilkan data terakhir atau pertama
10. Aggregation
    - $lookup, untuk join dua buah collection lebih spesifiknya left join
    - $match, untuk mencari data yang sesuai dengan value yang diberikan
    - $project, untuk reshape atau membentuk ulang document yang akan ditampilkan
    - $cond, untuk memberikan condition pada data yang ditampilkan
    - $group, untuk menggabungkan isi dalam dokumen
    - $unwind, untuk mengeluarkan data pada array atau subdokumen
    - $sort, untuk mengurutkan data baik ascending maupun descending

## **Praktikum**
text syntax - syntax yang digunakan dalam praktikum MongoDB bagian 2 ini dapat dilihat pada : [praktikum section 17.txt](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/praktikum/praktikum%20section%2017.txt)

Hasil Screenshot dari praktikumnya dapat dilihat dibawah ini :
![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%201%20(Pembuatan%20database%20dan%20collection%20books).PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%202%20(insert%20collection%20Authors%20dan%20Publishers).PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%203%20-%20Task%201.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%204%20-%20Task%202%20dan%203.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%205%20-%20Task%204%20-%20Output%201.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%206%20-%20Task%204%20-%20Output%202.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%207%20-%20Task%205.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%208%20-%20Task%207.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%209%20-%20Task%208.PNG)

![Screenshot secion 17](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/285f79a07274315737f056934fa325933bc7d2e8/17_Introduction%20NoSQL%20&%20MongoDB%202/screenshots/Screenshot%2010%20-%20Task%209.PNG)