public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
            new FullBorder(
                new FullBorder(
                    new SideBorder(
                        new FullBorder(new StringDisplay("Hello, world."))
                    , '*')
                )
            ), '/');
        b4.show();

        Display b5 = new FullBorder(
            new UpDownBorder(
                new SideBorder(
                    new UpDownBorder(
                        new SideBorder(
                            new StringDisplay("Hello, world."), '*'
                        ), '='
                    ), '|'
                ), '/'
            )
        );
        b5.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("hello, world.");
        md.add("hay, world.");
        md.add("goog night, world.");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}