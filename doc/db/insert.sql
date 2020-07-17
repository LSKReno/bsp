use bsp;
truncate table `sys_user`;
INSERT INTO `sys_user` VALUES (null, 'north_horse','123','mk',null, null, null,null,null,null, null,null,null,null,null,'0');
INSERT INTO `sys_user` VALUES (null, 'root','root','adim',null, null, null,null,null,null, null,null,null,null,null,'0');
INSERT INTO `sys_user` VALUES (null, 'BVO','BVO','BVO',null, null, null,null,null,null, null,null,null,null,1,'0');
INSERT INTO `sys_user` VALUES (null, 'MVO','MVO','MVO',null, null, null,null,null,null, null,null,null,null,1,'0');

truncate table `dsr_dropshipper`;
insert into `dsr_dropshipper` values (null, 'nike', 'BVO', '2020-7-7', '2020-7-7', NULL, '0', 'none', '1', '2020-7-7', NULL);

truncate table `str_store`;
insert into `str_store` values (null, '1', '1', 'alibaba', '0', 'BVO', '2020-7-7', 'BVO', '2020-7-7', '0', '0', 'none', 0);
insert into `str_store` values (null, '1', '2', 'TX', '1', 'BVO', '2020-7-7', 'BVO', '2020-7-7', '0', '0', 'none', 0);

truncate table `eba_ebay_authorization`;
insert into `eba_ebay_authorization` values (null, 1, 'root', 'root', '', 'string', NULL, 'string', NULL, '0', 'none', '0', '2020-07-10 14:59:08', '2020-07-10 14:59:08', '1', NULL);
insert into `eba_ebay_authorization` values (null, 2, 'root', 'root', '', 'string', NULL, 'string', NULL, '0', 'none', '0', '2020-07-10 14:59:08', '2020-07-10 14:59:08', '1', NULL);

truncate table `man_manufacturer`;
insert into `man_manufacturer` values (null, 'Apple', '苹果', '2', NULL, 'none', 'MVO', NULL, 'MVO', NULL, '0', 'none', '0', NULL);

truncate table `brd_brand`;
insert into `brd_brand` values (null, 1, 'KFC', 'KFC', 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, 'none', '0', '0');
insert into `brd_brand` values (null, 1, 'burgerKing', 'burgerKing', 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, 'none', '0', '0');

truncate table `pro_product`;
insert into `pro_product` values (null, '1', 1, 1, 'burger', null, null, null, '2020-7-7', 10, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 5, 30, 'burger', null, 'month', 3, 0);
insert into `pro_product` values (null, '2', 2, 1, 'ham', null, null, null, '2020-7-7', 10, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 5, 30, 'burger', null, 'month', 3, 0);
insert into `pro_product` values (null, '3', 1, 1, 'meet', null, null, null, '2020-7-7', 10, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 5, 30, 'burger', null, 'month', 3, 0);

truncate table `sto_store_order`;
insert into `sto_store_order` values (null, 1, '058-1233752', '2020-7-7', '2020-7-7', '2020-7-7', 'BVO', '2020-7-7', 'BVO', '2020-7-7', '0', 'none', 1, 1, null, 0);
insert into `sto_store_order` values (null, 2, '865826', '2020-7-7', '2020-7-7', '2020-7-7', 'BVO', '2020-7-7', 'BVO', '2020-7-7', '0', 'none', 1, 1, null, 0);

truncate table `sol_store_order_line_item`;
insert into `sol_store_order_line_item` values(null, null, 1, 10, 1, '1', 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 1, null, 0);
insert into `sol_store_order_line_item` values(null, null, 1, 10, 1, '2', 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 1, null, 0);
insert into `sol_store_order_line_item` values(null, null, 1, 10, 1, '3', 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 1, null, 0);

truncate table `sao_sales_order`;
insert into `sao_sales_order` values (null, 'BVO', '2020-7-7', 'BVO', '2020-7-7', 0, 'none', 1, 1, null, '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', 100, 10, 1, 'none', 'SO0000001', 'AwaitingPayment', 'CLOSE', 'SYNC', 1, 1, '2020-7-7', 4, null, '1', 0);
insert into `sao_sales_order` values (null, 'BVO', '2020-7-7', 'BVO', '2020-7-7', 0, 'none', 1, 1, null, '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', '2020-7-7', 100, 10, 1, 'none', 'SO0000001', 'AwaitingShipment', 'CLOSE', 'SYNC', 2, 1, '2020-7-7', 4, null, '1', 0);

truncate table `sal_sales_order_line_item`;
insert into `sal_sales_order_line_item` values (null, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 1, 1, 1, 10, null, null, 'yuantong', 0);
insert into `sal_sales_order_line_item` values (null, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 1, 2, 1, 10, null, null, 'yuantong', 0);
insert into `sal_sales_order_line_item` values (null, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 1, 3, 1, 10, null, null, 'yuantong', 0);
insert into `sal_sales_order_line_item` values (null, 'MVO', '2020-7-7', 'MVO', '2020-7-7', 0, null, 0, 2, 3, 1, 10, null, null, 'yuantong', 0);

truncate table `par_parameter`;
insert into `par_parameter` values (null, 'STOCK_TIME', 7, 'rest warning days', 'admin', '2020-7-7', 'admin', '2020-7-7', 0, null, 0, 0);
insert into `par_parameter` values (null, 'POUNDAGE', 0, 'withdrawFee', 'admin', '2020-7-7', 'admin', '2020-7-7', 0, null, 0, 0);

truncate table `cdm_code_master`;
insert into `cdm_code_master` values (null, 'SEX', 'gender', 1, 'male', null, 'admin', '2020-7-7', 'admin', '2020-7-7', 0, null, 0, 0);
insert into `cdm_code_master` values (null, 'SEX', 'gender', 2, 'female', null, 'admin', '2020-7-7', 'admin', '2020-7-7', 0, null, 0, 0);

truncate table `sha_shipping_address`;
insert into `sha_shipping_address` values (null, 'root', '2020-7-7', 'root', '2020-7-7', 0, null, 0, 'home', 'home', 'cn', 'CN', 'tj', 'TJ', 'TJ', null, null, null, 301600, null, null, 1, 'yuantong', 0);

truncate table `waa_wallet_account`;
insert into `waa_wallet_account` values (null, 'BVO', '875747176@qq.com', '12345', '2020-7-7', 'Y', 7, 'BVO', '2020-7-7', 'BVO', '2020-7-7', 1, null, 1, 0);

truncate table `waf_wallet_account_fund`;
insert into `waf_wallet_account_fund` values (null, 1000, 0, 0, 'BVO', '2020-7-7', 'BVO', '2020-7-7', 'RMB', 0);

truncate table `wtr_wallet_transaction_record`;
truncate table `waf_wallet_account_fund`;