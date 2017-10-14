package com.adelphia2004.tomcat;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        String data = "997f743f-ac3b-4e0d-83e4-5210c657a1092014-03-15 \n" +
                "00:00:142014-03-15 00:06:55SUCCESS   50366436189285597836   997f743f-ac3b-4e0d-83e4-5210c657a1092014-03-15 \n" +
                "00:00:142014-03-15 00:06:55SUCCESS   50366436189285597836";

        String regex = "(.{36})([0-9]{4}-[0-9]{2}-[0-9]{2}\\s+[0-9]{2}:[0-9]{2}:[0-9]{2})([0-9]{4}-[0-9]{2}-[0-9]{2}\\s+[0-9]{2}:[0-9]{2}:[0-9]{2})([A-Z]\\w+)\\s+(\\d{10})(\\d{10})";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(data);

        while(m.find()){
            String result = m.group();
        }
        
    }
}