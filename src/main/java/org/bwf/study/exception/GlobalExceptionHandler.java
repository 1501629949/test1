package org.bwf.study.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public  ResultBody bizExceptionHandler(HttpServletRequest req, BizException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResultBody bindExceptionHandler(BindException e){
        FieldError error = e.getFieldError();
        String message = String.format("%s:%s",error.getField(), error.getDefaultMessage());
        logger.error(String.format("数据模型验证失败！原因是：%s",message));
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH, message);
    }

    @ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public ResultBody arrayIndexOutofBoundsExceptionHandler(ArrayIndexOutOfBoundsException e){
        logger.error(String.format("数组访问越界！原因是：%s",e.getStackTrace()[0]));
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH, e.getStackTrace()[0]);
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error(String.format("发生空指针异常！原因是:%s" ,e.getStackTrace()[0]));
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH,e.getStackTrace()[0]);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultBody handleMethodArgumentNotValidException(MethodArgumentNotValidException notValidException){
        logger.error("参数格式不符合", notValidException.getParameter());
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH,notValidException.getParameter());
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e.getStackTrace()[0]);
        return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR,e.getStackTrace()[0]);
    }


}


