package com.zmh.note.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author 张铭浩
 * @since 2019/8/23 8:11
 */
@Entity
@Table(name="notekeys")
@Data
public class Key {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Override
  public String toString() {
    return "Key{" +
        "id=" + id +
        ", createtime='" + createtime + '\'' +
        ", keys='" + keyss + '\'' +
        '}';
  }

  @Column
  private String title;
  @Column
  private String createtime;
  @Column
  private String keyss;

  @Column
  private Integer userId;
}
