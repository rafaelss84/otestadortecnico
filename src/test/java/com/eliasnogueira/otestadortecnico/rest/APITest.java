package com.eliasnogueira.otestadortecnico.rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class APITest {

    @Before
    public void preCondicao() {
        baseURI = "http://eliasnogueira.com/apis/triangulo";
        basePath = "api";
        port = 80;
    }

    @Test
    public void testeTrianguloEquilatero() {
        given()
            .param("lado1", "3")
            .param("lado2", "3")
            .param("lado3", "3")
        .when()
            .post("/calcular")
        .then()
            .body("resultado", equalTo("O triângulo é Equilátero"));
    }
}
