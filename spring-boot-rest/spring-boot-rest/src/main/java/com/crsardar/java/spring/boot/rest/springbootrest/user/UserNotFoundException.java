package com.crsardar.java.spring.boot.rest.springbootrest.user;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND
//        This will override the constructor message
//        , reason = "User not found"
)
public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException()
    {
    }

    public UserNotFoundException(String message)
    {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause)
    {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, false);
    }
}
