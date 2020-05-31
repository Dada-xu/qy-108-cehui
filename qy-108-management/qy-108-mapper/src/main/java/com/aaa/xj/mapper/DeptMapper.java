package com.aaa.xj.mapper;

import com.aaa.xj.model.Dept;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DeptMapper extends Mapper<Dept> {

    /**
     * @author ligen
     * @description
     *  查询部门信息，根据主键id查询部门的信息
     * @date 2020/5/30
     * @param [parentId]
     * @return java.util.List<com.aaa.xj.model.Dept>
     */
    Dept selectDeptByDeptId(Integer deptId);

    /**
     * @author ligen
     * @description
     *  查询所有的部门
     * @date 2020/5/30
     * @param [parentId]
     * @return java.util.List<com.aaa.xj.model.Dept>
     */
    List<Dept> selectDeptByParentId(Integer parentId);

    /**
     * @author ligen
     * @description
     *  新增部门信息
     * @date 2020/5/30
     * @param [dept]
     * @return int
     */
    int insertDept(Dept dept);


}