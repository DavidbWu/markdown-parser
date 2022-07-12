import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // either use absolute path or use the commandline command from lab4
    @Test
    public void testGetLinkTry() throws IOException{
        String a = Files.readString(Path.of("/Users/fanwu/Documents/GitHub/markdown-parser/test-file.md"));

        assertEquals(List.of("https://something.com","some-thing.html"), MarkdownParse.getLinks(a));
    }

    // either use absolute path or use the commandline command from lab4
    @Test
    public void testTwoGetLinkTry() throws IOException{
        String a = Files.readString(Path.of("/Users/fanwu/Documents/GitHub/markdown-parser/test-file2.md"));
 
        assertEquals(List.of("https://something.com","some-thing.html"), MarkdownParse.getLinks(a));
    }

}