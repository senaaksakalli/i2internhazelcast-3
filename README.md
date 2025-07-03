# i2internhazelcast-3
# Hazelcast Java Örneği 

Bu proje, i2i Systems  intern  Programı kapsamında geliştirilmiştir.  
Java uygulaması, **10.000 adet örnek `Person` nesnesini** Hazelcast map yapısına ekler ve ardından bu nesneleri map’ten geri çeker.



##  Kullanılan Teknolojiler

- Java 17  
- Hazelcast (Docker üzerinden)  
- Hazelcast Management Center (Docker üzerinden)  
- IntelliJ IDEA  
- Maven  


## Nasıl Çalıştırılır?

docker run -d --name hazelcast-node -p 5701:5701 hazelcast/hazelcast:latest
Hazelcast veri sunucusunu 5701 portunda arka planda çalıştırır.

docker run --rm --name hazelcast-mc -p 8080:8080 hazelcast/management-center:latest
Hazelcast Management Center'ı 8080 portunda geçici olarak çalıştırır. Tarayıcı üzerinden map içeriğini ve veri dağılımını izlemeyi sağlar 
