
list_kopi = [
    ['Kopi Gula Aren', 'Hazelnut Latte', 'Caramel latte', 'Vanilla Latte', 'Caffe Latte', 'Coldbrew', 'Cappuccino'],
    [18000, 28000, 27000, 23000, 20000, 24000, 25000]
]

# def detailPilihan (x):
    

menuPilihan = int(input('\nSilakan pilih menu yang anda inginkan sesuai dengan angka yang tertera di menu : '))

# proses penghitungan harga kopi
if menuPilihan == 1:
    kopi = list_kopi[0][0]
    harga = list_kopi[1][0]
elif menuPilihan == 2:
    kopi = list_kopi[0][1]
    harga = list_kopi[1][1]
elif menuPilihan == 3:
    kopi = list_kopi[0][2]
    harga = list_kopi[1][2]
elif menuPilihan == 4:
    kopi = list_kopi[0][3]
    harga = list_kopi[1][3]
elif menuPilihan == 5:
    kopi = list_kopi[0][4]
    harga = list_kopi[1][4]
elif menuPilihan == 6:
    kopi = list_kopi[0][5]
    harga = list_kopi[1][5]
elif menuPilihan == 7:
    kopi = list_kopi[0][6]
    harga = list_kopi[1][6]


print (kopi)
print (harga)