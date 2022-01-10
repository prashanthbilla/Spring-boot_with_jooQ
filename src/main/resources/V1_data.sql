                            use billa;
                            TABLE `business_apikey`
                           (
                               `id`          CHAR(36)  NOT NULL,
                               `apikey`      VARCHAR(128),
                               `isactive`    BIT(1)             DEFAULT 1,
                               `business_id` CHAR(36),
                               `created_at`  TIMESTAMP          DEFAULT CURRENT_TIMESTAMP,
                               `created_by`  VARCHAR(36),
                               `updated_at`  TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                               `updated_by`  VARCHAR(36),
                               PRIMARY KEY (
                                            `id`
                                   )
                           ) ROW_FORMAT = Default;