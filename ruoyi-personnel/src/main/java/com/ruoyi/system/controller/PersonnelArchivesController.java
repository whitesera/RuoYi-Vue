package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.PersonnelArchives;
import com.ruoyi.system.service.IPersonnelArchivesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 花名册Controller
 * 
 * @author sera
 * @date 2025-02-21
 */
@RestController
@RequestMapping("/personnel/archives")
public class PersonnelArchivesController extends BaseController
{
    @Autowired
    private IPersonnelArchivesService personnelArchivesService;

    /**
     * 查询花名册列表
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:list')")
    @GetMapping("/list")
    public TableDataInfo list(PersonnelArchives personnelArchives)
    {
        startPage();
        List<PersonnelArchives> list = personnelArchivesService.selectPersonnelArchivesList(personnelArchives);
        return getDataTable(list);
    }

    /**
     * 导出花名册列表
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:export')")
    @Log(title = "花名册", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PersonnelArchives personnelArchives)
    {
        List<PersonnelArchives> list = personnelArchivesService.selectPersonnelArchivesList(personnelArchives);
        ExcelUtil<PersonnelArchives> util = new ExcelUtil<PersonnelArchives>(PersonnelArchives.class);
        util.exportExcel(response, list, "花名册数据");
    }

    /**
     * 获取花名册详细信息
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(personnelArchivesService.selectPersonnelArchivesById(id));
    }

    /**
     * 新增花名册
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:add')")
    @Log(title = "花名册", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PersonnelArchives personnelArchives)
    {
        return toAjax(personnelArchivesService.insertPersonnelArchives(personnelArchives));
    }

    /**
     * 修改花名册
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:edit')")
    @Log(title = "花名册", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PersonnelArchives personnelArchives)
    {
        return toAjax(personnelArchivesService.updatePersonnelArchives(personnelArchives));
    }

    /**
     * 删除花名册
     */
    @PreAuthorize("@ss.hasPermi('personnel:archives:remove')")
    @Log(title = "花名册", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(personnelArchivesService.deletePersonnelArchivesByIds(ids));
    }
}
