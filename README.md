# IE303.P22 - BTTH4
Sử dụng Spring Boot xây dựng một backend đơn giản gồm các tính năng:
- Truy vấn từ cơ sở dữ liệu danh sách các sản phẩm giày hiện có.
- Trả về API danh sách sản phẩm giày.

## Công nghệ sử dụng

- Java 17
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Lombok

## Cấu trúc thư mục
```
BEshoes/
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/BEshoes/
│       │       ├── model/
│       │       │   └── Shoe.java
│       │       ├── repository/
│       │       │   └── ShoesRepository.java
│       │       ├── controller/
│       │       │   └── ShoesController.java
│       │       └── BEshoesApplication.java
│       └── resources/
│           ├── images/
│           │   ├── img1.png
│           │   ├── img2.png
│           │   ├── img3.png
│           │   ├── img4.png
│           │   ├── img5.png
│           │   ├── img6.png
│           │   ├── image.png
│           │   └── api-json-response.png
│           ├── application.properties
│           ├── data.sql
│           └── product-info.txt
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Cấu hình database

- H2 chạy trong bộ nhớ (`in-memory`)
- Truy cập H2 Console tại: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:shoedb`
- User Name: `sa`, Password: *(để trống)*

## Khởi chạy ứng dụng

1. Tải dự án về và mở thư mục chứa dự án trong terminal hoặc command prompt.
```bash
   git clone https://github.com/vydo4243/IE303-Lab04.git
```

2. Chạy ứng dụng:
   - Cách 1: Dùng Maven (nếu đã cài Maven toàn cục)
      ```bash
      mvn spring-boot:run
      ```
   - Cách 2: Dùng Maven Wrapper (không cần cài Maven)
      ```bash
      ./mvnw spring-boot:run    
      ```
   - Cách 3: Hoặc dùng IDE (VS Code / IntelliJ): Mở file BEshoesApplication.java -> Nhấn Run

3. Truy cập API tại: [http://localhost:8080/api/shoes](http://localhost:8080/api/shoes)

## Demo

- Truy vấn từ cơ sở dữ liệu danh sách các sản phẩm giày hiện có:

![Danh sách sản phẩm giày hiển thị từ bảng 'shoe' trên H2 Console](/src/main/resources/images/image.png)

- Trả về API danh sách sản phẩm giày:

![Kết quả JSON từ API GET /api/shoes hiển thị danh sách sản phẩm giày](/src/main/resources/images/api-json-response.png)
