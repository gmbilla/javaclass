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



# Encoder

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
