<template>
  <el-config-provider :locale="locale">
  <div>

    <!-- 头部-->
    <Header/>
    <!--主体-->
    <div style="display: flex">
      <!--侧边栏-->
      <Aside/>
      <!--内容区域-->
      <router-view style="flex: 1"/>
    </div>
  </div>
  </el-config-provider>
</template>

<style>

</style>
<script>
import Header from "./components/Header";
import Aside from "@/components/Aside";
import { defineComponent } from 'vue'
import { ElConfigProvider } from 'element-plus'

import zhCn from 'element-plus/lib/locale/lang/zh-cn'

export default {
  name: "Layout",
  components: {
    Header,
    Aside,
    ElConfigProvider
  },
  setup() {
    return {
      locale: zhCn,
    }
  }
}
</script>
