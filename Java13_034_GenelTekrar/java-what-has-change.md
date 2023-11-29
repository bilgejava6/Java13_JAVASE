# JAVA DA VERSION DEGISIMLERININ TARIHCESI VE ICERIKLERI

## Java 21 Features 19 Eylül 2023

#### # String Templates

```
String name= "Alex";
String message = STR."Greetings \{ name }!";
System.out.println(message);

Greetings Alex!
``` 

```
String name= "Alex";
//concatenation
message = "Greetings " + name + "!";
//String.format()
message = String.format("Greetings %s!", name);	//concatenation
//MessageFormat
message = new MessageFormat("Greetings {0}!").format(name);
//StringBuilder
message = new StringBuilder().append("Greetings ").append(name).append("!").toString();
```

```
String name = "Lokesh";	

//STR
String message = STR."Greetings \{name}.";

//FMT
String message = STR."Greetings %-12s\{name}.";

//RAW
StringTemplate st = RAW."Greetings \{name}.";
String message = STR.process(st);
```

```
//variable
message = STR."Greetings \{name}!";

//method
message = STR."Greetings \{getName()}!";

//field
message = STR."Greetings \{this.name}!";
```

```
int x = 10, y = 20;
String s = STR."\{x} + \{y} = \{x + y}";	//"10 + 20 = 30"
```

````
Boolean result = true;  //Can be false also

String name = "Alex";
String msg = STR."The record for \{name} \{result ? "does" : "does not"} exist in the database.";

System.out.println(msg);  //Prints: The record for Alex does exist in the database.
````

#### # Virtual Thread

    Performans denemeleri
```
final AtomicInteger atomicInteger = new AtomicInteger();

Runnable runnable = () -> {
  try {
    Thread.sleep(Duration.ofSeconds(1));
  } catch(Exception e) {
      System.out.println(e);
  }
  System.out.println("Work Done - " + atomicInteger.incrementAndGet());
};
```

```
Instant start = Instant.now();

try (var executor = Executors.newFixedThreadPool(100)) {
  for(int i = 0; i < 10_000; i++) {
    executor.submit(runnable);
  }
}

Instant finish = Instant.now();
long timeElapsed = Duration.between(start, finish).toMillis();  
System.out.println("Total elapsed time : " + timeElapsed);	

Çıktı
Total elapsed time : 101152 //Approx 101 seconds
```
```
Instant start = Instant.now();

try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
  for(int i = 0; i < 10_000; i++) {
    executor.submit(runnable);
  }
}

Instant finish = Instant.now();
long timeElapsed = Duration.between(start, finish).toMillis();  
System.out.println("Total elapsed time : " + timeElapsed);	

Çıktı
Total elapsed time : 1589 //Approx 1.5 seconds
```

    Nasıl Oluşturulur?

```
Runnable runnable = () -> System.out.println("Inside Runnable");
Thread.startVirtualThread(runnable);

//or

Thread.startVirtualThread(() -> {
	//Code to execute in virtual thread
	System.out.println("Inside Runnable");
});
```

```
Runnable runnable = () -> System.out.println("Inside Runnable");

Thread.Builder builder = Thread.ofVirtual().name("JVM-Thread");

Thread t1 = builder.start(runnable); 
Thread t2 = builder.start(runnable);
```

```
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    IntStream.range(0, 10_000).forEach(i -> {
        executor.submit(() -> {
            Thread.sleep(Duration.ofSeconds(1));
            return i;
        });
    });
}
```

## Java 17 FEATURES 14 Eylül 2021

        Java 17,  14 Eylül 2021'de yayınlandı. Java 17, Java 11 ve Java 8 gibi bir LTS ( Uzun Süreli Destek ) sürümüdür. 
    Spring 6 ve Spring boot 3,  Java 17 için birinci sınıf desteğe sahip olacaktır.

    Aşağıda listelenen 14 JEP, Java 17'nin bir parçasıdır.
    
    ( JEP-306 ) Daima Katı Kayan Nokta Semantiğini Geri Yükle
    ( JEP-356 ) Geliştirilmiş Sözde Rastgele Sayı Üreteçleri
    ( JEP-382 ) Yeni macOS İşleme Hattı
    ( JEP-391 ) macOS/AArch64 Bağlantı Noktası
    ( JEP-398 ) Uygulama API'sinin Kaldırılması İçin Kullanımdan Kaldırılması
    ( JEP-403 ) JDK İçlerini Güçlü Bir Şekilde Kapsüller
    ( JEP-406 ) Anahtar için Desen Eşleştirme (Önizleme)
    ( JEP-407 ) RMI Aktivasyonunu Kaldır
    ( JEP-409 ) Mühürlü Sınıflar
    ( JEP-410 ) Deneysel AOT ve JIT Derleyicisini Kaldırma
    ( JEP-411 ) Güvenlik Yöneticisinin Kaldırılması İçin Kullanımdan Kaldırılması
    ( JEP-412 ) Yabancı Fonksiyon ve Bellek API'si (Kuluçka Makinesi)
    ( JEP-414 ) Vektör API (İkinci İnkübatör)
    ( JEP-415 ) Bağlama Özel Seri Durumdan Çıkarma Filtreleri

## Java 14 Features 17 Mart 2020
#### # Traditional Approach
```
Customer customer = null;
String customerName;

if(customer instanceof PersonalCustomer)
{
  PersonalCustomer pc = (PersonalCustomer) customer; //Redundant casting
  customerName = String.join(" ", pc.getFirstName(), pc.getMiddleName(), pc.getLastName());
}
else if(customer instanceof BusinessCustomer)
{
  BusinessCustomer bc = (BusinessCustomer) customer; //Redundant casting
  customerName = bc.getLegalName();
}
```
#### # Pattern Matching
```
Customer customer = null;
String customerName;

if(customer instanceof PersonalCustomer pc)
{
  customerName = String.join(" ", pc.getFirstName(), pc.getMiddleName(), pc.getLastName());
}
else if(customer instanceof BusinessCustomer bc)
{
  customerName = bc.getLegalName();
}
```
```
//Allowed to use s in complex condition
if (obj instanceof String s && s.startsWith("a")) {
  System.out.println(s);
}

//compiler error
if (obj instanceof String s || s.startsWith("a")) {
  System.out.println(s);  
}
```
#### # Text Block Syntax
```
String string = "Hello";
String textBlock = """
					World""";

String joinedString =  string + textBlock;

System.out.println(joinedString);
```
```
String dbSchema = 	"""
			CREATE TABLE 'TEST'.'EMPLOYEE'
			(
			  'ID' INT NOT NULL DEFAULT 0 ,
			  'FIRST_NAME' VARCHAR(100) NOT NULL ,
			  'LAST_NAME' VARCHAR(100) NULL ,
			  'STAT_CD' TINYINT NOT NULL DEFAULT 0
			);
					""";

System.out.println(dbSchema);
print:
|CREATE TABLE 'TEST'.'EMPLOYEE'
|(
|  'ID' INT NOT NULL DEFAULT 0 ,
|  'FIRST_NAME' VARCHAR(100) NOT NULL ,
|  'LAST_NAME' VARCHAR(100) NULL ,
|  'STAT_CD' TINYINT NOT NULL DEFAULT 0
|);
```
#### # NullPointerException Details
    -XX:+ShowCodeDetailsInExceptionMessages
    bu kodu kullanarak istisnaların detaylarını görebilirsiniz.
    DİKKAT!!! bunu açmak uygulamanını performansını bir miktar düşürebilir.
#### # Java Records
        enum Gibi , bir record da Java'da özel bir sınıf türüdür. record lar, yalnızca düz veri taşıyıcısı görevi görecek
    bir sınıfın oluşturulduğu yerlerde kullanılmak üzere tasarlanmıştır .
        Kayıtlar, etki alanı modeli sınıfları (potansiyel olarak ORM yoluyla kalıcı hale getirilecek) veya veri
    aktarım nesneleri ( DTO'lar ) gibi şeyleri modellerken ideal adaylardır .
```
public record Employee(Long id, String firstName, String lastName, String email, int age) { }
Employee e = new Employee(1l, "Lokesh", "Gupta", "howtodoinjava@gmail.com", 38);

System.out.println( e.id() );     //1
System.out.println( e.email() );  //howtodoinjava@gmail.com
System.out.println( e ); //Employee[id=1, firstName=Lokesh, ...]
```
    record lar iş duumuna göre özelleştirilebilir.
```
public record Employee(Long id, String firstName, String lastName, String email, int age) {

  public Employee(Long id, String firstName, String lastName, String email, int age) {
    Objects.requireNonNull(id);
    Objects.requireNonNull(email);

    if (age < 18) {
      throw new IllegalArgumentException("You cannot hire a minor as employee");
    }
  }

  //Other methods
}
```
    recordlara metod ve alan ekleme yapabiliriz
```
public record Employee(Long id, String firstName, String lastName, String email, int age) {

  static boolean minor;

  public boolean isMinor() {
    return minor;
  }

  public String fullName() {
    return firstName + " " + lastName;
  }

  public Employee {
    if (age < 18) {
      minor = true;
    }
  }
}
```
    recordlar generic typle olarak kullanılabilirler.
```
record Container<T>(int id, T value) {
}
Container<Integer> intContainer = new Container<>(1, Integer.valueOf(1));
Container<String> stringContainer = new Container<>(1, "1");

Integer intValue = intContainer.value();
String strValue = stringContainer.value();
```
#### # Java Enhanced Switch Expressions
```
public class SwitchExpressions
{
	public static void main(String[] argv)
	{
		System.out.println(isWeekDayV1_1(Day.MON));		//true
		System.out.println(isWeekDayV1_2(Day.MON));		//true
		System.out.println(isWeekDayV2(Day.MON));		//true
	}

	//1 - Return value directly

	enum Day {
		MON, TUE, WED, THUR, FRI, SAT, SUN
	};

	public static Boolean isWeekDayV1_1 (Day day)
	{
		Boolean result = switch(day) {
			case MON, TUE, WED, THUR, FRI -> true;
			case SAT, SUN -> false;
		};
		return result;
	}

	public static Boolean isWeekDayV1_2 (Day day)
	{
		Boolean result = switch(day) {
			case MON, TUE, WED, THUR, FRI : yield true;
			case SAT, SUN : yield false;
		};
		return result;
	}

	//2 - Multiple statements in case block

	public static Boolean isWeekDayV2 (Day day)
	{
		Boolean result = switch(day) {
			case MON, TUE, WED, THUR, FRI ->
			{
				System.out.println("It is WeekDay");
				yield true;
			}
			case SAT, SUN ->
			{
				System.out.println("It is Weekend");
				yield false;
			}
		};
		return result;
	}
}
```

## Java 12 Features 19 Mart 2019
#### # Stream API Collectors.teeing()
    iki koleksiyonu birleştirirken min ve max değerleri bulmak için kullanılan özel bir kullanım.
```
SalaryRange salaryRange = Stream
            .of(56700, 67600, 45200, 120000, 77600, 85000)
            .collect(teeing(
                    minBy(Integer::compareTo), 
                    maxBy(Integer::compareTo), 
                    SalaryRange::fromOptional));
```
#### # Compact Numbers
```
NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US,
                                  NumberFormat.Style.SHORT);
 
String formattedString = formatter.format(25000L);    //25K
```
#### # Unicode 11 

#### # switch...case
```
boolean isWeekend = switch (day) 
{
  case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
 
  case SATURDAY, SUNDAY -> true;
 
  default -> throw new IllegalStateException("Illegal day entry :: " + day);
};
 
System.out.println(isWeekend);  //true or false - based on current day
```

## Java 11 Features 2018 Eylül

#### # HTTP Api

    HttpClient eklenmiştir ve daha gelişmiş bir kullanım sunar.
```
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
 
final List<URI> uris = Stream.of(
                "https://www.google.com/",
                "https://www.github.com/",
                "https://www.yahoo.com/"
                ).map(URI::create).collect(toList());      
 
HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();
 
CompletableFuture[] futures = uris.stream()
                  .map(uri -> verifyUri(httpClient, uri))
                  .toArray(CompletableFuture[]::new);     
 
CompletableFuture.allOf(futures).join();           
 
private CompletableFuture<Void> verifyUri(HttpClient httpClient, 
                                          URI uri) 
{
    HttpRequest request = HttpRequest.newBuilder()
                        .timeout(Duration.ofSeconds(5))
                        .uri(uri)
                        .build();
 
    return httpClient.sendAsync(request,HttpResponse.BodyHandlers.ofString())
                  .thenApply(HttpResponse::statusCode)
                  .thenApply(statusCode -> statusCode == 200)
                  .exceptionally(ex -> false)
                  .thenAccept(valid -> 
                  {
                      if (valid) {
                          System.out.println("[SUCCESS] Verified " + uri);
                      } else {
                          System.out.println("[FAILURE] Could not " + "verify " + uri);
                      }
                  });                                    
}
```
#### # Collection To Array
```
public class HelloWorld 
{
    public static void main(String[] args) 
    {
      List<String> names = new ArrayList<>();
      names.add("alex");
      names.add("brian");
      names.add("charles");
 
      String[] namesArr1 = names.toArray(new String[names.size()]);   //Before Java 11
 
      String[] namesArr2 = names.toArray(String[]::new);          //Since Java 11
    }
}
```

## Java 10 Features 

        Java 10 9 dan sonra çok hızlı çıktı ve heyecan verici bir özellik getirmedi. değişkenlerin 
    tanımlanmasında biraz daha global olcak şekilde bir tür tanımı getirerek var değişkenini haya-
    tımıza sokmuştur.
    Şu şekilde kullanılabilir;
```
var blogName = "howtodoinjava.com";   //Local variables with initializer

for (var object : dataList){      //index in enhanced for-loop

    System.out.println( object );
}

for (var i = 0 ; i < dataList.size(); i++ ){     //local variables in for-loop

    System.out.println( dataList.get(i) );
}

```
    ancak şu şekilde kullanılamaz;
```
public class Application {

	//var firstName;	//Not allowed as class fields

	//public Application(var param){ }	//Not allowed as parameter 

	//try{ } catch(var ex){	} //Not allowed as catch formal 

	//public var demoMethod(){ return null; } //Not allowed in method return type

	//public Integer demoMethod2( var input ){ return null;	} //Not allowed in method parameters
}
```

## Java 9 Features - September 2017

#### # Java Module - JPMS (Java Platform Modül Sistemi)
        Herhangi bir programlama dilinde modüller, modülü ve onun diğer modüllerle ilişkisini açıklayan meta verilerle 
    birlikte kod içeren (paket benzeri) yapılardır. İdeal olarak, bu yapılar derleme zamanından çalışma zamanına 
    kadar tanınabilir. Herhangi bir uygulama genellikle iş hedeflerini gerçekleştirmek için birlikte çalışan birden fazla modülün birleşimidir.

        Uygulama mimarisi açısından bir modülün belirli bir iş yeteneğini temsil etmesi gerekir. Bu yetenek için 
    kendi kendine yeterli olmalı ve modül işlevselliğini kullanmak için yalnızca arayüzleri kullanıma sunmalıdır. 
    Görevlerini tamamlamak için açıkça beyan etmesi gereken diğer modüllere bağımlı olabilir.
    Yani kısacası bir modül üç temel prensibe bağlı kalmalıdır :

    1. Güçlü Kapsülleme
        Kapsülleme , modülün doğru şekilde kullanılması için bilinmesi gerekli olmayan uygulama ayrıntılarının 
    gizlenmesi anlamına gelir. Amaç, kapsüllenmiş kodun, modülün kullanıcılarını etkilemeden serbestçe değişebilmesidir.
    burada dikkat edilmesi gereken konu şudur, normalde bir kod tersine mühendislikle içinde barındırdığı private alanlara
    erişimi engelleyemezdi ancak modül ile birlikte bu artık engellendi.
    2. Kararlı Soyutlama
        Soyutlama, arayüzleri (yani genel API'leri) kullanarak modül işlevselliğinin ortaya çıkarılmasına yardımcı olur. 
    Modül kodu içindeki iş mantığını veya uygulamayı değiştirmek istediğinizde değişiklikler modül kullanıcıları için şeffaf olacaktır.
    3. Açık bağımlılıklar
        Modüller diğer modüllere de bağımlı olabilir. Bu dış bağımlılıklar modül tanımının kendisinin bir parçası olmalıdır.
    Modüller arasındaki bu bağımlılıklar genellikle grafiklerle temsil edilir. Grafiği uygulama düzeyinde gördüğünüzde 
    uygulamanın mimarisini daha iyi anlayacaksınız.

    ## Sorun
        Java 9'dan önce, ilgili sınıfları iş yeteneklerine göre gruplamak için ' paketlerimiz ' vardı . Paketlerin yanı sıra ,
    diğer sınıflara veya paketlere nelerin görüneceğini ve nelerin gizleneceğini kontrol etmek için 
    ' erişim değiştiricilerimiz ' vardı .
        Ancak açık bağımlılıklar her şeyin dağılmaya başladığı yerdir. Java'da bağımlılıklar ' import ' ifadeleriyle 
    bildirilir; ancak bunlar kesinlikle 'derleme zamanı' yapılarıdır.
        Kod derlendikten sonra çalışma zamanı bağımlılıklarını açıkça belirtecek bir mekanizma yoktur. Aslında, 
    Java çalışma zamanı bağımlılığı çözümü o kadar sorunlu bir alandır ki, bu sorunla mücadele etmek için gradle 
    veya maven gibi özel araçlar oluşturulmuştur .
        Ayrıca birkaç çerçeve, örneğin Spring önyükleme projeleri gibi tüm çalışma zamanı bağımlılıklarını bir araya getirmeye başladı .

    ## JPMS Sorunu Nasıl Çözer?
        Yeni Java 9 modülleri ile iyi yapılandırılmış uygulamalar yazma konusunda daha iyi bir yeteneğe sahip olacağız. 
    Bu geliştirme iki alana ayrılmıştır:
    # JDK'nın kendisini modülerleştirin.
    # Diğer uygulamaların kullanabileceği bir modül sistemi sunun.
    
    Java Temel Modülü
        Java 9 Modül Sisteminde “ java.base ” modülü bulunmaktadır. Temel Modül olarak bilinir . Bağımsız bir modüldür 
    ve başka hiçbir modüle bağlı DEĞİLDİR. Varsayılan olarak diğer tüm modüller “ java.base ” e bağımlıdır .
        Java 9'da modüller paketleri kapsüllemede ve bağımlılıkları yönetmede bize yardımcı olur. Yani tipik olarak,
        - sınıf, alanların ve yöntemlerin bir kabıdır
        - paket, sınıfların ve arayüzlerin kapsayıcısıdır
        - bir modül paketlerin bir kabıdır
    ## Modüler ve modüler olmayan kod arasındaki fark
        Aranacak belirli şeyleri bilmiyorsanız normal kod ile modüler kod arasında önemli bir fark hissetmezsiniz . Örneğin
    * Bir modül genellikle kökünde bir dosya bulunan bir jar dosyasıdır.module-info.class
    * Bir modülü kullanmak modulepathiçin classpath. Sınıf yoluna eklenen modüler bir jar dosyası normal jar dosyasıdır 
    ve module-info.classdosya göz ardı edilecektir.

#### # Interface Private Methods
        Interface ler java7 ve öncesi sürümlerde sadece basit method tanımlarını içerebiliyordu. 
```
public interface CustomInterface {
    public abstract void method();
}
```
        Java 8 ile birlikte genel soyutlamanın yanısıra, statik ve default yöntemlerle gövdesi yazılan 
    methodlar yazılabiliyordu.
```
public interface CustomInterface {
     
    public abstract void method1();
     
    public default void method2() {
        System.out.println("default method");
    }
     
    public static void method3() {
        System.out.println("static method");
    }
}
```
        Java 9 ile birlikte artık private olarak tanımlanan belli kurallara bağlı olarak method gövdelerini yazabiliyor
    olacağız.
        * private interface method abstract olamaz
        * private method yanlızca interface içinde kullanılabilir.
        * private statik method, diğer statik ve statik olmayan methodlarda kullanılabilir.
        * private statik olmayan methodlar(public static method), private statik methodların içinde kullanılamazlar.
```
public interface CustomInterface {
     
    public abstract void method1();
     
    public default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method");
    }
     
    public static void method3() {
        method5(); //static method inside other static method
        System.out.println("static method");
    }
     
    private void method4(){
        System.out.println("private method");
    } 
     
    private static void method5(){
        System.out.println("private static method");
    } 
}
 
```
    Bir örnek;
```
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
 
public interface CustomCalculator 
{
    default int addEvenNumbers(int... nums) {
        return add(n -> n % 2 == 0, nums);
    }
 
    default int addOddNumbers(int... nums) {
        return add(n -> n % 2 != 0, nums);
    }
 
    private int add(IntPredicate predicate, int... nums) { 
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }
}
```

## Java 8 Features - 18 March 2014

#### # Lambda Expressions

    Genel olarak programlama dillerinde, bir Lambda ifadesi (veya fonksiyonu), yani herhangi bir ad veya 
    tanımlayıcı olmadan, formal parametrelerin bir listesi ve bir gövdeye sahip anonim bir fonksiyondur. 
    Bir ok işareti (->), parametre listesini ve gövdeyi ayırmak için kullanılır.

```
// Şu şekilde bir syntax e sahiptir.
// (parameters -> expression)
// Şu şekilde kullanılabilir.
Operator<Integer> addOperation = (a, b) ->  a + b;
System.out.println(addOperation.process(3, 3));     //Prints 6
// Bir array list'in içindeki dataları işaretmek içinde kullanılabilir.
pointList.forEach( p ->  { System.out.println(p); } );
```
        Ayrıca fonksiyonel programlamada çok kullanışlı olduğu kesindir. Söz dizimleri kısa ve anlaşılırdır. Buna bir
    örnek vererek bitirelim.
```
//Using lambda expression Java8
Operator<Integer> addOperation = (a, b) -> a + b;

//Using anonymous class Java8 Before
Operator<Integer> addOperation = new Operator<Integer>() {
  @Override
  public Integer process(Integer a, Integer b) {
    return a + b;
  }
};
```

#### # FunctionalInterface 
        Kural olarak, işlevsel bir arayüz tam olarak bir soyut yöntem içerebilir. Bu işlevsel arayüzlere 
    Tek Soyut Yöntem arayüzleri (SAM Arayüzleri) de denir. Java da bu kullanıma örnek yapılar vardır.Mesela;
```
@FunctionalInterface
public interface Comparator<T> {
	int compare(T o1, T o2);
	boolean equals(Object obj);

	//and multiple default methods...
}
```
        Karşılaştırıcı arayüzünde yalnızca iki soyut yöntem vardır compare()ve equals(). Ancak equals() işlevi 
    Object sınıfından miras alınmıştır , dolayısıyla sayılmaz. Bu iki yöntem dışındaki diğer tüm yöntemler 
    varsayılan yöntemlerdir . Dolayısıyla Karşılaştırıcı, işlevsel bir arayüz olarak tanımlanmaya hak kazanmıştır.
    yukarıda ki sınıfı kullanarak bir örnek vermek gerekirse;
```

Comparator<User> compareById = Comparator.comparing(e -> e.getId());

Comparator<User> compareByFirstName = Comparator.comparing(e -> e.getFirstName());
```
    DİKKAT!!!
    @FunctionalInterface. Bu ek açıklamanın birincil kullanımı, arayüzün tam olarak tek bir soyut yöntemin 
    sözleşmelerini ihlal etmesi durumunda derleyici düzeyindeki hatalar içindir .

#### # StreamAPI
        Çok önemli bir içerik ve kullanımdır. İlk olarak Stream tanımını iyi yapmak gerekir, bunu anlamak için öncelikle
    şöyle düşünelim, youtube da video izlerken performans ve akışın sürekliliği için videolar belli bir dizilimde 
    parça parça çekilir ve video olarak izlenir.bu sayede sunucuya ve kullanıcının internetine minimum yük biner. İşte
    bu yapıya Stream-Akış denir.
        Burada önemli bir fark vardır, Array ve Stream farkı. Bir Array veri yapısının tüm değerlerini tutan bir bellek
    içi veri yapısıdır. Koleksiyondaki her öğenin koleksiyona eklenmeden önce hesaplanması gereklidir. Ancak Stream da kavramsal
    olarak öğelerin talep üzerine hesaplanması yapılır.

#### # Optionals

#### # New Date And Time API - LocalDate v.s.

