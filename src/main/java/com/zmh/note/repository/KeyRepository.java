package com.zmh.note.repository;

import com.zmh.note.entity.Key;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:18
 */
public interface KeyRepository extends JpaRepository<Key,Integer> {
}
