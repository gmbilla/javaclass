# Board game

```java
public interface Playable {

    /**
     * Play the game.
     */
    void play();

    /**
     * Whether you won the last game or not.
     *
     * @return true if you won, false otherwise.
     */
    boolean hasWon();

    /**
     * Details on last game.
     *
     * @return Results description.
     */
    String getResult();

}
```

```java

Game g = randomGame();

g.play()

System.out.println("Results: " + g.getResult());

if (g.hasWon()) {
	System.out.println("YAAAY!");
} else {
	System.out.println("D'oh!");
}

```

Game list:
* DiceGame
  * OneDiceGame
  * TwoDiceGame
  * ...
* EvenOrOddGame
* TossAPennyGame
  * TossAFakePennyGame
* ...


## IO utility
 
Write a simple service class to handle file IO. It could for instance represent a custom handler for Java logger.

The class must have a `write(String msg)` method that takes as input the _message_ to be written to file.
This method optionally takes as arguments a _path_ to the file to be written and a _flag_ to define if the content should be replaced or appended.
In addition to the `write` method we need a `read(String path)` method to read the content of the file.


## Encoder

Given a generic JavaBean object serialize/deserialize it to a file with this format:

```
ClassName
	attribute: value
	attribute: value
	...
```

Given the object type you have to create a utility class to store the current Object instance to a file, and another one to restore its state.

Example bean:

```java
class Pippo {
	private String name;	

	public Pippo() {}

	public String getName() { return name; }

	public void setName() { return name; }
}
```
