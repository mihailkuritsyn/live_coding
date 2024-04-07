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

public class WooHooTest {

  @Test
  public void givenArgumentAsConsoleInput_WhenReadFromSubstitutedByteArrayInputStream_ThenSuccessfullyCalculate()
      throws Exception {
    String[] arguments = new String[]{"", "CONSOLE"};
    try (MockedStatic mockedStatic = Mockito.mockStatic(WooHoo.class, Mockito.CALLS_REAL_METHODS);
        InputStream userInput = new ByteArrayInputStream("ab\naabbccd\n".getBytes());
    ) {

      InputStream original = System.in;

      System.setIn(userInput);

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream out = new PrintStream(byteArrayOutputStream);
      System.setOut(out);

      WooHoo.main(arguments);

      String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
      assertTrue(consoleOutput.contains("4"));

      System.setIn(original);
    }
  }

//  @Test
//  public void givenArgumentAsConsoleInput_WhenReadFromSubstitutedFileStream_ThenSuccessfullyCalculate() throws IOException {
//    String[] arguments = new String[] { "-i", "CONSOLE" };
//
//    InputStream fips = getClass().getClassLoader().getResourceAsStream("test-input.txt");
//    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//    PrintStream out = new PrintStream(byteArrayOutputStream);
//
//    System.setIn(fips);
//    System.setOut(out);
//
//    SimpleMain.main(arguments);
//
//    String consoleOutput = byteArrayOutputStream.toString(Charset.defaultCharset());
//    assertTrue(consoleOutput.contains("Calculated sum: 10"));
//
//    fips.close();
//    out.close();
//  }
}
