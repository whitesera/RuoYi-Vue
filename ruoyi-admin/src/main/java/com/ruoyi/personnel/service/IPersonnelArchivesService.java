package com.ruoyi.personnel.service;

import java.util.List;
import com.ruoyi.personnel.domain.PersonnelArchives;

/**
 * 人事档案花名册Service接口
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
public interface IPersonnelArchivesService 
{
    /**
     * 查询人事档案花名册
     * 
     * @param id 人事档案花名册主键
     * @return 人事档案花名册
     */
    public PersonnelArchives selectPersonnelArchivesById(Long id);

    /**
     * 查询人事档案花名册列表
     * 
     * @param personnelArchives 人事档案花名册
     * @return 人事档案花名册集合
     */
    public List<PersonnelArchives> selectPersonnelArchivesList(PersonnelArchives personnelArchives);

    /**
     * 新增人事档案花名册
     * 
     * @param personnelArchives 人事档案花名册
     * @return 结果
     */
    public int insertPersonnelArchives(PersonnelArchives personnelArchives);

    /**
     * 修改人事档案花名册
     * 
     * @param personnelArchives 人事档案花名册
     * @return 结果
     */
    public int updatePersonnelArchives(PersonnelArchives personnelArchives);

    /**
     * 批量删除人事档案花名册
     * 
     * @param ids 需要删除的人事档案花名册主键集合
     * @return 结果
     */
    public int deletePersonnelArchivesByIds(Long[] ids);

    /**
     * 删除人事档案花名册信息
     * 
     * @param id 人事档案花名册主键
     * @return 结果
     */
    public int deletePersonnelArchivesById(Long id);
}
