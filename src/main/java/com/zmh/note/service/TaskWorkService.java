package com.zmh.note.service;

import com.zmh.note.entity.TaskWork;
import java.text.ParseException;
import org.springframework.data.domain.Page;

/**
 * @author 张铭浩
 * @since 2019/8/22 15:25
 */
public interface TaskWorkService {
  public Page<TaskWork> searchTaskWork(Integer aspect, Integer pageNum);
  public void deleteTaskWork(Integer id);
  public void insertTaskWork(TaskWork taskWork) throws ParseException;
}
