list_code = []

while True:
  nama = list(input('nama : '))
  if len(nama) < 4: print ('nama tidak valid!')
  else: break
words = ''
for i in nama:
  words += i
  if i is nama[3]: break
list_code.append(words.upper())

while True:
  tanggal = str(input('input tanggal (DDMMYYYY) : '))
  if len(tanggal) < 8: print ('format tanggal DDMMYYYY!')
  else: break
list_code.append(str(tanggal))

telepon = list(input('nomor telepon : '))
int_telepon = [int(x) for x in telepon]
summ_telepon = 0
for i in (int_telepon):
  summ_telepon += i
list_code.append(str(summ_telepon))

print(''.join(list_code))