package com.demo.service;

import java.util.List;

import com.demo.model.BaseStudent;

public interface StudentService {
    public int saveStu(BaseStudent stu);
    public List<BaseStudent> findList();
    public List<BaseStudent> findListAll();
    public boolean del(int id);
    public BaseStudent cInfo(int id);
    public int update(BaseStudent bs);
}
