package patterns.builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getHTMLResult();
            System.out.println("HTML 파일 " + fileName + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    // 사용 방법을 표시한다
    public static void usage() {
        System.out.println("Usage: java Main text     텍스로 문서 작성");
        System.out.println("Usage: java Main html     HTML 파일로 문서 작성");
    }
}
