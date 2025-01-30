package tinkoff.ira;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;

public class SecondTaskTest {

  @Test
  public void test1() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "3\n15\n67\n5".getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      SecondTask.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("14\n67\n-1\n"));
    }
  }

  @Test
  public void test2() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "3\n15\n67\n5".getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      SecondTask.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("14\n67\n-1\n"));
    }
  }
}