package com.zmh.note.api;

import com.zmh.note.entity.TaskWork;
import com.zmh.note.global.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.text.ParseException;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张铭浩
 * @since 2019/8/22 9:40
 */
@Api(value = "任务相关API", description = "任务相关API", tags = "任务相关API")
@RequestMapping("/api/task_work")
public interface TaskItemApi {
  /**
   * .
   *
   * @return 频道分组信息
   */
  @ApiOperation(
      value = "查询工作任务",
      notes = "查询工作任务",
      produces = "application/json")
  @GetMapping(value = "/search_work_task")
  ResponseResult<Page<TaskWork>> searchWorkTask(Integer aspect, Integer pageNum);

  /**
   * .
   *
   * @return 频道分组信息
   */
  @ApiOperation(
      value = "删除工作任务",
      notes = "删除工作任务",
      produces = "application/json")
  @GetMapping(value = "/delete_work_task")
  ResponseResult<Boolean> deleteWorkTask(Integer id);

  /**
   * .
   *
   * @return 频道分组信息
   */
  @ApiOperation(
      value = "插入工作任务",
      notes = "插入工作任务",
      produces = "application/json")
  @PostMapping(value = "/insert_work_task")
  ResponseResult<Boolean> insertWorkTask(@RequestBody TaskWork taskWork) throws ParseException;
}
