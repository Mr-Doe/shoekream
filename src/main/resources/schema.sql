CREATE TABLE attached_file (
    model varchar(100) NOT NULL,
    save_dir varchar(1000) NOT NULL,
    file_name varchar(1000) NOT NULL,
    file_type tinyint(1) DEFAULT '0',
    pno int,
    mem_id varchar(100) DEFAULT NULL,
    file_size bigint NOT NULL,
    reg_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (model)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table if not exists product(
    pno int auto_increment,
    model varchar(100) not null,
    brand int not null,
    e_name varchar(100) not null,
    k_name varchar(100) not null,
    read_count int default 0,
    reg_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    retail_price int,
    category int
    primary key(pno)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table if not exists items (
    item_no int auto_increment,
    pno int not null,
    shoe_size int,
    price int,
    reg_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    end_at TIMESTAMP NULL,
    is_sold int default 0,
    seller_email varchar(100),
    buyer_email varchar(100),
    primary key(item_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table shoe_size(
    size_id int auto_increment,
    size_value int,
    primary key(size_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table shoe_brand(
    brand_id int auto_increment,
    brand_name varchar(100),
    primary key(brand_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table shoe_catgegory(
    category_id int auto_increment,
    category_name varchar(100),
    primary key(category_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

create table member (
    mem_id int auto_increment,
    email varchar(100) NOT NULL,
    pwd varchar(100) NOT NULL,
    nick_name varchar(100) NOT NULL,
    grade int default 10,
    primary key (mem_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;