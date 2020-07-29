package com.crsardar.springboot.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.crsardar.springboot.soap.models.CourseDetails;
import com.crsardar.springboot.soap.models.GetCourseDetailsRequest;
import com.crsardar.springboot.soap.models.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndPoint {

	@PayloadRoot(namespace = "http://com.crsardar.springboot.soap/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest courseDetailsRequest)
	{
		
		GetCourseDetailsResponse courseDetailsResponse = new GetCourseDetailsResponse();
		
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(courseDetailsRequest.getId());
		courseDetails.setName("Yoga");
		courseDetails.setDescription("Do Yoga daily, stay active and alive!");
		
		courseDetailsResponse.setCourseDetails(courseDetails);
		
		return courseDetailsResponse;
	}
}
