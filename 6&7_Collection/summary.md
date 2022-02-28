# **(6&7) Collection**

## **Resume**
Dalam Section 6 dan 7 saya mempelajari tentang collection Framework, seperti :
1. Iterable, adalah sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan, yang memiliki method bernama itertor, iterator merupakan class yang memanage iterasi dari sebuah iterable
2. Collections, adalah kumpulan dari objek/ data yang dikumpulkan dalam satu tempat yang sama
3. List, merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linier, list dapat menerima input yang bernilai sama, list terbagi lagi menjadi :
    - AbstractCollection, yang digunakan untuk mengimplementasikan collection yang tidak bisa diubah
    - AbstractList, yang menyediakan struktur implementasi list
    - ArrayList, untuk menyimpan array dinamis
    - LinkedList, yang tersusun dari beberapa node yang menyimpan data dan referensi untuk node selanjutnya
    - Stack, yaitu class yang merepresentasikan mekanisme last in first out
4. Set, merupakan sebuah struktur data yang dapat mengumpulkan data secara linier tetapi tidak dapat menerima data yang sama atau duplikat
5. SortedSet, adalah set yang dapat mengelola urutan dari data
6. Queue, yaitu struktur data yang menggunakan mekanisme FIFO
7. Deque, yaitu struktur data Queue yang mempunyai 2 ujung

Selain itu kita juga mempelajari tentang map, yaitu struktur data yang ada pada java yang dapat digunakan untuk menyimpan banyak data didalamnya, data yang ada didalam map diidentifikasikan dengan key dan setiap key mempunyai datanya sendiri yang disebut value. Berikut beberapa contoh map:
1. Hashmap, merupakan implementasi dari map yang menggunakan algoritma struktur data hashtable
2. Weak Hashmap, hampir sama dengan hashmap namun pada weakhashmap key dapat dihilangkan jika tidak digunakan
3. IdentityHashMap, masih menggunakan hashtable, tetapi jika key memiliki referensi pada memori yang berbeda maka akan dianggap sebagai data yang berbeda
4. LinkedHashMap, hampir sama dengan HashMap namun menerapkan bubblylinkedlist dan hashtable sebagai struktur data didalamnya
5. ImmutableMap, yaitu map yang tidak dapat diubah isinya
6. SortedMap, yaitu map yang dapat mengurutkan data secara ascending maupun descending, yang digunakan untuk mengurutkan key
7. NavigableMap, yaitu sortedmap yang mempunyai method - method navigasi yang lebih lengkap

### Kegunaan
Kegunaan pembelajaran tentang collection yaitu untuk memudahkan kita dalam mengatur data yang akan dimasukkan dan ditampilkan selain itu collection dapat mempermudah kita memasukan data sesuai dengan yang kita perlukan, seperti untuk mencari data yang tidak memiliki duplikat kita dapat menggunakan set

## **Praktikum**
1. Problem 1 - Array Merge, Buatlah sebuah program menggabungkan 2 array yang diberikan, dan jangan sampai terdapat nama yang sama di data yang sudah tergabung tadi, source codenya : [Section6ArrayMerge.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/praktikum/Section6ArrayMerge.java)

Hasil Screenshotsnya : ![Section6ArrayMerge.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/screenshots/Screenshot%20Array%20Merge%20(1).PNG)
![Section6ArrayMerge.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/screenshots/Screenshot%20Array%20Merge%20(2).PNG)


2. Problem 2 - Angka Muncul Sekali, Buat program sesuai dengan deskripsi di bawah. Input merupakan variable string berisi kumpulan angka. Output merupakan list / array berisi angka yang hanya muncul 1 kali pada input. Source Codenya [Section6AngkaMunculSekali.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/praktikum/Section6AngkaMunculSekali.java)

Hasil Screenshotnya : ![Section6AngkaMunculSekali.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/screenshots/Screenshot%20Angka%20Muncul%20Sekali.PNG)


3. Problem 5 - Remove Duplicates, Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the length of the subarray that has no duplicate in it. Source Codenya : [Section6RemoveDuplicates.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/praktikum/Section6RemoveDuplicates.java)

Hasil Screenshotnya : ![Section6RemoveDuplicates.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/screenshots/Screenshot%20Remove%20Duplicates.PNG)


4. Problem 6 - Maximum Sum Subarray of Size K, Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’. Source Codenya : [Section6MaximumSumSubarray.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/praktikum/Section6MaximumSumSubArray.java)

Hasil Screenshotnya : ![Section6MaximumSumSubarray.java](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/067931f19036e3a231a7b719d97897b961eb81cf/6&7_Collection/screenshots/Screenshot%20Maximum%20sum%20of%20Subarray.PNG)