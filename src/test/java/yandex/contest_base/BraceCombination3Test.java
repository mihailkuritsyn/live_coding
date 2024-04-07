package yandex.contest_base;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;
import yandex.contest_base.BraceCombination3;

public class BraceCombination3Test {

  @Test
  public void test() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("3\n".getBytes())) {
      System.setIn(userInput);

      BraceCombination3.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("1\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BraceCombination3.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("()"));
    }
  }

  @Test
  public void test2() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("2\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BraceCombination3.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("(())"));
      assertTrue(consoleOutput.contains("()()"));
    }
  }

  @Test
  public void test3() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("3\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BraceCombination3.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("((()))"));
      assertTrue(consoleOutput.contains("(()())"));
      assertTrue(consoleOutput.contains("(())()"));
      assertTrue(consoleOutput.contains("()(())"));
      assertTrue(consoleOutput.contains("()()()"));
    }
  }

  @Test
  public void test4() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream("4\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      BraceCombination3.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());

      assertTrue(consoleOutput.contains("(((())))"));
      assertTrue(consoleOutput.contains("((()))()"));
      assertTrue(consoleOutput.contains("(())()()"));
      assertTrue(consoleOutput.contains("(()())()"));

      assertTrue(consoleOutput.contains("()()()()"));
      assertTrue(consoleOutput.contains("()((()))"));

      assertTrue(consoleOutput.contains("()(())()"));
      assertTrue(consoleOutput.contains("()()(())"));

      assertTrue(consoleOutput.contains("()(()())"));

      assertTrue(consoleOutput.contains("(()()())"));
    }
  }
}
