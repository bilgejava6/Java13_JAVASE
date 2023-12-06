# UYGULAMA İÇİ HATA YÖNETİMİ

## Hata Türleri ve Numaralandırma
```
   X X X X -> Hata kodu
   | | | |
   | | | +->  Uygulama içi hata detay kodu
   | | +--->  Hata türü 
   | +----->  Hata kaynağı class, yada microservis adı
   +------->  Hata kodu numarası

```

### Kullanıcı Birimi Hataları (User Microservice)

    1 0 0 0 -> Kullanıcı birimi User Servis hata kodu
    1 0 0 1 -> Kullanıcı birimi User Servis Kullanıcı bulunamadı hatası


