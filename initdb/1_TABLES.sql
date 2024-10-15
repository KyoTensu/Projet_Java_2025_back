create table students
(
    id SERIAL PRIMARY KEY,
    first_name TEXT not null,
    last_name TEXT not null,
    birthdate date null,
    major_id int null,
    image bytea null
);

create table majors
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    description TEXT not null
);

create table courses
(
    id SERIAL PRIMARY KEY,
    name TEXT not null,
    hours int not null
);

create table student_course
(
    id SERIAL PRIMARY KEY,
    student_id int not null,
    course_id int not null
);


------------------------------------------------------------
--        Script Postgre
------------------------------------------------------------



------------------------------------------------------------
-- Table: Lieux
------------------------------------------------------------
CREATE TABLE public.Lieux(
    lieu_id         SERIAL NOT NULL ,
    lieu_capacity   INT  NOT NULL ,
    lieu_name       VARCHAR (50) NOT NULL  ,
    CONSTRAINT Lieux_PK PRIMARY KEY (lieu_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Concerts
------------------------------------------------------------
CREATE TABLE public.Concerts(
    concert_id   SERIAL NOT NULL ,
    lieu_id      INT  NOT NULL  ,
    concert_date_debut DATE NOT NULL ,
    concert_date_fin DATE ,
    concert_name VARCHAR (50) NOT NULL ,
    CONSTRAINT Concerts_PK PRIMARY KEY (concert_id)

    ,CONSTRAINT Concerts_Lieux_FK FOREIGN KEY (lieu_id) REFERENCES public.Lieux(lieu_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Nationalite
------------------------------------------------------------
CREATE TABLE public.Nationalite(
    nationalite_id     SERIAL NOT NULL ,
    nationalite_name   VARCHAR (50) NOT NULL ,
    CONSTRAINT Nationalite_PK PRIMARY KEY (nationalite_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Style
------------------------------------------------------------
CREATE TABLE public.Style(
    style_id            SERIAL NOT NULL ,
    style_name          VARCHAR (50) NOT NULL ,
    style_description   VARCHAR (500) NOT NULL  ,
    CONSTRAINT Style_PK PRIMARY KEY (style_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Artistes
------------------------------------------------------------
CREATE TABLE public.Artistes(
    Artiste_id             SERIAL NOT NULL ,
    artiste_name           VARCHAR (50) NOT NULL ,
    artist_is_group        BOOL  NOT NULL ,
    artist_date_of_birth   DATE   ,
    style_id               INT  NOT NULL ,
    nationalite_id         INT  NOT NULL  ,
    CONSTRAINT Artistes_PK PRIMARY KEY (Artiste_id)

    ,CONSTRAINT Artistes_Style_FK FOREIGN KEY (style_id) REFERENCES public.Style(style_id)
    ,CONSTRAINT Artistes_Nationalite0_FK FOREIGN KEY (nationalite_id) REFERENCES public.Nationalite(nationalite_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Utilisateurs
------------------------------------------------------------
CREATE TABLE public.Utilisateurs(
    utilisateur_id          SERIAL NOT NULL ,
    utilisateur_firstname   VARCHAR (50) NOT NULL ,
    utilisateur_lastname    VARCHAR (100) NOT NULL ,
    utilisateur_password    VARCHAR (100) NOT NULL ,
    utilisateur_mail        VARCHAR (50) NOT NULL  ,
    CONSTRAINT Utilisateurs_PK PRIMARY KEY (utilisateur_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Membres
------------------------------------------------------------
CREATE TABLE public.Membres(
    membre_id              SERIAL NOT NULL ,
    membre_firstname       VARCHAR (50) NOT NULL ,
    membre_lastname        VARCHAR (100) NOT NULL ,
    membre_date_of_birth   DATE  NOT NULL ,
    Artiste_id             INT  NOT NULL  ,
    CONSTRAINT Membres_PK PRIMARY KEY (membre_id)

    ,CONSTRAINT Membres_Artistes_FK FOREIGN KEY (Artiste_id) REFERENCES public.Artistes(Artiste_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Concert_Favoris
------------------------------------------------------------
CREATE TABLE public.Concert_Favoris(
    concert_id       INT  NOT NULL ,
    utilisateur_id   INT  NOT NULL  ,
    CONSTRAINT Concert_Favoris_PK PRIMARY KEY (concert_id,utilisateur_id)

    ,CONSTRAINT Concert_Favoris_Concerts_FK FOREIGN KEY (concert_id) REFERENCES public.Concerts(concert_id)
    ,CONSTRAINT Concert_Favoris_Utilisateurs0_FK FOREIGN KEY (utilisateur_id) REFERENCES public.Utilisateurs(utilisateur_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Artiste_Favoris
------------------------------------------------------------
CREATE TABLE public.Artiste_Favoris(
    Artiste_id       INT  NOT NULL ,
    utilisateur_id   INT  NOT NULL  ,
    CONSTRAINT Artiste_Favoris_PK PRIMARY KEY (Artiste_id,utilisateur_id)

    ,CONSTRAINT Artiste_Favoris_Artistes_FK FOREIGN KEY (Artiste_id) REFERENCES public.Artistes(Artiste_id)
    ,CONSTRAINT Artiste_Favoris_Utilisateurs0_FK FOREIGN KEY (utilisateur_id) REFERENCES public.Utilisateurs(utilisateur_id)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Artistes_Concert
------------------------------------------------------------
CREATE TABLE public.Artistes_Concert(
    concert_id   INT  NOT NULL ,
    Artiste_id   INT  NOT NULL  ,
    CONSTRAINT Artistes_Concert_PK PRIMARY KEY (concert_id,Artiste_id)

    ,CONSTRAINT Artistes_Concert_Concerts_FK FOREIGN KEY (concert_id) REFERENCES public.Concerts(concert_id)
    ,CONSTRAINT Artistes_Concert_Artistes0_FK FOREIGN KEY (Artiste_id) REFERENCES public.Artistes(Artiste_id)
)WITHOUT OIDS;




