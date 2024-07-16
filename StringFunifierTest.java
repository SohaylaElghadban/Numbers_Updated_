import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
class StringFunifierTest {

    @Test
    void getFunnyStringtest() {

        String inputString = "TheQuickBrownFox";

        List<Integer> startIndexes = Arrays.asList(3, 9);
        List<Integer> endIndexes = Arrays.asList(8, 12);
        List<StringOperations> operations = Arrays.asList( new ReverseOperation(), new LowerCaseOperation(), new UpperCaseOperation(), new SortOperation(), new CompressionOperation());

        StringFunifier funifier = new StringFunifier(inputString, startIndexes, endIndexes, operations);

        String expected = "The(BkciuQ)(rown)Fox";

        String result = funifier.getFunnyString();

        assertEquals(expected, result);
    }
    }
