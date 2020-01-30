package skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:cucumber-reports"},
		features = {"src/test/resources/skeleton/demo_Webpagelogin.feature",
				},
		monochrome = true,snippets=SnippetType.CAMELCASE
		)

public class cucumber_Runner
{
 
}
