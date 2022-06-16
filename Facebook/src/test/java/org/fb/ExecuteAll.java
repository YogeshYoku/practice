package org.fb;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
	@Test
	public void test() {
		Result result=JUnitCore.runClasses(SampleA.class,SampleB.class);
		int runCount = result.getRunCount();
		System.out.println(runCount);
int ignoreCount = result.getIgnoreCount();
System.out.println(ignoreCount);
int failureCount = result.getFailureCount();
System.out.println(failureCount);
long runTime = result.getRunTime();
System.out.println(runTime);
List<Failure> failures = result.getFailures();
//System.out.println(failures);
for (Failure failure : failures) {
	System.out.println(failure);
	System.out.println(failure.getMessage());
	
}
	}
	

}
