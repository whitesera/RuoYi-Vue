package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PersonnelArchivesMapper;
import com.ruoyi.system.domain.PersonnelArchives;
import com.ruoyi.system.service.IPersonnelArchivesService;

/**
 * 花名册Service业务层处理
 * 
 * @author sera
 * @date 2025-02-21
 */
@Service
public class PersonnelArchivesServiceImpl implements IPersonnelArchivesService 
{
    @Autowired
    private PersonnelArchivesMapper personnelArchivesMapper;

    /**
     * 查询花名册
     * 
     * @param id 花名册主键
     * @return 花名册
     */
    @Override
    public PersonnelArchives selectPersonnelArchivesById(Long id)
    {
        return personnelArchivesMapper.selectPersonnelArchivesById(id);
    }

    /**
     * 查询花名册列表
     * 
     * @param personnelArchives 花名册
     * @return 花名册
     */
    @Override
    public List<PersonnelArchives> selectPersonnelArchivesList(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.selectPersonnelArchivesList(personnelArchives);
    }

    /**
     * 新增花名册
     * 
     * @param personnelArchives 花名册
     * @return 结果
     */
    @Override
    public int insertPersonnelArchives(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.insertPersonnelArchives(personnelArchives);
    }

    /**
     * 修改花名册
     * 
     * @param personnelArchives 花名册
     * @return 结果
     */
    @Override
    public int updatePersonnelArchives(PersonnelArchives personnelArchives)
    {
        return personnelArchivesMapper.updatePersonnelArchives(personnelArchives);
    }

    /**
     * 批量删除花名册
     * 
     * @param ids 需要删除的花名册主键
     * @return 结果
     */
    @Override
    public int deletePersonnelArchivesByIds(Long[] ids)
    {
        return personnelArchivesMapper.deletePersonnelArchivesByIds(ids);
    }

    /**
     * 删除花名册信息
     * 
     * @param id 花名册主键
     * @return 结果
     */
    @Override
    public int deletePersonnelArchivesById(Long id)
    {
        return personnelArchivesMapper.deletePersonnelArchivesById(id);
    }
}
