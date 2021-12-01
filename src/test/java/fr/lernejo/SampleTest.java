package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    private final Sample Sample = new Sample();
    @Test
    void fact_zero_so_go_at_one() {
        int n = 0;
        int factzero = Sample.fact(n); // (2)
        Assertions.assertThat(factzero).as("factoriel de zero")
            .isEqualTo(1); // (3)
    }
    @Test
    void fact_3_so_go_at_6() {
        int n = 3;
        int fact3 = Sample.fact(n); // (2)
        Assertions.assertThat(fact3).as("factoriel de 3")
            .isEqualTo(6); // (6)
    }

    @Test
    void fact_by_zero_should_produce_an_exception() {
        int n = -3;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(n));
    }
    @Test // (1)
    void simple_addition() {
        int a=3;
        int b=3;
        int result = Sample.op(fr.lernejo.Sample.Operation.ADD, a, b); // (2)

        Assertions.assertThat(result) // (3)
            .as("addition of 3 by 3")
            .isEqualTo(6); // (6)
    }

    @Test // (1)
    void simple_multiplication() {
        int a=3;
        int b=3;
        int result = Sample.op(fr.lernejo.Sample.Operation.MULT, a, b); // (2)

        Assertions.assertThat(result) // (3)
            .as("multiplication of 3 by 3")
            .isEqualTo(9); // (9)
    }


}
