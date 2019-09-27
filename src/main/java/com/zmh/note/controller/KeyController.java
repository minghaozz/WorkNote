package com.zmh.note.controller;

import com.zmh.note.api.KeyItemApi;
import com.zmh.note.entity.ArrayKey;
import com.zmh.note.entity.Key;
import com.zmh.note.global.Constants;
import com.zmh.note.global.ResponseResult;
import com.zmh.note.service.KeyService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:16
 */
@RestController
public class KeyController implements KeyItemApi {
  @Autowired private KeyService keyService;
  @Override
  public ResponseResult<List<Key>> searchKeys() {
    List<Key> keys = keyService.searchKey();
    ResponseResult<List<Key>> responseResult = new ResponseResult<>();
    responseResult.setCode(Constants.RESP_STATUS_OK);
    responseResult.setData(keys);
    return responseResult;
  }

  @Override
  public ResponseResult<Boolean> insertKeys(ArrayKey key) throws ParseException {
    String s = "";
    for (String keyKey : key.getKeys()) {
      s+=keyKey+",";
    }
    String s1 = s.substring(0, s.length() - 1);
    Key k = new Key();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String sdate = simpleDateFormat.format(new Date());
    k.setCreatetime(sdate);
    k.setKeyss(s1);
    k.setUserId(1);
    k.setTitle(key.getTitle());
    keyService.insertKey(k);
    ResponseResult<Boolean> responseResult = new ResponseResult<>();
    responseResult.setCode(Constants.RESP_STATUS_OK);
    responseResult.setData(true);
    return responseResult;  }
}
