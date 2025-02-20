<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="工号" prop="workNumber">
        <el-input
          v-model="queryParams.workNumber"
          placeholder="请输入工号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="姓名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="身份证号" prop="idCard">
        <el-input
          v-model="queryParams.idCard"
          placeholder="请输入身份证号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联系方式" prop="contactNumber">
        <el-input
          v-model="queryParams.contactNumber"
          placeholder="请输入联系方式"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="gender">
        <el-select v-model="queryParams.gender" placeholder="请选择性别" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_gender"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="民族" prop="nationality">
        <el-select v-model="queryParams.nationality" placeholder="请选择民族" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_nationality"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="政治面貌" prop="politicalStatus">
        <el-select v-model="queryParams.politicalStatus" placeholder="请选择政治面貌" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_political"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="中心" prop="center">
        <el-input
          v-model="queryParams.center"
          placeholder="请输入中心"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="岗位" prop="position">
        <el-input
          v-model="queryParams.position"
          placeholder="请输入岗位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职级" prop="jobLevel">
        <el-input
          v-model="queryParams.jobLevel"
          placeholder="请输入职级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="班组" prop="team">
        <el-input
          v-model="queryParams.team"
          placeholder="请输入班组"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用工性质" prop="employmentType">
        <el-select v-model="queryParams.employmentType" placeholder="请选择用工性质" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_employmenttype"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="入职时间" prop="hireDate">
        <el-date-picker clearable
          v-model="queryParams.hireDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择入职时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="转正时间" prop="confirmDate">
        <el-date-picker clearable
          v-model="queryParams.confirmDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择转正时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="籍贯" prop="originPlace">
        <el-input
          v-model="queryParams.originPlace"
          placeholder="请输入籍贯"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="户籍性质" prop="hukouType">
        <el-select v-model="queryParams.hukouType" placeholder="请选择户籍性质" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_hukoutype"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="家庭住址" prop="homeAddress">
        <el-input
          v-model="queryParams.homeAddress"
          placeholder="请输入家庭住址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="婚姻状况" prop="maritalStatus">
        <el-select v-model="queryParams.maritalStatus" placeholder="请选择婚姻状况" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_marital"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="紧急联系人" prop="emergencyContact">
        <el-input
          v-model="queryParams.emergencyContact"
          placeholder="请输入紧急联系人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="工龄" prop="workYears">
        <el-input
          v-model="queryParams.workYears"
          placeholder="请输入工龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="学历" prop="education">
        <el-select v-model="queryParams.education" placeholder="请选择学历" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_education"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="证书" prop="certification">
        <el-input
          v-model="queryParams.certification"
          placeholder="请输入证书"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="招聘渠道" prop="recruitmentChannel">
        <el-input
          v-model="queryParams.recruitmentChannel"
          placeholder="请输入招聘渠道"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="车辆信息" prop="vehicleInfo">
        <el-input
          v-model="queryParams.vehicleInfo"
          placeholder="请输入车辆信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="上家单位信息" prop="previousEmployer">
        <el-input
          v-model="queryParams.previousEmployer"
          placeholder="请输入上家单位信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="住宿" prop="accommodation">
        <el-input
          v-model="queryParams.accommodation"
          placeholder="请输入住宿"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="毕业院校" prop="almaMater">
        <el-input
          v-model="queryParams.almaMater"
          placeholder="请输入毕业院校"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所学专业" prop="major">
        <el-input
          v-model="queryParams.major"
          placeholder="请输入所学专业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="晋升/调动信息" prop="promotionInfo">
        <el-input
          v-model="queryParams.promotionInfo"
          placeholder="请输入晋升/调动信息"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="合同编号" prop="contractNumber">
        <el-input
          v-model="queryParams.contractNumber"
          placeholder="请输入合同编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="合同类型" prop="contractType">
        <el-select v-model="queryParams.contractType" placeholder="请选择合同类型" clearable>
          <el-option
            v-for="dict in dict.type.personnel_archives_contracttype"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="合同开始时间" prop="contractStart">
        <el-date-picker clearable
          v-model="queryParams.contractStart"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择合同开始时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="合同结束时间" prop="contractEnd">
        <el-date-picker clearable
          v-model="queryParams.contractEnd"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择合同结束时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['personnel:archives:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['personnel:archives:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['personnel:archives:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['personnel:archives:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="archivesList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="编号" align="center" prop="id" />
      <el-table-column label="工号" align="center" prop="workNumber" />
      <el-table-column label="姓名" align="center" prop="name" />
      <el-table-column label="身份证号" align="center" prop="idCard" />
      <el-table-column label="联系方式" align="center" prop="contactNumber" />
      <el-table-column label="性别" align="center" prop="gender">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_gender" :value="scope.row.gender"/>
        </template>
      </el-table-column>
      <el-table-column label="民族" align="center" prop="nationality">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_nationality" :value="scope.row.nationality"/>
        </template>
      </el-table-column>
      <el-table-column label="政治面貌" align="center" prop="politicalStatus">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_political" :value="scope.row.politicalStatus"/>
        </template>
      </el-table-column>
      <el-table-column label="中心" align="center" prop="center" />
      <el-table-column label="岗位" align="center" prop="position" />
      <el-table-column label="职级" align="center" prop="jobLevel" />
      <el-table-column label="班组" align="center" prop="team" />
      <el-table-column label="用工性质" align="center" prop="employmentType">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_employmenttype" :value="scope.row.employmentType"/>
        </template>
      </el-table-column>
      <el-table-column label="入职时间" align="center" prop="hireDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.hireDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="转正时间" align="center" prop="confirmDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.confirmDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="籍贯" align="center" prop="originPlace" />
      <el-table-column label="户籍性质" align="center" prop="hukouType">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_hukoutype" :value="scope.row.hukouType"/>
        </template>
      </el-table-column>
      <el-table-column label="家庭住址" align="center" prop="homeAddress" />
      <el-table-column label="婚姻状况" align="center" prop="maritalStatus">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_marital" :value="scope.row.maritalStatus"/>
        </template>
      </el-table-column>
      <el-table-column label="紧急联系人" align="center" prop="emergencyContact" />
      <el-table-column label="工龄" align="center" prop="workYears" />
      <el-table-column label="学历" align="center" prop="education">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_education" :value="scope.row.education"/>
        </template>
      </el-table-column>
      <el-table-column label="证书" align="center" prop="certification" />
      <el-table-column label="招聘渠道" align="center" prop="recruitmentChannel" />
      <el-table-column label="车辆信息" align="center" prop="vehicleInfo" />
      <el-table-column label="上家单位信息" align="center" prop="previousEmployer" />
      <el-table-column label="住宿" align="center" prop="accommodation" />
      <el-table-column label="毕业院校" align="center" prop="almaMater" />
      <el-table-column label="所学专业" align="center" prop="major" />
      <el-table-column label="晋升/调动信息" align="center" prop="promotionInfo" />
      <el-table-column label="合同编号" align="center" prop="contractNumber" />
      <el-table-column label="合同类型" align="center" prop="contractType">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.personnel_archives_contracttype" :value="scope.row.contractType"/>
        </template>
      </el-table-column>
      <el-table-column label="合同开始时间" align="center" prop="contractStart" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.contractStart, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="合同结束时间" align="center" prop="contractEnd" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.contractEnd, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['personnel:archives:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['personnel:archives:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改人事档案花名册对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="工号" prop="workNumber">
          <el-input v-model="form.workNumber" placeholder="请输入工号" />
        </el-form-item>
        <el-form-item label="姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入姓名" />
        </el-form-item>
        <el-form-item label="身份证号" prop="idCard">
          <el-input v-model="form.idCard" placeholder="请输入身份证号" />
        </el-form-item>
        <el-form-item label="联系方式" prop="contactNumber">
          <el-input v-model="form.contactNumber" placeholder="请输入联系方式" />
        </el-form-item>
        <el-form-item label="性别" prop="gender">
          <el-select v-model="form.gender" placeholder="请选择性别">
            <el-option
              v-for="dict in dict.type.personnel_archives_gender"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="民族" prop="nationality">
          <el-select v-model="form.nationality" placeholder="请选择民族">
            <el-option
              v-for="dict in dict.type.personnel_archives_nationality"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="政治面貌" prop="politicalStatus">
          <el-select v-model="form.politicalStatus" placeholder="请选择政治面貌">
            <el-option
              v-for="dict in dict.type.personnel_archives_political"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="中心" prop="center">
          <el-input v-model="form.center" placeholder="请输入中心" />
        </el-form-item>
        <el-form-item label="岗位" prop="position">
          <el-input v-model="form.position" placeholder="请输入岗位" />
        </el-form-item>
        <el-form-item label="职级" prop="jobLevel">
          <el-input v-model="form.jobLevel" placeholder="请输入职级" />
        </el-form-item>
        <el-form-item label="班组" prop="team">
          <el-input v-model="form.team" placeholder="请输入班组" />
        </el-form-item>
        <el-form-item label="用工性质" prop="employmentType">
          <el-select v-model="form.employmentType" placeholder="请选择用工性质">
            <el-option
              v-for="dict in dict.type.personnel_archives_employmenttype"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="入职时间" prop="hireDate">
          <el-date-picker clearable
            v-model="form.hireDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择入职时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="转正时间" prop="confirmDate">
          <el-date-picker clearable
            v-model="form.confirmDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择转正时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="籍贯" prop="originPlace">
          <el-input v-model="form.originPlace" placeholder="请输入籍贯" />
        </el-form-item>
        <el-form-item label="户籍性质" prop="hukouType">
          <el-select v-model="form.hukouType" placeholder="请选择户籍性质">
            <el-option
              v-for="dict in dict.type.personnel_archives_hukoutype"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="家庭住址" prop="homeAddress">
          <el-input v-model="form.homeAddress" placeholder="请输入家庭住址" />
        </el-form-item>
        <el-form-item label="婚姻状况" prop="maritalStatus">
          <el-select v-model="form.maritalStatus" placeholder="请选择婚姻状况">
            <el-option
              v-for="dict in dict.type.personnel_archives_marital"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="紧急联系人" prop="emergencyContact">
          <el-input v-model="form.emergencyContact" placeholder="请输入紧急联系人" />
        </el-form-item>
        <el-form-item label="工龄" prop="workYears">
          <el-input v-model="form.workYears" placeholder="请输入工龄" />
        </el-form-item>
        <el-form-item label="学历" prop="education">
          <el-select v-model="form.education" placeholder="请选择学历">
            <el-option
              v-for="dict in dict.type.personnel_archives_education"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="证书" prop="certification">
          <el-input v-model="form.certification" placeholder="请输入证书" />
        </el-form-item>
        <el-form-item label="招聘渠道" prop="recruitmentChannel">
          <el-input v-model="form.recruitmentChannel" placeholder="请输入招聘渠道" />
        </el-form-item>
        <el-form-item label="车辆信息" prop="vehicleInfo">
          <el-input v-model="form.vehicleInfo" placeholder="请输入车辆信息" />
        </el-form-item>
        <el-form-item label="上家单位信息" prop="previousEmployer">
          <el-input v-model="form.previousEmployer" placeholder="请输入上家单位信息" />
        </el-form-item>
        <el-form-item label="住宿" prop="accommodation">
          <el-input v-model="form.accommodation" placeholder="请输入住宿" />
        </el-form-item>
        <el-form-item label="毕业院校" prop="almaMater">
          <el-input v-model="form.almaMater" placeholder="请输入毕业院校" />
        </el-form-item>
        <el-form-item label="所学专业" prop="major">
          <el-input v-model="form.major" placeholder="请输入所学专业" />
        </el-form-item>
        <el-form-item label="晋升/调动信息" prop="promotionInfo">
          <el-input v-model="form.promotionInfo" placeholder="请输入晋升/调动信息" />
        </el-form-item>
        <el-form-item label="合同编号" prop="contractNumber">
          <el-input v-model="form.contractNumber" placeholder="请输入合同编号" />
        </el-form-item>
        <el-form-item label="合同类型" prop="contractType">
          <el-select v-model="form.contractType" placeholder="请选择合同类型">
            <el-option
              v-for="dict in dict.type.personnel_archives_contracttype"
              :key="dict.value"
              :label="dict.label"
              :value="dict.value"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="合同开始时间" prop="contractStart">
          <el-date-picker clearable
            v-model="form.contractStart"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择合同开始时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="合同结束时间" prop="contractEnd">
          <el-date-picker clearable
            v-model="form.contractEnd"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择合同结束时间">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listArchives, getArchives, delArchives, addArchives, updateArchives } from "@/api/personnel/archives";

export default {
  name: "Archives",
  dicts: ['personnel_archives_employmenttype',
    'personnel_archives_nationality',
    'personnel_archives_contracttype',
    'personnel_archives_hukoutype',
    'personnel_archives_political',
    'personnel_archives_marital',
    'personnel_archives_gender',
    'personnel_archives_education'],
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 人事档案花名册表格数据
      archivesList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        workNumber: null,
        name: null,
        idCard: null,
        contactNumber: null,
        gender: null,
        nationality: null,
        politicalStatus: null,
        center: null,
        position: null,
        jobLevel: null,
        team: null,
        employmentType: null,
        hireDate: null,
        confirmDate: null,
        originPlace: null,
        hukouType: null,
        homeAddress: null,
        maritalStatus: null,
        emergencyContact: null,
        workYears: null,
        education: null,
        certification: null,
        recruitmentChannel: null,
        vehicleInfo: null,
        previousEmployer: null,
        accommodation: null,
        almaMater: null,
        major: null,
        promotionInfo: null,
        contractNumber: null,
        contractType: null,
        contractStart: null,
        contractEnd: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        workNumber: [
          { required: true, message: "工号不能为空！", trigger: "blur" }
        ],
        name: [
          { required: true, message: "姓名不能为空！", trigger: "blur" }
        ],
        gender:[
          {required:true,message:"性别不能为空！",triggrr:"blur"}
        ],
        idCard: [
          { required: true, message: "身份证号不能为空！", trigger: "blur" }
        ],
        contactNumber: [
          {requirde:true,message:"联系方式不能为空！",trigger:"blur"}
        ],
        emergencyContact:[
          {requirde:true,message:"紧急联系人不能为空！",trigger:"blur"}
        ],

      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询人事档案花名册列表 */
    getList() {
      this.loading = true;
      listArchives(this.queryParams).then(response => {
        this.archivesList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        workNumber: null,
        name: null,
        idCard: null,
        contactNumber: null,
        gender: null,
        nationality: null,
        politicalStatus: null,
        center: null,
        position: null,
        jobLevel: null,
        team: null,
        employmentType: null,
        hireDate: null,
        confirmDate: null,
        originPlace: null,
        hukouType: null,
        homeAddress: null,
        maritalStatus: null,
        emergencyContact: null,
        workYears: null,
        education: null,
        certification: null,
        recruitmentChannel: null,
        vehicleInfo: null,
        previousEmployer: null,
        accommodation: null,
        almaMater: null,
        major: null,
        promotionInfo: null,
        contractNumber: null,
        contractType: null,
        contractStart: null,
        contractEnd: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加人事档案花名册";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getArchives(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改人事档案花名册";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateArchives(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addArchives(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除人事档案花名册编号为"' + ids + '"的数据项？').then(function() {
        return delArchives(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('personnel/archives/export', {
        ...this.queryParams
      }, `archives_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
