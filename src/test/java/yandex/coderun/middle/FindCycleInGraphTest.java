package yandex.coderun.middle;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;

public class FindCycleInGraphTest {

  @Test
  public void testManual() throws Exception {
//    String s = """
//        3
//        0 1 1
//        1 0 1
//        1 1 0
//        """;

//    String s = """
//        5
//        0 1 0 0 0
//        1 0 0 0 0
//        0 0 0 1 1
//        0 0 1 0 1
//        0 0 1 1 0
//        """;

//    String s = """
//        4
//        0 0 1 0
//        0 0 0 1
//        1 0 0 0
//        0 1 0 0
//        """;

    String s = """
        6
        0 1 0 0 0 0
        1 0 1 0 0 0
        0 1 0 1 0 1
        0 0 1 0 1 0
        0 0 0 1 0 1
        0 0 1 0 1 0
        """;
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      FindCycleInGraph.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    String s = """
        3
        0 1 1
        1 0 1
        1 1 0
        """;

    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      FindCycleInGraph.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("YES"));
      assertTrue(consoleOutput.contains("3\n1 2 3"));
    }
  }

  @Test
  public void test2() throws Exception {
    String s = """
        4
        0 0 1 0
        0 0 0 1
        1 0 0 0
        0 1 0 0""";
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      FindCycleInGraph.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("NO"));
    }
  }

  @Test
  public void test3() throws Exception {
    String s = """
        5
        0 1 0 0 0
        1 0 0 0 0
        0 0 0 1 1
        0 0 1 0 1
        0 0 1 1 0
        """;

    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      FindCycleInGraph.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("YES"));
      assertTrue(consoleOutput.contains("3\n3 4 5"));
    }
  }

  @Test
  public void test4() throws Exception {
    String s = """
        6
        0 1 0 0 0 0
        1 0 1 0 0 0
        0 1 0 1 0 1
        0 0 1 0 1 0
        0 0 0 1 0 1
        0 0 1 0 1 0
        """;

    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      FindCycleInGraph.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("YES"));
      assertTrue(consoleOutput.contains("3\n3 4 5"));
    }
  }
}
