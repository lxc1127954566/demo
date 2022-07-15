package com.cpy.userdboperation.Exception;
import lombok.Data;

@Data
public class DefinitionException extends RuntimeException {
    private Integer errorCode;
    private String errorMsg;

    public DefinitionException(){

    }
    public DefinitionException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}