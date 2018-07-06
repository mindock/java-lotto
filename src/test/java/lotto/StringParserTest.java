package lotto;

import lotto.StringParser;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class StringParserTest {
    @Test
    public void parse() {
        Set<Integer> result = StringParser.parse("1, 2, 3, 4, 5, 6");
        assertThat(result)
                .containsExactly(1,2,3,4,5,6)
                .hasSize(6);
    }
}
