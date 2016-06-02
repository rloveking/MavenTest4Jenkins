package com.mycompany.MavenTest4Jenkins;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome=true,
	features="src/main/cucumber",
	plugin={"pretty", "html:target/cucumber-html-report"},
	tags={"@Regression, @Smoke"}
	)

//For TestNG, uncomment this line, make sure testng.xml is available
public class LoginTestRunner extends AbstractTestNGCucumberTests{}

//For JUnit, uncomment this line, make sure textng.xml is not available (add _ before filename)
//public class LoginTestRunner{}