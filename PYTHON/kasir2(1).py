# inisialisasi harga makanan
MG = 10000
NG = 15000
Soto = 12000
Ketoprak = 14000
GD = 12000
# inisialisasi harga minuman
EJ = 8000
ET = 5000
AM = 4000
PC = 7000
HDC = 10000

# inisialiasi akumulasi harga
akumulasiHarga = 0

# menu utama
menu = input('KLIK y UNTUK MENUJU KE MENU : ')
while menu =='y':
  print("-------- MENU UTAMA ---------")
  print ("menu 1 = makanan")
  print ("menu 2 = minuman")
  # pilih menu
  menuPilihan = int(input("pilih menu utama (1/2) : "))
  print(" ")
  # tampilan
  if (menuPilihan == 1):
    # tampilkan
    print("----- Menu Makanan -----")
    print("1. Mie Goreng = Rp 10000")
    print("2. Nasi Goreng = Rp 15000")
    print("3. Soto = Rp 12000")
    print("4. Ketoprak = Rp 14000")
    print("5. gado - gado = Rp 12000")
    print("------------------------")
  elif(menuPilihan == 2):
    # tampilkan
    print("----- Menu Minuman -----")
    print("1. Es Jeruk = Rp 8000")
    print("2. Es teh = Rp 5000")
    print("3. Air Mineral = Rp 4000")
    print("4. Pocari = Rp 7000")
    print("5. Hydrococo = Rp 10000")
    print("------------------------")
  # customer pilih makanan yg dibeli
  jenisPilihan = int(input("jenis makanan/minuman yg dipilih = "))
  # jumlah yang dipilih
  jmlPorsi = int(input("jumlah porsi = "))
  print(" ")
  # tampilkan hasil yg dipilih
  print("----- Menu yang anda pilih -----")
  if (menuPilihan == 1):
    if (jenisPilihan == 1):
      hargaPilihan = MG
      print(f"Jenis Makanan : Mie goreng")
    elif (jenisPilihan == 2):
      hargaPilihan = NG
      print(f"Jenis Makanan : Nasi goreng")
    elif (jenisPilihan == 3):
      hargaPilihan = Soto
      print(f"Jenis Makanan : Soto")
    elif (jenisPilihan == 4):
      hargaPilihan = Ketoprak
      print(f"Jenis Makanan : Ketoprak")
    elif (jenisPilihan == 5):
      hargaPilihan = GD
      print(f"Jenis Makanan : Gado-gado")
  elif (menuPilihan == 2):
    if (jenisPilihan == 1):
      hargaPilihan = EJ
      print(f"Jenis Minuman : Es Jeruk")
    elif (jenisPilihan == 2):
      hargaPilihan = ET
      print(f"Jenis Minuman : Es Teh")
    elif (jenisPilihan == 3):
      hargaPilihan = AM
      print(f"Jenis Minuman : Air Mineral")
    elif (jenisPilihan == 4):
      hargaPilihan = PC
      print(f"Jenis Minuman : Pocari")
    elif (jenisPilihan == 5):
      hargaPilihan = HDC
      print(f"Jenis Minuman : Hydrococo")
  
  
  # proses penghitungan harga
  totalHarga = hargaPilihan * jmlPorsi
  akumulasiHarga += totalHarga
  print("jumlah porsi : ", jmlPorsi)
  print("Harga = ", totalHarga)
  print(" ")
  menu = input ('Apakah anda ingin memesan lagi? (y/n) : ')


print(" ")
print("-------- PEMBAYARAN ----------")



# jika diskon
if (akumulasiHarga > 100000):
  hargaDiskon = akumulasiHarga * 10 / 100
  hargaAkhir = akumulasiHarga - hargaDiskon
  print("Total Harga yang harus anda bayar = Rp ", hargaAkhir)
elif (akumulasiHarga > 250000):
  hargaDiskon = akumulasiHarga * 15 / 100
  hargaAkhir = akumulasiHarga - hargaDiskon
  print("Total Harga yang harus anda bayar = Rp ", hargaAkhir)
elif (akumulasiHarga > 500000):
  hargaDiskon = akumulasiHarga * 25 / 100
  hargaAkhir = akumulasiHarga - hargaDiskon
  print("Total Harga yang harus anda bayar = Rp ", hargaAkhir)
else:
  print("Total Harga yang harus anda bayar = Rp ", akumulasiHarga)

# input nominal pembayaran
nominalUang = int(input("Masukan Nominal Pembayaran : Rp. "))
print(" ")
# kembalian
if (akumulasiHarga <= 100000):
  kembalian = nominalUang - akumulasiHarga
  print("Kembalian anda : Rp", kembalian)
elif (akumulasiHarga > 100000):
  kembalian = nominalUang - hargaAkhir
  print("Kembalian anda : Rp", kembalian)