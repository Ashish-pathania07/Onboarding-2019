package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

  
@Test
public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
	//mocking- creating a dummy Camera object with no original code
	Camera mockedCamera= mock( Camera.class);
	
	//Stubbing -hard coding the response of depending method
	Mockito.when(mockedCamera.on()).thenReturn(true);
	
	//dependency injection
	Mobile mobile = new Mobile(mockedCamera);
	
	boolean actualResponse = mobile.startPhotoApp();
	boolean expectedResponse = true;
	
	assertEquals ( expectedResponse,actualResponse);
	
	//verify the camera.on() method invoking within the startPhotoApp() method
	Mockito.verify(mockedCamera,Mockito.times(1)).on();
}


}
