# the-magic-of-the-static-key-work
This sample program is to demonstrate how java computes the static members of a class.
The static members of a class are computed and instanciated as soon as the class is loaded.
that's why the Test_class1 program computed despite the fact that the DATE_OF BIRTH VARIABLE was instantiated in our code after it
was called. If it was non static, the program wouldn't even have compiled.
Static variables are copied only once and instanciated when the class is loaded and are accessible to every instance of the class.
(there are said to be global variables).


La-magie du modificateur "static"
Ce programme exemple montre comment java calcule les membres statiques d'une classe.
Les membres statiques d'une classe sont calculés et instanciés dès que la classe est chargée.
C'est pourquoi le programme Test_class1 a été executé malgré le fait que  DATE_OF BIRTH VARIABLE a été instanciée dans notre code après
qu'elle ait été appelé. S'Il était non statique, le programme n'aurait même pas compilé.
Les variables statiques ne sont copiées qu'une seule fois et instanciées lorsque la classe est chargée et sont accessibles à chaque instance de la classe.
(On dit qu'il sont de variables globales).


