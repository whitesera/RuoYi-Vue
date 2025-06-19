<!--首页页面-->
<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        <blockquote class="text-warning" style="font-size: 28px">
          欢迎使用管理系统！
        </blockquote>
        <hr />
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>系统测试中</h2>
        <p>
        </p>
        <!--<p>-->
        <!--  <b>当前系统框架版本:</b> <span>v{{ version }}</span>-->
        <!--</p>-->
        <p>
          <el-button
            type="primary"
            size="mini"
            icon="el-icon-s-order"
            plain
            @click="goTarget('http://116.62.146.15/task/todo')"
            >点击跳转至待办任务</el-button
          >
          <el-button
            size="mini"
            icon="el-icon-notebook-1"
            plain
            @click="goTarget('http://116.62.146.15/personnel/archives')"
            >点击跳转至花名册</el-button
          >
        </p>
      </el-col>

      <!--<el-col :sm="24" :lg="12" style="padding-left: 50px">-->
      <!--  <el-row>-->
      <!--    <el-col :span="12">-->
      <!--      <h2>小标题h2h2h2</h2>-->
      <!--    </el-col>-->
      <!--  </el-row>-->
      <!--  <el-row>-->
      <!--    <el-col :span="6">-->
      <!--      <h4>公告</h4>-->
      <!--      <ul>-->
      <!--        <li>本周六8点到22点</li>-->
      <!--        <li>在中心开展福利活动</li>-->
      <!--        <li>请大家互相转告参与</li>-->
      <!--        <li>...</li>-->
      <!--      </ul>-->
      <!--    </el-col>-->
      <!--    <el-col :span="6">-->
      <!--      <h4>恭喜！</h4>-->
      <!--      <ul>-->
      <!--        <li>您在福利活动中</li>-->
      <!--        <li>获得一等奖</li>-->
      <!--        <li>请尽快领取</li>-->
      <!--        <li>...</li>-->
      <!--      </ul>-->
      <!--    </el-col>-->
      <!--  </el-row>-->
      <!--</el-col>-->
    </el-row>
    <el-divider />
    <el-row :gutter="20" class="equal-cards">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log full-height">
          <div slot="header" class="clearfix">
            <span>联系信息</span>
          </div>
          <div class="body">
            系统测试中
            如遇到问题BUG
            请联系管理员
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log full-height">
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log full-height">
          <div slot="header" class="clearfix">
            <span>图片展示</span>
          </div>
          <div class="body">
            <!-- 走马灯组件 -->
            <el-carousel height="200px">
              <el-carousel-item v-for="item in carouselItems" :key="item">
                <img :src="item.imageUrl" alt="carousel" style="width: 100%; height: 100%; object-fit: cover;" />
              </el-carousel-item>
            </el-carousel>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.8.9",

      carouselItems: [
        { imageUrl: require('@/assets/images/infinity-391278.jpg') },
        { imageUrl: require('@/assets/images/infinity-1578883.jpg') },
        { imageUrl: require('@/assets/images/infinity-1762124.jpg') }
      ]
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    }
  }
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }

  .equal-cards {
    display: flex;
    align-items: stretch; /* 让 el-col 等高 */
  }

  .card-col {
    height: 100%;
  }

  .full-height {
    height: 100%;
    display: flex;
    flex-direction: column;
  }

    full-height.body {
      flex: 1;
      overflow-y: auto;
    }
}
</style>

