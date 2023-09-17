package com.siyar.models;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public int doubleMyage (){

        System.out.println();
        return age * 2;
    }

}


/*Java-koden du har tillhandahållit definierar en studentklass med en konstruktor för att skapa
elevobjekt och en huvudmetod som genererar slumpmässiga elevnamn och åldrar och skriver ut dem. Här är en förklaring av koden:

Importera klassen Random från paketet java.util.

Definiera Studentklassen med två instansvariabler: namn (en sträng) och ålder (en int).

Skapa en konstruktor för klassen Student som tar två parametrar: namn och ålder, och initierar instansvariablerna med de angivna värdena.

I huvudmetoden:

Skapa en instans av klassen Random med namnet randomAge för att generera slumpmässiga åldrar.
Skapa en array av strängar som kallas namn som innehåller fem elevnamn.
Använda en for-loop för att iterera fem gånger, skapa ett nytt Student-objekt för varje iteration.
Elevens namn väljs från namnmatrisen, och åldern genereras slumpmässigt mellan 25 och 67 med randomAge.nextInt(43) + 25.
Skriver ut elevens namn och ålder på konsolen för varje elev.
Koden genererar och skriver ut information om fem elever med slumpmässiga namn och åldrar inom det angivna intervallet.
Varje gång du kör programmet kan du få olika namn och åldrar på grund av åldersgenerationens slumpmässiga karaktär.*/