package yandex.coderun.middle;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;

public class CheapWayTest {

  @Test
  public void testManual() throws Exception {
    String s = """
        3 3
        1 2 1
        3 0 1
        1 1 0
        """;

    String s2 = """
        1 3 4
        4 3 4
        5 4 4
        """;
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      CheapWay.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    String s = """
        5 5
        1   1   1   1   1
        3 100 100 100 100
        1   1   1   1   1
        2   2   2   2   1
        1   1   1   1   1""";
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      CheapWay.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("11"));
    }
  }

  @Test
  public void test2() throws Exception {
    String s = """
        3 3
        1 2 1
        3 0 1
        1 1 0
        """;
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      CheapWay.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("4"));
    }
  }
}
