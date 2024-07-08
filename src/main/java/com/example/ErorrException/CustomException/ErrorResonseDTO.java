package com.example.ErorrException.CustomException;

import java.util.List;

public class ErrorResonseDTO {
    private String error ;
    private List<String> detail ;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getDetail() {
        return detail;
    }

    public void setDetail(List<String> detail) {
        this.detail = detail;
    }

    public ErrorResonseDTO(String error, List<String> detail) {
        this.error = error;
        this.detail = detail;
    }

    public ErrorResonseDTO() {
    }
}
