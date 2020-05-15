---- PRODUCT CATEGORIES ---- INSERT START ----
INSERT INTO product_category (product_category_id, product_category_name, product_category_description, created_date, last_modified_date) 
    VALUES (product_cat_seq.nextval, 'Electronics', 'These are electronics' , sysdate, sysdate);
INSERT INTO product_category (product_category_id, product_category_name, product_category_description, created_date, last_modified_date) 
    VALUES (product_cat_seq.nextval, 'Books', 'These are books' , sysdate, sysdate);
INSERT INTO product_category (product_category_id, product_category_name, product_category_description, created_date, last_modified_date) 
    VALUES (product_cat_seq.nextval, 'Fashion', 'These are fashion products' , sysdate, sysdate);
---- PRODUCT CATEGORIES ---- INSERT END ----
---- PRODUCT TYPES ---- INSERT START ----
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'PHONE', 'Phone using which you can call', 10001, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'LAPTOP', 'This is the small computer', 10001, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'TV', 'Television you can watch', 10001, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'TEXTBOOK', 'Textbooks used in College', 10002, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'FICTION', 'Fictional novels, I usually dont like these', 10002, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'NON-FICTION', 'I love these', 10002, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'JEWELLERY', 'Jewellery for men and women', 10003, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'SHOES', 'Shoes for men and women', 10003, SYSDATE, SYSDATE);
INSERT INTO product_type (product_type_id, product_type_name, product_type_description, product_category_id, created_date, last_modified_date) 
    VALUES (PRODUCT_TYPE_SEQ.nextval, 'APPAREL', 'Apparel for men and women', 10003, SYSDATE, SYSDATE);
---- PRODUCT TYPES ---- INSERT END ----
---- PRODUCT ---- INSERT START ----
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'IPHONE X', 'XXLAMZDFAT', 'cb835c52169240f58708f40b4f5a46962', 'Phone from Apple iPhone X', 1099.99, 20001, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Google Pixel', 'SBBURA2H5V', '52cadad0ce92443282a346327fb15526', 'Phone from Google', 899.99, 20001, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Samsung S9', '2ZIOTOE72R', '201af9d18b0941eb8c8a89a7585d3ed6', 'Phone from Samsung', 1199.99, 20001, SYSDATE, SYSDATE);
 
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'HP STREAM 14', 'WG01N852FI', '6ab9a02007174384b85c28a8ca3ecb71', 'The best laptop in 2020 for solid performance at a truly bargain price point is the HP Stream 14.', 799.99, 20002, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'APPLE MACBOOK AIR ', 'A44AMCBY58', '4584f65f6bd44dd88567d05d275ad23c', 'The Apple MacBook Air 2020 is a superb laptop if you prize a premium design and portability.', 999.99, 20002, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'DELL XPS 13', 'YBYO2MDUTV', 'f464fbd2c2d44216885004b924e6857b', 'The Dell XPS 13 is a fantastic all-round system. Thats why it sits at the top of the best laptop guide', 699.99, 20002, SYSDATE, SYSDATE);

    
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'LG C9 OLED TV', 'DCIJ6KGOIT', 'a40836ad00cf4f9e86e927a6756bffe6', 'The best 4K TV overall', 2145.00, 20003, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Vizio M Series Quantum', 'EGFVHAW5R5', '729bdfeab9764fce9382c09036ed64e4', 'Our favorite smart-TV value', 948.98, 20003, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Sony Master Series A9G OLED TV', 'DQZKRORS7U', '8a24b620b261447583cb785916bac4f5', 'Phone from Apple iPhone X', 2299.99, 20003, SYSDATE, SYSDATE);
    
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Modern Quantum Mechanics', '0Y3EG1E87L', '680038257d704e80b3ff981849276394', 'Modern Quantum Mechanics is a classic graduate level textbook',41.44, 20004, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Principles of Microeconomics', 'O75PZU7UN5', '4681a6148c8c4ddba64546ebdc8fd238', 'An innovative instructor uses his tested insights and successful teaching practices to create a truly student-centered approach',79.49, 20004, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Principles of Neural Science', 'OTEK8UBUX1', '5b27858cfa904b3694673deb2691e4b5', 'First published in 1981 by Elsevier, Principles of Neural Science is an influential neuroscience textbook edited by Eric R. Kandel, James H. Schwartz, and Thomas M. Jessell', 66.15, 20004, SYSDATE, SYSDATE);
    
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'To Kill a Mockingbird', 'D24FQ5XTOL', '125a50ebf3ed49069d33290affd1662c', 'The novel won a Pulitzer Prize in 1961 and the next year was made into an Academy Award-winning film', 29.99, 20005, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'The Great Gatsby', 'BW6XY0ATWG', '25127add6e02434aad767816f4114c2e', 'The Great Gatsby is distinguished as one of the greatest texts for introducing students to the art of reading literature', 31.99, 20005, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'One Hundred Years of Solitude', 'Q6CZ589ZC6', '6baaae8710ab4611a4ab90d26ff416ad', 'The late Colombian author Gabriel published his most-famous work', 25.99, 20005, SYSDATE, SYSDATE);

INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'When Breath Becomes Air', 'YEW03DJUCJ', '95df38c247a04c3fb950a389bcf84156', 'by Paul Kalanithi', 15.99, 20006, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Sapiens: A Brief History of Humankind', 'PUEH3BSLBW', '0b5242605f7d45b9bba669cb745dd4a8', 'by Yuval Noah Harari', 19.99, 20006, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Into Thin Air: A Personal Account of the Mt. Everest Disaster', 'TAN9F0ZVIS', '33b2b47fa25f49a1b4e50cfcf95b84e8', 'by Jon Krakauer', 25.54, 20006, SYSDATE, SYSDATE);

INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Gold Ring', '9LCB5U5NNL', 'd0850f2b10a646cd85ccd2b2a9e94046', 'This is a gold ring', 599.99, 20007, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Silver Necklace', '78PF23SG1M', '5c4ea44cf99f48559efecd45712e39b7', 'This is a silver necklace', 799.99, 20007, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Men Watch', '4ZAPWNNQ6O', '0eacec82b03f4459987c823a1233ccf6', 'A nice watch', 299.99, 20007, SYSDATE, SYSDATE);
    
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Addidas Sports Shoes', 'NR42UZQ64P', 'fb2a328ca7304e3c8a12b2e8cc3833e5', 'An Addidas shoes', 65.99, 20008, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Reebok Crossfit Shoes', 'GZ5IUMCFWP', 'ef4b5787d8f9493fa6e444021b95df98', 'Crossfit Shoes', 79.99, 20008, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Asics Shoes', 'WE46GYNEDF', 'f28b74240cf6435195604c90ea825ffc', 'Asics Shoes', 99.99, 20008, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Timberland Shirt', '5M8H1AV094', 'a4ef98a5660d4c4eb60462483914cce2', 'Timberland Shirts', 29.99, 20009, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Ralph Lauren Shirt', 'DTLULLO39A', 'b5cfd577ef614c8ab2c8051710156a88', 'Ralph Lauren Shirts', 19.99, 20009, SYSDATE, SYSDATE);
INSERT INTO PRODUCT(product_id, product_name, product_number, serial_number, product_description, product_price, product_type_id, created_date, last_modified_date)
    VALUES (PRODUCT_SEQUENCE.nextval, 'Polo Shirts', 'QAJ8LQNNC0', '099de54c2b3f44079d9ac3b6ba33099f', 'Polo short shirts', 19.99, 20009, SYSDATE, SYSDATE);















