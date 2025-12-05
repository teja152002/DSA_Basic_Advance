package mypractice.oops;

public class AgeInvalidException extends Exception{
    String message;
    AgeInvalidException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }

    @Override
    public void printStackTrace(){
        System.out.println("Exception occurs becuase of age is not eligible !");
    }
}

