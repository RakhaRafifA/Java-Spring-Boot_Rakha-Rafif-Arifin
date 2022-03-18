# **(19) Configuration Management and CLI**

## **Resume**
Pada section ini saya mempelajari tentang CLI, kenapa kita harus menggunakan CLI?
1. Lebih terperinci, karena dengan menggunakan CLI kita dapat menentukan dan melihat program - program dalam ukuran mikro
2. Lebih cepat karena kita hanya disuguhkan tampilan berupa Teks
3. Kemampuan untuk menyimpan script untuk automate task
4. Merupakan interface yang bagus untuk mempelajari tentang troubleshooting
berikut beberapa syntax dalam CLI linux yang biasa digunakan :
1. Directory :
    - untuk melihat posisi direktori yang saat ini kita tempati
    - ls untuk menampilkan direktori dan file yang ada pada direktori yang sedang kita gunakan
    - mkdir untuk membuat direktori baru
    - cd untuk berpindah direktori
    - rm untuk menghapus file
    - cp untuk mengcopy file
    - mv untuk cut atau memindahkan file
    - ln untuk menlink atau menghubungkan suatu data
    - create : touch
2. Files
    - view : head, cat, tail, less
    - editor : vim, nano
    - permission : chown, chmod
    - Different : diff
3. Network
    - ping
    - ssh
    - netstat
    - nmap
    - wget
    - curl
    - telnet
    - netcat
    - ip addr (ifconfig)
4. Utility
    - man
    - env
    - echo
    - date
    - which
    - watch
    - sudo
    - history
    - grep
    - locate


## **Praktikum**
Bagian 1 - Instalasi ZSH :
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot1%20-%20activate%20subsystem%20for%20linux.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot2%20-%20update%20and%20upgrade%20debian.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot3%20-%20install%20zsh.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot4%20-%20konfigurasi%20awal%20zsh.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot5%20-%20install%20curl.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot6%20-%20Install%20git.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot7%20-%20Install%20oh%20my%20zsh.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot8%20-%20Install%20Spaceship.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot9%20-%20update%20configuration.PNG)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%201/Screenshot10%20-%20install%20font%20firacode.PNG)

Bagian 2 - Membuat file Bash :
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%201%20-%20mambuat%20folder,%20file.txt%20dan%20file%20bash.png)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%202%20-%20mambuat%20facebook.txt.png)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%203%20-%20mambuat%20linkedin.txt.png)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%204%20-%20mambuat%20list_of_my_friends.txt.png)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%205%20-%20isi%20file%20bash.png)
![Screenshot](https://github.com/RakhaRafifA/Java-Spring-Boot_Rakha-Rafif-Arifin/blob/4cad25cc9f2b65b0a19c45b2ad91a88904f3b0a3/19_Configuration%20Management%20and%20CLI/praktikum/bagian%202/Screenshot%206%20-%20hasil%20test.png)