package test.com.company;

import main.com.company.CustomHash;
import main.com.company.JsonMapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sbelkin on 1/23/2016.
 */
public class CustomHashTest {

    CustomHash customHash;

    @Before
    public void setUp() throws Exception {
        JsonMapper jsonMapper = new JsonMapper("values.json");
        customHash = new CustomHash(jsonMapper);
    }

    @Test
    public void testParseString() throws Exception {

    }

    @Test
    public void testParseInteger() throws Exception {

    }

    @Test
    public void testIntegerToList() throws Exception {

    }

    @Test
    public void testHighestPower() throws Exception {

    }
}