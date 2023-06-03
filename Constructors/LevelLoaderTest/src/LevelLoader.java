public class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getHeight() * level.getWidth() < 100000) {
            System.out.println("Level loaded");
        } else throw new LevelTooBigException("Level too big");
    }
}