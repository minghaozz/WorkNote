package com.zmh.note.global;

import lombok.Data;

/**
 * @author 张铭浩
 * @since 2019/8/22 14:40
 */
@Data
public class ResponseResult<T> {
  //默认状态码200  其实就是一个工具类存的数字 替换成数字就行了
  private int code = Constants.RESP_STATUS_OK;

  private String message;

  private T data;

  public ResponseResult() {
  }

  public ResponseResult(int code, String message) {
    this.code = code;
    this.message = message;
  }
}
