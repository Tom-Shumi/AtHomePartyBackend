DROP TABLE public.drink;

CREATE TABLE public.drink (
	id serial NOT NULL,
	name varchar(100) NOT NULL,
	description varchar(255) NULL,
	drink_category_id1 int4 NOT NULL,
	drink_category_id2 int4 NOT NULL,
	info_url varchar(255) NULL,
	image_url varchar(255) NULL,
	alcohol int2 NOT NULL,
	star real NOT NULL,
	CONSTRAINT pk_drink PRIMARY KEY (id)
);

DROP TABLE public.beer_detail;

CREATE TABLE public.beer_detail (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	bitter int2 NOT NULL,
	flavor int2 NOT NULL,
	hop int2 NOT NULL,
	sharp int2 NOT NULL,
	body int2 NOT NULL,
	CONSTRAINT pk_beer_detail PRIMARY KEY (id)
);

DROP TABLE public.chuhigh_detail;

CREATE TABLE public.chuhigh_detail (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	delicious int2 NOT NULL,
	sweet int2 NOT NULL,
	exhilaration int2 NOT NULL,
	fruity int2 NOT NULL,
	bitter int2 NOT NULL,
	CONSTRAINT pk_chuhigh_detail PRIMARY KEY (id)
);

DROP TABLE public.sake_detail;

CREATE TABLE public.sake_detail (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	prefecture_id int2 NOT NULL,
	flavor int2 NOT NULL,
	rice_type int2 NOT NULL,
	sake_degree int2 NOT NULL,
	acidity int2 NOT NULL,
	CONSTRAINT pk_sake_detail PRIMARY KEY (id)
);

DROP TABLE public.wine_detail;

CREATE TABLE public.wine_detail (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	country_id int4 NOT NULL,
	body_type int2 NOT NULL,
	flavor int2 NOT NULL,
	CONSTRAINT pk_wine_detail PRIMARY KEY (id)
);

DROP TABLE public.drink_category1;

CREATE TABLE public.drink_category1 (
	id serial NOT NULL,
	category varchar(50) NOT NULL,
	CONSTRAINT pk_drink_category1 PRIMARY KEY (id)
);

DROP TABLE public.drink_category2;

CREATE TABLE public.drink_category2 (
	id serial NOT NULL,
	drink_category_id1 int4 NOT NULL,
	category varchar(50) NOT NULL,
	CONSTRAINT pk_drink_category2 PRIMARY KEY (id)
);

DROP TABLE public.situation;

CREATE TABLE public.situation (
	id serial NOT NULL,
	situation varchar(50) NULL,
	CONSTRAINT pk_situation PRIMARY KEY (id)
);

DROP TABLE public.snack;

CREATE TABLE public.snack (
	id serial NOT NULL,
	name varchar(100) NOT NULL,
	description varchar(255) NULL,
	info_url varchar(255) NULL,
	CONSTRAINT pk_snack PRIMARY KEY (id)
);

DROP TABLE public.drink_snack;

CREATE TABLE public.drink_snack (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	snack_id int4 NOT NULL,
	recommendation int2 NOT NULL,
	CONSTRAINT pk_drink_snack PRIMARY KEY (id)
);

DROP TABLE public.drink_situation;

CREATE TABLE public.drink_situation (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	situation_id int4 NOT NULL,
	CONSTRAINT pk_drink_situation PRIMARY KEY (id)
);

DROP TABLE public.pickup_drink;

CREATE TABLE public.pickup_drink (
	id serial NOT NULL,
	drink_id int4 NOT NULL,
	image_url varchar(255) NOT NULL,
	delete_flg boolean NOT NULL,
	CONSTRAINT pk_pickup_drink PRIMARY KEY (id)
);
