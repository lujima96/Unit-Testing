import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestDemoJUnitTest {

    private TestDemo testDemo;

    @BeforeEach
    void setUp() {
        testDemo = new TestDemo();
    }

    @ParameterizedTest
    @MethodSource("argumentsForAddPositive")
    void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
        if (!expectException) {
            assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
        } else {
            assertThatThrownBy(() -> testDemo.addPositive(a, b))
                .isInstanceOf(IllegalArgumentException.class);
        }
    }

    static Stream<Arguments> argumentsForAddPositive() {
        return Stream.of(
            arguments(2, 4, 6, false),
            arguments(3, 5, 8, false),
            arguments(-1, 2, 0, true),
            arguments(2, -3, 0, true),
            arguments(0, 5, 0, true)
        );
    }

    @Test
    void assertThatHalvedWorksCorrectly() {
        assertThat(testDemo.halved(4)).isEqualTo(2);
        assertThat(testDemo.halved(-3)).isEqualTo(-1);
        assertThat(testDemo.halved(10)).isEqualTo(5);
    }

    @Test
    void assertThatNumberSquaredIsCorrect() {
        TestDemo spyDemo = spy(testDemo);
        doReturn(5).when(spyDemo).getRandomInt();
        assertThat(spyDemo.randomNumberSquared()).isEqualTo(25);
    }
}