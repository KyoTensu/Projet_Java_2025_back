-- INSERT INTO majors (id, name, description) VALUES (1, 'Ingéniérie du Numérique', 'Ouaiiis du code partout');
-- INSERT INTO majors (id, name, description) VALUES (2, 'Structure & Matériaux', 'Beaucoup de béton et des poutres (snif elle a été renomée)');
-- INSERT INTO majors (id, name, description) VALUES (3, 'Aéronautique & Espace', 'Vive le vent');
-- INSERT INTO majors (id, name, description) VALUES (4, 'Data Engineering', 'Trop cool plein de données à ordonner');
-- INSERT INTO majors (id, name, description) VALUES (5, 'Energie & Environnement', 'On est full green');
-- INSERT INTO majors (id, name, description) VALUES (6, 'Engineering Management', 'Des managers de qualité');
-- INSERT INTO majors (id, name, description) VALUES (7, 'Ingénierie & Santé', 'On connait tous les os et tous les muscles du corps humain');
-- INSERT INTO majors (id, name, description) VALUES (8, 'Ingénierie & Architecture durable', 'Objectif 0 carbon');
-- INSERT INTO majors (id, name, description) VALUES (9, 'Design Industriel Durable', 'Ca existait pas pour la P2022 ça');
--
-- INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (1, 'Paul', 'Harrohide', '2002-06-15', 1);
-- INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (2, 'Jean', 'Bonbeur', '2001-08-21', 1);
-- INSERT INTO students (id, first_name, last_name, birthdate, major_id) VALUES (3, 'Alain', 'Térieur', '2000-01-11', 1);
--
-- INSERT INTO courses (id, name, hours) VALUES (1, 'Spanish', 30);
-- INSERT INTO courses (id, name, hours) VALUES (2, 'German', 30);
-- INSERT INTO courses (id, name, hours) VALUES (3, 'Internet of Things', 30);
-- INSERT INTO courses (id, name, hours) VALUES (4, 'Thermodynamic', 30);
-- INSERT INTO courses (id, name, hours) VALUES (5, 'Anatomy', 30);
-- INSERT INTO courses (id, name, hours) VALUES (6, 'Maths', 30);
-- INSERT INTO courses (id, name, hours) VALUES (7, 'Java', 30);
-- INSERT INTO courses (id, name, hours) VALUES (8, 'Lean Management', 30);
-- INSERT INTO student_course (id, student_id, course_id) VALUES (1, 1, 7);

INSERT INTO lieux (lieu_capacity, lieu_name) VALUES (80000, 'Stade de France');
Insert Into lieux (lieu_capacity, lieu_name) VALUES (20300, 'Accor Arena Bercy');

INSERT INTO concerts (lieu_id, concert_date_debut, concert_date_fin, concert_name) VALUES (1,'2024-11-23','2024-11-27','Festival du Stade de France');
INSERT INTO concerts (lieu_id, concert_date_debut, concert_date_fin, concert_name) VALUES (2,'2024-11-23','2024-11-23','Queen le retour');

INSERT INTO nationalite (nationalite_name) VALUES ('France');
INSERT INTO nationalite (nationalite_name) VALUES ('Canada');
INSERT INTO nationalite (nationalite_name) VALUES ('USA');
INSERT INTO nationalite (nationalite_name) VALUES ('Royaume-Unis');

INSERT INTO style (style_name, style_description) VALUES ('Pop', 'ceci est la Pop');
INSERT INTO style (style_name, style_description) VALUES ('Rock', 'ceci est le Rock');
INSERT INTO style (style_name, style_description) VALUES ('Variété', 'ceci est la Variété');

INSERT INTO artistes (artiste_name, artist_is_group, artist_date_of_birth, style_id, nationalite_id) VALUES ('Francis Cabrel', false, '1953-11-23', 3, 1);
INSERT INTO artistes (artiste_name, artist_is_group, artist_date_of_birth, style_id, nationalite_id) VALUES ('Queen', true, '1970-01-01', 2, 3);

insert into membres (membre_firstname, membre_lastname, membre_date_of_birth, artiste_id) VALUES ('Freddie', 'Mercury', '1946-09-05', 2);
insert into membres (membre_firstname, membre_lastname, membre_date_of_birth, artiste_id) VALUES ('Brian', 'May', '1946-09-05', 2);
insert into membres (membre_firstname, membre_lastname, membre_date_of_birth, artiste_id) VALUES ('John', 'Deacon', '1946-09-05', 2);
insert into membres (membre_firstname, membre_lastname, membre_date_of_birth, artiste_id) VALUES ('Roger', 'Taylor', '1946-09-05', 2);

INSERT INTO utilisateurs (utilisateur_firstname, utilisateur_lastname, utilisateur_password, utilisateur_mail) VALUES ('Mathieu', 'Roubaud', '123456', 'mathieu.roubaud@epfedu.fr');
INSERT INTO utilisateurs (utilisateur_firstname, utilisateur_lastname, utilisateur_password, utilisateur_mail) VALUES ('Loic', 'Champeau', '123456', 'loic.champeau@epfedu.fr');
INSERT INTO utilisateurs (utilisateur_firstname, utilisateur_lastname, utilisateur_password, utilisateur_mail) VALUES ('Victor', 'Gaspard', '123456', 'victor.gaspard@epfedu.fr');

Insert Into concert_favoris (concert_id, utilisateur_id) VALUES (1, 1);
Insert Into concert_favoris (concert_id, utilisateur_id) VALUES (2, 1);


INSERT INTO artistes_concert (concert_id, artiste_id) VALUES (1, 1);
INSERT INTO artistes_concert (concert_id, artiste_id) VALUES (1, 2);
INSERT INTO artistes_concert (concert_id, artiste_id) VALUES (2,2);