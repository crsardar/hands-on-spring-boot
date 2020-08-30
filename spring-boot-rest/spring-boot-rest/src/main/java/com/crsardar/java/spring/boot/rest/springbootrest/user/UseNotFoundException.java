package com.crsardar.java.spring.boot.rest.springbootrest.user;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND
//        This will override the constructor message
//        , reason = "User not found"
)
public class UseNotFoundException extends RuntimeException
{
    public UseNotFoundException()
    {
    }

    public UseNotFoundException(String message)
    {
        super(message);
    }

    public UseNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public UseNotFoundException(Throwable cause)
    {
        super(cause);
    }

    public UseNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, false);
    }
}
