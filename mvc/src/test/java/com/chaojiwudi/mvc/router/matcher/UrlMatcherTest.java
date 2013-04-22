package com.chaojiwudi.mvc.router.matcher;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UrlMatcherTest {

    private UrlMatcher urlMatcher;

    @Test
    public void test_root_url() {
        urlMatcher = UrlMatcher.create("/");
        UrlResult result = urlMatcher.parse("/");
        assertTrue(result.isMatch());
    }

    @Test
    public void test_basic_url() {
        urlMatcher = UrlMatcher.create("/about");
        UrlResult result = urlMatcher.parse("/about");
        assertTrue(result.isMatch());
    }

    @Test
    public void test_url_with_param() {
        urlMatcher = UrlMatcher.create("/users/:id");
        UrlResult result = urlMatcher.parse("/users/28");
        assertTrue(result.isMatch());
        assertEquals("28", result.getParam("id"));
    }

    @Test
    public void test_url_with_param_other() {
        urlMatcher = UrlMatcher.create("/users/:id/edit");
        UrlResult result = urlMatcher.parse("/users/13/edit");
        assertTrue(result.isMatch());
        assertEquals("13", result.getParam("id"));
    }

    @Test
    public void test_url_with_param_in_the_end() {
        urlMatcher = UrlMatcher.create("/users/:id");
        UrlResult result = urlMatcher.parse("/users/13/edit");
        assertFalse(result.isMatch());
    }

}
