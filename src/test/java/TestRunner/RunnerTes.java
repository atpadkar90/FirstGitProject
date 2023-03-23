package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features= {"E:\\DatabasConnect workspace\\HybiredFrameWork\\BDDFrameWork\\Allfeatures file\\login.feature"},
		features= {"Allfeatures file\\cogme.feature"},
		glue={"StepDefination"},
		dryRun=false,
		monochrome=true
		
		
		
		)

public class RunnerTes {

}
