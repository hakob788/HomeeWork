package homework.homework9;

public class BraceChecker {
    Stack s = new Stack();
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack s = new Stack();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    s.push(text.charAt(i));
                    break;
                case ')':
                    char a = s.pop();
                    if (a != '(') {
                        System.out.println("Error: opened " + a + " but closed ) at " + i);
                    }
                    continue;
                case ']':
                    char b = s.pop();
                    if (b != '[') {
                        System.out.println("Error: opened " + b + " but closed ] at " + i);
                    }
                    continue;
                case '}':
                    char c = s.pop();
                    if (c != '{') {
                        System.out.println("Error: opened " + c + " but closed } at " + i);
                    }
                    continue;
            }
        }
    }
}


