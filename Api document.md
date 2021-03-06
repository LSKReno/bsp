# Api document

base url: /system

return:

ResponseDto:{  

"code": "string",  

"content": {},  

"message": "string",  

"success": true }

## 获取BVO信息

url: /DsrDropshipperController/getBVOInfo

```
@RequestBody SysUserDto sysUserDto
```

return content type: DsrDropshipperDto

```
describe:
	根据sysuser的userid来查询dsr_dropshipper表,把得到的借卖方信息组装传回给前端
```



## 保存BVO信息

url: /DsrDropshipperController/saveBVOInfo

```
@RequestBody Map<String,Object> request
```

{

"SysUserDto":{},

"DsrDropshipperDto":{}

}

return content type: DsrDropshipperDto

```
describe:
	前端向后端发送组装好的数据，里面包括sysUserDto和DsrDropshipperDto两个对象,后端会查找sysuserdto的manbuyerid是否存在来判断是新插入一个dsrdropshipper还是update一个dsrdropshipper
```



## 获取商店列表

url: /StrStoreController/getOnlineStores

```
@RequestBody SysUserDto sysUserDto
```

return content type: List<StrStoreDto>

```
describe：
	根据sysuser的userid来查询str_store表,把得到的借卖方信息组装传回给前端
```



## 添加商店

url: /StrStoreController/addOnlineStore

```
@RequestBody Map<String,Object> request
```

{

“SysUserDto”:{},

"StrStoreDto":{}

}

return content type: SysUserDto

```
describe:
  前端向后端发送组装好的数据，里面包括sysUserDto和StrStoreDto两个对象后端会查找sysuserdto的manbuyerid是否存在来判断是新插入一个StrStore还是update一个StrStore
```



## 获取品牌列表

url: /BrdBrandController/getBrandsList

```
@RequestBody ManManufacturerDto manManufacturerDto
```

return content type: List<BrdBrandDto>

```
describe:
	前端向后端发送manmanufacturedto数据，调用并查询brd_brand表。
```



## 保存品牌

url: /BrdBrandController/saveBrand

```
@RequestBody BrdBrandDto brdBrandDto
```

return content type: null

```
describe：
	前端发送一个brdbrandDto，后端调用数据库并封装返回前端
```



## 删除品牌

url:  /BrdBrandController/removeBrand

```
@RequestBody BrdBrandDto brdBrandDto
```

return content type: null

```
describe:
	前端发送一个BrdBrandDto到后端，后端调用数据库并返回结果到前端
```



## 获取公司信息（MVO信息）

url: /CompanyInformationController/getCompanyInfo

```
@RequestBody SysUserDto sysUserDto
```

return content type: ManManufacturerDto

## 保存公司信息（MVO信息）

url: /CompanyInformationController/saveCompanyInfo

```
@RequestBody Map<String,Object> request
```

{

"SysUserDto":{},

"ManManufactureDto":{}

}

return content type: SysUserDto

## 获取销售订单明细列表

url: /SalSalesOrderLineItemController/getSalSalesOrderLineItemControllerList

```
@RequestBody SaoSalesOrderDto saoSalesOrderDto
```

return content type: List<OrderItemWithProductDto>

## 添加销售订单明细

url: /SalSalesOrderLineItemController/addItem

```
@RequestBody SalSalesOrderLineItemDto salSalesOrderLineItemDto
```

return content type: SalSalesOrderLineItemDto

## 添加销售订单列表

url: /SaOSalesOrderController/addSaoSalesOrder

```
@RequestBody SaoSalesOrderDto saoSalesOrderDto
```

return content type: SaoSalesOrderDto

## 修改订单状态为SHIPPED

url: /SaOSalesOrderController/changeToSHIPPED

```
@RequestBody SaoSalesOrderDto saoSalesOrderDto
```

return content type: null

## BVO获取订单

url: /SaOSalesOrderController/getBVOOrderList

```
@RequestBody Map<String,Object> request
```

{

"SysUserDto":{},

"ORDER_STS":""

}

return content type: List<StrWithOrderDto>

## 获取销售订单

url: /SaOSalesOrderController/getSaoSalesOrderList

```
@RequestBody Map<String, Object> request
```

{

"SysUserDto":{},

"ORDER_STS":""

}

return content type: List<SaoSalesOrderDto>

## 添加订单收货地址

url:  /AddressController/addAddress

```
@RequestBody ShaShippingAddressDto shaShippingAddressDto
```

return content type: ShaShippingAddressDto

## 获取订单收货地址

url: /AddressController/getAddress

```
@RequestBody SaoSalesOrderDto saoSalesOrderDto
```

return content type: ShaShippingAddressDto

## 添加原始订单明细

url: /SolStoreOrderItem/addItem

```
@RequestBody SolStoreOrderLineItemDto solStoreOrderLineItemDto
```

return content type: SolStoreOrderLineItemDto

## 添加原始订单

url: /StoStoreOrderController/addStoStoreOrder

```
@RequestBody StoStoreOrderDto stoStoreOrderDto
```

return content type: StoStoreOrderDto

## 付款

url: /wallerController/pay

```
@RequestBody Map<String, Object> request
```

{

“SysUserDto”:{},

"password":"",

"SaoSalesOrderDto":{}

}

return content type: null