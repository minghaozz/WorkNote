package com.zmh.note.api;

import com.zmh.note.entity.ArrayKey;
import com.zmh.note.entity.Key;
import com.zmh.note.global.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.text.ParseException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:14
 */
@Api(value = "要点相关API", description = "要点相关API", tags = "要点相关API")
@RequestMapping("/api/key")
public interface KeyItemApi {
  /**
   * .
   *
   * @return v
   */
  @ApiOperation(
      value = "查询要点",
      notes = "查询要点",
      produces = "application/json")
  @GetMapping(value = "/search_keys")
  ResponseResult<List<Key>> searchKeys();

  @ApiOperation(
      value = "新增要点",
      notes = "新增要点",
      produces = "application/json")
  @PostMapping(value = "/insert_keys")
  ResponseResult<Boolean> insertKeys(@RequestBody ArrayKey key) throws ParseException;
}
