package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.stepDefinition"},
monochrome=false,
plugin= {"html:Reports\\HTMLReport","json:Reports\\JsonReport\\Cucumber.json",
		"junit:Reports\\JunitReport\\Cucumber.xml"})

public class Runner {

}
