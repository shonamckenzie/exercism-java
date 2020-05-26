public class Twofer {
    public String twofer(String name) {
//        return (name == null) ? "One for you, one for me." : ("One for " + name + ", one for me.");
        return "One for " + (name != null ? name : "you") + ", one for me.";
    }
}
