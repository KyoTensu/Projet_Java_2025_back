# Endpoints du back-end du projet

Les endpoints disponibles sur le serveur back-end sont les suivants :
  - `GET /concerts` pour récupérer l'intégralité des concerts
  - `GET /concerts/{id}` pour récupérer un concert en particulier grâce à son identifiant
  - `GET /artistes` pour récupérer l'intégralité des artistes
  - `GET /artistes/{id}` pour récupérer un artiste en particulier grâce à son identifiant
  - `GET /utilisateurs/authentification` pour effectuer une connexion sur un compte utilisateur et récupérer ses informations
  - `GET /utilisateurs/{id}` pour récupérer un utilisateur en particulier grâce à son identifiant
  - `GET /lieux` pour récupérer l'intégralité des lieux
  - `GET /lieux/{id}` pour récupérer un lieu en particulier grâce à son identifiant
  - `GET /styles` pour récupérer l'intégralité des styles de musique
  - `GET /styles/{id}` pour récupérer un style en particulier grâce à son identifiant
  - `GET /nationalities` pour récupérer l'intégralité des nationalitées
  - `GET /nationalities/{id}` pour récupérer une nationalitée en particulier grâce à son identifiant

# Lancement du projet

1. Copier-coller le .env.sample en .env
2. Lancer Docker et faire un `docker-compose up` dans le répertoire `back-skeleton`
3. Rajouter le plugin : https://plugins.jetbrains.com/plugin/7861-envfile
4. <img src="img-readme/img.png">
5. <img src="img-readme/img_1.png">
6. <img src="img-readme/img_2.png">
7. Exécuter les scripts BDD dans /initdb
8. Run la BackSkeletonApplication

Tout est bon !
