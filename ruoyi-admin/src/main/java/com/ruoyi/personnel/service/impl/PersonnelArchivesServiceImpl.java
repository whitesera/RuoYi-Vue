package com.ruoyi.personnel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.personnel.mapper.PersonnelArchivesMapper;
import com.ruoyi.personnel.domain.PersonnelArchives;
import com.ruoyi.personnel.service.IPersonnelArchivesService;

/**
 * 人事档案花名册Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-21
 */
@Service
public class PersonnelArchivesServiceImpl implements IPersonnelArchivesService 
{
    @Autowired
    private PersonnelArchivesMapper personnelArchivesMapper;

    /**
     * 查询人事档案花名册
     * 
     * @param id 人事档案花名册主键
     * @return 人事档案花名册
     */
    @Override
    public PersonnelArchives selectPersonnelArchivesById(Long id)
    {
        return personnelArchivesMapper.selectPersonnelArchivesById(id);
    }

    /**
     * 查询人事档案花名册列表
     * 
     * @param personnelArchives 人事档案花名册
     * @return 人事档案花名册
     */
    @Override
    public List<PersonnelArchives> selectPersonnelArchivesList(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.selectPersonnelArchivesList(personnelArchives);
    }

    /**
     * 新增人事档案花名册
     * 
     * @param personnelArchives 人事档案花名册
     * @return 结果
     */
    @Override
    public int insertPersonnelArchives(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.insertPersonnelArchives(personnelArchives);
    }

    /**
     * 修改人事档案花名册
     * 
     * @param personnelArchives 人事档案花名册
     * @return 结果
     */
    @Override
    public int updatePersonnelArchives(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.updatePersonnelArchives(personnelArchives);
    }

    /**
     * 批量删除人事档案花名册
     * 
     * @param ids 需要删除的人事档案花名册主键
     * @return 结果
     */
    @Override
    public int deletePersonnelArchivesByIds(Long[] ids)
    {
        return personnelArchivesMapper.deletePersonnelArchivesByIds(ids);
    }

    /**
     * 删除人事档案花名册信息
     * 
     * @param id 人事档案花名册主键
     * @return 结果
     */
    @Override
    public int deletePersonnelArchivesById(Long id)
    {
        return personnelArchivesMapper.deletePersonnelArchivesById(id);
    }
}
