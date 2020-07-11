

# 跨境电商借卖平台


## 一、组内分工
> 后端微服务部分主要由三位同学合力完成，分别为马焜，常柏雨，李思宽。
> 他们的分工如下所示：

### 马焜的工作
1. MVO information maintenance
   - [x] get brands list
   - [x] save brand
   - [x] remove brand
   - [x] get company Info
   - [x] save Company Info
2. BVO information maintenance
   - [x] get BVO info
   - [x] save BVO info
   - [x] get Online Stores
   - [x] add Online Store
3. MVO/BVO order management
   - [x] getSalSalesOrderLineItemControllerList
   - [x] add item
   - [x] get sao sales order list
   - [x] change to shipped
   - [x] get bvo order list
   - [x] add sao sales order
   - [x] get address
   - [x] add address
   - [x] add sto store order
   - [ ] pay

### 常铂雨的工作
- MVO商品信息
   - [x] 增
   - [x] 删
   - [x] 改
   - [x] 查
- MVO商品分类&主图
   - [x] 增
   - [x] 删
   - [x] 改
   - [x] 查
- BVO商品浏览
- BVO心愿单
   - [x] 增
   - [x] 删
   - [x] 查
- BVO借卖
- 钱包
   - [x] 注册
   - [x] 账户查询
   - [ ] BVO充值
   - [ ] MVO提现

### 李思宽的工作

1. 用户登录
   - [x] 登录模块
   - [x] 验证码模块（Redis工具包）
   - [x] JWT拦截校验模

2. 用户注册
   - [x] 注册模块

3. 菜单管理
   - [x] 根据角色权限获取菜单
   - [x] 菜单相关增删改查
4. 角色管理
   - [x] 角色相关增删改查

5. 角色权限管理
   - [x] 角色相关权限更改
6. 财务审核
   - [ ] 财务审核