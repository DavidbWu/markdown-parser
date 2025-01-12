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

    // either use absolute path or use the commandline command from lab4?
    @Test
    public void testGetLinkTry() throws IOException{
        String a = Files.readString(Path.of("test-file.md"));
        // absolute path /Users/fanwu/Documents/GitHub/markdown-parser/

        assertEquals(List.of("https://something.com","some-thing.html"), MarkdownParse.getLinks(a));
    }

    // either use absolute path or use the commandline command from lab4
    @Test
    public void testTwoGetLinkTry() throws IOException{
        // absolute path /Users/fanwu/Documents/GitHub/markdown-parser/
        String a = Files.readString(Path.of("test-file2.md"));
 
        assertEquals(List.of(), MarkdownParse.getLinks(a));
    }

    //2022/07/12 cse15l lab5 create 1 fail inducing test
    @Test
    public void testThreeGetLinkTry() throws IOException{
        // absolute path /Users/fanwu/Documents/GitHub/markdown-parser/
        String a = Files.readString(Path.of("test-file-lab5.md"));
 
        assertEquals(List.of(), MarkdownParse.getLinks(a));
    }
}