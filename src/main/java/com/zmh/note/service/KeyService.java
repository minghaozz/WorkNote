package com.zmh.note.service;

import com.zmh.note.entity.Key;
import java.util.List;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:16
 */
public interface KeyService {
  public List<Key> searchKey();
  public void insertKey(Key key);
}
