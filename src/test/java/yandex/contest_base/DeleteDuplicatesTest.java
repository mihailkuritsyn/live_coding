package yandex.contest_base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;
import yandex.contest_base.DeleteDuplicates;

public class DeleteDuplicatesTest {

  @Test
  public void test1() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("5\n2\n4\n8\n8\n8\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      DeleteDuplicates.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("2\n4\n8\n"));
    }
  }

  @Test
  public void test2() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("5\n2\n2\n2\n8\n8\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      DeleteDuplicates.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("2\n8"));
    }
  }

  @Test
  public void test3() throws Exception {
    StringBuilder sb = new StringBuilder("1000000");
    sb.append("\n2".repeat(1000000));

    try (InputStream userInput = new ByteArrayInputStream(sb.toString().getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      DeleteDuplicates.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("2"));
    }
  }

  @Test
  public void test4() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("1\n2\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      DeleteDuplicates.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertEquals("2\n", consoleOutput);
    }
  }

  @Test
  public void test5() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("0\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      DeleteDuplicates.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
    }
  }
}
