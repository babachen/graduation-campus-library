# Campus Library Management System (Showcase)

![cover](./docs/cover.svg)


校园图书借阅管理系统（展示版）

> **Showcase repository** — partial educational code + architecture notes.  
> Not a full production dump. No student thesis files, no real secrets.

## Tech stack

Spring Boot + Vue + MySQL

## Features (product scope)

- 图书分类与库存
- 借阅 / 归还流程（完整版）
- 阅览室座位预约（完整版）
- 阅读活动与简易论坛（完整版）

## What's in this repo

| Path | Content |
|------|---------|
| `docs/ARCHITECTURE.md` | Module diagram & boundaries |
| `samples/` | Small, self-contained excerpts |
| `LICENSE` | MIT |

Included samples: samples/java/.../BookController.java, BookService.java, Result.java, samples/sql/schema-fragment.sql, samples/vue/BookList.vue

## Quick read path

1. Read `docs/ARCHITECTURE.md`
2. Skim `samples/sql/schema-fragment.sql`
3. Read one Controller + Service pair under `samples/java`
4. Optional: Vue snippet under `samples/vue`

## Disclaimer

- Code here is **rewritten for open source teaching**, not a byte-for-byte export of any client delivery.
- Do **not** expect `mvn spring-boot:run` to boot a full system from this repo alone.
- For a complete runnable graduation project (code + docs + deploy help), see the links below.


## Related / 相关链接

- 计算机毕设定制官网：**[毕设无忧](https://www.bysj.site)**  
- 在线课题工坊 / 项目成品展示：**[课题工坊 · 项目列表](https://app.bysj.site/?page=products)**  
- 更多开源展示清单：https://github.com/babachen/bysj-open-source-catalog  

> 本仓库为**教学展示 / 架构样例**，仅包含部分模块说明与示例代码，**不是**完整交付源码。  
> 完整可运行项目、论文与部署辅导请通过官网或课题工坊了解。


## 相关博客介绍（来自官网）

- 选题方法可参考：[计算机毕业设计选题与落地指南](https://www.bysj.site/blog/p/computer-science-graduation-project-guide)（catalog 内副本：[同步文](https://github.com/babachen/bysj-open-source-catalog/blob/main/blog/computer-science-graduation-project-guide.md)）
- 开题结构可参考：[如何准备开题报告](https://www.bysj.site/blog/p/how-to-write-proposal)

更多文章：https://www.bysj.site/blog/

## License

MIT