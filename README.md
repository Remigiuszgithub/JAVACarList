# Car Management Application

## Opis projektu
Aplikacja do zarządzania listą samochodów, stworzona przy użyciu Spring Boot w architekturze REST API. Obsługuje operacje CRUD (Create, Read, Update, Delete) dla samochodów. Dane przechowywane są w bazie MySQL.

### Funkcjonalności:
- Wyświetlanie listy samochodów.
- Dodawanie nowych samochodów.
- Edytowanie istniejących danych samochodów.
- Usuwanie samochodów z listy.

### Pola samochodu:
- Marka
- Model
- Rok produkcji (liczba dodatnia)
- Pojemność silnika (z jednym miejscem po przecinku)
- Liczba drzwi (3 lub 5)
- Konie mechaniczne (liczba dodatnia)

## Wymagania
- Java 17 lub nowsza
- Maven
- MySQL (np. uruchomiony na XAMPP lub innym serwerze)
- IntelliJ IDEA lub Eclipse (opcjonalnie)

## Instalacja i konfiguracja

1. **Klonowanie repozytorium**
   ```bash
   git clone https://github.com/example/car-management.git
   cd car-management
   ```

2. **Konfiguracja bazy danych**
   W pliku `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nazwabazy
   spring.datasource.username=root
   spring.datasource.password=
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   ```
   - Utwórz bazę danych `nazwabazy` w phpMyAdmin lub innym narzędziu.

3. **Budowanie projektu**
   ```bash
   mvn clean install
   ```

4. **Uruchamianie aplikacji**
   ```bash
   mvn spring-boot:run
   ```

5. **Dostęp do aplikacji**
   Otwórz przeglądarkę i przejdź pod adres: [http://localhost:8080/cars](http://localhost:8080/cars)

## Struktura projektu

- **Model:** Klasa `Car` reprezentuje dane samochodu.
- **Repository:** Interfejs `CarRepository` obsługuje operacje na bazie danych.
- **Controller:** `CarController` obsługuje żądania HTTP dla operacji CRUD.
- **Szablony Thymeleaf:**
  - `index.html`: Lista samochodów.
  - `create.html`: Formularz dodawania samochodu.
  - `update.html`: Formularz edycji samochodu.

## Przykładowe funkcjonalności
1. **Dodawanie nowego samochodu**:
   - Wypełnij formularz na stronie `/cars/create`.
   
2. **Edycja samochodu**:
   - Kliknij "Edytuj" przy odpowiednim samochodzie na stronie głównej.

3. **Usuwanie samochodu**:
   - Kliknij "Usuń" przy odpowiednim samochodzie na stronie głównej.

## Technologie
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## Autor
Projekt stworzony w ramach zaliczenia zajęć z programowania aplikacji webowych w Javie ~ Remigiusz Nowakowski.

