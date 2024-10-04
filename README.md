# REST-Service

用這個專案複習一些基本的 Spring Boot 設定、連線與編寫 API

並導入一些設計模式做為練習

筆記都會寫在每個路徑下

## 環境相關

- IDE: IntelliJ
- OS: Windows 10
- Version: Java 23
- Framework: Spring Boot + Maven

使用 Spring Boot initilzr 產生專案

## 全域設定

- 使用 `application.properties` 設定參數，可以用 `@Value` 或 `@ConfigurationProperties` 引用
- 使用 `application.properties`, `application-dev.properties` 方式設定兩套參數，使用環境變數的方式引用

## DB Connection

### Flow

1. 在 POM 中加入 jpa-starter
2. 使用 JPA 連線資料庫 ORM
3. 透過 `Entity (映射到 DB table 的資料實體)-> DAO (Repository, ORM 提供基本操作介面) -> Service 使用 -> Controller` 呼叫

### 說明

- Entity（PersonEntity）：映射到資料庫的 person 表
- DAO（PersonDAO）：負責與資料庫交互，繼承了 JpaRepository 以簡化 CRUD 操作
- Service（PersonService）：包含業務邏輯，使用 DAO 進行資料庫操作
- Controller（PersonController）：處理 HTTP 請求，調用 Service 層的方法來完成操作

### 痛點筆記

> 新程式碼不要使用 javax!!!!

我一開始參考網路寫法時，使用了 javax 作為 Persistance 套件來源，但一直編譯不過，
書上或是 GPT 都會告訴你你的程式碼沒錯 bla blab bla，
直到我換成 jarkata， Boom! 過了!

Javax 是之前 java EE 時代的產物，現在則推出了新的 jarkata，
兩者是併行的，而 tomcat 10.0.x 版開始，似乎預設是使用 jarkata，並號稱可以兼容 javax
不過似乎我在使用上有點問題，無法!

> 要怎麼看 tomcat 版本?
>
> 打開 pom.xml，點進(進入方式視 IDE 而異) `spring-boot-starter-web` -> `spring-boot-starter-tomcat`
> 就可以看到打到了哪一版的 tomcat
