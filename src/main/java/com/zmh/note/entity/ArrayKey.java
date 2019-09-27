package com.zmh.note.entity;

import lombok.Data;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:11
 */
@Data
public class ArrayKey {
  private Integer id;

  @Override
  public String toString() {
    return "Key{" +
        "id=" + id +
        ", createtime='" + createtime + '\'' +
        ", keys='" + keys + '\'' +
        '}';
  }

  private String title;
  private String createtime;
  private String[] keys;
}
