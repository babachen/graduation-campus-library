# 校园图书借阅管理系统（展示版）

**关键词**：图书管理系统、校园图书借阅、座位预约、Spring Boot、Vue、毕业设计

> **展示仓库**：部分示例代码 + 架构说明。  
> **不是**完整可运行交付包。

---

## 相关链接（优先看这里）

| 说明 | 链接 |
|------|------|
| 计算机毕设定制官网 · 毕设无忧 | https://www.bysj.site |
| 课题工坊 · 项目列表 | https://app.bysj.site/?page=products |
| 开源展示清单 | https://github.com/babachen/bysj-open-source-catalog |
| 博客 · 选题落地指南 | https://www.bysj.site/blog/p/computer-science-graduation-project-guide |
| 博客 · 开题报告写法 | https://www.bysj.site/blog/p/how-to-write-proposal |
| 博客专栏 | https://www.bysj.site/blog/ |

**说明**：本仓库为教学展示 / 架构样例，仅包含部分模块说明与示例代码，**不是完整交付源码**。  
完整可运行项目、论文与部署辅导请通过 [官网](https://www.bysj.site) 或 [课题工坊](https://app.bysj.site/?page=products) 了解。

---

## 项目简介

校园图书借阅管理系统（展示版），面向高校图书管理与阅览场景，覆盖图书分类库存、借还流程、座位预约与活动社区等能力（完整版功能以交付为准）。

## 主要功能（产品范围）

- 图书分类与库存
- 借阅 / 归还流程（完整版）
- 阅览室座位预约（完整版）
- 阅读活动与简易论坛（完整版）

## 技术栈

Spring Boot + Vue + MySQL

## 本仓内容

| 路径 | 内容 |
|------|------|
| docs/ARCHITECTURE.md | 模块边界与结构说明 |
| samples/ | 小型自包含示例 |
| LICENSE | MIT |

示例文件：`samples/java/.../BookController.java`、`BookService.java`、`Result.java`、`samples/sql/schema-fragment.sql`、`samples/vue/BookList.vue`

## 建议阅读顺序

1. `docs/ARCHITECTURE.md`
2. `samples/sql/schema-fragment.sql`
3. `samples/java` 下 Controller + Service
4. 可选：`samples/vue`

## 声明

代码为开源教学改写，不是任何客户交付的逐字节导出。  
不要期望仅靠本仓库即可 `mvn spring-boot:run` 启动完整系统。

## License

MIT