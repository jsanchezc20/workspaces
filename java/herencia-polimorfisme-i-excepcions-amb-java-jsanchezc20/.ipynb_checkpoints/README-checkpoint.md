# Activitat: p-herencia-polimorfisme-00

(amb Exceptions)

## Instruccions

Heu de fer aquesta activitat en local, al vostre entorn de desenvolupament, amb vscode.

Quan acabeu cada nivell, heu de fer un commit amb el següent missatge:

**"Nom Cognom: nivell X acabat"**

(on X serà 1, 2 o 3 segons el cas, i on nom i cognom són el nom i cognoms de l'alumne.)

Un cop acabeu i fet el darrer commit, heu de fer un **git push** al repo remot de github classroom.

### Com crear un nou package Java amb VSCode?

Aneu a "Java Projects", desplegueu el vostre projecte, i damunt de la carpeta ```src```cliqueu amb el botó secundari del ratolí, i seleccioneu _New Package_ del menú contextual.

## Nivells i qualificacions

Hi ha 3 nivells.

- **Nivell 1**: per arribar al 5

- **Nivell 2**: per arribar al 7.5

- **Nivell 3**: per arribar al 10


# Enunciat

## Nivell 1

Les classes d'aquest nivell les has de posar al package ```cat.daw.m3.nivell1```

- **Exercici 1**. Al repo clonat, trobaràs una classe anomenada App, amb el mètode main (punt d'entrada a l'aplicació). Has de crear 2 mètodes més: un constructor i un altre mètode, que és invocat pel 'main()'. Demostra la seqüència d'execució dels mètodes de la classe.
- **Exercici 2**. Crea una altra classe amb dos mètodes: un static i un altre no-static. Demostra com invocar el mètode static i el no-static des del main de la classe de l'exercici 1.
- **Exercici 3**. Crea una altra classe amb un camp static final i un camp final. Demostra la diferència entre els dos.
- **Exercici 4**. Crea una altra classe amb un mètode sobrecarregat **tres vegades**. Defineix una nova classe que hereti de l'anterior i afegeix una nova versió sobrecarregada del mètode. Mostra que els quatre mètodes estan disponibles en la classe derivada.
- **Exercici 5**. Crea una classe denominada Amphibian. A partir d'aquesta, defineix una nova classe denominada Frog que hereti de l'anterior. Inclogui una sèrie de mètodes apropiats en la classe base. En 'main()' (de la classe de l'exercici 1) creeu un objecte Frog i feu una generalització a Amphibian, demostrant que tots els mètodes continuen funcionant.
- **Exercici 6**. Modifiqui l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de la classe base (proporcioni noves definicions utilitzant les mateixes signatures de mètodes). Demostra què passa des del 'main()' de la classe de l'exercici 1.
- **Exercici 7**. Crea una interfície, anomenada ```Speakable``` igual a la que hi ha als apunts de classe. Fes que Frog implementi aquesta interfície, de manera que el gripau dirà: "_Frog, I am a Frog, What do I say? Ribbit, ribbit, I say it all day._". Des del 'main()', fes que el gripau parli.
- **Exercici 8**. Fes un nou mètode a Frog, anomenat ```jump``` i que li passem el número de vegades que el gripau ha de saltar. Un gripau no pot saltar més de 3 vegades seguides. Si li passem un número més gran de 3, has de controlar **amb excepcions** que el programa mostri per pantalla "_Error: Un gripau no pot saltar més de 3 vegades seguides_". Si el valor és vàlid (per exemple 2) caldrà imprimir "_El gripau ha fet 2 salts !!!_".


## Nivell 2

En el mateix projecte que el nivell 1, afegirem les següents classes, però de manera que les classes d'aquest nivell les has de posar al package ```cat.daw.m3.nivell2```

- Creu una classe Cycle, amb subclasses Unicycle, Bicycle i Tricycle. Demostra que es pot generalitzar una instància de cada tipus a Cycle mitjançant un mètode 'ride()':
  * Afegeix un mètode 'wheels()' a Cycle, que retorni el nombre de rodes. Modifiqui 'ride()' per a invocar 'wheels()' i verifiqui que funciona el polimorfisme.
  * Afegeix un mètode 'balance()' a Unicycle i a Bicycle, però no a Tricycle. Creeu instàncies de tres tipus i generalitza-les per a formar un array d'objectes Cycle. Tracta d'invocar 'balance()' en cada element de l'array. Realitza una especialització i invoqui 'balance()' demostrant què passa.

- Crea una jerarquia d'herència Rodent: Mouse, Jerbil, Hamster. En la classe base proporciona els mètodes que són comuns als rosegadors, i substitueix aquests mètodes en les classes derivades per a obtenir diferents comportaments depenent del tipus específic de rosegador. Creu un array d'objectes Rosegador, emplena-la amb diferents tipus específics de rosegadors i invoca els mètodes de la classe base demostrant què succeeix.


## Nivell 3

En el mateix projecte que els nivells 1 i 2, afegirem les següents classes, però de manera que les classes d'aquest nivell les has de posar al package ```cat.daw.m3.nivell3```

- Creu una classe base amb dos mètodes. En el primer mètode, invocarà el segon. Defineix una classe que heredi de l'anterior i substitueixi el segon mètode. Creu un objecte de la classe derivada, realitza una generalització (upcasting) al tipus base i crida al primer mètode. Demostra el que succeeix.
  
- Modifica el segon mètode anterior amb ```throws Exception``` a la signatura, i perquè dins del seu cos llenci una excepció si se li passa per paràmetre un valor invàlid. Modifica el primer mètode perquè, en invocar el segon amb un argument no vàlid, capturi l'excepció i mostri per pantalla "Excepció capturada".


***
A continuació hi ha informació genèrica de Visual Studio Code per a projectes Java.
*** 

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
