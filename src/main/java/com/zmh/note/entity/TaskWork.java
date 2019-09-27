package com.zmh.note.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 张铭浩
 * @since 2019/8/22 11:19
 */
@Entity
@Table(name = "task")
public class TaskWork {
  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column private String title;
  @Column private Integer aspect;

  public Integer getAspect() {
    return aspect;
  }

  public void setAspect(Integer aspect) {
    this.aspect = aspect;
  }

  @Column private String description;

  @Column private Integer status;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  @Column private Integer userId;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "TaskWork{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", status=" + status +
        ", userId=" + userId +
        ", createtime='" + createtime + '\'' +
        ", completetime='" + completetime + '\'' +
        ", priority=" + priority +
        '}';
  }

  public String getCreatetime() {
    return createtime;
  }

  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  public String getCompletetime() {
    return completetime;
  }

  public void setCompletetime(String completetime) {
    this.completetime = completetime;
  }


  @Column private String createtime;

  @Column private String completetime;

  @Column private String priority;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
