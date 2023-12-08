CREATE TABLE `person`
(
    `id`         bigint       NOT NULL AUTO_INCREMENT,
    `first_name` varchar(100) NOT NULL,
    `last_name`  varchar(100) NOT NULL,
    `address`    varchar(150) NOT NULL,
    `gender`     varchar(10)  NOT NULL,

    PRIMARY KEY (`id`)
);

