# botiga

Projecte SpringBoot i mariadb

En aquesta pràctica hem utilitzat el framework Spring, que ens permet, entre altres coses, crear aplicacions eficients mitjançant injeccions de dependències i aspectes modulars.

Per començar, s'ha completat la clase model Producte, fent una relació ManyToOne amb subcategories;![1717017860787](image/README/1717017860787.png)

Un cop s'ha creat la classe Producte, hem continuat amb la classe repositori, que es la que "treballa" amb la base de dades. És una interfície que hereda de CRUDRepository<> i té uns métodes ja incorporats, tot i que li pots afegir més (de manera personalitzada). Treballa amb la annotació @Repository.

![1717018305443](image/README/1717018305443.png)

Acte seguit, treballarem amb les classes serveis, on si desenvoluparà tota o casi tota la lògica de negoci. Primer farem la classe interfície, on hi hauran els mètodes (o els essencials) buits, acte seguit, crearem la classe  servei amb l'implmentació d'aquests mètodes treballan juntament amb la capa repositori (als mètodes que així ho demanin), per implementar el component repositori utilitzarem l'annotació @Autowired, que ens permet fer la injecció del bean repositori.

ProductService:

![1717021320743](image/README/1717021320743.png)


ProductServiceImpl:

![1717021359433](image/README/1717021359433.png)

A continuació, hem seguit el mateix procediment amb eles clases Subcategory i Category:

Dins la classe Subcategory hi ha una relació @ManyToOne, on bàsicament, és dictamina el tipus de relació que tindrà amb l'objecte Category, una categoria pot contenir una o més subcategories, per exemple la categoria "Carn" podría tenir les subcategories: "carn vermella", "Embotits", etc.

![1717021566570](image/README/1717021566570.png)

I la classe category:

![1717021723980](image/README/1717021723980.png)


Seguint el procediment, hem continuat amb els components repositoris:

Subcategoria:

![1717021785355](image/README/1717021785355.png)

Categoria:

![1717021803120](image/README/1717021803120.png)

* Amb l'annotació @SuppressWarnings evitem possibles problemes d'excepcions quan el programa compil·li i detecti nulls relacionats amb el objecte que és treballi.









Pàgina desar:

Pàgina catàlog:

Pàgina Index:

Pàgina Search:

Base de dades:

- Categoria:

  ![1717006484330](image/README/1717006484330.png)
- Subcategoria:

  ![1717006493141](image/README/1717006493141.png)
- Productes:

  ![1717006514201](image/README/1717006514201.png)
