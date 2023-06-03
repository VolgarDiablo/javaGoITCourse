public class ObjectWorker {
    //    public String join(Object[] objects) {
//        String result = "";
//
//        for (int i = 0; i < objects.length; i++) {
//            result += objects[i];
//
//            if (i != objects.length - 1) {
//                result += " ";
//            }
//        }
//
//        return result;
//    }
    public String join(Object[] objects) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object elem : objects) {
            stringBuilder.append(elem).append(" ");
        }
        return stringBuilder.toString().strip();
    }
}
