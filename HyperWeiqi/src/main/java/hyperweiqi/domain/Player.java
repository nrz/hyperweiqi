package hyperweiqi.domain;

/**
 * Abstract class Player functions as a common interface for human & AI players.
 * Both HumanPlayer and AiPlayer extend Player class.
 */
public abstract class Player {

    private String name;
    private final Type type;

    public enum Type {
        HUMAN, AI
    }

    public Player(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return this.type;
    }

    abstract public StoneLocation getMove();
}
