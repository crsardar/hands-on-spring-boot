/**
 * @author CRSardar
 *
 * https://github.com/crsardar
 */
package com.crsardar.springsoap;

import com.crsardar.springsoap.models.CourseDetails;
import com.crsardar.springsoap.models.GetCourseDetailsRequest;
import com.crsardar.springsoap.models.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndPoint {

    @PayloadRoot(namespace = "http://com.crsardar.springboot.soap/courses", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest getCourseDetailsRequest)
    {
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(getCourseDetailsRequest.getId());
        courseDetails.setName("Spring SOAP");
        courseDetails.setDescription("SOAP using Spring and SpringBoot is fun!");

        GetCourseDetailsResponse getCourseDetailsResponse = new GetCourseDetailsResponse();
        getCourseDetailsResponse.setCourseDetails(courseDetails);

        return getCourseDetailsResponse;
    }
}
