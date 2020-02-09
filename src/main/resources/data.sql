INSERT INTO TODO_LIST (todo_list_id,name) VALUES (1, 'Tesco shopping list');
INSERT INTO TODO_LIST (todo_list_id,name) VALUES (2, 'Amazon list');
INSERT INTO TODO_LIST (todo_list_id,name) VALUES (3, 'Github repo list');

INSERT INTO TODO_ITEM (item, complete, todo_list_id) VALUES ('Milk', FALSE, 1);
INSERT INTO TODO_ITEM (item, complete, todo_list_id) VALUES ('Irn-Bru', FALSE, 1);

INSERT INTO TODO_ITEM (item, complete, todo_list_id) VALUES ('Mavic 2 Pro', TRUE, 2);

INSERT INTO TODO_ITEM (item, complete, todo_list_id) VALUES ('Actuator backend', FALSE, 3);
INSERT INTO TODO_ITEM (item, complete, todo_list_id) VALUES ('Actuator UI Angular', FALSE, 3);