package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PersonnelArchives;

/**
 * 花名册Mapper接口
 * 
 * @author sera
 * @date 2025-02-21
 */
public interface PersonnelArchivesMapper 
{
    /**
     * 查询花名册
     * 
     * @param id 花名册主键
     * @return 花名册
     */
    public PersonnelArchives selectPersonnelArchivesById(Long id);

    /**
     * 查询花名册列表
     * 
     * @param personnelArchives 花名册
     * @return 花名册集合
     */
    public List<PersonnelArchives> selectPersonnelArchivesList(PersonnelArchives personnelArchives);

    /**
     * 新增花名册
     * 
     * @param personnelArchives 花名册
     * @return 结果
     */
    public int insertPersonnelArchives(PersonnelArchives personnelArchives);

    /**
     * 修改花名册
     * 
     * @param personnelArchives 花名册
     * @return 结果
     */
    public int updatePersonnelArchives(PersonnelArchives personnelArchives);

    /**
     * 删除花名册
     * 
     * @param id 花名册主键
     * @return 结果
     */
    public int deletePersonnelArchivesById(Long id);

    /**
     * 批量删除花名册
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePersonnelArchivesByIds(Long[] ids);
}
