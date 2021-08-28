
CREATE TABLE public.Drink (
	id serial NOT NULL,
	name varchar(100) NOT NULL,
	description varchar(255) NULL,
	drinkCategoryId1 int4 NOT NULL,
	drinkCategoryId2 int4 NOT NULL,
	infoUrl varchar(255) NULL,
	alcohol int2 NOT NULL,
	star real NOT NULL,
	CONSTRAINT DrinkPk PRIMARY KEY (id)
);

CREATE TABLE public.BeerDetail (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	bitter int2 NOT NULL,
	flavor int2 NOT NULL,
	hop int2 NOT NULL,
	sharp int2 NOT NULL,
	body int2 NOT NULL,
	CONSTRAINT BeerDetailPk PRIMARY KEY (id)
);

CREATE TABLE public.ChuHighDetail (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	delicious int2 NOT NULL,
	sweet int2 NOT NULL,
	exhilaration int2 NOT NULL,
	fruity int2 NOT NULL,
	bitter int2 NOT NULL,
	CONSTRAINT ChuHighDetailPk PRIMARY KEY (id)
);

CREATE TABLE public.SakeDetail (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	prefectureId int2 NOT NULL,
	flavor int2 NOT NULL,
	riceType int2 NOT NULL,
	sakeDegree int2 NOT NULL,
	acidity int2 NOT NULL,
	CONSTRAINT SakeDetailPk PRIMARY KEY (id)
);

CREATE TABLE public.WineDetail (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	countryId int4 NOT NULL,
	body int2 NOT NULL,
	flavor int2 NOT NULL,
	CONSTRAINT WineDetailPk PRIMARY KEY (id)
);

CREATE TABLE public.DrinkCategory1 (
	id serial NOT NULL,
	category varchar(50) NOT NULL,
	CONSTRAINT DrinkCategoryPk PRIMARY KEY (id)
);

CREATE TABLE public.DrinkCategory2 (
	id serial NOT NULL,
	drinkCategoryId1 int4 NOT NULL,
	category varchar(50) NOT NULL,
	CONSTRAINT DrinkCategoryPk PRIMARY KEY (id)
);

CREATE TABLE public.Situation (
	id serial NOT NULL,
	situation varchar(50)) NULL,
	CONSTRAINT SituationPk PRIMARY KEY (id)
);

CREATE TABLE public.Snack (
	id serial NOT NULL,
	name varchar(100) NOT NULL,
	description varchar(255) NULL,
	infoUrl varchar(255) NULL,
	CONSTRAINT SnackPk PRIMARY KEY (id)
);

CREATE TABLE public.DrinkSnack (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	snackId int4 NOT NULL,
	recommendation int2 NOT NULL,
	CONSTRAINT DrinkSnackPk PRIMARY KEY (id)
);

CREATE TABLE public.DrinkSituation (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	situationId int4 NOT NULL,
	CONSTRAINT DrinkSituationPk PRIMARY KEY (id)
);

CREATE TABLE public.PickupDrink (
	id serial NOT NULL,
	drinkId int4 NOT NULL,
	CONSTRAINT PickupDrinkPk PRIMARY KEY (id)
);