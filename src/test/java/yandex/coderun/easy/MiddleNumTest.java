package yandex.coderun.easy;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;

public class MiddleNumTest {

  @Test
  public void testManual() throws Exception {
    String s = "1 2 3";

    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      MiddleNum.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    String s = "1 2 3";
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      MiddleNum.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("2"));
    }
  }

  @Test
  public void test2() throws Exception {
    String s = "1000 -1000 0";
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      MiddleNum.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("0"));
    }
  }

  @Test
  public void test3() throws Exception {
    String s = "3 1 3";
    try (InputStream userInput = new ByteArrayInputStream((s).getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      MiddleNum.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("3"));
    }
  }

}
