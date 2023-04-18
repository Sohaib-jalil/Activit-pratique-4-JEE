# Activit-pratique-4-JEE

Dans cette activité ont va ajouter la possibilité de s'authentifier pour sécurisé notre application en utilisant spring security avec les deux stratégies : InMemoryAuthentication et JdbcAuthentication

### Objectif de l'atelier ###

• Récupérer le code source de l'application non sécurisé qui permet de gérer les patients (résultat de l'activité pratique N°3). Le code source de cette application se trouve dans le repository suivant : https://github.com/mohamedYoussfi/unsecured-hospital-app.git

• Sécuriser cette application en intégrant un système d'authentification basé sur Spring security avec les trois stratégies : InMemoryAuthentication et JdbcAuthentication

### Spring Security ###

Spring Security est une solution de sécurité fiable pour les applications Java, qui offre une intégration transparente avec d'autres frameworks de Spring et fournit des fonctionnalités de sécurité avancées pour protéger les applications contre les attaques et les violations de sécurité.

Les fonctionnalités principales de Spring Security comprennent l'authentification et l'autorisation, la protection contre les attaques telles que l'injection de SQL et les attaques par déni de service, la gestion de session et la prise en charge de la sécurité pour les API RESTful.

### Configuration du projet ###

Langue : Java

Type : Maven

JDK : Oracle OpenJDK version 20

Java : 17

Packaging : Jar

### Dépendances utilisées ###

• thymeleaf : Un moteur de template pour les applications web Java qui permet de créer des pages HTML avec des fonctionnalités dynamiques et réutilisables.

• lombok : Une bibliothèque Java qui permet de réduire la quantité de code boilerplate nécessaire pour écrire des classes.

• Bootstrap : Une bibliothèque de composants d'interface utilisateur pour le développement de sites web et d'applications web.

• H2database : Une base de données relationnelle qui offre des fonctionnalités avancées pour les développeurs tout en étant légère, rapide et facile à utiliser.

• MySQL : Un système de gestion de base de données relationnelle utilisé par de nombreuses applications web, mobiles et d'entreprise.

• Spring Web : un module de la plateforme Spring qui fournit des fonctionnalités pour le développement d'applications web, telles que la création de contrôleurs et la gestion des requêtes et des réponses HTTP.

• spring boot starter security : Un module de démarrage de la plateforme Spring Boot qui fournit des fonctionnalités de sécurité pour les applications web, telles que l'authentification et l'autorisation des utilisateurs.

• spring boot devtools : Il permet la détection et le rechargement automatique des modifications apportées au code source.

• thymeleaf extras spring security 6 : Il permet d'utiliser les fonctionnalités de sécurité de Spring Security dans les templates Thymeleaf.

### Démonstration de L'application Web ###

• L'interface D'authentification
![login](https://user-images.githubusercontent.com/92445933/232563574-7f6bace6-5b8a-4af8-a0f1-2c12db324071.PNG)

• Page D'accueil pour un utilisateur
![Page_accueil_utilisateur](https://user-images.githubusercontent.com/92445933/232566160-a57b33c7-6a01-4d0d-bf1f-40fb2c9d13fc.PNG)

• Pagination
![Page_accueil_utilisateur(pagination)](https://user-images.githubusercontent.com/92445933/232568523-2acbd1ff-669e-4730-9ed9-afab27fd2a4a.PNG)

• Recherche
![Page_accueil_utilisateur(recherche)](https://user-images.githubusercontent.com/92445933/232569751-9fa1dc6f-a654-41f6-a977-33e865b58e6e.PNG)

• Accès aux pages non autorisés
![Acces_non_autorisés](https://user-images.githubusercontent.com/92445933/232603356-424dc00e-64dd-48b9-8bde-74ab4b055133.PNG)

• Page D'accueil pour un admin
![Page_accueil_admin](https://user-images.githubusercontent.com/92445933/232604153-2206bd69-1a31-4206-b49e-36a38b403306.PNG)

• Modifier les informations d'un patient
![Modifier_Patient](https://user-images.githubusercontent.com/92445933/232604577-01a5fce4-733e-45c5-9c6d-8b2cec6b7e09.PNG)

• Suppression d'un patient
![Suppression_Patient](https://user-images.githubusercontent.com/92445933/232604726-42d19487-43c3-4302-b4a3-7f2db537d371.PNG)

• Patient supprimé
![Patient_supprime](https://user-images.githubusercontent.com/92445933/232604838-cc1071dc-4281-4ef3-bef9-a22bd358aa38.PNG)

• Ajouter un Patient(1/3)
![Ajouter_Patient_1](https://user-images.githubusercontent.com/92445933/232604965-519276a4-f7d9-460f-9a3d-02b36bfc4104.PNG)
• Ajouter un Patient(2/3)
![Ajouter_Patient_2](https://user-images.githubusercontent.com/92445933/232605018-cbecaaf8-d562-44d5-b47f-0f2f15c3d74b.PNG)
• Ajouter un Patient(3/3)
![Ajouter_Patient_3](https://user-images.githubusercontent.com/92445933/232605098-340a475a-9941-4d15-a2ad-89b385ef6e6a.PNG)

