# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Répondre ici

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "Gwennael Cannenpasse"
    git config --global user.email "gwennaelcan@gmail.com"
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init 
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add ./src
    git status (pour voir que tout est bon)
    git commit (on rentre le message des modifications effectuées)
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    Fraction frac = new Fraction(6,2);
		System.out.println(frac);
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git commit -m "first commit"
    git branch -M master
    git remote add origin https://github.com/uvsq21804324/TODL.git
    git push -u origin master
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
> Répondre ici
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git add src/README.md
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    .classpath
    .project
    .settings/
    bin/
    src/README (J'avais oublié le .md)

    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    je ne les avais pas ajoutés initialement
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    Sur la branche master
    Votre branche est à jour avec 'origin/master'.

    Modifications qui seront validées :
    (utilisez "git reset HEAD <fichier>..." pour désindexer)

        nouveau fichier : src/README.md

    Fichiers non suivis:
    (utilisez "git add <fichier>..." pour inclure dans ce qui sera validé)

        .gitignore

    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Générer une clée publique que l'on va renter sur github. La clée privée générer on la conserve pour l'authentifiquation.

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, ...).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, ...).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Répondre ici
    J'utilise Linux et le shell bash.
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash man malloc
    exemple : man malloc 
    # Répondre ici
    ``` la commande "man" permet d'obtenir de l'aide et d'ouvrir une page du manuel Linux de programmation
    
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash ls -lSrh
        exemple :  || Affichage ||
        155 Makefile
		555 memoire.h	
		561 main.c
		1,3K thread.c
	    5,0K memoire.c
			      
        # Répondre ici
        ``` 1) cd Bureau/TD1 (accès au dossier ou au répertoire)
			2) ls -lSrh affichage puis liste des fichiers du répertoire
        ls -lSrh permet de trier les fichiers d'un répertoire par taille, les tailles sont affiché en octets
        
    1. compter le nombre de ligne d'un fichier
        ```bash
       exemple :  wc main.c
        || Affichage ||
        30 71 561 main.c
        
        # Répondre ici
        ``` 1) wc NomFichier , la commande wc permet de compter les lignes d'un fichier (NomFichier)
			   30 nombre de lignes que l'on cherche
			   71 nombre de mots 
			   561 nombre d'octets
        
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        exemple : grep -n "uneVariable" Main.java
        || Affichage ||
        25 :     int uneVariable = 52;
        32 : 	 System.out.println(uneVariable);
         
        # Répondre ici
        ``` 1) la ligne de commande grep permet d'afficher les lignes du fichier 'Main.java' contenant 'uneVariable'
			2) le -n permet d'avoir le numéro de la ligne où se situe la chaîne de caractère rechercher 
			
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        exemple : grep -r -l 'uneVariable' *.java
        || Affichage ||
        Var.java
        Main.java
        Launcher.java
        
        # Répondre ici
        ``` 1) la commande grep afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
			2) l'ajout de la commande -r permet de faire une recherche récursive
			3) l'ajout de la commande -l permet d'afficher que les noms de fichiers 
			4) /home/User/Bureau/TdJava chemin d'accès où l'on souhaite faire des recherches
			
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        exemple : find /home/user/Bureau/ -name README.md
        || Affichage ||
		/home/user/Bureau/projet1/README.md
		/home/user/Bureau/projetJava/README.md

        # Répondre ici
        ``` 1) la commande find trouver les fichiers (pas les répertoires) nommés `README.md` 
			   dans une arborescence de répertoires
			2) ici l'arborescence de répertoire est le bureau (/home/user/Bureau/)
			3) dans notre exemple on peut voir qu'il existe 2 fichier README.md sur le bureau,
			   le premier se trouve dans le dossier projet1 et le deuxième dans le dossier projetJava
        
   1. afficher les différences entre deux fichiers textes
        ```bash
        exemple : diff -y script1.txt script2.txt
        || Affichage ||
        je suis le script 1         | je suis le script 2
        
        # Répondre ici
        ``` 1) la commande diff permet de détecter si il y a des différences entre deux fichiers textes
			2) la commande diff -y permet d'afficher les différences entre deux fichiers textes
			
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Répondre ici
        Cet commande permet d'avoir un accès à distance à la console en ligne de commande shell,
        De ce fait il facilite pour le programmeur les opérations à effectuer sur la machine distante
        comme le transferts de fichier en ligne de commande ou encore déporter l'affichage graphique 
        de la machine distante (ouverture d'un shell à distance).
        
    * `screen`/`tmux`
        > Répondre ici
        Ces deux lignes de commande permettent d'utiliser et d'avoir plusieurs terminaux virtuel
        dans une seule console et un seul affichage(pour le tmux notamment).
        Très utile pour le programmeur car il a la capacité de partager un terminal avec un autre
        utilisateur distant. De plus le suivi visuel de plusieurs processus en même temps peut 
        faciliter le programmeur, ainsi que de pouvoir laisser certains terminaux fonctionné en arrière 
        plan.
        
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
        Ligne de commande utiliser pour transférer des données depuis ou vers un serveur grâce 
        à un protocole (HTTP,FTP...), afficher la page d'accueil d'un site, ou alors télécharger 
        des fichiers à distances
        
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici
        jq permet d'extraire, trié et classé selon les préférences d'un programmeur
        des informations d'un flux JSON. Il affiche aussi les données reçu
        selon les options du programmeur, ainsi il est possible par exemple d'afficher que les 5
        derniers commit d'un dépôt github et non pas tout le repository.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), ...).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Répondre ici
	J'utilise pour le développement Java Visual Studio Code
	
    Pour la suite, ne considérez que l'un de vos choix.
    
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
	Dans la barre inférieur de VSCode, on peut voir l'étiquette "UTF-8"
	Pour être sur que le projet actuel écrit par le programmeur soit enregistré et encodé 
	sous "UTF-8" il suffit de cliquer sur l'étiquette puis d'appuyer sur le popup
	"Save with encoding" et de tout simplement choisir "UTF-8".
	
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
    
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
    Une fois le code ouvert dans VSCode on peut voir sur la barre des tâches en bas à droite
    que sur celle-ci y figure plusieurs précision. Notamment la version du langage utilisé
    et ses caractéristiques. Ici après l'encodage on peut voir écrit 'Java' puis juste à côté 
    la version Java des sources soit 'JavaSE-14'
    EXEMPLE : || AFFICHAGE ||
    UTF-8 | Java | JavaSE-14
    
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
    2 méthodes existent sur VSCode :
    
    1) Les fichiers JAR peuvent être ajoutés en cliquant sur le signe + en regard du nœud Bibliothèques référencées dans la vue projet. (Reference Libraries)
		puis ajouter le dossier téléchargé précédemment.
    
    2) Une fois après avoir téléchargé la bibliothèque sous forme .jar ajouté manuellement celle-ci au projet :
		"java.project.referencedLibraries": [
			"library/**/*.jar",
			"/home/username/lib/foo.jar"
		]

1. Comment reformater un fichier source Java ?
    > Répondre ici
    
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
    EXEMPLE : || AFFICHAGE ||
    double ordonnee (ordonnee sera afficher en bleu clair)
    void AfficherForme() (AfficherForme sera afficher en jaune)
    
    Sur VSCode la déclaration d'une variable ou d'une méthode est facile à repérer car VSCode permet d'avoir une coloration syntaxique
    de notre code.
    De ce fait les variables sont de couleur bleu clair (pour mon extension) et les méthodes jaune.
    
    
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
    Dans Visual Studio Code, les extraits de code apparaissent dans IntelliSense ( Ctrl + Espace ) mélangés à d'autres suggestions,
    ainsi que dans un sélecteur d'extrait de code dédié ( Insérer un extrait dans la palette de commandes). 
    Pour insérer un bloc de code prédéfini il suffit d'entrer un préfixe d'extrait de code (texte de déclenchement) et appuyez sur 
    Tab pour insérer un extrait de code.(plusieurs choix d'extrait de code seront proposé il suffira que le programmeur fasse son choix)

1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
    Cliquer sur la classe en question puis appuyer sur le raccourcis F2 puis cliquer sur renommer 
    Ainsi, VSCode renomme l'élément sélectionné et corrige toutes les références 
    aux éléments du projet (également dans d'autres fichiers).
    
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
    
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
    Sur VSCode il suffit d'appuyer sur le raccourcis F5 pour pouvoir lancer le débogueur, une fois cela fait
    plusieurs options sont disponible.
    Pour visualiser les variables du code, elles se retrouvent en haut à gauche sur l'espace variables
    Modifier votre code en changeant certaine variable et faite des tests avec le débogage, par exemple une fois le test lancé 
    votre point d'arrêt pour que le débogueur s'arrête est lorsque l'expression prend la valeur true.
    La console de débogage permet aussi de pouvoir gérer les erreurs du code.
    
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici
	Tout d'abord le débogage est l'un des éléments les plus important pour le développement Java,
	suivre l'avancé et le déroulement de son projet tout en vérifiant si il y à des coquilles dans 
	son code permet de ne pas avoir de surprise lors de la compilation.
	De plus le refactoring est selon moi une fonctionnalité très utile pour le développement Java,
	en effet l'objectif de la refactorisation du programme est d'apporter des modifications de code 
	à l'échelle du système sans affecter le comportement du programme ce qui peut particulièrement
	servir au programmeur suite à de grosse ou petite erreur apreçu après débogage ou non par exemple.