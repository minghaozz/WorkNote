package com.zmh.note.controller;

import com.zmh.note.api.TaskItemApi;
import com.zmh.note.entity.TaskWork;
import com.zmh.note.global.Constants;
import com.zmh.note.global.ResponseResult;
import com.zmh.note.service.TaskWorkService;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张铭浩
 * @since 2019/8/22 9:35
 */
@RestController
public class TaskWorkController implements TaskItemApi {
  @Autowired
  TaskWorkService taskWorkService;
  @Override
  public ResponseResult<Page<TaskWork>> searchWorkTask(Integer aspect,Integer pageNum) {
    Page<TaskWork> taskWorks = taskWorkService.searchTaskWork(aspect, pageNum);
    ResponseResult<Page<TaskWork>> responseResult = new ResponseResult<>();
    responseResult.setCode(Constants.RESP_STATUS_OK);
    responseResult.setData(taskWorks);
    return responseResult;
  }

  @Override
  public ResponseResult<Boolean> deleteWorkTask(Integer id ) {
    taskWorkService.deleteTaskWork(id);
    ResponseResult<Boolean> result = new ResponseResult<>();
    result.setData(true);
    return result;
  }

  @Override
  public ResponseResult<Boolean> insertWorkTask(TaskWork taskWork) throws ParseException {
    taskWorkService.insertTaskWork(taskWork);
    ResponseResult<Boolean> result = new ResponseResult<>();
    result.setData(true);
    return result;
  }
}
