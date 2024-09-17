package com.testcases.trial;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
//@SelectPackages("com.testcases.demos")
@SelectPackages(value = {"com.testcases.demos","com.testcases.examples"})
@IncludeTags({"sample","sample1"})
public class AllTests {

}
