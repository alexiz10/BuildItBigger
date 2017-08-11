package com.udacity.gradle.builditbigger;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class EndpointsAsyncTaskTest {

    @Test
    public void testAsyncTask() {
        try {
            String joke = new EndpointAsyncTask().execute().get();

            assertNotNull(joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}