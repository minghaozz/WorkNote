package com.zmh.note.service;

import com.zmh.note.entity.TaskWork;
import com.zmh.note.repository.TaskRepository;
import com.zmh.note.utils.DateUtil;
import java.text.ParseException;
import javax.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author 张铭浩
 * @since 2019/8/22 15:26
 */
@Service
public class TaskWorkServiceImpl implements TaskWorkService {
  @Resource private TaskRepository taskRepository;

  @Override
  public Page<TaskWork> searchTaskWork(Integer aspect,Integer pageNum) {

    Pageable pageable = PageRequest.of(pageNum-1, 1000000000);
    Page<TaskWork> workList = taskRepository
        .findTaskWorkByAspect(aspect, pageable);
    workList.map(
            obj -> {
                obj.setCreatetime(obj.getCreatetime());
                obj.setCompletetime(obj.getCompletetime());
              return workList;
            });
    return workList;
  }

  @Override
  public void deleteTaskWork(Integer id) {
    TaskWork taskWork = new TaskWork();
    taskWork.setId(id);
    taskRepository.delete(taskWork);
  }

  @Override
  public void insertTaskWork(TaskWork taskWork) throws ParseException {
    String createtime = DateUtil.format(taskWork.getCreatetime());
    String completetime = DateUtil.format(taskWork.getCompletetime());
    taskWork.setCompletetime(completetime);
    taskWork.setCreatetime(createtime);
    taskWork.setUserId(3);
    if(taskWork.getStatus()==null){
      taskWork.setStatus(1);
    }
    taskRepository.save(taskWork);
  }
}
