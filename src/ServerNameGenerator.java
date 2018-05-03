public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adj = {"Liquid","Vulcan","Sniper","Decoy","Revolver","Psycho","Laughing","Raging","Crying","Screaming","The","Big","Solid"};
        String[] noun = {"Snake","Raven","Wolf","Octopus","Mantis","Ocelot","End","Pain","Fury","Sorrow","Fear","Boss","Joy"};
        String code = returnRando(adj);
        String name = returnRando(noun);
        System.out.println("Your code name is: " + code + "-" + name);
    }
    public static String returnRando(String[] words) {
        int rando = (int)(Math.random()*(words.length));
        return words[rando];
    }
}
