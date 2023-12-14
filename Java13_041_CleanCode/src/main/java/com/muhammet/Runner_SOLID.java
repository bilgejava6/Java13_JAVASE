package com.muhammet;

public class Runner_SOLID {
    public static void main(String[] args) {
        /**
         * SOLID - ACID - AGILE - Design Patterns
         *
         * Amaç;
         * 1- Kodlamanın esnek olması, genişleyebilir olması
         * 2- Kodlarımız daha anlaşılır olur, okunurluğu artar.
         * 3- Kodlarımız daha modüler hale gelir. Bu nedenle  tekrar kullanılabilirliği artar,
         * genişleyebilir
         * 4- Kodlarımız daha test edilebilir olur.
         * 5- SOLID yazarak kodlarınızın maliyetini düşürürsünüz.
         *
         * S - Single Responsibility Principle
         * Interface, Class, Methodlar tüm bu kodlamalarda kod yapılarımızın sadece tek bir işi olmalıdır.
         * buna olabildiğince dikkat etmeliyiz.
         * IUserRepository -> sadece kullanıcı ile ilgili DB işlemlerini içerir.
         * ICrud, IService -> Belli kuralları yazılım içerisinde uygulamak için arayüzler oluşturmak.
         * bylece kodlamalarda işlem bütünlüğünü sağlarız.
         * save(T entity), findOptionalById(Long id), deleteById(Long id)
         *
         * O - Open Closed Principle
         * Kodlarımız genişlemeye açık, değişime kapalı olmalıdır.
         * /// YANLIŞ : musteriKayit(); -> kullaniciBul(Long id);
         * --> Servis Katmanı (UserService, ProductService v.s.)-> findAll(), findById(T t), findOptionalBy<T>(U u);
         * ----> kod eklemek, miras almak, yeni method ve sınıflarla uygulamayı genişletmek.
         * Uygulamanını genel çerçevesini belirler buna uygun şekilde abstract class lar tanımlar bunun üzerinde
         * geliştirme ve genişlemelerinizi yaparsınız.
         *
         *
         * L - Liskov Substitution Principle
         * Gereksiz method kullanımlarından olduğu kadar uzaklaşalım. Bir den çok aynı işi yapan sınıf içi methodlar
         * var ise bunlar miras alınrak kullanılabilir.
         *
         *
         * I - Interface Segregation Principle
         * Uygulamalarımız içinde sınıflar ve methodlarımızın belli kalıplara uymasını isteriz. Bunu sağlayabilmek için
         * interface lerden yararlanırız. Ancak Dikkat etmeniz gereken husus şudur ki; Her bir sınıf için ayrı
         * interface ler oluşturmamalısınız. Ortak kullanılan methodlar için ortak interface ler oluşturmalısınız.
         *
         *
         * D - Dependency Inversion Principle
         * Bir projesi yazarken ortak alanların üst sınıflar(parent) yardımıyla kodlanmasını sağlarız ve bu sınıfları
         * diğer sınıflara miras olarak geçeriz. Bu sayede kodlarımızın tekrar kullanılabilirliğini arttırırız. Ancak
         * kod ilerledikçe ve karmalıklık arttıkça işler karışır ve sınıfların bir birlerine olan bağlılıkları artar.
         *
         * Polymorphism -> Çok biçimlilik
         * AH class
         * B class -> A, E class A, G class A
         * H class -> B, T class G
         *
         *
         */
    }
}
