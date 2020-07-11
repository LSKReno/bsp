# 跨境电商借卖平台


## 跨域
跨域在gateway的启动类里进行配置，目前是使用了通配符*进行的全匹配


## 后端分工
> 后端微服务部分主要由三位同学合力完成，分别为马焜，常柏雨，李思宽。
> 他们的分工如下所示：

### 马焜的工作
1. MVO information maintenance
   1. get brands list
   2. save brand
   3. remove brand
   4. get company Info
   5. save Company Info
2. BVO information maintenance
   1. get BVO info
   2. save BVO info
   3. get Online Stores
   4. add Online Store
3. MVO/BVO order management
   1. getSalSalesOrderLineItemControllerList
   2. add item
   3. get sao sales order list
   4. change to shipped
   5. get bvo order list
   6. add sao sales order
   7. get address
   8. add address
   9. add sto store order
   10. pay

### 常铂雨的工作
- MVO商品信息
   - 增
   - 删
   - 改
   - 查
- MVO商品分类&主图
   - 增
   - 删
   - 改
   - 查
- BVO商品浏览
- BVO心愿单
   - 增
   - 删
   - 查
- BVO借卖
- 钱包
   - 注册
   - 账户查询
   - BVO充值
   - MVO提现

