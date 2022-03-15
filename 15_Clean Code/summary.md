# **(15) Clean Code**
## **Resume**
Pada section ini kita mempelajari tentang clean code, atau kerapihan kode agar lebih mudah dimengerti oleh orang lain dan kita sendiri untuk mempermudah kita dalam melakukan update data kedepannya. Berikut beberapa karakteristik clean code :
1. Mudah difahami
2. Mudah dieja dan dicari
3. Singkat namun mendskripsikan konteks
4. Konsisten
5. Hindari penambahan konteks yang tidak perlu
6. Komentar
7. Good function
8. Menggunakan konvensi
9. Formatting
Berikut beberapa prinsipal clean code :
1. KISS (Keep It So Simple), yaitu hindari membuat fungsi yang melakukan tugas A, sekaligus memodifikasi B dan Mengecek C dan seterusnya, tipsnya yaitu :
    - Fungsi atau class harus kecil
    - fungsi dibuat hanta untuk melakukan satu tugas saja
    - jangan gunakan terlalu banyak argumen pada fungsi
    - Harus diperhatikan untuk mencapai kondisi yang seimbang, kkecil dan jumlahnya minimal.
2.DRY (Don't Repeat Yourself), Duplikasi kode terjadi karena sering copy paste, untuk menghindari duplikasi code buatlah fungsi yang dapat dipakai berulang kali. contohnya yaitu refactoring, refactoring adalah proses restrukturisasi kode yang dibuat dengan cara mengubah struktur internal tanpa mengganggu perilaku eksternal. prinsip KISS dan DRY dapat dicapai menggunakan refactoring.