package xin.mrbear.springboot_mybtis.mapper;

import org.apache.ibatis.annotations.*;
import xin.mrbear.springboot_mybtis.bean.Department;


public interface DepartmentMapper {


    @Select("SELECT * FROM department WHERE id=#{id}")
    public Department getDeptByID(Integer id);

    @Delete("DELETE FROM department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{departmentName});")
    public int inserDept(Department department);

    @Update("UPDATE department SET departmentName=#{departmentName} WHERE id=#{id}")
    public int updateDept(Department department);
}
