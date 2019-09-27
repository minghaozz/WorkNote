package com.zmh.note.repository;

import com.zmh.note.entity.TaskWork;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张铭浩
 * @since 2019/8/22 15:21
 */
public interface TaskRepository extends JpaRepository<TaskWork, Integer> {
    public Page<TaskWork> findTaskWorkByAspect(Integer aspect, Pageable pageable);
}
