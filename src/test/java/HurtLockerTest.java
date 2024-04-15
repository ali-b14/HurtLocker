import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HurtLockerTest {
    @Test
    public void hasHashMap() {
        Map<String, Double> hash = new HashMap<>();
        boolean expected = true;

        boolean actual = hash.isEmpty();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void hasList() {
        List list = new ArrayList<>();
        boolean expected = true;

        boolean actual = list.isEmpty();

        Assert.assertEquals(expected,actual);
    }
//    @Test
//    public void hasStringBuilder() {
//        StringBuilder sb = new StringBuilder();
//        boolean expected = true;
//
//        boolean actual = sb.
//
//        Assert.assertEquals(expected,actual);
//    }
}
