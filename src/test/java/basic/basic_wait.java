package basic;

public class basic_wait {
	/*
	 implicity wait :-
	- implicitywait is apply globally over the all webelement
    - means if one of webelement is not identify then it gives noelement found exception
	- if we give implicity wait then before provide noelementexception it wait for given time and then provide exception
	-driver.manage().timeout().implicitywait(time,timeunit.)
	
      explicit wait:-
      -this wait is apply for indivual webelement 
      -time is always in second
      -for apply explicitwait we need to create object of webdriverwait class 
      -and we apply this wait on condition base
      -webdriverwait wait=new webdriverwait(driver,time);
       wait.util(expectedconditions.visibilityof(webelement))
      
		     
	 */
	

}
