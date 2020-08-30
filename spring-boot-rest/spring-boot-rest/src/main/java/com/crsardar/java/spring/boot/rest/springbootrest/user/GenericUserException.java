package com.crsardar.java.spring.boot.rest.springbootrest.user;

public class GenericUserException extends RuntimeException
{
    public GenericUserException()
    {
    }

    public GenericUserException(String message)
    {
        super(message);
    }

    public GenericUserException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public GenericUserException(Throwable cause)
    {
        super(cause);
    }

    public GenericUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
