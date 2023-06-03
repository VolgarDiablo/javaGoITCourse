public class GameMenu {

    void act(MenuItem item) {
        System.out.println(item.getAction());
    }

    public abstract static class MenuItem {
        public abstract String getAction();
    }

    public static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    public static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    public static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }
}