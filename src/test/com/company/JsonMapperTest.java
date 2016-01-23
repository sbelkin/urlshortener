package test.com.company;

import main.com.company.JsonMapper;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by sbelkin on 1/23/2016.
 */
public class JsonMapperTest {

    JsonMapper jsonMapper;

    @Before
    public void setUp() throws Exception {
        jsonMapper = new JsonMapper("values.json");
    }

    @Test
    public void testMapValues() throws Exception {

    }

    @Test
    public void testReverseMapValues() throws Exception {

    }

    @Test
    public void testGetLetter() throws Exception {

    }

    @Test
    public void testGetNumber() throws Exception {

    }

    @Test
    public void testGetSize() throws Exception {

    }
}