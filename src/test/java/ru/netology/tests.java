package ru.netology;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import java.lang.management.GarbageCollectorMXBean;

public class tests {
    @Test
    void ShouldReturnDemoAccounts()  {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("12")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("12")
        ;}
}
