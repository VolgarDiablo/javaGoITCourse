public class NameParser {
    //    public String parse(String[] names) {
//        String result = "";
//
//        for (int i = 0; i < names.length; i++) {
//            String firstName = names[i].split(" ")[0];
//
//            result += firstName;
//            if (i != names.length - 1) {
//                result += ", ";
//            }
//        }
//
//        return result;
//    }
    public String parse(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : names) {
            stringBuilder.append(name.split(" ")[0]).append(", ");
        }
        if (stringBuilder.length() != 0) stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
