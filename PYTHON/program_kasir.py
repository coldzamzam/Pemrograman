### Percobaan Program Kasir ###
#Inisialisasi nilai awal total harga
total_harga = 0
total_barang = 0

#Input berapa banyak barang yang dibeli
total_barang = int(input('Berapa total jenis barang yang anda beli : '))

#Proses looping nama barang, harga satuan, banyak barang, dan harga beli barang
for harga_beli in range (total_barang):
    nama_barang = input('Nama Barang : ')
    harga_satuan = int(input('Harga satuan : Rp '))
    banyak_barang = int(input('Banyak barang %s : '%nama_barang))

    #Menghitung total harga per jenis barang
    harga_beli = harga_satuan*banyak_barang
    print ('Total harga %s = %d'%(nama_barang, harga_beli))
    print (' ')

    #Penjumlahan total harga barang barang yang dibeli
    total_harga += harga_beli
    
#Output
print ('Banyak jenis barang yang Anda beli ada %d barang'%total_barang)
print ('Jumlah harga yang harus Anda bayar adalah Rp%d'%total_harga)
