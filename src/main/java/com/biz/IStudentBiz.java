package com.biz;

import com.po.Clazz;
import com.po.Student;

import java.util.List;

public interface IStudentBiz {
    public int save(Student st);
    public int update(Student st);
    public int delById(Integer sid);
    public Student findByid(Integer sid);
    public List<Student> findPageAll(int page,int rows);
    public int findmaxPage(int rows);
    public List<Clazz> doinit();

}
