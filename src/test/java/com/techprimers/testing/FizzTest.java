package com.techprimers.testing;

import org.junit.jupiter.api.*;

public class FizzTest {

    public FizzBuzz fB;

    @BeforeEach
    public void setUp() {
        fB = new FizzBuzz();
    }


    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }
}
