package com.ntr1x.treasure.web;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ntr1x.treasure.web.resources.UserResourceTest;

@RunWith(Suite.class)
@SuiteClasses({
    UserResourceTest.class,
})
public class ResourcesTestSuite {
    
}