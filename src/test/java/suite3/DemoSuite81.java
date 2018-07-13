package suite3;

import demo.TestAssert;
import demo.Test82;
import demo.Test83;

import demo.Test91;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//import org.junit.runner.FilterFactoryParams;



@RunWith(Suite.class)
@Suite.SuiteClasses({

		Test91.class,
	    Test82.class,
	    Test83.class,
		TestAssert.class

})
public class DemoSuite81 {
	

}
