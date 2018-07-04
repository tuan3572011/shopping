insert into product(id,name,description,images,thumbnail)
values
(1,'USD','Đồng đô la m','This is img','This is thumbnail'),
(2,'VND','Đồng VN','This is img','This is thumbnail'),
(3,'JPM','Đồng Nhật','This is img','This is thumbnail'),
(4,'CHF','Đồng Thụy Sĩ','This is img','This is thumbnail');
insert into category(id, name)
values(1, 'Tiền tệ');

insert into category_product(category_id, product_id)
values
(1,1),
(1,2),
(1,3),
(1,4);