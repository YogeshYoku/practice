package org.data;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
	@Test
	public void test8() {
Result runClasses = JUnitCore.runClasses(Sample2.class,Sample3.class);
int failureCount = runClasses.getFailureCount();
System.out.println("Failure Count"+failureCount);
int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("IgnoreCount"+ignoreCount);
int runCount = runClasses.getRunCount();
System.out.println("RunCount"+runCount);
long runTime = runClasses.getRunTime();
System.out.println("Runtime"+runTime);
boolean wasSuccessful = runClasses.wasSuccessful();
System.out.println("SuccessfulCount"+wasSuccessful);
List<Failure> failures = runClasses.getFailures();
for (Failure failure : failures) {
	String message = failure.getMessage();
	System.out.println(message);
	
}
	}

}
