public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "が作成されました。");
        } else if (args[0].equals("underlined")) {
            UnderlinedTextBuilder underlined = new UnderlinedTextBuilder();
            Director director = new Director(underlined);
            director.construct();
            String result = underlined.getResult();
            System.out.println(result);
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain      プレーンテキストで文書作成");
        System.out.println("Usage: java main html       HTMLファイルで文書作成");
    }
}