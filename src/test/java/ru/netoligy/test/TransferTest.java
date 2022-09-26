package ru.netoligy.test;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

class TransferTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

}
