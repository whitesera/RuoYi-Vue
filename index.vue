<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-collapse accordion>
        <el-collapse-item title="基本信息">
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
        </el-collapse-item>
        <el-collapse-item title="岗位信息">
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
        </el-collapse-item>
        <el-collapse-item title="时间信息">
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
        </el-collapse-item>
        <!-- Add more collapsible items as needed -->
      </el-collapse>
      <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
      <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
    </el-form>

    <!-- Other parts of the template remain unchanged -->
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
      // ... other data properties
    };
  },
  methods: {
    // ... other methods
  }
};
</script>