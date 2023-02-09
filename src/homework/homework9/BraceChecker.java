package homework.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack s = new Stack();
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    s.push(c);
                    break;
                case ')':
                    last = s.pop();
                    if (last == 0) {
                        System.out.println("Error: փակվել է " + c + " " + i + "-րդ ինդեքսում բայց չի բացվել");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '(') {
                            System.out.println("Error: բացվել է " + lastBracket + " բայց փակվել է " + c + " " + i + "-րդ ինդեքսում");
                        }
                    }
                    break;
                case ']':
                    last = s.pop();
                    if (last == 0) {
                        System.out.println("Error: փակվել է " + c + " " + i + "-րդ ինդեքսում բայց չի բացվել");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '[') {
                            System.out.println("Error: բացվել է " + lastBracket + " բայց փակվել է " + c + " " + i + "-րդ ինդեքսում");
                        }
                    }
                    break;
                case '}':
                    last = s.pop();
                    if (last == 0) {
                        System.out.println("Error: փակվել է " + c + " " + i + "-րդ ինդեքսում բայց չի բացվել");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '{') {
                            System.out.println("Error: բացվել է " + lastBracket + " բայց փակվել է " + c + " " + i + "-րդ ինդեքսում");
                        }
                    }
                    break;
            }
        }
        while ((lastBracket = (char) s.pop()) != 0) {
            System.out.println("Error: բացվել է " + lastBracket + " բայց չի փակվել");
        }
    }
}