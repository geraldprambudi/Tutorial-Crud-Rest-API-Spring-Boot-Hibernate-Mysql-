# Tutorial-Crud-Rest-API-Spring-Boot-Hibernate-Mysql-
Tutorial Crud Rest Api Spring Boot Mysql Hibernate Flyway Lombok

1. Download Source Code
2. Aktifkan Xampp atau Lampp
3. Buka cmd lalu menuju mysql dengan perintah dibawah ini (XAMPP)
```
cd /xampp/mysql/bin
```
Lalu Ketikan
```
mysql -u root -p
```
Lalu Ketikan dibawah ini
```
  mysql> create database siupdb 
  mysql> create user 'siupdbuser'@'%' identified by 'siup123'; -- Creates the user
  mysql> grant all on siupdb.* to 'siupdbuser'@'%'; -- Gives all the privileges to the new user on the newly created database
```
```
name database : siupdb
nama user     : siupdbuser
password      : siup123
```
3. Import project Ke eclipse atau netbeans atau intelij IDEA
4. Jalankan dengan buka terminal lalu ketikan $ mvn clean spring-boot:run
5. Finish

