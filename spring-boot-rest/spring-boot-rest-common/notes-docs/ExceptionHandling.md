Exceptions can be handled at 3 levels -

    1. Per Exception -
    
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such record")
    public class MyClass extends RuntimeException{
    
    }
    
    2. Per Controller - 
    (NOTE - It has Highest Priority. It will over-ride @ControllerAdvice & @ResponseStatus)
    
    @Controller
    public class ExceptionHandlingController {
 
      // Convert a predefined exception to an HTTP Status code
      @ResponseStatus(value=HttpStatus.CONFLICT, reason="Data integrity violation")
      @ExceptionHandler(DataIntegrityViolationException.class)
      public void conflict() {
        // Nothing to do
      }
      
      // Specify name of a specific view that will be used to display the error:
      @ExceptionHandler({SQLException.class,DataAccessException.class})
      public String databaseError() {
        
        return "databaseError";
      }
    
      // Total control - setup a model and return the view name yourself. Or
      // consider subclassing ExceptionHandlerExceptionResolver (see below).
      @ExceptionHandler(Exception.class)
      public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        logger.error("Request: " + req.getRequestURL() + " raised " + ex);
    
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
      }
    }
    
    3. Application/Global Level -
    
    @ControllerAdvice
    class GlobalDefaultExceptionHandler {
      public static final String DEFAULT_ERROR_VIEW = "error";
    
      @ExceptionHandler(value = Exception.class)
      public ModelAndView
      defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
      
        // If the exception is annotated with @ResponseStatus rethrow it and let
        // the framework handle it - like the OrderNotFoundException example
        // at the start of this post.
        // AnnotationUtils is a Spring Framework utility class.
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
          throw e;
    
        // Otherwise setup and send the user to a default error-view.
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
      }
    }