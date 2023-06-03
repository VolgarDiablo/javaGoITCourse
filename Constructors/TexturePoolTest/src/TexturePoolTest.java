//Напиши клас-сінглтон TexturePool. У цього класу має бути метод public String getTexture(String textureName).
//        Цей метод повертає рядок Get texture <TEXTURE_NAME>.
//        амість <TEXTURE_NAME> має бути ім'я текстури, яке передається як параметр у метод getTexture().
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}