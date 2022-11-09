INSERT INTO `case_study_m4`.`position` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'Quản Lý');
INSERT INTO `case_study_m4`.`position` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'Nhân Viên');


INSERT INTO `case_study_m4`.`education_degree` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'Trung Cấp');
INSERT INTO `case_study_m4`.`education_degree` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'Cao Đẳng');
INSERT INTO `case_study_m4`.`education_degree` (`id`, `is_delete`, `name`) VALUES ('3', '1', 'Đại Học');
INSERT INTO `case_study_m4`.`education_degree` (`id`, `is_delete`, `name`) VALUES ('4', '1', 'Sau Đại Học');

INSERT INTO `case_study_m4`.`division` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'Sale-Marketing');
INSERT INTO `case_study_m4`.`division` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'Hành chính');
INSERT INTO `case_study_m4`.`division` (`id`, `is_delete`, `name`) VALUES ('3', '1', 'Phục vụ');
INSERT INTO `case_study_m4`.`division` (`id`, `is_delete`, `name`) VALUES ('4', '1', 'Quản lý');

INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('An1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Binh1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Yen1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Toan1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Phat1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Nghi1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Ha1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Dong1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Hoang1', '1', '123');
INSERT INTO `case_study_m4`.`app_user` (`user_name`, `is_delete`, `password`) VALUES ('Dao1', '1', '123');

INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('1', '295 Nguyễn Tất Thành, Đà Nẵng', '1970-11-07', 'annguyen@gmail.com', '456231786', '1', 'Nguyễn Văn An', '0901234121', '10000000', 'An1', '1', '3', '1');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('2', '22 Yên Bái, Đà Nẵng', '1997-04-09', 'binhlv@gmail.com', '654231234', '1', 'Lê Văn Bình', '0934212314', '7000000', 'Binh1', '2', '2', '1');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('3', 'K234/11 Điện Biên Phủ, Gia Lai', '1995-12-12', 'thiyen@gmail.com', '999231723', '1', 'Hồ Thị Yến', '0412352315', '14000000', 'Yen1', '2', '3', '1');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('4', '77 Hoàng Diệu, Quảng Trị', '1980-04-04', 'toan0404@gmail.com', '123231365', '1', 'Võ Công Toản', '0374443232', '17000000', 'Toan1', '4', '4', '1');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('5', '43 Yên Bái, Đà Nẵng', '1999-12-09', 'phatphat@gmail.com', '454363232', '1', 'Nguyễn Bỉnh Phát', '0902341231', '6000000', 'Phat1', '1', '1', '2');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('6', '294 Nguyễn Tất Thành, Đà Nẵng', '2000-11-08', 'annghi20@gmail.com', '964542311', '1', 'Khúc Nguyễn An Nghi', '0978653213', '7000000', 'Nghi1', '3', '2', '2');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('7', '4 Nguyễn Chí Thanh, Huế', '1993-01-01', 'nhh0101@gmail.com', '534323231', '1', 'Nguyễn Hữu Hà', '0941234553', '8000000', 'Ha1', '2', '3', '2');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('8', '111 Hùng Vương, Hà Nội', '1989-09-03', 'donghanguyen@gmail.com', '234414123', '1', 'Nguyễn Hà Đông', '0642123111', '9000000', 'Dong1', '4', '4', '2');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('9', '213 Hàm Nghi, Đà Nẵng', '1982-09-03', 'hoangtong@gmail.com', '256781231', '1', 'Tòng Hoang', '0245144444', '6000000', 'Hoang1', '4', '4', '2');
INSERT INTO `case_study_m4`.`employee` (`id`, `address`, `date_of_birth`, `email`, `id_card`, `is_delete`, `name`, `phone_number`, `salary`, `user_name`, `division_id`, `education_degree_id`, `position_id`) VALUES ('10', '6 Hoà Khánh, Đồng Nai', '1994-01-08', 'nguyencongdao12@gmail.com', '755434343', '1', 'Nguyễn Công Đạo', '0988767111', '8000000', 'Dao1', '2', '3', '2');

INSERT INTO `case_study_m4`.`customer_type` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'Diamond');
INSERT INTO `case_study_m4`.`customer_type` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'Platinium');
INSERT INTO `case_study_m4`.`customer_type` (`id`, `is_delete`, `name`) VALUES ('3', '1', 'Gold');
INSERT INTO `case_study_m4`.`customer_type` (`id`, `is_delete`, `name`) VALUES ('4', '1', 'Silver');
INSERT INTO `case_study_m4`.`customer_type` (`id`, `is_delete`, `name`) VALUES ('5', '1', 'Member');

INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('1', '23 Nguyễn Hoàng, Đà Nẵng', '1970-11-07', 'thihao07@gmail.com', '0', '643431213', '1', 'Nguyễn Thị Hào', '0945423362', '5');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('2', 'K77/22 Thái Phiên, Quảng Trị', '1992-08-08', 'xuandieu92@gmail.com', '1', '865342123', '1', 'Phạm Xuân Diệu', '0954333333', '3');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('3', 'K323/12 Ông Ích Khiêm, Vinh', '1990-02-27', 'nghenhan2702@gmail.com', '1', '488645199', '1', 'Trương Đình Nghệ', '0373213122', '1');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('4', 'K453/12 Lê Lợi, Đà Nẵng', '1981-07-08', 'duongquan@gmail.com', '1', '543432111', '1', 'Dương Văn Quan', '0490039241', '1');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('5', '224 Lý Thái Tổ, Gia Lai', '1995-12-09', 'nhinhi123@gmail.com', '0', '795453345', '1', 'Hoàng Trần Nhi Nhi', '0312345678', '4');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('6', '37 Yên Thế, Đà Nẵng', '2005-12-06', 'tonnuchau@gmail.com', '0', '732434215', '1', 'Tôn Nữ Mộc Châu', '0988888844', '4');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('7', 'K123/45 Lê Lợi, Hồ Chí Minh', '1984-04-08', 'kimcuong84@gmail.com', '0', '856453123', '1', 'Nguyễn Mỹ Kim', '0912345698', '1');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('8', '55 Nguyễn Văn Linh, Kon Tum', '1999-04-08', 'haohao99@gmail.com', '0', '965656433', '1', 'Nguyễn Thị Hào', '0763212345', '3');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('9', '24 Lý Thường Kiệt, Quảng Ngãi', '1994-07-01', 'danhhai99@gmail.com', '1', '432341235', '1', 'Trần Đại Danh', '0643343433', '1');
INSERT INTO `case_study_m4`.`customer` (`id`, `address`, `date_of_birth`, `email`, `gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) VALUES ('10', '22 Ngô Quyền, Đà Nẵng', '1989-07-01', 'dactam@gmail.com', '1', '344343432', '1', 'Nguyễn Tâm Đắc', '0987654321', '2');

INSERT INTO `case_study_m4`.`rent_type` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'year');
INSERT INTO `case_study_m4`.`rent_type` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'month');
INSERT INTO `case_study_m4`.`rent_type` (`id`, `is_delete`, `name`) VALUES ('3', '1', 'day');
INSERT INTO `case_study_m4`.`rent_type` (`id`, `is_delete`, `name`) VALUES ('4', '1', 'hour');

INSERT INTO `case_study_m4`.`facility_type` (`id`, `is_delete`, `name`) VALUES ('1', '1', 'Villa');
INSERT INTO `case_study_m4`.`facility_type` (`id`, `is_delete`, `name`) VALUES ('2', '1', 'House');
INSERT INTO `case_study_m4`.`facility_type` (`id`, `is_delete`, `name`) VALUES ('3', '1', 'Room');

INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('1', '25000', '1000000', '1', '10', 'Villa Beach Front', '1', '3', 'Có hồ bơi', null, '4', '500', 'vip');
INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('2', '14000', '5000000', '1', '7', 'House Princess 01', '2', '2', 'Có thêm bếp nướng', null, '3', '0', 'vip');
INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('3', '5000', '1000000', '1', '2', 'Room Twin 01', '3', '4', 'Có tivi', '1 Xe máy, 1 Xe đạp', '0', '0', 'normal');
INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('4', '22000', '9000000', '1', '8', 'Villa No Beach Front', '1', '3', 'Có hồ bơi', null, '3', '300', 'normal');
INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('5', '10000', '4000000', '1', '5', 'House Princess 02', '2', '3', 'Có thêm bếp nướng', null, '2', '0', 'normal');
INSERT INTO `case_study_m4`.`facility` (`id`, `area`, `cost`, `is_delete`, `max_people`, `name`, `facility_type_id`, `rent_type_id`, `description_other_convenience`, `facility_free`, `number_of_floors`, `pool_area`, `standard_room`) VALUES ('6', '3000', '900000', '1', '2', 'Room Twin 02', '3', '4', 'Có tivi', '1 Xe máy', '0', '0', 'normal');

INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('1', '10000', 'Karaoke', 'tiện nghi, hiện tại', 'giờ', '1');
INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('2', '10000', 'Thuê xe máy', 'hỏng 1 xe', 'chiếc', '1');
INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('3', '20000', 'Thuê xe đạp', 'tốt', 'chiếc', '1');
INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('4', '15000', 'Buffet buổi sáng', 'đầy đủ đồ ăn, tráng miệng', 'suất', '1');
INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('5', '90000', 'Buffet buổi trưa', 'đầy đủ đồ ăn, tráng miệng', 'suất', '1');
INSERT INTO `case_study_m4`.`attach_facility` (`id`, `cost`, `name`, `status`, `unit`,`is_delete`) VALUES ('6', '16000', 'Buffet buổi tối', 'đầy đủ đồ ăn, tráng miệng', 'suất', '1');

INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('1', '0', '2020-12-08', '2020-12-08', '1', '3', '3', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('2', '200000', '2020-07-21', '2020-07-14', '3', '7', '1', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('3', '50000', '2021-03-17', '2021-03-15', '4', '3', '2', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('4', '100000', '2021-01-18', '2021-01-14', '5', '7', '5', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('5', '0', '2021-07-15', '2021-07-14', '2', '7', '6', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('6', '0', '2021-06-03', '2021-06-01', '7', '7', '6', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('7', '100000', '2021-09-05', '2021-09-02', '4', '7', '4', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('8', '150000', '2021-06-18', '2021-06-17', '4', '3', '1', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('9', '0', '2020-11-19', '2020-11-19', '4', '3', '3', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('10', '0', '2021-04-14', '2021-04-12', '3', '10', '5', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('11', '0', '2021-04-25', '2021-04-25', '2', '2', '1', '1');
INSERT INTO `case_study_m4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer_id`, `employee_id`, `facility_id`,`is_delete`) VALUES ('12', '0', '2021-05-27', '2021-05-25', '10', '7', '1', '1');

INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('1', '5', '4', '2', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('2', '8', '5', '2', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('3', '15', '6', '2', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('4', '1', '1', '3', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('5', '11', '2', '3', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('6', '1', '3', '1', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('7', '2', '2', '1', '1');
INSERT INTO `case_study_m4`.`contract_detail` (`id`, `quantity`, `attach_facility_id`, `contract_id`,`is_delete`) VALUES ('8', '2', '2', '12', '1');

SELECT  f.`name` AS facilityName,
c.`name` AS customerName,
ct.id AS id,
ct.start_date AS startDate,
ct.end_date AS endDate,
ct.deposit, ((IFNULL(SUM(cd.quantity * af.cost), 0) + f.cost)) AS total
 FROM contract ct
 LEFT JOIN facility f ON ct.facility_id = f.id
 LEFT JOIN  contract_detail cd ON ct.id = cd.contract_id
 LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id
 LEFT JOIN customer c ON ct.customer_id = c.id
 GROUP BY ct.id;

select af.name as nameDto,  
af.unit as unitDto, 
sum(ifnull(cd.quantity, 0)) as quantityDto,
af.status as statusDto,
af.cost as costDto 
from contract_detail cd
join attach_facility af on cd.attach_facility_id = af.id
where cd.contract_id = 1 
group by af.id;