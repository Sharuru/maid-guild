package com.mbp.MaidGuild.web;

import com.mbp.MaidGuild.service.TestService;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sharuru on 2016/5/15 0015.
 */
public class TestControllerTest {
    TestService testService = new TestService();
    TestController tController = new TestController(testService);

    /**
     * JUnit 测试用例
     * @throws Exception
     */
    @Test
    public void testIndex() throws Exception {
        //查看返回值是否为 index
        assertEquals("index", tController.index(new HashMap<>()));
    }
}
