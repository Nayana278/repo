CREATE TABLE `user`
(
    `id`           BIGINT(6) NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(50)  NOT NULL,
    `phone_number` VARCHAR(20)  NOT NULL,
    `email`        VARCHAR(50)  NOT NULL,
    `password`     VARCHAR(200) NOT NULL,
    `created_on`   DATETIME     NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)

