package ru.netology;

import org.junit.jupiter.api.Test;

public class tests {
    @Test
// Given - When - Then
    given()
  .baseUri("https://postman-echo.com")
  .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
.when()
  .post("/post")
// Проверки
.then()
  .statusCode(200)
  .body("data": "some value");
}
}
