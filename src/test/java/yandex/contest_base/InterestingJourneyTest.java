package yandex.contest_base;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.junit.Test;
import yandex.contest_base.InterestingJourney;

public class InterestingJourneyTest {

  @Test
  public void testManual() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
//        "4\n0 0\n1 0\n0 1\n1 1\n2\n1 4\n".getBytes())) {
//        "7\n0 0\n0 2\n2 2\n0 -2\n2 -2\n2 -1\n2 1\n2\n1 5\n".getBytes())) {
//    "4\n0 0\n2 0\n0 2\n2 2\n1\n1 4\n".getBytes())) {
//        "7\n0 0\n0 2\n2 2\n0 -2\n2 -2\n2 -1\n2 1\n2\n1 6\n".getBytes())) {
//        "8\n0 0\n0 2\n2 2\n3 1\n4 0\n3 -1\n2 -2\n0 -2\n2\n1 5\n".getBytes())) {
        "8\n0 0\n0 2\n2 2\n3 1\n4 0\n3 -1\n2 -2\n0 -2\n2\n1 1\n".getBytes())) {

      System.setIn(userInput);

      InterestingJourney.main(new String[]{""});
    }
  }

  @Test
  public void test1() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "7\n0 0\n0 2\n2 2\n0 -2\n2 -2\n2 -1\n2 1\n2\n1 3\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      InterestingJourney.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("rc = 2"));
    }
  }

  @Test
  public void test2() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "4\n0 0\n1 0\n0 1\n1 1\n2\n1 4\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      InterestingJourney.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("rc = 1"));
    }
  }

  @Test
  public void test3() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "4\n0 0\n2 0\n0 2\n2 2\n1\n1 4\n".getBytes())) {
      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      InterestingJourney.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("rc = -1"));
    }
  }

  @Test
  public void test4() throws Exception {
    try (InputStream userInput = new ByteArrayInputStream(
        "7\n0 0\n0 2\n2 2\n0 -2\n2 -2\n2 -1\n2 1\n2\n1 5\n".getBytes())) {

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      InterestingJourney.main(new String[]{""});

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("rc = 2"));
    }
  }
}
