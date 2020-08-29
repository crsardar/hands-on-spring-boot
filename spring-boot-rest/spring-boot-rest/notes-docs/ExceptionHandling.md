Exceptions can be handled at 3 levels -

    1. Per Exception -
    
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such record")
    public class MyClass extends RuntimeException{
    
    }
    
    2. Per Controller - 
    
    3. Application/Global Level -
    