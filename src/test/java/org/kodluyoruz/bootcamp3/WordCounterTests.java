package org.kodluyoruz.bootcamp3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class WordCounterTests {

    @Test
    public void getOutput_WhenInputSentenceGiven5Words_ItShouldReturn5() {
        //Arrange
        Word_Counter sut = new Word_Counter();

        //Act
        int result = sut.getOutput("hi my name is asya");

        //Assert
        assertThat(result).isEqualTo(5);

    }

    @Test
    public void itShouldIgnore_WhenInputSentenceContainsPunctuation() {
        //Arrange
        Word_Counter sut = new Word_Counter();

        //Act
        int result = sut.getOutput("hi, my name is asya.");

        //Assert
        assertThat(result).isEqualTo(5);

    }

    @Test
    public void getOutputError_WhenInputIsNull() {
        //Arrange
        Word_Counter sut = new Word_Counter();

        //Act
        Throwable result = catchThrowable(() -> sut.getOutput(""));

        //Assert
        assertThat(result).isInstanceOf(IllegalArgumentException.class).hasMessage("It can not be null.");


    }

    @Test
    public void itShouldReturn1_whenInputIsSame2Words() {
        //Arrange
        Word_Counter sut = new Word_Counter();

        //Act
        int result = sut.getOutput("Asya asya");

        //Assert
        assertThat(result).isEqualTo(1);
    }

}