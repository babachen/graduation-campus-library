<template>
  <div class="book-list">
    <h2>图书列表（展示组件）</h2>
    <el-input v-model="keyword" placeholder="搜索书名" clearable @keyup.enter="load" />
    <el-table :data="rows" v-loading="loading">
      <el-table-column prop="title" label="书名" />
      <el-table-column prop="category" label="分类" width="120" />
      <el-table-column prop="stock" label="库存" width="80" />
    </el-table>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const keyword = ref('')
const rows = ref([])
const loading = ref(false)

async function load() {
  loading.value = true
  try {
    const { data } = await axios.get('/api/books', { params: { keyword: keyword.value } })
    rows.value = data?.data?.records || []
  } finally {
    loading.value = false
  }
}

onMounted(load)
</script>