package GoogleTests;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.CollectionCondition.*;

public class FirstTest {
    @Test
     public void shouldSearch() {
        Selenide.open("https://google.com/ncr");
       element(byName("q")).setValue("maven selenium java").pressEnter();
       element(byCssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
   }
 }
