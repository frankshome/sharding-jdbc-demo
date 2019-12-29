
CREATE DATABASE sharding_db_0 CHARACTER SET utf8mb4;
CREATE DATABASE sharding_db_1 CHARACTER SET utf8mb4;


use sharding_db_0;
DROP TABLE IF EXISTS user_info_0;
CREATE TABLE user_info_0
(
    id BIGINT(20) PRIMARY KEY NOT NULL,
    age INT(11),
    user_name VARCHAR(100),
    create_date DATE,
    update_date DATE
);

DROP TABLE IF EXISTS user_info_1;
CREATE TABLE user_info_1
(
    id BIGINT(20) PRIMARY KEY NOT NULL,
    age INT(11),
    user_name VARCHAR(100),
    create_date DATE,
    update_date DATE
);


use sharding_db_1;
DROP TABLE IF EXISTS user_info_0;
CREATE TABLE user_info_0
(
    id BIGINT(20) PRIMARY KEY NOT NULL,
    age INT(11),
    user_name VARCHAR(100),
    create_date DATE,
    update_date DATE
);

DROP TABLE IF EXISTS user_info_1;
CREATE TABLE user_info_1
(
    id BIGINT(20) PRIMARY KEY NOT NULL,
    age INT(11),
    user_name VARCHAR(100),
    create_date DATE,
    update_date DATE
);