import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Collection;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
  
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
    this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> getTextData() {
    return java.util.Arrays.asList(new Object[][] {
      {17, false}, // Меньше 18, не совершеннолетний
      {18, true},  // Ровно 18, совершеннолетний
      {20, true},  // Проверка граничного значения перед 21
      {21, true},  // Совершеннолетие в некоторых странах наступает в 21
    });
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Ожидаемый результат для возраста " + age + " не соответствует фактическому", result, isAdult);
  }
}
