-- Brand
INSERT INTO brand (id, brand_group_id, brand_group_code) VALUES
(1, 500, 'INDITEX-ZARA');


-- Product
INSERT INTO product (id, brand_id, type, kind, state, name, section, section_name, family_id, family_name, subfamily_id, subfamily_name, first_visible_date) VALUES
(1, 1, 'Clothing', 'Dress', 'Active', 'Zara Summer Dress', 10, 'Women', 100, 'Dresses', 1001, 'Summer', '2023-05-01'),
(2, 1, 'Clothing', 'Shirt', 'Active', 'Zara Casual Shirt', 11, 'Men', 101, 'Shirts', 1002, 'Casual', '2023-04-15'),
(3, 1, 'Footwear', 'Sneakers', 'Active', 'Zara White Sneakers', 12, 'Unisex', 102, 'Footwear', 1003, 'Sneakers', '2023-03-20'),
(4, 1, 'Accessories', 'Bag', 'Active', 'Zara Leather Bag', 13, 'Women', 103, 'Bags', 1004, 'Leather', '2023-06-10'),
(35455, 1, 'Clothing', 'Shirt', 'Active', 'Camisa blanca', 13, 'Men', 103, 'Bags', 1004, 'Casual', '2023-06-10');

-- Price
INSERT INTO price (price_list, brand_id, product_id, start_date, end_date, priority, price, currency) VALUES
(1, 1, 35455, '2020-06-14 00.00.00', '2020-12-31 23.59.59', 0, 35.50, 'EUR'),
(2, 1, 35455, '2020-06-14 15.00.00', '2020-06-14 18.30.00', 1, 25.45, 'EUR'),
(3, 1, 35455, '2020-06-15 00.00.00', '2020-06-15 11.00.00', 1, 30.50, 'EUR'),
(4, 1, 35455, '2020-06-15 16.00.00', '2020-12-31 23.59.59', 1, 38.98, 'EUR');
