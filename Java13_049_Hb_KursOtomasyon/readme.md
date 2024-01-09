# HİBERNATE ÖNEMLİ BAŞLIKLAR

## CASCADE

        tablolar ve entityler arasındaki işlişkileri yöneten hibernate bir sınıfın kendi 
    entitysini yönetmek şeklide çalışır. Yani bir sınıftan ürettiğiniz nesne ile o sınıftan
    oluşan bir tablo kaydı oluşturursunuz. Ancak bazı durumlarda ilişkili olan tablolarda
    bir tablonun ilişkili olduğu tabloyuda yönetmesini sağlamanız gerekebilir. 
        Örn;
        Bir kullanıcının silinmesi ona ait hareketlerinde silinmesini gerektiriyor olabilir, işte
    burada eğer bunu elle yapacak olursanız ilişkili olduğu tüm tabloları tek tek çıkartmak ve 
    sorgular yazmak zorunda kalırsınız.
        Bunun yerine yönettiği  tabloları otomatik silmesini ya da düzenlemesini zorlayabilirsiniz.
    bunu yapmak için CascadeType belirterek bu işi yapabilrisiniz.

## PERSISTANCE -> hibernate.hbm2ddl.auto

    * update: hibernate DB ye gider ve kendisine verilen sınıfların var olup olmadığına bakar,
    eğer tablolar DB de yok ise oluşturur. Eğer tablolar DB de var ise tablolara dokunmaz kendisinden
    istenilen sorguları çalıştrırır.
    * create: hibernate DB ye her ulaştığında yani projeniz ilk ayağa kalktığı zaman DB de tabloları
    yeniden oluşturur. Yani DB de aynı isimde bulunan tabloları yeniden yaratır. Bunun neticesnide
    DB de önceden kayıt edilen tüm veriler silinir. (Development)
    * create-drop: Hibernate DB de her işlem yaptığında tabloları temizler ve yeniden yaratır. create
    ten farkı şudur. Elimizde 2 tablomuz olsun, 
    User ve Poduct. create ile işlem yaptığımızda her seferinde bu tablolar yeniden oluşturulur eskileri r
    temizlenir. Ancak, tablolardan birisin adını değiştirip tekrar uygulama açıldığında örneğin;
    UserTable, Product yaptınızda DB de User tablosu var olmaya devam eder, ayrıca UserTable tablosuda 
    eklenmiş olur. 
    Fakat, create-drop kullanırsanız adını değiştirsenizde önceden işaretlenmiş olan User tablosu DB 
    den silinir. Yani Veri Tabanınız her daim temiz bir şekilde başlar.

## Fetch 

        Belli tablolar ilişkileri gereği bir çok tabloya bağlanabilirler, böyle durumlarda bir tablonun 
    diğerlerine göre ne kadar üstte olduğu onun DB den ne kadar bağlı tabloyu çekeceğini belirtir.
    Örn;
    bir satış işlemnide Satış tablosu, kendisine bağlı [Kullanıcı, Satış Detay, Sepet, Ödeme, Kargo v.s.] tab-
    lolarını çağırabilir.
    Böyle bir durumda bir satış listesini çekmek için yüzbinlerce kayıt listelenmek zorunda kalabilir bu da 
    sistemi olamyacak bir şekilde kitler.
    -- LAZY LOAD: tablolarda bulunan ilişkiler ilk sorguda yüklenmez, null olarak gelir. eğer ilişkili 
    tablolarda işlemyapılmaya başlanır (yani verilere erişilmeye çalışılır ise ) tekrar ilgili tabloya
    sorgu atılır ve veriler çekilir.
    -- EAGER LOAD: tüm datalar ilk seferinde çekilir.

## ...ToMany 

    OneToMany -> Eğer mappedBy kullanmaz iseniz ilgil tablolar için cross tablo oluşturur.
    Örn:
    mappedBy YOK
    Personel    -> Adres
    OneToMany   -> ManyToOne   // tblpersonel_tbladres cross tablosu oluşur.
    mappedBy EKLERSEN
    Personel                      -> Adres
    OneToMany(mappedBy="adres")   -> ManyToOne   // adres tablosu içine personel_id oluşur
    -----------------------------

    ManyToMany -> Cross tablo oluşur
    mappedBy YOK
    Personel    -> Adres
    OneToMany   -> ManyToOne   // tblpersonel_tbladres  ve tbladres_tblpersonel cross tablosu oluşur.
    mappedBy EKLERSEN
    Personel                      -> Adres
    OneToMany(mappedBy="adres")   -> ManyToOne   //  tbladres_tblpersonel cross tablosu oluşur
    

