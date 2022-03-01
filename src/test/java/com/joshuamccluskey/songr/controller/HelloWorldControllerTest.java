package com.joshuamccluskey.songr.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    @Test
    void test_helloWorld() {
        HelloWorldController cut = new HelloWorldController();
        cut.helloWorld();
        assertTrue(true, "Yo something wrong with hellWorld()");
    }
}