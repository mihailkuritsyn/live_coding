package yandex.contest_base;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import yandex.contest_base.BinVector;

public class BinVectorTest {

  @Test
  public void test1() throws Exception {
    String[] arguments = new String[]{"", "CONSOLE"};
    try (MockedStatic mockedStatic = Mockito.mockStatic(BinVector.class,
        Mockito.CALLS_REAL_METHODS); InputStream userInput = new ByteArrayInputStream(
        "5\n1\n0\n1\n0\n1\n".getBytes());) {
      InputStream original = System.in;

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BinVector.main(arguments);

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("1"));

      System.setIn(original);
    }
  }

  @Test
  public void test2() throws Exception {
    String[] arguments = new String[]{"", "CONSOLE"};
    try (MockedStatic mockedStatic = Mockito.mockStatic(BinVector.class,
        Mockito.CALLS_REAL_METHODS); InputStream userInput = new ByteArrayInputStream(
        "5\n1\n1\n1\n0\n1\n".getBytes());) {
      InputStream original = System.in;

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BinVector.main(arguments);

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("3"));

      System.setIn(original);
    }
  }

  @Test
  public void test3() throws Exception {
    String[] arguments = new String[]{"", "CONSOLE"};
    try (InputStream userInput = new ByteArrayInputStream("5\n0\n0\n0\n0\n0\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BinVector.main(arguments);

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("0"));
    }
  }

  @Test
  public void test4() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("5\n1\n1\n1\n1\n1\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BinVector.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("5"));
    }
  }

}
