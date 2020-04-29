import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_fizz_when_numbre_is_3() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(3);
        //Then
        Assertions.assertThat(result).isEqualTo("fizz");
    }
    @Test
    public void should_return_buzz_when_numbre_is_5() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(5);
        //Then
        Assertions.assertThat(result).isEqualTo("buzz");
    }
    @Test
    public void should_return_fizz_when_numbre_is_multiple_of_3() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(9);
        //Then
        Assertions.assertThat(result).isEqualTo("fizz");
    }
    @Test
    public void should_return_buzz_when_numbre_is_multiple_of_5() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(10);
        //Then
        Assertions.assertThat(result).isEqualTo("buzz");
    }
    @Test
    public void should_return_fizzbuzz_when_numbre_is_15() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(15);
        //Then
        Assertions.assertThat(result).isEqualTo("fizzbuzz");
    }
    @Test
    public void should_return_fizzbuzz_when_numbre_is_multiple_of_15() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(45);
        //Then
        Assertions.assertThat(result).isEqualTo("fizzbuzz");
    }
    @Test
    public void should_return_number_when_numbre_is_not_multiple_of_3_and_not_mutliple_of_5() {

        //given
        final FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        final String result = fizzBuzz.solution(4);
        //Then
        Assertions.assertThat(result).isEqualTo("4");
    }

}
