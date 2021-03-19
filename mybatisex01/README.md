### MyBatis DB 설정

```sql
CREATE TABLE product(
	id int auto_increment primary key,
    name varchar(50),
    code varchar(50)
);

CREATE TABLE panmae(
	id int auto_increment primary key,
    productId int,
    username varchar(30)
);
```