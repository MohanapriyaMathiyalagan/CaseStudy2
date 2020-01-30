package skeleton;

import io.cucumber.java.en.Given;

public class Sarah_def {
	/*@Given("Sarah has {int} cucumbers in her bag")
	public void sarah_has_cucumbers_in_her_bag(Integer int1) {
	   
	}*/
	@Given("(Sarah|She) has {double} cucumber(s) in {string}")
	public void sarah_has_cucumbers_in_her_bag(Double double1,String string1) {
		System.out.println(double1+"\t "+string1);
	    
	}

}
