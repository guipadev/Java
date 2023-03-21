package com.charlycimino.$44TRY_CATCH_FINALLYCapturarEXCEPCIONES.excepcionespropias;

public class IntegerOverflowException extends RuntimeException {

    public IntegerOverflowException() {
    }

    public IntegerOverflowException(String message) {
        super(message);
    }

    public IntegerOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerOverflowException(Throwable cause) {
        super(cause);
    }
    
}
