package yandex.contest_base;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;
import yandex.contest_base.Anagrams;

public class AnagramsTest {

  @Test
  public void testManual() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "qui\niuq\n".getBytes())) {

      System.setIn(userInput);

      Anagrams.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "qui\niuq\n".getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      Anagrams.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("1"));
    }
  }

  @Test
  public void test2() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "zprl\nzprc\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      Anagrams.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("0"));
    }
  }

}
