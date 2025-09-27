public class StringToken extends Token {
    public String value;
    
    public StringToken() {
        super();
    }
    
    public StringToken(int kind, String image) {
        this.kind = kind;
        this.image = image;
        String content = image.substring(1, image.length() - 1);
        this.value = processEscapeSequences(content);
    }
    
    public static StringToken newToken(int ofKind, String image) {
        return new StringToken(ofKind, image);
    }
    
    private String processEscapeSequences(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c == '\\' && i + 1 < str.length()) {
                char nextChar = str.charAt(i + 1);
                switch (nextChar) {
                    case 'n':
                        result.append('\n');
                        break;
                    case 't':
                        result.append('\t');
                        break;
                    case '\"':
                        result.append('\"');
                        break;
                    case '\\':
                        result.append('\\');
                        break;
                    default:
                        result.append(c);
                        result.append(nextChar);
                        break;
                }
		i++;
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    @Override
    public Object getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return value != null ? value.toString() : super.toString();
    }
}
