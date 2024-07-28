print('Melakukan tukar nilai A,B,C,D menjadi B,D,A,C jika A,B,C,D merupakan bilangan desimal sembarang')
A=eval(input('A= '))
B=eval(input('B= '))
C=eval(input('C= '))
D=eval(input('D= '))

if type(A) is float and type(B) is float and type (C) is float and type(D) is float:
    print('Nilai bilangan berhasil ditukar karena merupakan desimal')
    A, B, C, D = B, A, D, C
    print(f'A = {A}, B = {B}, C = {C}, D = {D}')
else:
    print('Nilai bilangan tidak ditukar karena bukan desimal')
    A, B, C, D = A, B, C, D
    print('Setelah pertukaran')
    print(f'A = {A}, B = {B}, C = {C}, D = {D}')
