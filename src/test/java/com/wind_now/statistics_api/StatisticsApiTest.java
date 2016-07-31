package com.wind_now.statistics_api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wind_now.statistics_api.beans.LatestResponse;

/**
 *
 * @author ono
 */
public class StatisticsApiTest {

    public StatisticsApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void latest() throws Exception {
        String title = "吹奏楽";
        Latest search = new Latest();
        LatestResponse res = search.latest(title);
        String actual = res.getTitle();
        String expected = title;
        assertThat(actual, is(expected));
    }

}
