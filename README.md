# Thymeleaf ile Kütüphane Uygulaması

#### Uygulamada kullanılan teknolojiler
- Spring Boot
- Maven
- Thymeleaf
- JPA

#### Uygulama Kullanımı
- Proje kullanılmadan önce sisteminize mysql veritabanı kurulmuş olması gerekir. Kurulumu **https://dev.mysql.com/downloads/mysql/** sitesinden kendi işletim sisteminize göre indirip kurabilirsiniz.
- MySQL kurduktan sonra MySQL Workbench kullanarak **uygulamada kullanılan veritabanı** klasöründeki dosyadaki sql komutunu kullanarak MySQL Workbenchdeki query kısmından sql komutunu yazınız ve çalıştırınız **(sql komutlarını teker teker çalıştırınız. Önce create database... kısmı sonra use "veritabanı ismi"  sonunda diğer komutları toplu olarak çalıştırınız)**. **uygulamada kullanılan veritabanı** klasörünü işlemleri yaptıktan sonra proje klasöründen çıkarınız.
- Veritabanı oluşturulduktan sonra **src/main/resources/application.properties** dizinindeki dosyada username,password ve url kısmı değiştirmelidir.username kısmı mysql kurarken oluşturduğunuz username(**root**). password kısmı mysql için kullandığınız password. url kısmında veritabanı ismine göre jdbc:mysql//localhost:3306/(veritabanı ismi)... şeklinde değişitiriniz.
- IDE olarak eclipse kullanılabilir. 
- Çalıştırmak için Linux kullanıcıları proje dizininde  **./mvnw spring-boot:run** komutu kullanarak çalıştırabilir. Ya da eclipse uygulamasında projeyi import edip 

