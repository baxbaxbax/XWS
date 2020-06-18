-- ROLES
insert into role (name, id) values ('ROLE_ADMIN', 1);
insert into role (name, id) values ('ROLE_REGISTERED_USER', 2);
insert into role (name, id) values ('ROLE_AGENT', 3);
insert into role (name, id) values ('ROLE_USER', 4);

insert into USER_TABLE (first_name, last_name, username, password, enabled, account_non_expired, account_non_locked, credentials_non_expired, is_admin) values ('balsa', 'sarenac', 'bax', 'asdf', true, false, false, false, false );


insert into MARK (name ) values ('audi');
insert into MARK (name ) values ('bmw');
insert into MARK (name ) values ('mercedes');
insert into MARK (name ) values ('ford');
insert into MODEL (name, mark_id) values ('q7', 1);
insert into MODEL (name, mark_id) values ('a4', 1);
insert into MODEL (name, mark_id) values ('g22', 2);
insert into MODEL (name, mark_id) values ('x7', 2);
insert into MODEL (name, mark_id) values ('c112', 3);
insert into MODEL (name, mark_id) values ('f700', 3);
insert into MODEL (name, mark_id) values ('focus', 4);
insert into MODEL (name, mark_id) values ('Q5', 1);
insert into MODEL (name, mark_id) values ('A3', 1);
insert into MODEL (name, mark_id) values ('A4', 1);
insert into MODEL (name, mark_id) values ('Q3', 1);
insert into FUEL (type) values ('benzin');
insert into FUEL (type) values ('dizel');
insert into FUEL (type) values ('elektricni');
insert into CAR_CLASS (name ) values ('city');
insert into CAR_CLASS (name ) values ('limuzina');
insert into CAR_CLASS (name ) values ('karavan');
insert into CAR_CLASS (name ) values ('terenac');
insert into GEARBOX (type) values ('automatic');
insert into GEARBOX (type) values ('manuelni');
insert into PRICE_LIST (per_day, extra_kilometrage, cdw, discount) values (7, 4, false, 10);
insert into PRICE_LIST (per_day, extra_kilometrage, cdw, discount) values (8, 6, false, 11);
insert into PRICE_LIST (per_day, extra_kilometrage, cdw, discount) values (9, 5, false, 12);
insert into PRICE_LIST (per_day, extra_kilometrage, cdw, discount) values (11, 6, true, 10);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (100010, 0,false, 1,2,1,1,1,1,0);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (25555, 0,false, 1,2,2,2,2,1,0);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (100100, 1,false, 2,1,3,3,2,1,0);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (250203, 2,false, 2,2,1,4,1,1,0);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (10503, 0,false, 3,2,3,5,1,1,0);
insert into CAR (kilometrage, number_of_child_seats, has_android,  mark_id, car_class_id, fuel_id, model_id, gearbox_id, owner_id, number_of_grades) values (150000, 2,false, 4,1,2,7,2,1,0);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (true, 'Nevesinje', '2020-06-01T21:39:45.618', '2020-06-19T21:39:45.618', 350, 1,1,1);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (true, 'Trebinje', '2020-06-01T21:39:45.618', '2020-06-19T21:39:45.618', 100, 2,2,1);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (false, 'BanjaLuka', '2020-06-02T21:39:45.618', '2020-06-10T21:39:45.618', 200, 3,3,1);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (false, 'Nevesinje', '2020-06-02T21:39:45.618', '2020-06-10T21:39:45.618', 300, 4,4,1);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (true, 'Nevesinje', '2020-06-03T21:39:45.618', '2020-06-11T21:39:45.618', 0, 5,2,1);
insert into AD (cdw_available, pick_up_place, from_date, to_date, allowed_kilometrage, car_id, price_list_id, user_id) values (true, 'Nevesinje', '2020-06-03T21:39:45.618', '2020-06-11T21:39:45.618', 250, 6,4,1);

