# Architecture (showcase)

```
Vue (admin + portal)
    |  REST JSON
Spring Boot
    |  MyBatis
MySQL  (book / borrow_record / seat_reservation / forum_post ...)
```

## Modules (full product)

| Module | Description |
|--------|-------------|
| Auth | Login, roles (admin/manager/user) |
| Books | Category, inventory, on/off shelf |
| Borrow | Borrow / return / history |
| Seats | Reading-room seat reservation |
| Activities | Campus reading events |
| Forum | Simple community posts |

This public repo only ships **sample** controller/service/SQL/Vue pieces under `samples/`.