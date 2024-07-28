print('Soal 1: Menghitung rata-rata dari 3 bilangan bulat sembarang')
a1=int(input('Bilangan ke-1: '))
a2=int(input('Bilangan ke-2: '))
a3=int(input('Bilangan ke-3: '))
total=a1+a2+a3
print('Total = ', total)
avg=total/3
print('Average = ', avg)

print('Soal 2: Menghitung nilai fungsi f(x) = 2x3 + 2x + 15/x jika x merupakan bilangan bulat sembarang')
x=int(input('x = '))
fx=2*x*x*x+2*x+15/x
print('f(x)=', fx)

print('Melakukan tukar nilai A,B,C,D menjadi B,D,A,C jika A,B,C,D merupakan bilangan desimal sembarang')
A=eval(input('A= '))
B=eval(input('B= '))
C=eval(input('C= '))
D=eval(input('D= '))

if type(A) is float and type(B) is float and type (C) is float and type(D) is float:
    print('Nilai bilangan berhasil ditukar karena merupakan desimal')
    A, B, C, D = B, D, A, C
    print(f'A = {A}, B = {B}, C = {C}, D = {D}')
else:
    print('Nilai bilangan tidak ditukar karena bukan desimal')
    A, B, C, D = A, B, C, D
    print('Setelah pertukaran')
    print(f'A = {A}, B = {B}, C = {C}, D = {D}')

