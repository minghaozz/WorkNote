package com.zmh.note.global;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 张铭浩
 * @since 2019/8/22 15:10
 */

//@ControllerAdvice
public class GlobalException {
  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public ResponseResult defaultErrorException(){
    return new ResponseResult(Constants.RESP_STATUS_ERROR,"系统异常，请稍后再试！");
  }
}
