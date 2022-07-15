package com.cpy.userdboperation.Exception;


import com.cpy.userdboperation.encapsulation.ResultDTO;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;



@ControllerAdvice
public class GlobalExceptionHandler {

        /**
         * 处理自定义异常
         */
        @ExceptionHandler(value = Exception.class)
        @ResponseBody
        public ResultDTO exceptionHandler(Exception exception) {
            ResultDTO result=new ResultDTO();
            //自定义类型异常
            if(exception instanceof DefinitionException){
                DefinitionException definitionException= (DefinitionException) exception;
                result.setCode(definitionException.getErrorCode());
                result.setMsg(definitionException.getErrorMsg());
            }else if(exception instanceof BindException){//@valid注解抛出的异常
                //使用StringBuilder来拼接错误信息,减少对象开销
                StringBuilder stringBuilder = new StringBuilder();
                //获取并拼接所有错误信息
                BindException bindException= (BindException) exception;
                BindingResult bindingResult = bindException.getBindingResult();
                List<ObjectError> allErrors = bindingResult.getAllErrors();
                for (ObjectError item : allErrors) {
                    stringBuilder.append(item.getDefaultMessage())
                            .append(',');
                }
                //删除最后一个逗号
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
                result.setCode(600);//这里自定义了600用于表示参数有误
                result.setMsg(stringBuilder.toString());
            }else {//其他异常
                result.setCode(500);
                result.setMsg(exception.getMessage());
            }
            return result;
        }

}
