# GUI dan Collection

GUI (Graphical User Interface) ini digunakan untuk memvisualisasikan dan mengelola data yang disimpan dalam beberapa jenis collection di Java, seperti **List**, **Set**, dan **Map**. Melalui tombol-tombol yang tersedia, data dapat dimasukkan, disimpan ke collection, diambil kembali, dan dikelola (ditambah, diubah, atau dihapus).

## 1. List

List adalah collection yang menyimpan data secara berurutan dan memperbolehkan adanya nilai duplikat. Ini berarti satu elemen dapat muncul lebih dari satu kali di dalam List.

Contoh: dalam List terdapat data **Sepatu, Sandal, Kaos kaki, Kaos, Celana, Celana**, sehingga jumlah data yang tersimpan adalah 6.

**Kelebihan List:**
- Menyimpan elemen sesuai urutan penambahan.
- Mendukung nilai duplikat.
- Bisa diakses menggunakan indeks.

## 2. Set

Set adalah collection yang tidak mengizinkan adanya duplikasi. Jika terdapat data yang sama, hanya satu instance yang disimpan.

Contoh: data pada List di atas disimpan ke Set. Meskipun List memiliki 6 data, setelah dimasukkan ke Set, jumlah data yang tersimpan menjadi 5 karena **Celana** hanya disimpan satu kali.

**Kelebihan Set:**
- Menjamin semua elemen unik.
- Ideal untuk memfilter duplikasi.
- Urutan elemen tidak selalu dijamin, kecuali menggunakan `LinkedHashSet`.

## 3. Map

Map adalah collection yang menyimpan data dalam bentuk pasangan **key-value**. Setiap elemen memiliki kunci unik (key) untuk mengakses nilai (value). Key tidak boleh duplikat; jika key sama digunakan lagi, value lama akan diganti oleh value baru.

Contoh: data dimasukkan ke Map sebagai pasangan key-value:

| Key | Value      |
|-----|------------|
| 1   | Sepatu     |
| 2   | Sandal     |
| 3   | Kaos kaki  |
| 4   | Kaos       |
| 5   | Celana     |
| 6   | Celana     |

**Catatan penting:**
- Key harus unik. Misalnya, key 3 tidak dapat digunakan dua kali.
- Jika key sama dimasukkan lagi dengan value berbeda, value sebelumnya akan digantikan oleh value baru.
- Map memudahkan pencarian data cepat berdasarkan key.

---

Dengan GUI ini, pengguna dapat mencoba langsung efek dari List, Set, dan Map: menambahkan data, menyimpan ke masing-masing collection, dan melihat perbedaan jumlah data serta aturan duplikasi secara real-time.# GUI dan Collection

GUI (Graphical User Interface) ini digunakan untuk memvisualisasikan dan mengelola data yang disimpan dalam beberapa jenis collection di Java, seperti **List**, **Set**, dan **Map**. Melalui tombol-tombol yang tersedia, data dapat dimasukkan, disimpan ke collection, diambil kembali, dan dikelola (ditambah, diubah, atau dihapus).

## 1. List

List adalah collection yang menyimpan data secara berurutan dan memperbolehkan adanya nilai duplikat. Ini berarti satu elemen dapat muncul lebih dari satu kali di dalam List.

Contoh: dalam List terdapat data **Sepatu, Sandal, Kaos kaki, Kaos, Celana, Celana**, sehingga jumlah data yang tersimpan adalah 6.

**Kelebihan List:**
- Menyimpan elemen sesuai urutan penambahan.
- Mendukung nilai duplikat.
- Bisa diakses menggunakan indeks.

## 2. Set

Set adalah collection yang tidak mengizinkan adanya duplikasi. Jika terdapat data yang sama, hanya satu instance yang disimpan.

Contoh: data pada List di atas disimpan ke Set. Meskipun List memiliki 6 data, setelah dimasukkan ke Set, jumlah data yang tersimpan menjadi 5 karena **Celana** hanya disimpan satu kali.

**Kelebihan Set:**
- Menjamin semua elemen unik.
- Ideal untuk memfilter duplikasi.
- Urutan elemen tidak selalu dijamin, kecuali menggunakan `LinkedHashSet`.

## 3. Map

Map adalah collection yang menyimpan data dalam bentuk pasangan **key-value**. Setiap elemen memiliki kunci unik (key) untuk mengakses nilai (value). Key tidak boleh duplikat; jika key sama digunakan lagi, value lama akan diganti oleh value baru.

Contoh: data dimasukkan ke Map sebagai pasangan key-value:

| Key | Value      |
|-----|------------|
| 1   | Sepatu     |
| 2   | Sandal     |
| 3   | Kaos kaki  |
| 4   | Kaos       |
| 5   | Celana     |
| 6   | Celana     |

**Catatan penting:**
- Key harus unik. Misalnya, key 3 tidak dapat digunakan dua kali.
- Jika key sama dimasukkan lagi dengan value berbeda, value sebelumnya akan digantikan oleh value baru.
- Map memudahkan pencarian data cepat berdasarkan key.

---

Dengan GUI ini, pengguna dapat mencoba langsung efek dari List, Set, dan Map: menambahkan data, menyimpan ke masing-masing collection, dan melihat perbedaan jumlah data serta aturan duplikasi secara real-time.


