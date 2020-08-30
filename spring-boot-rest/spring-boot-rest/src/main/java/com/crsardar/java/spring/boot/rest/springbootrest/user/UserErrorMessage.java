package com.crsardar.java.spring.boot.rest.springbootrest.user;

import java.util.Date;
public class UserErrorMessage
{
    public Date timeStamp;
    public String message;

    public UserErrorMessage()
    {
    }

    public UserErrorMessage(Date timeStamp, String message)
    {
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public Date getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "UserErrorMessage{" + "timeStamp=" + timeStamp + ", message='" + message + '\'' + '}';
    }
}
