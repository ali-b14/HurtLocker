import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceriesTest {
    @Test
    public void hasHashMap() {
        Map<String, Double> hash = new HashMap<>();
        boolean expected = true;

        boolean actual = hash.isEmpty();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void hasPriceList() {
        List price = new ArrayList<>();
        boolean expected = true;

        boolean actual = price.isEmpty();

        Assert.assertEquals(expected,actual);
    }
//    @Test
//    public void hasPattern() {
//        Main data = new Main();
//        Pattern pattern = Pattern.compile(String.valueOf(data));
//        Matcher matcher = pattern.matcher(s);
//
//        boolean expected = true;
//
//        boolean actual = sb.
//
//        Assert.assertEquals(expected,actual);
//    }
}
