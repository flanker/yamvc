package com.chaojiwudi.mvc.router;

import com.chaojiwudi.mvc.router.matcher.ParseResult;
import com.chaojiwudi.mvc.router.url.Url;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UrlTest {

    private Url url;

    @Test
    public void test_root_url() {
        url = new Url("/");
        ParseResult result = url.parse("/");
        assertTrue(result.isMatch());
    }

    @Test
    public void test_basic_url() {
        url = new Url("/about");
        ParseResult result = url.parse("/about");
        assertTrue(result.isMatch());
    }

    @Test
    public void test_url_with_param() {
        url = new Url("/users/:id");
        ParseResult result = url.parse("/users/28");
        assertTrue(result.isMatch());
        assertEquals("28", result.getParam("id"));
    }

    @Test
    public void test_url_with_param_other() {
        url = new Url("/users/:id/edit");
        ParseResult result = url.parse("/users/13/edit");
        assertTrue(result.isMatch());
        assertEquals("13", result.getParam("id"));
    }

    @Test
    public void test_url_with_param_in_the_end() {
        url = new Url("/users/:id");
        ParseResult result = url.parse("/users/13/edit");
        assertFalse(result.isMatch());
    }

}
