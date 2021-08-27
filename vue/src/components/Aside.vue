<template>
<div>
  <el-menu
      default-active="2"
      style="width: 200px;min-height: calc(100vh - 50px)"
      class="el-menu-vertical-demo">
    <el-submenu index="1">
      <template #title>
        <i class="el-icon-location"></i>
        <span>导航一</span>
      </template>
        <el-menu-item index="1-4-1">选项1-1</el-menu-item>
    </el-submenu>
    <el-menu-item index="2">
      <i class="el-icon-menu"></i>
      <template #title>导航二</template>
    </el-menu-item>
    <el-menu-item index="3">
      <i class="el-icon-document"></i>
      <template #title>导航三</template>
    </el-menu-item>
    <el-menu-item index="4">
      <i class="el-icon-setting"></i>
      <template #title>导航四</template>
    </el-menu-item>
  </el-menu>
</div>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>