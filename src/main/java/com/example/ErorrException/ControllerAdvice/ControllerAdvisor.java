package com.example.ErorrException.ControllerAdvice;

import com.example.ErorrException.CustomException.ErrorResonseDTO;
import com.example.ErorrException.CustomException.FielRequireException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice

public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    // Bắt lỗi 500
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex , WebRequest request){
        ErrorResonseDTO errorResonseDTO = new ErrorResonseDTO() ;
        errorResonseDTO.setError(ex.getMessage());
        List<String> details = new ArrayList<>();
        details.add("So Nguyen Khong The Chia Cho 0") ;
        errorResonseDTO.setDetail(details);
        return new ResponseEntity<>(errorResonseDTO , HttpStatus.INTERNAL_SERVER_ERROR);
    }


    // Bắt lỗi 502
    @ExceptionHandler(FielRequireException.class)
    public ResponseEntity<Object> handleFielRequireException(FielRequireException ex , WebRequest request){
        ErrorResonseDTO errorResonseDTO = new ErrorResonseDTO() ;
        errorResonseDTO.setError(ex.getMessage());
        List<String> details = new ArrayList<>();
        details.add("So Nguyen Khong The Chia Cho 0") ;
        errorResonseDTO.setDetail(details);
        return new ResponseEntity<>(errorResonseDTO , HttpStatus.BAD_GATEWAY);
    }
}
