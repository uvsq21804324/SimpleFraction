# TD 1
## Remarques pr�liminaires
* Pour l'ensemble des TDs, vous cr�erez un compte individuel sur [github](https://github.com/) si vous n'en poss�dez pas d�j� un.
Vous nommerez ce compte de la fa�on suivante: `uvsq<MonNum�ro�tudiant>`.
Par exemple, pour un �tudiant de num�ro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont � taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable num�rique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont install�s.
* Vous r�pondrez aux questions directement dans ce fichier en compl�tant les emplacements correspondants.
Ajoutez ensuite ce fichier au d�p�t `git`.

## Partie I (� faire durant le TD) : d�couverte de `git`
Dans cet exercice, vous cr�erez une classe `Fraction` repr�sentant un nombre rationnel et une classe `Main` qui testera les m�thodes de la classe `Fraction` **avec des assertions**.
� chaque �tape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, cr�ez le d�p�t (_repository_) `SimpleFraction`;
En terme de *commits*, quelle diff�rence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > R�pondre ici

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "Gwennael Cannenpasse"
    git config --global user.email "gwennaelcan@gmail.com"
    ```
1. Initialisez le d�p�t `git` local pour le projet;
    ```bash
    git init 
    ```
1. Cr�ez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
V�rifiez que le projet compile et s'ex�cute dans l'IDE;
Validez les changements;
    ```bash
    git add ./src
    git status (pour voir que tout est bon)
    git commit (on rentre le message des modifications effectu�es)
    ```
1. Ajoutez un constructeur et la m�thode `toString` � la classe `Fraction` et modifiez la classe `Main` en cons�quence;
Validez les changements;
    ```Java
    Fraction frac = new Fraction(6,2);
		System.out.println(frac);
    ```
1. Publiez vos modifications sur le d�p�t distant;
Vous utiliserez le protocole `https` pour cela;
V�rifiez avec le navigateur;
    ```bash
    git commit -m "first commit"
    git branch -M master
    git remote add origin https://github.com/uvsq21804324/TODL.git
    git push -u origin master
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilis�e pour ce fichier ?
> R�pondre ici
1. R�cup�rez localement les modifications effectu�es sur la forge.
    ```bash
    git add src/README.md
    ```
1. Ajoutez les r�pertoires et fichiers issus de la compilation aux fichiers ignor�s par `git` (fichier `.gitignore`);
    ```bash
    .classpath
    .project
    .settings/
    bin/
    src/README (J'avais oubli� le .md)

    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    je ne les avais pas ajout�s initialement
    ```
    Ajoutez-les aux fichiers ignor�s par `git`.
    ```bash
    Sur la branche master
    Votre branche est � jour avec 'origin/master'.

    Modifications qui seront valid�es :
    (utilisez "git reset HEAD <fichier>..." pour d�sindexer)

        nouveau fichier : src/README.md

    Fichiers non suivis:
    (utilisez "git add <fichier>..." pour inclure dans ce qui sera valid�)

        .gitignore

    ```
1. Configurez l'acc�s par cl� publique/cl� priv�e � la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > G�n�rer une cl�e publique que l'on va renter sur github. La cl�e priv�e g�n�rer on la conserve pour l'authentifiquation.

## Partie II (� faire � la maison) : r�visions et perfectionnement *shell* et *IDE*
### Ma�triser le *shell* de commandes
L'objectif de cet exercice est de vous faire r�viser/d�couvrir les commandes de base du *shell* de votre machine.
Vous pouvez r�pondre en utilisant le shell de votre choix (*bash*, *Powershell*, ...).
Pour r�pondre � ces questions, vous devez effectuer les recherches documentaires ad�quates (livre, web, ...).

1. Quel OS et quel shell de commande utilisez-vous ?
    > R�pondre ici
    J'utilise Linux et le shell bash.
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash man malloc
    exemple : man malloc 
    # R�pondre ici
    ``` la commande "man" permet d'obtenir de l'aide et d'ouvrir une page du manuel Linux de programmation
    
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un r�pertoire tri�s par taille (taille affich�e lisiblement)
        ```bash ls -lSrh
        exemple :  || Affichage ||
        155 Makefile
		555 memoire.h	
		561 main.c
		1,3K thread.c
	    5,0K memoire.c
			      
        # R�pondre ici
        ``` 1) cd Bureau/TD1 (acc�s au dossier ou au r�pertoire)
			2) ls -lSrh affichage puis liste des fichiers du r�pertoire
        ls -lSrh permet de trier les fichiers d'un r�pertoire par taille, les tailles sont affich� en octets
        
    1. compter le nombre de ligne d'un fichier
        ```bash
       exemple :  wc main.c
        || Affichage ||
        30 71 561 main.c
        
        # R�pondre ici
        ``` 1) wc NomFichier , la commande wc permet de compter les lignes d'un fichier (NomFichier)
			   30 nombre de lignes que l'on cherche
			   71 nombre de mots 
			   561 nombre d'octets
        
    1. afficher les lignes du fichier `Main.java` contenant la cha�ne `uneVariable`
        ```bash
        exemple : grep -n "uneVariable" Main.java
        || Affichage ||
        25 :     int uneVariable = 52;
        32 : 	 System.out.println(uneVariable);
         
        # R�pondre ici
        ``` 1) la ligne de commande grep permet d'afficher les lignes du fichier 'Main.java' contenant 'uneVariable'
			2) le -n permet d'avoir le num�ro de la ligne o� se situe la cha�ne de caract�re rechercher 
			
    1. afficher r�cursivement les fichiers `.java` contenant la cha�ne `uneVariable`
        ```bash
        exemple : grep -r -l 'uneVariable' *.java
        || Affichage ||
        Var.java
        Main.java
        Launcher.java
        
        # R�pondre ici
        ``` 1) la commande grep afficher r�cursivement les fichiers `.java` contenant la cha�ne `uneVariable`
			2) l'ajout de la commande -r permet de faire une recherche r�cursive
			3) l'ajout de la commande -l permet d'afficher que les noms de fichiers 
			4) /home/User/Bureau/TdJava chemin d'acc�s o� l'on souhaite faire des recherches
			
    1. trouver les fichiers (pas les r�pertoires) nomm�s `README.md` dans une arborescence de r�pertoires
        ```bash
        exemple : find /home/user/Bureau/ -name README.md
        || Affichage ||
		/home/user/Bureau/projet1/README.md
		/home/user/Bureau/projetJava/README.md

        # R�pondre ici
        ``` 1) la commande find trouver les fichiers (pas les r�pertoires) nomm�s `README.md` 
			   dans une arborescence de r�pertoires
			2) ici l'arborescence de r�pertoire est le bureau (/home/user/Bureau/)
			3) dans notre exemple on peut voir qu'il existe 2 fichier README.md sur le bureau,
			   le premier se trouve dans le dossier projet1 et le deuxi�me dans le dossier projetJava
        
   1. afficher les diff�rences entre deux fichiers textes
        ```bash
        exemple : diff -y script1.txt script2.txt
        || Affichage ||
        je suis le script 1         | je suis le script 2
        
        # R�pondre ici
        ``` 1) la commande diff permet de d�tecter si il y a des diff�rences entre deux fichiers textes
			2) la commande diff -y permet d'afficher les diff�rences entre deux fichiers textes
			
1. Expliquez en une ou deux phrases le r�le de ces commandes et dans quel contexte elles peuvent �tre utiles pour un d�veloppeur.
    * `ssh`
        > R�pondre ici
        Cet commande permet d'avoir un acc�s � distance � la console en ligne de commande shell,
        De ce fait il facilite pour le programmeur les op�rations � effectuer sur la machine distante
        comme le transferts de fichier en ligne de commande ou encore d�porter l'affichage graphique 
        de la machine distante (ouverture d'un shell � distance).
        
    * `screen`/`tmux`
        > R�pondre ici
        Ces deux lignes de commande permettent d'utiliser et d'avoir plusieurs terminaux virtuel
        dans une seule console et un seul affichage(pour le tmux notamment).
        Tr�s utile pour le programmeur car il a la capacit� de partager un terminal avec un autre
        utilisateur distant. De plus le suivi visuel de plusieurs processus en m�me temps peut 
        faciliter le programmeur, ainsi que de pouvoir laisser certains terminaux fonctionn� en arri�re 
        plan.
        
    * `curl`/[HTTPie](https://httpie.org/)
        > R�pondre ici
        Ligne de commande utiliser pour transf�rer des donn�es depuis ou vers un serveur gr�ce 
        � un protocole (HTTP,FTP...), afficher la page d'accueil d'un site, ou alors t�l�charger 
        des fichiers � distances
        
    * [jq](https://stedolan.github.io/jq/)
        > R�pondre ici
        jq permet d'extraire, tri� et class� selon les pr�f�rences d'un programmeur
        des informations d'un flux JSON. Il affiche aussi les donn�es re�u
        selon les options du programmeur, ainsi il est possible par exemple d'afficher que les 5
        derniers commit d'un d�p�t github et non pas tout le repository.

### D�couverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous r�alisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/�diteur de texte de votre choix.
Pour r�aliser cette exercice, vous devez bien �videmment vous reporter � la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), ...).

1. Quels IDE ou �diteurs de texte utilisez-vous pour le d�veloppement Java ?
    > R�pondre ici
	J'utilise pour le d�veloppement Java Visual Studio Code
	
    Pour la suite, ne consid�rez que l'un de vos choix.
    
1. Comment v�rifier/d�finir que l'encodage utilis� est *UTF-8* ?
    > R�pondre ici
	Dans la barre inf�rieur de VSCode, on peut voir l'�tiquette "UTF-8"
	Pour �tre sur que le projet actuel �crit par le programmeur soit enregistr� et encod� 
	sous "UTF-8" il suffit de cliquer sur l'�tiquette puis d'appuyer sur le popup
	"Save with encoding" et de tout simplement choisir "UTF-8".
	
1. Comment choisir le JDK � utiliser dans un projet ?
    > R�pondre ici
    
1. Comment pr�ciser la version Java des sources dans un projet ?
    > R�pondre ici
    Une fois le code ouvert dans VSCode on peut voir sur la barre des t�ches en bas � droite
    que sur celle-ci y figure plusieurs pr�cision. Notamment la version du langage utilis�
    et ses caract�ristiques. Ici apr�s l'encodage on peut voir �crit 'Java' puis juste � c�t� 
    la version Java des sources soit 'JavaSE-14'
    EXEMPLE : || AFFICHAGE ||
    UTF-8 | Java | JavaSE-14
    
1. Comment ajouter une biblioth�que externe dans un projet ?
    > R�pondre ici
    2 m�thodes existent sur VSCode :
    
    1) Les fichiers JAR peuvent �tre ajout�s en cliquant sur le signe + en regard du n�ud Biblioth�ques r�f�renc�es dans la vue projet. (Reference Libraries)
		puis ajouter le dossier t�l�charg� pr�c�demment.
    
    2) Une fois apr�s avoir t�l�charg� la biblioth�que sous forme .jar ajout� manuellement celle-ci au projet :
		"java.project.referencedLibraries": [
			"library/**/*.jar",
			"/home/username/lib/foo.jar"
		]

1. Comment reformater un fichier source Java ?
    > R�pondre ici
    
1. Comment trouver la d�claration d'une variable ou m�thode ?
    > R�pondre ici
    EXEMPLE : || AFFICHAGE ||
    double ordonnee (ordonnee sera afficher en bleu clair)
    void AfficherForme() (AfficherForme sera afficher en jaune)
    
    Sur VSCode la d�claration d'une variable ou d'une m�thode est facile � rep�rer car VSCode permet d'avoir une coloration syntaxique
    de notre code.
    De ce fait les variables sont de couleur bleu clair (pour mon extension) et les m�thodes jaune.
    
    
1. Comment ins�rer un bloc de code pr�d�fini (*snippet*) ?
    > R�pondre ici
    Dans Visual Studio Code, les extraits de code apparaissent dans IntelliSense ( Ctrl + Espace ) m�lang�s � d'autres suggestions,
    ainsi que dans un s�lecteur d'extrait de code d�di� ( Ins�rer un extrait dans la palette de commandes). 
    Pour ins�rer un bloc de code pr�d�fini il suffit d'entrer un pr�fixe d'extrait de code (texte de d�clenchement) et appuyez sur 
    Tab pour ins�rer un extrait de code.(plusieurs choix d'extrait de code seront propos� il suffira que le programmeur fasse son choix)

1. Comment renommer une classe dans l'ensemble du projet ?
    > R�pondre ici
    Cliquer sur la classe en question puis appuyer sur le raccourcis F2 puis cliquer sur renommer 
    Ainsi, VSCode renomme l'�l�ment s�lectionn� et corrige toutes les r�f�rences 
    aux �l�ments du projet (�galement dans d'autres fichiers).
    
1. Comment ex�cuter le programme en lui passant un param�tre en ligne de commande ?
    > R�pondre ici
    
1. Comment d�boguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > R�pondre ici
    Sur VSCode il suffit d'appuyer sur le raccourcis F5 pour pouvoir lancer le d�bogueur, une fois cela fait
    plusieurs options sont disponible.
    Pour visualiser les variables du code, elles se retrouvent en haut � gauche sur l'espace variables
    Modifier votre code en changeant certaine variable et faite des tests avec le d�bogage, par exemple une fois le test lanc� 
    votre point d'arr�t pour que le d�bogueur s'arr�te est lorsque l'expression prend la valeur true.
    La console de d�bogage permet aussi de pouvoir g�rer les erreurs du code.
    
1. Quels param�tres ou fonctionnalit�s vous semblent particuli�rement importants/utiles pour le d�veloppement Java ?
    > R�pondre ici
	Tout d'abord le d�bogage est l'un des �l�ments les plus important pour le d�veloppement Java,
	suivre l'avanc� et le d�roulement de son projet tout en v�rifiant si il y � des coquilles dans 
	son code permet de ne pas avoir de surprise lors de la compilation.
	De plus le refactoring est selon moi une fonctionnalit� tr�s utile pour le d�veloppement Java,
	en effet l'objectif de la refactorisation du programme est d'apporter des modifications de code 
	� l'�chelle du syst�me sans affecter le comportement du programme ce qui peut particuli�rement
	servir au programmeur suite � de grosse ou petite erreur apre�u apr�s d�bogage ou non par exemple.