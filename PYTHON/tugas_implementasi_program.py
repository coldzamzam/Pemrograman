#1. Menghitung penjumlahan dua bilangan
bil1=eval(input('Bilangan pertama = ')) 
bil2=eval(input('Bilangan kedua = '))

#Jumlahkan bil1 dan bil 2
hasil=bil1+bil2
print (bil1, '+', bil2, '=', hasil)

#################################################################################

#2. Menentukan kelulusan siswa. Misal jika nilai ≥ 60 maka lulus & sebaliknya.
#Menginput nilai siswa
nilai_siswa=eval(input('Input nilai siswa = '))

if nilai_siswa >= 60:
    print('Nilai Anda', nilai_siswa, ', Anda Dinyatakan Lulus.') 
else:
    print('Nilai Anda', nilai_siswa, ', Anda Dinyatakan Tidak Lulus.')

#################################################################################

#3. Menukar isi dua buah bilangan pada suatu variabel.
#Menginput variabel
A=eval(input('Input nilai A = '))
B=eval(input('Input nilai B = '))

#Proses penukaran variabel
C = A
A = B
B = C

#Print variabel setelah ditukar
print('Setelah variabel ditukar:')
print('A = %d\nB = %d'%(A, B))

#################################################################################

#4. Menghitung rata-rata bilangan bulat
n = int(input('Masukkan banyaknya bilangan: '))
total = 0

for i in range(n):
    bilangan = int(input('Masukkan bilangan ke-%d: '%(i+1)))
    total = total + bilangan

rata_rata = total / n
print(f'Rata-rata adalah: {rata_rata}')

#################################################################################

print('5. Menentukan bilangan yang dimasukkan adalah ganjil atau genap.')
bil5=int(input('Input sebuah bilangan: '))
if bil5 % 2 == 0:
    print(f'{bil5} adalah bilangan genap.')
else:
    print(f'{bil5} adalah bilangan ganjil.')

#################################################################################

print('6. Menampilkan 10 bilangan kuadrat pertama.')
j = 1
for j in range(10):
    j = j + 1
    kuadrat=j*j
    print ('Kuadrat dari', j, 'adalah', kuadrat)

#################################################################################

print('7. Menampilkan bilangan kuadrat yang kurang dari 100')
q=1
print('Berikut adalah bilangan kuadrat < 100')
while q < 10:
    kuadrat2=q*q
    q += 1
    print(f'Kuadrat dari {q} adalah {kuadrat2}')

#################################################################################

print('8. Konversi nilai angka ke huruf.')
nilai_angka=eval(input('Input nilai anda: '))
if nilai_angka < 0:
    nilai_angka = 0
elif nilai_angka > 100:
    nilai_angka = 100

if nilai_angka >= 85:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat A.')
elif nilai_angka >= 75:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat B+.')
elif nilai_angka >= 65:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat B.')
elif nilai_angka >= 55:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat C+.')
elif nilai_angka >= 45:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat C.')
else:
    print(f'Nilai anda {nilai_angka}, anda mendapatkan predikat D.')
