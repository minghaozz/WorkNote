package com.zmh.note.service;

import com.zmh.note.entity.Key;
import com.zmh.note.repository.KeyRepository;
import com.zmh.note.utils.DateUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:16
 */
@Service
public class KeyServiceImpl implements KeyService {
  @Autowired private KeyRepository keyRepository;

  @Override
  public List<Key> searchKey() {
    List<Key> keys = new ArrayList<>();
    keyRepository
        .findAll()
        .forEach(
            obj -> {
              try {
                obj.setCreatetime(DateUtil.format(obj.getCreatetime()));
                keys.add(obj);
              } catch (ParseException e) {
                e.printStackTrace();
              }
            });
    return keys;
  }

  @Override
  public void insertKey(Key key) {
    keyRepository.save(key);
  }
}
